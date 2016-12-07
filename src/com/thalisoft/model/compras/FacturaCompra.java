package com.thalisoft.model.compras;

import com.thalisoft.model.maestros.empleado.Empleado;
import com.thalisoft.model.maestros.proveedor.Proveedor;
import java.util.Date;

public class FacturaCompra {
    
    private int idfacturacompra;
    private Date fechaFactura;
    private Date fechaVece;
    private Date fechaIngreso;
    private String numeroFactura;
    private String tipoCompra;
    private Proveedor proveedor;
    private Empleado empleado;
    private Date fechahoraingreso;
    private int estado;
    private int subtotal;
    private int saldo;

    public int getIdfacturacompra() {
        return idfacturacompra;
    }

    public void setIdfacturacompra(int idfacturacompra) {
        this.idfacturacompra = idfacturacompra;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Date getFechaVece() {
        return fechaVece;
    }

    public void setFechaVece(Date fechaVece) {
        this.fechaVece = fechaVece;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
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

    public Date getFechahoraingreso() {
        return fechahoraingreso;
    }

    public void setFechahoraingreso(Date fechahoraingreso) {
        this.fechahoraingreso = fechahoraingreso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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
    
}
