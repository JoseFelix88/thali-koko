package com.thalisoft.model.maestros.cliente;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import com.thalisoft.model.maestros.empleado.EmpleadoDao;

public class ClienteDao extends database {

    Edicion edicion = new Edicion();
    EmpleadoDao EmployedDAO;

    public ClienteDao() {

    }

    public boolean CRUD_CLIENTE(Object[] key) {
        return EJECUTAR_SP("CRUD_CLIENTE", key);
    }

    public Cliente CONSULTAR_CLIENTE(Object key) {
        Cliente cliente = null;
        Object parametros = 1 + ",'" + key + "'";
        Object[][] rs = SELECT_SP("SELECT_CLIENTE", parametros);
        if (rs.length > 0) {
            EmployedDAO = new EmpleadoDao();
            cliente = new Cliente(edicion.toNumeroEntero(rs[0][0].toString()), rs[0][1].toString(), 
                     rs[0][2].toString(), rs[0][3].toString(), rs[0][4].toString(), 
                    EmployedDAO.CONSULTAR_EMPLEADO(rs[0][5]), DateUtil.getDateTime(rs[0][6]));
        }

        return cliente;
    }

    public Object[][] LISTADO_CLIENTES() {
        Object parametros = 2 + "," + 0 + "";
        Object[][] rs = SELECT_SP("SELECT_CLIENTE", parametros);
        return rs;
    }

    public String NUMERO_FICHA() {
        Object parametros = 3 + "," + 0 + "";
        Object[][] rs = SELECT_SP("SELECT_CLIENTE", parametros);
        return rs[0][0].toString();
    }
}
