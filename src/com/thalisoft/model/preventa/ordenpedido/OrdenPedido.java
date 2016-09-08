 
package com.thalisoft.model.preventa.ordenpedido;

import com.thalisoft.model.maestros.cliente.Cliente;
import com.thalisoft.model.maestros.empleado.Empleado;
import com.thalisoft.model.maestros.proveedor.Proveedor;
import java.util.Date;

 public class OrdenPedido {
    
    private int idordencompra;
    private Date fechaEntrega;
    private Date fehcaEmision;
    private int subtotal;
    private int saldo;
    private int estado;
    private Proveedor proveedor;
    private Empleado empleado;
    private Cliente cliente;
    private Object cotizacion;
    private DetalleOrdenPedido detalleOrdenCompra;
    private Date fechahoraingreso;

    public int getIdordencompra() {
        return idordencompra;
    }

    public void setIdordencompra(int idordencompra) {
        this.idordencompra = idordencompra;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFehcaEmision() {
        return fehcaEmision;
    }

    public void setFehcaEmision(Date fehcaEmision) {
        this.fehcaEmision = fehcaEmision;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechahoraingreso() {
        return fechahoraingreso;
    }

    public void setFechahoraingreso(Date fechahoraingreso) {
        this.fechahoraingreso = fechahoraingreso;
    }

    public Object getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Object cotizacion) {
        this.cotizacion = cotizacion;
    }

    public DetalleOrdenPedido getDetalleOrdenCompra() {
        return detalleOrdenCompra;
    }

    public void setDetalleOrdenCompra(DetalleOrdenPedido detalleOrdenCompra) {
        this.detalleOrdenCompra = detalleOrdenCompra;
    }
    
    
    
    
}
