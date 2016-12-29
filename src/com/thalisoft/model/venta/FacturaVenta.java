package com.thalisoft.model.venta;

import com.thalisoft.model.maestros.cliente.Cliente;
import java.util.Date;

public class FacturaVenta {

    private int numeroFactura;
    private Date FechaFactura;
    private String numOrdenPedido;
    private String plansepare;
    private Cliente cliente;
    private Date fechahoraregistro;
    private int subtotal;
    private int saldo;
    

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(Date FechaFactura) {
        this.FechaFactura = FechaFactura;
    }

    public String getNumOrdenPedido() {
        return numOrdenPedido;
    }

    public void setNumOrdenPedido(String numOrdenPedido) {
        this.numOrdenPedido = numOrdenPedido;
    }

    public String getPlansepare() {
        return plansepare;
    }

    public void setPlansepare(String plansepare) {
        this.plansepare = plansepare;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechahoraregistro() {
        return fechahoraregistro;
    }

    public void setFechahoraregistro(Date fechahoraregistro) {
        this.fechahoraregistro = fechahoraregistro;
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
