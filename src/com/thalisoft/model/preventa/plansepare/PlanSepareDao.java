package com.thalisoft.model.preventa.plansepare;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.database;
import com.thalisoft.model.maestros.cliente.ClienteDao;
import com.thalisoft.model.maestros.empleado.EmpleadoDao;

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
    
    public PlanSepare CONSULTAR_PLAN_SEPARE(Object key) {
        PlanSepare ps = null;
        Object param = 0 + ",'"+key+"'";
        Object[][] rs = SELECT_SP("SELECT_PLANSEPARE", param);
        if (rs.length > 0) {
           ps = new PlanSepare();
           ps.setIdcotizacion(Integer.parseInt(rs[0][0].toString()));
           ps.setCliente(new ClienteDao().CONSULTAR_CLIENTE(rs[0][2]));
           ps.setFechaEmision(DateUtil.getDateTime(rs[0][1]));
           ps.setEmpleado(new EmpleadoDao().CONSULTAR_EMPLEADO(rs[0][3]));
           ps.setSaldo(Integer.parseInt(rs[0][4].toString()));
           ps.setSubTotal(Integer.parseInt(rs[0][5].toString()));
        }
        return ps;
    }
}
