package com.thalisoft.model.venta;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.database;
import com.thalisoft.model.maestros.cliente.Cliente;
import com.thalisoft.model.maestros.cliente.ClienteDao;

public class FacturaVentaDao extends database {

    public boolean CRUD_VENTA(Object[] DATOS_FACTURA) {
        return EJECUTAR_SP("CRUD_VENTAS", DATOS_FACTURA);
    }

    public Object[][] SELECT_DETALLEVENTA(String text) {
        return SELECT_SP("SELECT_FACTURA_VENTA", "1,"+text);
    }

    public boolean BORRAR_PRODUCTO_DETALLE(int idcompra) {
        return Delete("detalleventas", "iddetalleventas = "+idcompra);
    }

    public FacturaVenta SELECT_VENTA(Object factura) {
        FacturaVenta fv = null;
        Object[][] rs = SELECT_SP("SELECT_FACTURA_VENTA", "0,"+factura);
        if (rs.length  > 0) {
            fv = new FacturaVenta();
            fv.setNumeroFactura(Integer.parseInt(rs[0][0].toString()));
            fv.setFechaFactura(DateUtil.getDateTime(rs[0][1]));
            fv.setCliente(new ClienteDao().CONSULTAR_CLIENTE(rs[0][2]));
            fv.setNumOrdenPedido(rs[0][3].toString());
            fv.setPlansepare(rs[0][4].toString());
            fv.setSubtotal(Integer.parseInt(rs[0][5].toString()));
            fv.setSaldo(Integer.parseInt(rs[0][6].toString()));
            fv.setFechahoraregistro(DateUtil.getDateTime(rs[0][7]));
        }
        return fv;
    }

    public Object[][] SELECT_DETALLEVENTA(Object factura) {
         return SELECT_SP("SELECT_FACTURA_VENTA", "1,"+factura);
    }
    
    public String NUMERO_FACTURA_VENTA(){
        return SELECT_SP("SELECT_FACTURA_VENTA", "0,0")[0][0].toString();
    }
}
