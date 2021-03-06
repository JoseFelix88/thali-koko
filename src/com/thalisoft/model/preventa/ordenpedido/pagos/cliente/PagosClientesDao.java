package com.thalisoft.model.preventa.ordenpedido.pagos.cliente;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import com.thalisoft.model.maestros.cliente.Cliente;
import com.thalisoft.model.maestros.cliente.ClienteDao;
import com.thalisoft.model.maestros.empleado.EmpleadoDao;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedidoDao;
import com.thalisoft.model.preventa.plansepare.PlanSepareDao;
import com.thalisoft.model.preventa.plansepare.pagos.PagosPlanSepare;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PagosClientesDao extends database {

    Edicion edicion = new Edicion();

    public boolean CRUD_PAGO_CLIENTE(Object[] DATA) {
        return EJECUTAR_SP("CRUD_PAGO_CLIENTE", DATA);
    }

    public PagosClientes CONSULTA_PAGO_CLIENTE(Object KEY) {
        PagosClientes pc = null;
        Object param = 1 + ",'" + KEY + "'";
        Object[][] rs = SELECT_SP("SELECT_PAGOS_CLIENTE", param);
        if (rs.length > 0) {
            try {
                pc = new PagosClientes();
                pc.setIdpagocliente(edicion.toNumeroEntero(rs[0][0].toString()));
                pc.setFechahoraemision(DateUtil.getDateTime(rs[0][1]));
                pc.setFormapago(rs[0][2].toString());
                pc.setOrdenCompra(new OrdenPedidoDao().CONSULTA_ORDEN_COMPRA(rs[0][3]));
                pc.setEmpleado(new EmpleadoDao().CONSULTAR_EMPLEADO(rs[0][4]));
                pc.setNumrecibo(rs[0][5].toString());
                pc.setValorpago(edicion.toNumeroEntero(rs[0][6].toString()));
                pc.setCntrecibida(edicion.toNumeroEntero(rs[0][7].toString()));
                pc.setCntdevuelta(edicion.toNumeroEntero(rs[0][8].toString()));
                pc.getOrdenCompra().setCliente(new ClienteDao().CONSULTAR_CLIENTE(rs[0][9]));
                pc.setEstado(edicion.toNumeroEntero(rs[0][10].toString()));
            } catch (ParseException ex) {
                Logger.getLogger(PagosClientesDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return pc;
    }

    public Object[][] HISTORIAL_PAGOS_CLIENTE(Object key) {
        Object param = 2 + ",'" + key + "'";
        return SELECT_SP("SELECT_PAGOS_CLIENTE", param);
    }

    public String NUMERO_RECIBO_PAGO_ORDEN_PEDIDO() {
        Object param = 0 + ",2";
        Object[][] RS = SELECT_SP("SELECT_PAGOS_CLIENTE", param);
        if (RS.length > 0) {
            return RS[0][0].toString();
        }
        return null;
    }

    public String NUMERO_RECIBO_PAGO_PLAN_SEPARE() {
        Object param = 3+ ",0";
        Object[][] RS = SELECT_SP("SELECT_PAGOS_CLIENTE", param);
        if (RS.length > 0) {
            return RS[0][0].toString();
        }
        return null;
    }
    
    public Object[][] HISTORICO_PAGOS_PLAN_SEPARE(Object key){
         Object param = 5+ ",'"+key+"'";
        return SELECT_SP("SELECT_PLANSEPARE", param);
    }
    
    public PagosPlanSepare CONSULTA_PAGO_PLAN_SEPARE(Object KEY) {
        PagosPlanSepare pc = null;
        Object param = 4 + ",'" + KEY + "'";
        Object[][] rs = SELECT_SP("SELECT_PLANSEPARE", param);
        if (rs.length > 0) {
            pc = new PagosPlanSepare();
            pc.setIdpagocliente(edicion.toNumeroEntero(rs[0][0].toString()));
            pc.setFechahoraemision(DateUtil.getDateTime(rs[0][1]));
            pc.setFormapago(rs[0][2].toString());
            pc.setPlanSepare(new PlanSepareDao().CONSULTAR_PLAN_SEPARE(rs[0][3]));
            pc.setEmpleado(new EmpleadoDao().CONSULTAR_EMPLEADO(rs[0][4]));
            pc.setNumrecibo(rs[0][5].toString());
            pc.setValorpago(edicion.toNumeroEntero(rs[0][6].toString()));
            pc.setCntrecibida(edicion.toNumeroEntero(rs[0][7].toString()));
            pc.setCntdevuelta(edicion.toNumeroEntero(rs[0][8].toString()));
            pc.setEstado(edicion.toNumeroEntero(rs[0][9].toString()));
        }

        return pc;
    }
}
