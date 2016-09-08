package com.thalisoft.model.maestros.proveedor;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import com.thalisoft.model.maestros.empleado.EmpleadoDao;

public class ProveedorDao extends database {

    Edicion edicion = new Edicion();
    EmpleadoDao edao;

    public ProveedorDao() {
    }

    public boolean CRUD_PROVEEDOR(Object[] key) {
        return EJECUTAR_SP("CRUD_PROVEEDOR", key);
    }

    public Proveedor CONSULTAR_PROVEEDOR(Object key) {
        Proveedor proveedor = null;
        String parametro = 1 + "," + key;
        Object[][] rs = SELECT_SP("SELECT_PROVEEDOR", parametro);
        if (rs.length > 0) {
            edao = new EmpleadoDao();
            proveedor = new Proveedor(edicion.toNumeroEntero(rs[0][0].toString()), rs[0][1].toString(),
                    rs[0][2].toString(), rs[0][3].toString(), rs[0][4].toString(),
                    rs[0][5].toString(), rs[0][6].toString(), rs[0][7].toString(), DateUtil.getDateTime(rs[0][8]),
                    edao.CONSULTAR_EMPLEADO(rs[0][8]));
        }
        return proveedor;
    }

    public Object[][] LISTADO_PROVEEDORS() {
        Object parametros = 2 + "," + 0 + "";
        Object[][] rs = SELECT_SP("SELECT_PROVEEDOR", parametros);
        return rs;
    }

    public String NUMERO_FICHA() {
        Object parametros = 3 + "," + 0 + "";
        Object[][] rs = SELECT_SP("SELECT_PROVEEDOR", parametros);
        return rs[0][0].toString();
    }

    public Object[][] PRODUCTOS_PROVEEDORS(Object key) {
        Object parametros = 5 + ",'" + key + "'";
        Object[][] rs = SELECT_SP("SELECT_PROVEEDOR", parametros);
        return rs;
    }

    public Object[][] DESCUENTOS_PROVEEDOR(Object key) {
        Object parametros = 6 + ",'" + key + "'";
        Object[][] rs = SELECT_SP("SELECT_PROVEEDOR", parametros);
        return rs;
    }

    public boolean CRUD_BANCO_PROVEEDOR(Object[] key) {
        return EJECUTAR_SP("CRUD_BANCO_PROVEEDOR", key);
    }

    public Object[][] BANCO_PROVEEDOR(Object key) {
        Object parametros = 7 + ",'" + key + "'";
        Object[][] rs = SELECT_SP("SELECT_PROVEEDOR", parametros);
        return rs;
    }
}
