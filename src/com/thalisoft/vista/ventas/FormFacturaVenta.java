package com.thalisoft.vista.ventas;

import com.thalisoft.controller.index.ControllerContenedor;
import com.thalisoft.main.util.CambiaFormatoTexto;
import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.main.util.report.Manager_Report;
import com.thalisoft.model.maestros.cliente.Cliente;
import com.thalisoft.model.maestros.producto.Producto;
import com.thalisoft.model.maestros.producto.ProductoDao;
import com.thalisoft.model.maestros.cliente.ClienteDao;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedido;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedidoDao;
import com.thalisoft.model.preventa.plansepare.PlanSepare;
import com.thalisoft.model.preventa.plansepare.PlanSepareDao;
import com.thalisoft.model.venta.FacturaVenta;
import com.thalisoft.model.venta.FacturaVentaDao;
import com.thalisoft.vista.maestros.cliente.FormCliente;
import com.thalisoft.vista.maestros.cliente.FormListarClientes;
import com.thalisoft.vista.maestros.producto.FormProducto;
import com.thalisoft.vista.preventa.ordenpedido.pagos.cliente.FormPagosCliente;
import com.thalisoft.vista.preventa.plansepare.pagos.FormPagosPlanSepare;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class FormFacturaVenta extends javax.swing.JInternalFrame {

    Edicion edicion = new Edicion();
    CambiaFormatoTexto formatoTexto = new CambiaFormatoTexto();
    Manager_Report report = new Manager_Report();
    ProductoDao productoDao;
    FacturaVenta facturaVenta;
    FacturaVentaDao factVentaDao;
    ClienteDao clienteDao;
    PlanSepareDao planDao;
    OrdenPedidoDao pedidoDao;

    public FormFacturaVenta() {
        clienteDao = new ClienteDao();
        facturaVenta = new FacturaVenta();
        factVentaDao = new FacturaVentaDao();
        productoDao = new ProductoDao();
        planDao = new PlanSepareDao();
        pedidoDao = new OrdenPedidoDao();
        initComponents();
        JDateFactura.setDate(DateUtil.newDateTime());
        LBTIPOFAC.setVisible(false);
        TXTTIPOFACT.setVisible(Boolean.FALSE);
        llenar_combo();
        accionesfml();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup_mediopago = new javax.swing.ButtonGroup();
        groupimpresion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnumfactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JDateFactura = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        RadioArticulo = new javax.swing.JRadioButton();
        RadioOrden = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtvalorpago = new javax.swing.JTextField();
        RadioPlan = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        combocliente = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        LBTIPOFAC = new javax.swing.JLabel();
        TXTTIPOFACT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcntrecibida = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtdevuelta = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        radioefectivo = new javax.swing.JRadioButton();
        radiotarjeta = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        txtnumrecibo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        comboproducto = new javax.swing.JComboBox<>();
        txtcantidad = new javax.swing.JTextField();
        txtprecioventa = new javax.swing.JTextField();
        txtventatotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_detalle = new javax.swing.JTable();
        txtstock = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lb_item = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-icono-6397-32.png"))); // NOI18N
        jMenuItem1.setText("ELIMINAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);
        setForeground(java.awt.Color.orange);
        setIconifiable(true);
        setTitle("Factura de Venta");

        jPanel1.setBackground(new java.awt.Color(102, 166, 227));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)), "FACTURA DE VENTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Narrow", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACTURA No.");

        txtnumfactura.setEditable(false);
        txtnumfactura.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        txtnumfactura.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA FACTURA");

        JDateFactura.setDateFormatString("EEE, dd MMMM yyyy");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUE DESEAS FACTURAR?");

        buttonGroup1.add(RadioArticulo);
        RadioArticulo.setSelected(true);
        RadioArticulo.setText("ARTICULO");
        RadioArticulo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadioArticuloItemStateChanged(evt);
            }
        });

        buttonGroup1.add(RadioOrden);
        RadioOrden.setText("ORDEN DE PEDIDO");
        RadioOrden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadioOrdenItemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SUBTOTAL");

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsubtotal.setText("$ 0");

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" SALDO ACTUAL");

        txtsaldo.setEditable(false);
        txtsaldo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtsaldo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsaldo.setText("$ 0");

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TOTAL A PAGAR");

        txtvalorpago.setEditable(false);
        txtvalorpago.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtvalorpago.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtvalorpago.setText("$ 0");

        buttonGroup1.add(RadioPlan);
        RadioPlan.setText("PLAN SEPARE");
        RadioPlan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadioPlanItemStateChanged(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel18.setText("No. DE IDENTIFICACION");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("TELFONOS");

        txtidentificacion.setFont(new java.awt.Font("Arial Narrow", 0, 11)); // NOI18N
        txtidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentificacionActionPerformed(evt);
            }
        });

        jLabel20.setText("NOMBRES Y APELLIDOS");

        txttelefono.setEditable(false);

        jLabel21.setText("DIRECCIÓN");

        txtdireccion.setEditable(false);

        combocliente.setEditable(true);
        combocliente.setFont(new java.awt.Font("Arial Narrow", 0, 11)); // NOI18N
        combocliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/netvibes-user-icono-4355-48.png"))); // NOI18N
        jButton2.setToolTipText("Consulta Cliente");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
        );

        LBTIPOFAC.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        LBTIPOFAC.setForeground(new java.awt.Color(255, 255, 255));

        TXTTIPOFACT.setToolTipText("PRESIONA \"ENTER\" PARA REALIZAR LA BUSQUEDA");
        TXTTIPOFACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTTIPOFACTActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/la-lucha-contra-la-caja-registradora-icono-4028-96.png"))); // NOI18N

        txtcntrecibida.setEditable(false);
        txtcntrecibida.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtcntrecibida.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcntrecibida.setText("$ 0");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("EFECTIVO");

        txtdevuelta.setEditable(false);
        txtdevuelta.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtdevuelta.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtdevuelta.setText("$ 0");

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("MEDIO DE PAGO");

        buttonGroup_mediopago.add(radioefectivo);
        radioefectivo.setText("EFECTIVO");
        radioefectivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioefectivoItemStateChanged(evt);
            }
        });

        buttonGroup_mediopago.add(radiotarjeta);
        radiotarjeta.setText("TARJETA");
        radiotarjeta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiotarjetaItemStateChanged(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("No. RECIBO");

        txtnumrecibo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtnumrecibo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/insert-coin.png"))); // NOI18N
        jButton1.setText("FACTURAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 0));
        groupimpresion.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("POST");
        jRadioButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/printer_post.png"))); // NOI18N
        jRadioButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jRadioButton2.setBackground(new java.awt.Color(0, 255, 204));
        groupimpresion.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jRadioButton2.setText("MEMBRETE");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("IMPRIMIR FACTURA EN:");

        jLabel24.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("CAMBIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvalorpago, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel24))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcntrecibida, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdevuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtnumfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JDateFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnumrecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(radioefectivo)
                                                .addGap(18, 18, 18)
                                                .addComponent(radiotarjeta))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(RadioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(RadioOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RadioPlan)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBTIPOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TXTTIPOFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnumfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(radioefectivo)
                                                .addComponent(radiotarjeta))
                                            .addComponent(JDateFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RadioArticulo)
                                    .addComponent(jLabel4)
                                    .addComponent(RadioPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RadioOrden)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnumrecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBTIPOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTTIPOFACT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtdevuelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtvalorpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcntrecibida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(212, 193, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DETALLE VENTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel6.setText("REFERENCIA");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel7.setText("DESCRIPCION");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel8.setText("CANTIDAD");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel9.setText("PRECIO UNIDAD");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PRECIO TOTAL");

        txtreferencia.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtreferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreferenciaActionPerformed(evt);
            }
        });

        comboproducto.setEditable(true);
        comboproducto.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        comboproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtcantidad.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcantidad.setText("0");
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        txtprecioventa.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtprecioventa.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtprecioventa.setText("$ 0");
        txtprecioventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioventaActionPerformed(evt);
            }
        });

        txtventatotal.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtventatotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtventatotal.setText("$ 0");

        TB_detalle.setBackground(new java.awt.Color(204, 255, 204));
        TB_detalle.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TB_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id. Detalle", "Referencia", "Descripcion", "Cantidad", "Precio Unidad", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_detalle.setComponentPopupMenu(jPopupMenu1);
        TB_detalle.setRowHeight(22);
        TB_detalle.setSelectionBackground(new java.awt.Color(255, 255, 102));
        TB_detalle.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TB_detalle);
        if (TB_detalle.getColumnModel().getColumnCount() > 0) {
            TB_detalle.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_detalle.getColumnModel().getColumn(2).setMinWidth(220);
        }

        txtstock.setEditable(false);
        txtstock.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtstock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtstock.setText("0");

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel15.setText("STOCK ACTUAL");

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Item Agregados:");

        lb_item.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lb_item.setForeground(new java.awt.Color(255, 255, 255));
        lb_item.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_item.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtreferencia))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboproducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecioventa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtventatotal)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_item, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtventatotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_item, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setBackground(new java.awt.Color(153, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/userconfig-icono-8183-32.png"))); // NOI18N
        jMenu1.setText("Gestion");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-nuevo-documento-de-archivo-mas-icono-6249-32.png"))); // NOI18N
        jMenuItem2.setText("Nuevo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/insert-coin.png"))); // NOI18N
        jMenuItem4.setText("FACTURAR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/printer.png"))); // NOI18N
        jMenuItem5.setText("Imprimir Factura");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/view-employed.png"))); // NOI18N
        jMenuItem7.setText("Consultar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/exit.png"))); // NOI18N
        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioArticuloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadioArticuloItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            LBTIPOFAC.setVisible(false);
            TXTTIPOFACT.setVisible(false);
            llenar_combo();
        }
    }//GEN-LAST:event_RadioArticuloItemStateChanged

    private void RadioOrdenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadioOrdenItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            LBTIPOFAC.setVisible(Boolean.TRUE);
            TXTTIPOFACT.setVisible(Boolean.TRUE);
            LBTIPOFAC.setText("No. " + RadioOrden.getText());
            TXTTIPOFACT.grabFocus();
            TXTTIPOFACT.setText(null);
            LIMPIAR_FML(1);
        }
    }//GEN-LAST:event_RadioOrdenItemStateChanged

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FACTURAR_FACTURA_VENTA();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas eliminar el producto?");
            if (SI_NO == 0) {
                int idcompra = Integer.parseInt(TB_detalle.getValueAt(TB_detalle.getSelectedRow(), 0).toString());
                if (factVentaDao.BORRAR_PRODUCTO_DETALLE(idcompra) != false) {
                    edicion.menu_emergente(TB_detalle);
                    calculatotalesfactura();
                }
            }
        } catch (Exception e) {
            edicion.mensajes(3, "no haz seleccionado algun producto.");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Object factura = edicion.msjQuest(2, "ingresa el numero de la factura de compra.");
        facturaVenta = factVentaDao.SELECT_VENTA(factura);
        if (facturaVenta != null) {
            txtnumfactura.setText(edicion.AGREGAR_CEROS_LEFT(facturaVenta.getNumeroFactura()));
            JDateFactura.setDate(facturaVenta.getFechaFactura());
            edicion.llenarTabla(TB_detalle, factVentaDao.SELECT_DETALLEVENTA(factura));
            calculatotalesfactura();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        FACTURAR_FACTURA_VENTA();
        /*if (VALIDAR_FORMULARIO() != false) {
            if (factVentaDao.CRUD_VENTA(DATOS_FACTURA(1)) != false) {
                edicion.llenarTabla(TB_detalle,
                        factVentaDao.SELECT_DETALLEVENTA(txtnumfactura.getText()));
                calculatotalesfactura();
            }
        }*/
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void RadioPlanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadioPlanItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            LBTIPOFAC.setVisible(Boolean.TRUE);
            TXTTIPOFACT.setVisible(Boolean.TRUE);
            LBTIPOFAC.setText("No. " + RadioPlan.getText());
            TXTTIPOFACT.setText(null);
            TXTTIPOFACT.grabFocus();
            LIMPIAR_FML(1);
        }

    }//GEN-LAST:event_RadioPlanItemStateChanged

    private void txtidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentificacionActionPerformed
        CARGAR_CLIENTE(txtidentificacion.getText());
    }//GEN-LAST:event_txtidentificacionActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Object IDFACTURA = edicion.msjQuest(2, "INGRESA EL # DE LA FACTURA.");
        CARGAR_FACTURA_VENTA(IDFACTURA);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void radioefectivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioefectivoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtnumrecibo.setEditable(false);
            txtnumrecibo.setText("");
            txtcntrecibida.setEditable(true);
            txtcntrecibida.selectAll();
            txtcntrecibida.requestFocus();
        }
    }//GEN-LAST:event_radioefectivoItemStateChanged

    private void radiotarjetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radiotarjetaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtnumrecibo.setEditable(true);
            txtcntrecibida.setText("$ 0");
            txtdevuelta.setText("$ 0");
            txtcntrecibida.setEditable(false);
            txtnumrecibo.selectAll();
            txtnumrecibo.requestFocus();
        }
    }//GEN-LAST:event_radiotarjetaItemStateChanged

    private void TXTTIPOFACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTTIPOFACTActionPerformed
        // TODO add your handling code here:
        if (RadioPlan.isSelected() | RadioOrden.isSelected()) {
            llenar_PRODUCTO();
            llenar_cliente();
        }

    }//GEN-LAST:event_TXTTIPOFACTActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        LIMPIAR_FML(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtprecioventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioventaActionPerformed
        // TODO add your handling code here:
        if (VALIDAR_FORMULARIO() != false) {
            if (factVentaDao.CRUD_VENTA(DATOS_FACTURA(0)) != false) {
                CARGAR_DETALLE();
                LIMPIAR_FML(1);
                txtreferencia.grabFocus();
            }
        }
    }//GEN-LAST:event_txtprecioventaActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
        txtprecioventa.selectAll();
        txtprecioventa.requestFocus();
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtreferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreferenciaActionPerformed
        // TODO add your handling code here:
        CARGAR_PRODUCTO(txtreferencia.getText());
    }//GEN-LAST:event_txtreferenciaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JInternalFrame ji = validador.getJInternalFrame(FormListarClientes.class.getName());
        if (ji == null || ji.isClosed()) {
            ji = new FormListarClientes();
            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormListarClientes.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormListarClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateFactura;
    private javax.swing.JLabel LBTIPOFAC;
    private javax.swing.JRadioButton RadioArticulo;
    private javax.swing.JRadioButton RadioOrden;
    private javax.swing.JRadioButton RadioPlan;
    private javax.swing.JTable TB_detalle;
    private javax.swing.JTextField TXTTIPOFACT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup_mediopago;
    public static javax.swing.JComboBox<String> combocliente;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.ButtonGroup groupimpresion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lb_item;
    private javax.swing.JRadioButton radioefectivo;
    private javax.swing.JRadioButton radiotarjeta;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcntrecibida;
    private javax.swing.JTextField txtdevuelta;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnumfactura;
    private javax.swing.JTextField txtnumrecibo;
    private javax.swing.JTextField txtprecioventa;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtvalorpago;
    private javax.swing.JTextField txtventatotal;
    // End of variables declaration//GEN-END:variables

    private boolean VALIDAR_FORMULARIO() {

        if (txtnumfactura.getText().isEmpty() | txtnumfactura.getText() == null) {
            edicion.mensajes(1, "ingrese el numero de factura.");
            return false;
        }

        if (JDateFactura.getDate() == null) {
            edicion.mensajes(1, "selecciona la fecha de la factura.");
            return false;
        }

        if (comboproducto.getSelectedItem() == null) {
            edicion.mensajes(1, "por favor selecciona el producto.");
            return false;
        }

        if (edicion.toNumeroEntero(txtcantidad.getText()) < 1) {
            edicion.mensajes(1, "la cantidad debe ser mayor a cero (0).");
            return false;
        }
        if (edicion.toNumeroEntero(txtcantidad.getText()) > edicion.toNumeroEntero(txtstock.getText())) {
            edicion.mensajes(1, "la cantidad debe ser menor o igual al stock actual.");
            return false;
        }

        return true;
    }

    private void llenar_combo() {
        combocliente.removeAllItems();
        comboproducto.removeAllItems();
        comboproducto.addItem(null);
        combocliente.addItem(null);
        Object[][] rs = clienteDao.LISTADO_CLIENTES();
        if (rs.length > 0) {
            for (Object[] objects : rs) {
                combocliente.addItem(objects[2].toString());
            }
        }

        productoDao.LISTA_PRODUCTOS().stream().forEach((producto) -> {
            comboproducto.addItem(producto.getDescripcion());
        });
        txtnumfactura.setText(factVentaDao.NUMERO_FACTURA_VENTA());
    }

    private void accionesfml() {
        //AutoCompleteDecorator.decorate(combocliente);

        combocliente.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (evt.getStateChange() == ItemEvent.SELECTED
                    && combocliente.getSelectedItem().toString().isEmpty() != true) {
                CARGAR_CLIENTE(combocliente.getSelectedItem().toString());
            }
        });
        comboproducto.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (evt.getStateChange() == ItemEvent.SELECTED
                    && comboproducto.getSelectedItem().toString().isEmpty() != true) {
                CARGAR_PRODUCTO(comboproducto.getSelectedItem().toString());
            }
        });

        TXTTIPOFACT.addKeyListener(new KeyAdapter() {
            @Override
        public void keyReleased(KeyEvent e) {
                TXTTIPOFACT.setText(edicion.AGREGAR_CEROS_LEFT(
                        edicion.toNumeroEntero(TXTTIPOFACT.getText())));
            }
        });

        txtcantidad.addKeyListener(new KeyAdapter() {
            @Override
        public void keyReleased(KeyEvent e) {
                CALCULARTOTALVENTA();
            }
        });
        txtcntrecibida.addKeyListener(new KeyAdapter() {
            @Override
        public void keyReleased(KeyEvent e) {
                txtcntrecibida.setText("$ " + formatoTexto.numerico(edicion.toNumeroEntero(txtcntrecibida.getText())));
                if (edicion.toNumeroEntero(txtsubtotal.getText())
                        <= edicion.toNumeroEntero(txtcntrecibida.getText())) {
                    int cntdevuelta = edicion.toNumeroEntero(txtcntrecibida.getText())
                            - edicion.toNumeroEntero(txtsubtotal.getText());
                    txtdevuelta.setText("$ " + formatoTexto.numerico(cntdevuelta));
                } else {
                    txtdevuelta.setText("$ 0");
                }

            }
        });
        txtprecioventa.addKeyListener(new KeyAdapter() {
            @Override
        public void keyReleased(KeyEvent e) {
                CALCULARTOTALVENTA();
            }
        });
    }

    private void CALCULARTOTALVENTA() {
        int totalcompra = edicion.toNumeroEntero(txtprecioventa.getText())
                * edicion.toNumeroEntero(txtcantidad.getText());
        txtventatotal.setText("$ " + formatoTexto.numerico(totalcompra));
    }

    private void CARGAR_PRODUCTO(String text) {
//        if (RadioArticulo.isSelected()) {
        Producto producto = productoDao.READ_PRODUCTO(text);
        if (producto != null) {
            txtreferencia.setText(producto.getReferencia());
            comboproducto.setSelectedItem(producto.getDescripcion());
            txtprecioventa.setText("$ " + formatoTexto.numerico(producto.getPrecio_venta()));
            txtstock.setText(formatoTexto.numerico(producto.getStrock()));
            txtcantidad.selectAll();
            txtcantidad.requestFocus();

        } else {
            int SI_NO = (int) edicion.msjQuest(1, "el producto no se encuentra registrado, deseas registrarlo?");
            

if (SI_NO == 0) {
                JInternalFrame ji = validador.getJInternalFrame(FormProducto.class
.getName());
                if (ji == null || ji.isClosed()) {
                    ji = new FormProducto();
                    ControllerContenedor.getjDesktopPane1().add(ji, 0);
                    validador

.addJIframe(FormProducto.class
.getName(), ji);
                    ji.setVisible(true);
                } else {
                    ji.show(true);
                    try {
                        ji.setIcon(false);
                    

} catch (PropertyVetoException ex) {
                        Logger.getLogger(FormCliente.class
.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

        if (RadioOrden.isSelected()) {
            dato_producto();
        }

        if (RadioPlan.isSelected()) {
            dato_producto();
        }
    }

    private Object[] DATOS_FACTURA(int opcion) {
        Object[] datos = new Object[10];
        String NUMEROPLAN = null, NUMEROORDEN = null;
        if (opcion == 0 | opcion == 1 | opcion == 2) {
            datos[0] = opcion;
        }

        if (RadioPlan.isSelected()) {
            NUMEROPLAN = TXTTIPOFACT.getText();
        }
        if (RadioOrden.isSelected()) {
            NUMEROORDEN = TXTTIPOFACT.getText();
        }

        datos[1] = "" + txtnumfactura.getText() + "";
        datos[2] = "'" + NUMEROORDEN + "'";
        datos[3] = "'" + NUMEROPLAN + "'";
        datos[4] = clienteDao.CONSULTAR_CLIENTE("" + combocliente.getSelectedItem() + "").getIdentificacion();
        datos[5] = "'" + Variables_Gloabales.EMPLEADO.getIdentificacion() + "'";
        datos[6] = "'" + edicion.formatearFechaSQL(JDateFactura.getDate()) + "'";
        datos[7] = "'" + txtreferencia.getText() + "'";
        datos[8] = edicion.toNumeroEntero(txtcantidad.getText());
        datos[9] = edicion.toNumeroEntero(txtprecioventa.getText());
        return datos;
    }

    private void calculatotalesfactura() {
        edicion.calcula_total(TB_detalle, lb_item, txtsubtotal, 5);
        facturaVenta = factVentaDao.SELECT_VENTA(txtnumfactura.getText());
        if (facturaVenta != null) {
            txtsaldo.setText("$ " + formatoTexto.numerico(facturaVenta.getSaldo()));
        }
        int totalpagar = edicion.toNumeroEntero(txtsubtotal.getText())
                - edicion.toNumeroEntero(txtsaldo.getText());
        txtvalorpago.setText("$ " + formatoTexto.numerico(totalpagar));
    }

    private void CARGAR_CLIENTE(String text) {
        Cliente cliente = clienteDao.CONSULTAR_CLIENTE(text);
        if (cliente != null) {
            txtidentificacion.setText(cliente.getIdentificacion());
            combocliente.setSelectedItem(cliente.getNombrecompleto());
            txttelefono.setText(cliente.getTelefono());
            txtdireccion.setText(cliente.getDireccion());
            txtreferencia.grabFocus();
        } else {
            int SI_NO = (int) edicion.msjQuest(1, "el cliente no se encuentra registrado, deseas registrarlo?");
            

if (SI_NO == 0) {
                JInternalFrame ji = validador.getJInternalFrame(FormCliente.class
.getName());
                if (ji == null || ji.isClosed()) {
                    ji = new FormCliente();
                    ControllerContenedor.getjDesktopPane1().add(ji, 0);
                    validador

.addJIframe(FormCliente.class
.getName(), ji);
                    ji.setVisible(true);
                } else {
                    ji.show(true);
                    try {
                        ji.setIcon(false);
                    

} catch (PropertyVetoException ex) {
                        Logger.getLogger(FormCliente.class
.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    Object[][] DETALLE_ORDEN, DETALLE_PLAN;

    private void llenar_PRODUCTO() {
        if (RadioPlan.isSelected()) {
            comboproducto.removeAllItems();
            comboproducto.addItem("");
            DETALLE_PLAN = planDao.SELECT_PLANSEPARE("7," + TXTTIPOFACT.getText());
            for (Object[] SELECT_PLANSEPARE : DETALLE_PLAN) {
                comboproducto.addItem(SELECT_PLANSEPARE[1].toString());
            }
        }

        if (RadioOrden.isSelected()) {
            comboproducto.removeAllItems();
            comboproducto.addItem("");
            DETALLE_ORDEN = pedidoDao.DETALLE_ORDEN_COMPRA(TXTTIPOFACT.getText());
            for (Object[] DETALLE_ORDEN_COMPRA : DETALLE_ORDEN) {
                comboproducto.addItem(DETALLE_ORDEN_COMPRA[2].toString());
            }
        }

    }

    private void dato_producto() {
        if (RadioOrden.isSelected()) {
            for (Object[] DETALLE_ORDEN1 : DETALLE_ORDEN) {
                if (comboproducto.getSelectedItem() == DETALLE_ORDEN1[2]) {
                    txtreferencia.setText(DETALLE_ORDEN1[1].toString());
                    txtcantidad.setText(DETALLE_ORDEN1[4].toString());
                    txtprecioventa.setText("$ " + formatoTexto.numerico(DETALLE_ORDEN1[5].toString()));
                    CALCULARTOTALVENTA();
                }
            }
        }

        if (RadioPlan.isSelected()) {
            for (Object[] DETALLE_PLAN1 : DETALLE_PLAN) {
                if (comboproducto.getSelectedItem() == DETALLE_PLAN1[1]) {
                    txtreferencia.setText(DETALLE_PLAN1[0].toString());
                    txtcantidad.setText(DETALLE_PLAN1[2].toString());
                    txtprecioventa.setText("$ " + formatoTexto.numerico(DETALLE_PLAN1[3].toString()));
                    CALCULARTOTALVENTA();
                }
            }
        }

    }

    private void llenar_cliente() {
        if (RadioPlan.isSelected()) {
            PlanSepare ps = planDao.CONSULTAR_PLAN_SEPARE(TXTTIPOFACT.getText());
            if (ps != null) {
                if (ps.getSaldo() > 0) {
                    int SI_NO = (int) edicion.msjQuest(1, "el "+RadioPlan.getText()+" tiene un saldo sin pagar de $ " + formatoTexto.numerico(ps.getSaldo()) + ","
                            + " deseas registrar el pago?");
                    

if (SI_NO == 0) {
                        JInternalFrame ji = validador.getJInternalFrame(FormPagosPlanSepare.class
.getName());
                        if (ji == null || ji.isClosed()) {
                            ji = new FormPagosPlanSepare();
                            ControllerContenedor.getjDesktopPane1().add(ji, 0);
                            validador

.addJIframe(FormPagosPlanSepare.class
.getName(), ji);
                            ji.setVisible(true);
                        } else {
                            ji.show(true);
                            try {
                                ji.setIcon(false);
                            

} catch (PropertyVetoException ex) {
                                Logger.getLogger(FormPagosPlanSepare.class
.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            } else {
                CARGAR_CLIENTE(planDao.CONSULTAR_PLAN_SEPARE(
                        TXTTIPOFACT.getText()).getCliente().getIdentificacion());
                
            }
        }
        if (RadioOrden.isSelected()) {
            try {
                OrdenPedido op = pedidoDao.CONSULTA_ORDEN_COMPRA(TXTTIPOFACT.getText());
                if (op != null) {
                    if (op.getSaldo() > 0) {
                        int SI_NO = (int) edicion.msjQuest(1, "la "+RadioOrden.getText()+" tiene un saldo sin pagar de $ " + formatoTexto.numerico(op.getSaldo()) + ","
                                + " deseas registrar el pago?");
                        

if (SI_NO == 0) {
                            JInternalFrame ji = validador.getJInternalFrame(FormPagosCliente.class
.getName());
                            if (ji == null || ji.isClosed()) {
                                ji = new FormPagosCliente();
                                ControllerContenedor.getjDesktopPane1().add(ji, 0);
                                validador

.addJIframe(FormPagosCliente.class
.getName(), ji);
                                ji.setVisible(true);
                            } else {
                                ji.show(true);
                                try {
                                    ji.setIcon(false);
                                

} catch (PropertyVetoException ex) {
                                    Logger.getLogger(FormPagosCliente.class
.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    } else {
                        CARGAR_CLIENTE(pedidoDao.CONSULTA_ORDEN_COMPRA(
                                TXTTIPOFACT.getText()).getCliente().getIdentificacion());
                    

}
                }
            } catch (ParseException ex) {
                Logger.getLogger(FormFacturaVenta.class
.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void LIMPIAR_FML(int opcion) {
        if (opcion == 0) {
            llenar_combo();
            txtidentificacion.setText(null);
            txttelefono.setText(null);
            txtdireccion.setText(null);
            TXTTIPOFACT.setText(null);
            RadioArticulo.setSelected(true);
            txtnumrecibo.setText(null);
            txtsubtotal.setText("$ 0");
            txtsaldo.setText("$ 0");
            txtvalorpago.setText("$ 0");
            txtcntrecibida.setText("$ 0");
            txtdevuelta.setText("$ 0");
            lb_item.setText("0");
            txtreferencia.setText(null);
            txtcantidad.setText("0");
            txtstock.setText("0");
            txtprecioventa.setText("$ 0");
            txtventatotal.setText("$ 0");
            edicion.limpiar_tablas(TB_detalle);
        }

        if (opcion == 1) {
            txtreferencia.setText(null);
            txtcantidad.setText("0");
            txtstock.setText("0");
            txtprecioventa.setText("$ 0");
            txtventatotal.setText("$ 0");
            comboproducto.setSelectedItem(null);
        }

    }

    boolean VALIDAD_FACTURA() {

        if (RadioArticulo.isSelected()) {

            if (!radioefectivo.isSelected() & !radiotarjeta.isSelected()) {
                edicion.mensajes(1, "seleccione el medio de pago de la factura.");
                return false;
            }
            if (radioefectivo.isSelected() && edicion.toNumeroEntero(txtcntrecibida.getText()) < 1) {
                edicion.mensajes(1, "la cantidad recibida de dinero debe ser mayor a cero.");
                return false;
            }
            if (radiotarjeta.isSelected() && txtnumrecibo.getText().isEmpty()) {
                edicion.mensajes(1, "ingrese el numero del recibo de la transsanccion.");
                return false;
            }

            if (radioefectivo.isSelected() && edicion.toNumeroEntero(txtcntrecibida.getText())
                    < edicion.toNumeroEntero(txtsubtotal.getText())) {

                edicion.mensajes(3, "LA CANTIDAD DE DINERO RECIBIDA DEBE SER MAYOR O IGUAL AL SUBTOTAL.");
                return false;
            }

            return true;
        } else {
            return false;
        }
    }

    private Object[] DATOS_FACTURAR_VENTA() {
        Object[] datos = new Object[5];
        String MEDIO_DE_PAGO;
        int CNT_DEVUELTA = 0;
        if (radioefectivo.isSelected()) {
            MEDIO_DE_PAGO = radioefectivo.getText();
            CNT_DEVUELTA = edicion.toNumeroEntero(txtcntrecibida.getText())
                    - edicion.toNumeroEntero(txtsubtotal.getText());
        } else {
            MEDIO_DE_PAGO = radiotarjeta.getText();
        }
        datos[0] = "" + txtnumfactura.getText() + "";
        datos[1] = "'" + MEDIO_DE_PAGO + "'";
        datos[2] = "'" + txtnumrecibo.getText() + "'";
        datos[3] = "" + edicion.toNumeroEntero(txtcntrecibida.getText()) + "";
        datos[4] = "" + CNT_DEVUELTA + "";
        return datos;
    }

    private void CARGAR_FACTURA_VENTA(Object IDFACTURA) {
        facturaVenta = factVentaDao.SELECT_VENTA(IDFACTURA);
        if (facturaVenta != null) {
            txtnumfactura.setText(edicion.AGREGAR_CEROS_LEFT(facturaVenta.getNumeroFactura()));
            JDateFactura.setDate(facturaVenta.getFechaFactura());
            if (facturaVenta.getMedioPago().equals(radioefectivo.getText())) {
                radioefectivo.setSelected(true);
                txtcntrecibida.setText("$ " + formatoTexto.numerico(facturaVenta.getCntrecibida()));
                txtdevuelta.setText("$ " + formatoTexto.numerico(facturaVenta.getCntdevuelta()));
            } else {
                radiotarjeta.setSelected(true);
                txtnumrecibo.setText(facturaVenta.getNumerorecibo());
            }
            if (!facturaVenta.getNumOrdenPedido().equals("null")) {
                RadioOrden.setSelected(true);
                TXTTIPOFACT.setText(facturaVenta.getNumOrdenPedido());
            } else if (!facturaVenta.getPlansepare().equals("null")) {
                RadioPlan.setSelected(true);
                TXTTIPOFACT.setText(facturaVenta.getPlansepare());
            } else {
                RadioArticulo.setSelected(true);
                TXTTIPOFACT.setText(null);
            }
            CARGAR_CLIENTE(facturaVenta.getCliente().getNombrecompleto());
            CARGAR_DETALLE();
        } else {
            edicion.mensajes(1, "la factura aun no hacido registrada.");
        }
    }

    private void CARGAR_DETALLE() {
        edicion.llenarTabla(TB_detalle,
                factVentaDao.SELECT_DETALLEVENTA(txtnumfactura.getText()));
        calculatotalesfactura();
    }

    private void FACTURAR_FACTURA_VENTA() {
        if (VALIDAD_FACTURA() != false) {
            if (factVentaDao.FACTURAR_FACTURA(DATOS_FACTURAR_VENTA()) != false) {
                int sino = (int) edicion.msjQuest(1, "deseas imprimir la factura.");
                if (sino == 0) {
                    report.FACTURA_VENTA_TIKECT(txtnumfactura.getText());
                

}
            }
        }
    }

}

class validador {

    public static java.util.HashMap<String, javax.swing.JInternalFrame> jIframes = new java.util.HashMap<>();

    public static void addJIframe(String key, javax.swing.JInternalFrame jiframe) {
        jIframes.put(key, jiframe);
    }

    public static javax.swing.JInternalFrame getJInternalFrame(String key) {
        return jIframes.get(key);
    }
}
