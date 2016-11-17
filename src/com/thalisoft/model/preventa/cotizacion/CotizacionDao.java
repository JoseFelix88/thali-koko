package com.thalisoft.model.preventa.cotizacion;

import com.thalisoft.main.util.database;

public class CotizacionDao extends database {

    public boolean CRUD_COTIZACION(Object[] values) {
        return EJECUTAR_SP("CRUD_COTIZACION", values);
    }

    public Object[][] SELECT_COTIZACION(Object key) {
        Object parametro = 0 + ",'" + key + "'";
        return SELECT_SP("SELECT_COTIZACION", parametro);
    }

    public String NUMERO_COTIZACION() {
        Object param = 2 + ",0";
        Object[][] rs = SELECT_SP("SELECT_COTIZACION", param);
        if (rs.length > 0) {
            return rs[0][0].toString();
        }
        return null;
    }
}
