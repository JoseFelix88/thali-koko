package com.thalisoft.main.util.report;

import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.database;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class Manager_Report extends database {

    static String RUTA_REPORTE = "C:\\ThaliSotf Report/";
    public String NOMBRE_REPORTE;
    public String NOMBRE_DEL_ARCHIVO_EXPORTADO;
    public HashMap PARAMETROS = new HashMap();
    public String DIRECTORIO_POR_DEFECTO;
    JasperReport masterReport = null;

    Edicion edicion = new Edicion();

    public Manager_Report() {
    }

    public void FichaDeEmpleado(Object key) {
        try {
            String Ubicacion = RUTA_REPORTE + "/Empleado/";
            String reporte = "Ficha de Empleado.jasper";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("key", key.toString());
//            PARAMETROS.put("numCaja", numcaja);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR la ficha del empleado.\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void ListadoDeEmpleados() {
        try {
            String Ubicacion = RUTA_REPORTE + "/Empleado/";
            String reporte = "listado de Empleados.jasper";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el listado del empleado.\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void ORDEN_DE_COMPRA(Object key) {
        String reporte = "orden de compra.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/Orden de Compra/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("idordencompra", key);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void ORDEN_DE_COMPRA_PEDIDO(Object key) {
        String reporte = "orden de compra - Pedido.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/Orden de Compra/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("idordencompra", key);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void RECIBO_DE_PAGO_CLIENTE(Object key) {
        String reporte = "Recibo de Pago Cliente.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/Orden de Compra/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("NUMPAGO", key);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void HISTORIAL_PAGOS_CLIENTES_PROVEEDOR(Object[] key) {
        String reporte = "historial de pagos orden de pedidos.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/preventa/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("fecha1", key[0]);
            PARAMETROS.put("fecha2", key[1]);
            PARAMETROS.put("idorden", key[2]);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void RECIBO_DE_PAGO_PROVEEDOR(Object key) {
        String reporte = "Recibo de Pago Proveedor.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/PREVENTA/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("NUMPAGO", key);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void RELACION_DE_ORDENES_DE_PEDIDO(Object[] key) {
        String reporte = "Relacion de ordenes de Pedido.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/preventa/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("fecha1", key[0]);
            PARAMETROS.put("fecha2", key[1]);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void COTIZACION(Object key) {
        String reporte = "Cotizacion.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/PREVENTA/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("idcotizacion", key.toString());
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }

    public void PLANSEPARE(String key) {
         String reporte = "Plan Separe.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/PREVENTA/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("idplan", key);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }
    
    public void RECIBO_DE_PAGO_PLANSEPARE(Object key) {
        String reporte = "Recibo de Pago Plan Separe.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/PREVENTA/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("NUMPAGO", key);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }
    
     public void RELACION_DE_COMPRAS_REGISTRADAS(Object[] key) {
        String reporte = "Relacion de Compras.jasper";
        try {
            String Ubicacion = RUTA_REPORTE + "/compras/";
            masterReport = (JasperReport) JRLoader.loadObject(Ubicacion.concat(reporte));
            PARAMETROS.put("fe1", key[0]);
            PARAMETROS.put("fe2", key[1]);
            PARAMETROS.put("filtro", key[2]);
            edicion.Lanzador(masterReport, PARAMETROS);
        } catch (Exception j) {
            edicion.mensajes(3, "NO SE PUEDE LANZAR el reporte " + reporte + ".\n" + j);
            System.out.println("Mensaje de Error:" + j);
        }
    }
}
