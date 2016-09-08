package com.thalisoft.model.preventa.ordenpedido.pagos.proveedor;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import com.thalisoft.model.maestros.empleado.EmpleadoDao;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedidoDao;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PagosProveedorDao extends database {

    Edicion edicion = new Edicion();

    public boolean CRUD_PAGO_PROVEEDOR(Object[] DATA) {
        return EJECUTAR_SP("CRUD_PAGO_PROVEEDOR", DATA);
    }

    public PagosProveedor CONSULTA_PAGO_PROVEEDOR(Object KEY) {
        PagosProveedor pp = null;
        Object param = 0 + ",'" + KEY + "'";
        Object[][] rs = SELECT_SP("SELECT_PAGOS_PROVEEDOR", param);
        if (rs.length > 0) {
            try {
                pp = new PagosProveedor();
                pp.setIdpagoproveedor(edicion.toNumeroEntero(rs[0][0].toString()));
                pp.setFechahoraemision(DateUtil.getDateTime(rs[0][1]));
                pp.setFormapago(rs[0][2].toString());
                pp.setOrdenPedido(new OrdenPedidoDao().CONSULTA_ORDEN_COMPRA(rs[0][3]));
                pp.setEmpleado(new EmpleadoDao().CONSULTAR_EMPLEADO(rs[0][4]));
                pp.setNumrecibo(rs[0][5].toString());
                pp.setValorpago(edicion.toNumeroEntero(rs[0][6].toString()));
                pp.setCntrecibida(edicion.toNumeroEntero(rs[0][7].toString()));
                pp.setCntdevuelta(edicion.toNumeroEntero(rs[0][8].toString()));

            } catch (ParseException ex) {
                Logger.getLogger(PagosProveedorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return pp;
    }

    public Object[][] HISTORIAL_PAGOS_PROVEEDOR(Object key) {
        Object param = 2 + ",'" + key + "'";
        return SELECT_SP("SELECT_PAGOS_PROVEEDOR", param);
    }

    public String NUMERO_RECIBO_PAGO() {
        Object param = 0 + ",2";
        Object[][] RS = SELECT_SP("SELECT_PAGOS_PROVEEDOR", param);
        if (RS.length > 0) {
           return  RS[0][0].toString();
        }
        return null;
    }
}
