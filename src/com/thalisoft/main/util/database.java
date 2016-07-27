package com.thalisoft.main.util;

import java.sql.*;

/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class database {

    /* DATOS PARA LA CONEXION */

    private static final Conexcion cnn = Conexcion.saberEstado();
    private Connection conn = cnn.getCnn();
//___________________________________________________________________________________ Soy una barra separadora :)

    public database() {

    }
//___________________________________________________________________________________ Soy una barra separadora :)

    public Connection getConnection() {
        return this.conn;
    }
//___________________________________________________________________________________ Soy una barra separadora :)
/* METODO PARA REALIZAR UNA CONSULTA A LA BASE DE DATOS
     * INPUT:  
     *      table => nombre de la tabla donde se realizara la consulta, puede utilizarse tambien INNER JOIN
     *      fields => String con los nombres de los campos a devolver Ej.: campo1,campo2campo_n
     *      where => condicion para la consulta
     * OUTPUT: un object[][] con los datos resultantes, sino retorna NULL
     */

    public Object[][] select(String table, String fields, String where) {

        int registros = 0, columnas = 0;
        String colname[] = fields.split(",");
        String q;
        String q2;

//Consultas SQL
        if (table != null) {
            q = "SELECT " + fields + " FROM " + table;
            q2 = "SELECT count(*) as total FROM " + table;

        } else {
            q = "SELECT " + fields + " ";
            q2 = "SELECT count(*) as total ";

        }

        if (where != null) {
            q += " WHERE " + where;
            q2 += " WHERE " + where;
        }

//        System.out.println(q);
        //obtenemos la cantidad de registros existentes en la tabla
        try {

            PreparedStatement pstm = conn.prepareStatement(q);
            try (ResultSet res = pstm.executeQuery()) {
                while (res.next()) {
                    columnas = res.getMetaData().getColumnCount();
                    registros = registros + 1;
                }

//res.next();
                //          registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new Object[registros][columnas];

        //realizamos la consulta sql y llenamos los datos en la matriz "Object"
        try {
//            System.out.println(1);
            PreparedStatement pstm = conn.prepareStatement(q);
            try (ResultSet res = pstm.executeQuery()) {
                int i = 0;
                while (res.next()) {

                    for (int j = 0; j <= columnas - 1; j++) {

//                        System.out.println("columnas "+colname[j]+" = "+res.getObject(j+1));
                        data[i][j] = res.getObject(j + 1);

                        if (data[i][j] == null) {

                            data[i][j] = "";
                        }
                    }

                    i++;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en Select SQL: " + e);
        }
        return data;
    }

    public Object[][] SELECT_SP(String S_P, Object parametros) {
        int registros = 0, columnas = 0;
        String q = null;
        if (parametros != null) {
            q = "CALL " + S_P + "(" + parametros + ")";
        }

//        System.out.println(q);
        //obtenemos la cantidad de registros existentes en la tabla
        try {

            PreparedStatement pstm = conn.prepareStatement(q);
            try (ResultSet res = pstm.executeQuery()) {
                while (res.next()) {
                    columnas = res.getMetaData().getColumnCount();
                    registros = registros + 1;
                }

//res.next();
                //          registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new Object[registros][columnas];

        //realizamos la consulta sql y llenamos los datos en la matriz "Object"
        try {
//            System.out.println(1);
            PreparedStatement pstm = conn.prepareStatement(q);
            try (ResultSet res = pstm.executeQuery()) {
                int i = 0;
                while (res.next()) {

                    for (int j = 0; j <= columnas - 1; j++) {

//                        System.out.println("columnas "+colname[j]+" = "+res.getObject(j+1));
                        data[i][j] = res.getObject(j + 1);

                        if (data[i][j] == null) {

                            data[i][j] = "";
                        }
                    }

                    i++;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en Select SQL: "+q+" " + e);
        }
        return data;
    }

//___________________________________________________________________________________ Soy una barra separadora :)
/* METODO PARA INSERTAR UN REGISTRO EN LA BASE DE DATOS
     * INPUT:
     table = Nombre de la tabla
     fields = String con los nombres de los campos donde insertar Ej.: campo1,campo2campo_n
     values = String con los datos de los campos a insertar Ej.: valor1, valor2, valor_n
     */
//___________________________________________________________________________________ Soy una barra separadora :)
    public boolean insert(String table, String fields, String values) {
        boolean res = false;
        //Se arma la consulta
        String q = " INSERT INTO " + table + " ( " + fields + " ) VALUES  (" + values + " ) ";
        System.out.println(q);
        //se ejecuta la consulta
        try {
            try (PreparedStatement pstm = conn.prepareStatement(q)) {
                pstm.execute();
            }
            res = true;
        } catch (SQLException e) {
            System.out.println("Error al intentar guardar en la tabla: " + table + "\n" + e);
        } finally {
            desconectar();
        }
        return res;
    }

    public boolean update(String table, String fields, String where) {
        boolean res = false;

        //Se arma la consulta
        String q = " UPDATE " + table + " SET " + fields + " ";
        if (where != null) {
            q += " WHERE " + where;

        }
        System.out.println(q);
        //se ejecuta la consulta
        try {
            try (PreparedStatement pstm = conn.prepareStatement(q)) {
                pstm.execute();
            }
            res = true;
        } catch (SQLException e) {
            System.out.println("Error al ACTUAZALIAR en la tabla: " + table + "\n" + e);
        }
        return res;
    }

    public boolean EJECUTAR_SP(String sp, Object[] values) {

        boolean res = false;

        //SE RECORRE EL ARRAY DE VALORES
        String valores = "";
        for (Object value : values) {
            valores = valores + value + ",";
        }

        String datavalores = valores.substring(0, valores.length() - 1);

        //Se arma la consulta
        String q = " CALL  " + sp + " ( " + datavalores + " ) ";
        System.out.println(q);
        //se ejecuta la consulta
//        System.out.println(q);
        try {
            try (CallableStatement pstm = conn.prepareCall(q)) {
                pstm.execute();
            }
            res = true;
        } catch (Exception e) {
            System.out.println("Error la momento de ejecuetar SP " + sp + ": " + e);
        }

        return res;
    }

    //METODO USADO PARA ELIMINAR
    public boolean Delete(String table, String where) {
        boolean res = false;
        //Se arma la consulta
        String q = " DELETE FROM " + table + "  ";
        //se ejecuta la consulta
        if (where != null) {

            q += "WHERE " + where;
        }
        try {
            PreparedStatement pstm = conn.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return res;
    }

    public Object[][] SP_QUERY(Object procedimiento, Object fields) {

        Object[][] data = null;
        String q = "call " + procedimiento + "()";
        try {
            System.out.println(q);
            CallableStatement pstm = conn.prepareCall(q);
            try (ResultSet res = pstm.executeQuery()) {
                String colname[] = fields.toString().split(",");
                int i = 0;
                while (res.next()) {

                    if (res.getString(1) != null) {
                        for (int j = 0; j <= res.getRow() - 1; j++) {
                            data[i][j] = res.getObject(j);
                        }
                    }
                    i++;
                }
            }

        } catch (Exception e) {
            System.out.println("error en procedimiento " + procedimiento + "\n" + e);
        }

        return data;
    }

//___________________________________________________________________________________ Soy una barra separadora :)
    public void desconectar() {
        conn = null;
        cnn.cerrarConexcion();
//        System.out.println("La conexion a la  base de datos  a terminado. PROBLEM?");
    }
//___________________________________________________________________________________ Soy una barra separadora :)
}
