package com.thalisoft.model.pagos;

import com.thalisoft.model.empleado.Empleado;
import com.thalisoft.model.ordencompra.OrdenCompra;
import java.util.Date;

public class PagosClientes {

    private int idpagocliente;
    private Date fechahoraemision;
    private String formapago;
    private OrdenCompra ordenCompra;
    private Empleado empleado;
    private String numrecibo;
    private int valorpago;
    private int cntrecibida;
    private int cntdevuelta;

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

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
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
    
}