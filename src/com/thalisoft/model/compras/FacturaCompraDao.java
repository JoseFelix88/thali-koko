package com.thalisoft.model.compras;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.database;
import com.thalisoft.model.maestros.empleado.Empleado;
import com.thalisoft.model.maestros.empleado.EmpleadoDao;
import com.thalisoft.model.maestros.proveedor.Proveedor;
import com.thalisoft.model.maestros.proveedor.ProveedorDao;

public class FacturaCompraDao extends database {

    public boolean CRUD_COMPRA(Object[] key) {
        return EJECUTAR_SP("CRUD_FACTURACOMPRA", key);
    }

    public FacturaCompra SELECT_COMPRA(Object key) {
        FacturaCompra fc = null;
        Object[][] rs = SELECT_SP("SELECT_FACTURACOMPRA", key);
        if (rs.length > 0) {
            fc = new FacturaCompra();
            fc.setIdfacturacompra(Integer.parseInt(rs[0][0].toString()));
            fc.setFechaFactura(DateUtil.getDateTime(rs[0][1]));
            fc.setFechaVece(DateUtil.getDateTime(rs[0][2]));
            fc.setFechaIngreso(DateUtil.getDateTime(rs[0][3]));
            fc.setNumeroFactura(rs[0][4].toString());
            fc.setTipoCompra(rs[0][5].toString());
            fc.setProveedor(new ProveedorDao().CONSULTAR_PROVEEDOR(rs[0][6]));
            fc.setEmpleado(new EmpleadoDao().CONSULTAR_EMPLEADO(rs[0][7]));
            fc.setEstado(Integer.parseInt(rs[0][8].toString()));
        }
        return fc;
    }

    public Object[][] SELECT_DETALLECOMPRA(Object key) {
        Object[][] rs = SELECT_SP("SELECT_FACTURACOMPRA", key);
        if (rs.length > 0) {
            return rs;
        }
        return null;
    }

    public Object[][] SELECT_RELACIONCOMPRA(Object key) {
        Object[][] rs = SELECT_SP("SELECT_FACTURACOMPRA", key);
        if (rs.length > 0) {
            return rs;
        }
        return null;
    }
}
