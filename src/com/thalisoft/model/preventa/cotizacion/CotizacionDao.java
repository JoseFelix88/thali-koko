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

}
