 
package com.thalisoft.model.preventa.ordenpedido;

import com.thalisoft.model.producto.Producto;

 
public class DetalleOrdenPedido {
    private int iddetalleordencompra;
    private int cantidad;
    private int valorUnidad;
    private int costoTotal;
    private OrdenPedido ordenCompra;
    private Producto producto;
    private String especificacion;

    public int getIddetalleordencompra() {
        return iddetalleordencompra;
    }

    public void setIddetalleordencompra(int iddetalleordencompra) {
        this.iddetalleordencompra = iddetalleordencompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public OrdenPedido getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenPedido ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }
    
    
}
