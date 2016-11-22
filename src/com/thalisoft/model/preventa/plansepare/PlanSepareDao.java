package com.thalisoft.model.preventa.plansepare;

import com.thalisoft.main.util.database;

public class PlanSepareDao extends database {

    public boolean CRUD_PLANSEPARE(Object[] values) {
        return EJECUTAR_SP("CRUD_PLANSEPARE", values);
    }

    public Object[][] SELECT_PLANSEPARE(Object key) {
        return SELECT_SP("SELECT_PLANSEPARE", key);
    }

    public String NUMERO_PLANSEPARE() {
        Object param = 2 + ",0";
        Object[][] rs = SELECT_SP("SELECT_PLANSEPARE", param);
        if (rs.length > 0) {
            return rs[0][0].toString();
        }
        return null;
    }
    
}
