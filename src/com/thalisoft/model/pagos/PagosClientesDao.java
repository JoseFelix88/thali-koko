package com.thalisoft.model.pagos;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import com.thalisoft.model.cliente.Cliente;
import com.thalisoft.model.cliente.ClienteDao;
import com.thalisoft.model.empleado.EmpleadoDao;
import com.thalisoft.model.ordencompra.OrdenCompraDao;
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
        Object param = 0 + ",'" + KEY + "'";
        Object[][] rs = SELECT_SP("SELECT_PAGOS_CLIENTE", param);
        if (rs.length > 0) {
            try {
                pc = new PagosClientes();
                pc.setIdpagocliente(edicion.toNumeroEntero(rs[0][0].toString()));
                pc.setFechahoraemision(DateUtil.getDateTime(rs[0][1]));
                pc.setFormapago(rs[0][2].toString());
                pc.setOrdenCompra(new OrdenCompraDao().CONSULTA_ORDEN_COMPRA(rs[0][3]));
                pc.setEmpleado(new EmpleadoDao().CONSULTAR_EMPLEADO(rs[0][4]));
                pc.setNumrecibo(rs[0][5].toString());
                pc.setValorpago(edicion.toNumeroEntero(rs[0][6].toString()));
                pc.setCntrecibida(edicion.toNumeroEntero(rs[0][7].toString()));
                pc.setCntdevuelta(edicion.toNumeroEntero(rs[0][8].toString()));
                pc.getOrdenCompra().setCliente(new ClienteDao().CONSULTAR_CLIENTE(rs[0][9]));
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

    public String NUMERO_RECIBO_PAGO() {
        Object param = 0 + ",2";
        Object[][] RS = SELECT_SP("SELECT_PAGOS_CLIENTE", param);
        if (RS.length > 0) {
           return  RS[0][0].toString();
        }
        return null;
    }
}
