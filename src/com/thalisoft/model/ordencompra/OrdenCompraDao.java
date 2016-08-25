package com.thalisoft.model.ordencompra;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.database;
import com.thalisoft.model.cliente.ClienteDao;
import com.thalisoft.model.empleado.EmpleadoDao;
import com.thalisoft.model.proveedor.ProveedorDao;
import java.text.ParseException;

public class OrdenCompraDao extends database {

    public boolean CRUD_ORDENCOMPRA(Object[] key) {
        return EJECUTAR_SP("CRUD_ORDEN_COMPRA", key);
    }
    public String NUMERO_ORDEN_COMPRA() {
        Object param = 0 + ",0";
        Object[][] rs = SELECT_SP("SELECT_ORDEN_COMPRA", param);
        if (rs.length > 0) {
            return rs[0][0].toString();
        }
        return null;
    }

    public OrdenCompra CONSULTA_ORDEN_COMPRA(Object key) throws ParseException{
        OrdenCompra compra = null;
        ProveedorDao pd;
        ClienteDao cd;
        EmpleadoDao ed;
        Object param = 1+",'"+key+"'";
        Object[][] rs = SELECT_SP("SELECT_ORDEN_COMPRA", param);
        if (rs.length > 0) {
            compra = new OrdenCompra();
            pd = new ProveedorDao();
            ed = new EmpleadoDao();
            cd = new ClienteDao();                    
            compra.setIdordencompra(Integer.parseInt(rs[0][0].toString()));
            compra.setFechaEntrega(DateUtil.toDate(rs[0][1]));
            compra.setFehcaEmision(DateUtil.toDate(rs[0][2]));
            compra.setSubtotal(Integer.parseInt(rs[0][3].toString()));
            compra.setSaldo(Integer.parseInt(rs[0][4].toString()));
            compra.setEstado(Integer.parseInt(rs[0][5].toString()));
            compra.setProveedor(pd.CONSULTAR_PROVEEDOR(rs[0][6]));
            compra.setEmpleado(ed.CONSULTAR_EMPLEADO(rs[0][7]));
            compra.setCliente(cd.CONSULTAR_CLIENTE(rs[0][8]));
            compra.setCotizacion(rs[0][9].toString());
            compra.setFechahoraingreso(DateUtil.toDateTime(rs[0][10]));
        }
        return compra;
    }
    
    public Object[][] DETALLE_ORDEN_COMPRA(Object key){
        Object param = 2+",'"+key+"'";
        return SELECT_SP("SELECT_ORDEN_COMPRA", param);
    }
}
