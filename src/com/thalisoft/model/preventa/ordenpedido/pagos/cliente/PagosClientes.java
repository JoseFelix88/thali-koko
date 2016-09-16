package com.thalisoft.model.preventa.ordenpedido.pagos.cliente;

import com.thalisoft.model.maestros.empleado.Empleado;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedido;
import java.util.Date;

public class PagosClientes {

    private int idpagocliente;
    private Date fechahoraemision;
    private String formapago;
    private OrdenPedido ordenCompra;
    private Empleado empleado;
    private String numrecibo;
    private int valorpago;
    private int cntrecibida;
    private int cntdevuelta;
    private int estado;

    public int getIdpagocliente() {
        return idpagocliente;
    }

    public void setIdpagocliente(int idpagocliente) {
        this.idpagocliente = idpagocliente;
    }

    public Date getFechahoraemision() {
        return fechahoraemision;
    }

    public void setFechahoraemision(Date fechahoraemision) {
        this.fechahoraemision = fechahoraemision;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public OrdenPedido getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenPedido ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getNumrecibo() {
        return numrecibo;
    }

    public void setNumrecibo(String numrecibo) {
        this.numrecibo = numrecibo;
    }

    public int getValorpago() {
        return valorpago;
    }

    public void setValorpago(int valorpago) {
        this.valorpago = valorpago;
    }

    public int getCntrecibida() {
        return cntrecibida;
    }

    public void setCntrecibida(int cntrecibida) {
        this.cntrecibida = cntrecibida;
    }

    public int getCntdevuelta() {
        return cntdevuelta;
    }

    public void setCntdevuelta(int cntdevuelta) {
        this.cntdevuelta = cntdevuelta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
