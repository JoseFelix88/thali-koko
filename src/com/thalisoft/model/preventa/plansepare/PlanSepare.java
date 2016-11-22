package com.thalisoft.model.preventa.plansepare;

import com.thalisoft.model.maestros.cliente.Cliente;
import com.thalisoft.model.maestros.empleado.Empleado;
import java.util.Date;


public class PlanSepare {

    private int idcotizacion;
    private Date fechaEmision;
    private Cliente cliente;
    private Empleado empleado;

    public int getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(int idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
}
