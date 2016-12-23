package com.thalisoft.vista.ventas;

import com.thalisoft.vista.compra.*;
import com.thalisoft.controller.index.ControllerContenedor;
import com.thalisoft.main.util.CambiaFormatoTexto;
import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.model.compras.FacturaCompra;
import com.thalisoft.model.compras.FacturaCompraDao;
import com.thalisoft.model.maestros.producto.Producto;
import com.thalisoft.model.maestros.producto.ProductoDao;
import com.thalisoft.model.maestros.proveedor.ProveedorDao;
import com.thalisoft.vista.maestros.cliente.FormCliente;
import com.thalisoft.vista.maestros.producto.FormProducto;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class FormFacturaVenta extends javax.swing.JInternalFrame {

    Edicion edicion = new Edicion();
    CambiaFormatoTexto formatoTexto = new CambiaFormatoTexto();
    ProductoDao productoDao;
    FacturaCompra facturaCompra;
    FacturaCompraDao factCompraDao;
    ProveedorDao proveedorDao;

    public FormFacturaVenta() {
        proveedorDao = new ProveedorDao();
        facturaCompra = new FacturaCompra();
        factCompraDao = new FacturaCompraDao();
        productoDao = new ProductoDao();
        initComponents();
        llenar_combo();
        accionesfml();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnumfactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JDateFactura = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        RadioArticulo = new javax.swing.JRadioButton();
        RadioOrden = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtvalorpago = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lb_item = new javax.swing.JLabel();
        RadioPlan = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtidentificacion1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txttelefono1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtdireccion1 = new javax.swing.JTextField();
        combocliente1 = new javax.swing.JComboBox<>();
        LBTIPOFAC = new javax.swing.JLabel();
        TXTTIPOFACT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        comboproducto = new javax.swing.JComboBox<>();
        txtcantidad = new javax.swing.JTextField();
        txtcostound = new javax.swing.JTextField();
        txtcostototal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_detalle = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
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

        jLabel1.setText("FACTURA No.");

        txtnumfactura.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel2.setText("FECHA FACTURA");

        JDateFactura.setDateFormatString("EEE, dd MMMM yyyy");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setText("QUE DESEAS FACTURAR?");

        buttonGroup1.add(RadioArticulo);
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

        jLabel11.setText("SUBTOTAL");

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsubtotal.setText("$ 0");

        jLabel12.setText(" SALDO ACTUAL");

        txtsaldo.setEditable(false);
        txtsaldo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtsaldo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsaldo.setText("$ 0");

        jLabel13.setText("TOTAL A PAGAR");

        txtvalorpago.setEditable(false);
        txtvalorpago.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtvalorpago.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtvalorpago.setText("$ 0");

        jLabel14.setText("Item Agregados:");

        lb_item.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        lb_item.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_item.setText("0");

        buttonGroup1.add(RadioPlan);
        RadioPlan.setText("PLAN SEPARE");
        RadioPlan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadioPlanItemStateChanged(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel18.setText("No. DE IDENTIFICACION");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("TELFONOS");

        txtidentificacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentificacion1ActionPerformed(evt);
            }
        });

        jLabel20.setText("NOMBRES Y APELLIDOS");

        txttelefono1.setEditable(false);

        jLabel21.setText("DIRECCIÓN");

        txtdireccion1.setEditable(false);

        combocliente1.setEditable(true);
        combocliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel20))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel21)))
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txttelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdireccion1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtidentificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combocliente1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidentificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combocliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(LBTIPOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RadioArticulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioPlan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnumfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDateFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXTTIPOFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalorpago, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_item, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvalorpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnumfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioArticulo)
                            .addComponent(jLabel4)
                            .addComponent(RadioPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioOrden)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JDateFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBTIPOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTTIPOFACT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        comboproducto.setEditable(true);
        comboproducto.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        comboproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtcantidad.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcantidad.setText("0");

        txtcostound.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtcostound.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcostound.setText("$ 0");

        txtcostototal.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtcostototal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcostototal.setText("$ 0");

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/save.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(85, 85, 85)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcostound, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcostototal)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(2, 2, 2))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcostound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcostototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setBackground(new java.awt.Color(153, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/userconfig-icono-8183-32.png"))); // NOI18N
        jMenu1.setText("Gestion");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-nuevo-documento-de-archivo-mas-icono-6249-32.png"))); // NOI18N
        jMenuItem2.setText("Nuevo");
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/reload.png"))); // NOI18N
        jMenuItem4.setText("Modificar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/tablet-with-price-tag.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioArticuloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadioArticuloItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            JDateFactura.setDate(DateUtil.newDateTime());

        }
    }//GEN-LAST:event_RadioArticuloItemStateChanged

    private void RadioOrdenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadioOrdenItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            JDateFactura.setDate(null);
        }
    }//GEN-LAST:event_RadioOrdenItemStateChanged

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (VALIDAR_FORMULARIO() != false) {
            if (factCompraDao.CRUD_COMPRA(DATOS_FACTURA(0)) != false) {
                edicion.llenarTabla(TB_detalle,
                        factCompraDao.SELECT_DETALLECOMPRA(txtnumfactura.getText()));
                calculatotalesfactura();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas eliminar el producto?");
        if (SI_NO == 0) {
            int idcompra = Integer.parseInt(TB_detalle.getValueAt(TB_detalle.getSelectedRow(), 0).toString());
            if (factCompraDao.BORRAR_PRODUCTO_DETALLE(idcompra) != false) {
                edicion.menu_emergente(TB_detalle);
                calculatotalesfactura();
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Object factura = edicion.msjQuest(2, "ingresa el numero de la factura de compra.");
        facturaCompra = factCompraDao.SELECT_COMPRA(factura);
        if (facturaCompra != null) {
            if ("CONTADO".equals(facturaCompra.getTipoCompra())) {
                RadioArticulo.setSelected(true);
            } else {
                RadioOrden.setSelected(true);
            }
            txtnumfactura.setText(facturaCompra.getNumeroFactura());
            JDateFactura.setDate(facturaCompra.getFechaFactura());
            edicion.llenarTabla(TB_detalle, factCompraDao.SELECT_DETALLECOMPRA(factura));
            calculatotalesfactura();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if (VALIDAR_FORMULARIO() != false) {
            if (factCompraDao.CRUD_COMPRA(DATOS_FACTURA(1)) != false) {
                edicion.llenarTabla(TB_detalle,
                        factCompraDao.SELECT_DETALLECOMPRA(txtnumfactura.getText()));
                calculatotalesfactura();
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void RadioPlanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadioPlanItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioPlanItemStateChanged

    private void txtidentificacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentificacion1ActionPerformed
        CARGAR_CLIENTE(txtidentificacion.getText());
    }//GEN-LAST:event_txtidentificacion1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateFactura;
    private javax.swing.JLabel LBTIPOFAC;
    private javax.swing.JRadioButton RadioArticulo;
    private javax.swing.JRadioButton RadioOrden;
    private javax.swing.JRadioButton RadioPlan;
    private javax.swing.JTable TB_detalle;
    private javax.swing.JTextField TXTTIPOFACT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combocliente;
    private javax.swing.JComboBox<String> combocliente1;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lb_item;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcostototal;
    private javax.swing.JTextField txtcostound;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdireccion1;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtidentificacion1;
    private javax.swing.JTextField txtnumfactura;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefono1;
    private javax.swing.JTextField txtvalorpago;
    // End of variables declaration//GEN-END:variables

    private boolean VALIDAR_FORMULARIO() {

        if (txtnumfactura.getText().isEmpty() | txtnumfactura.getText() == null) {
            edicion.mensajes(1, "ingrese el numero de factura.");
            return false;
        }



        if (!RadioArticulo.isSelected() && !RadioOrden.isSelected()) {
            edicion.mensajes(1, "selecciona una forma de pago.");
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

        return true;
    }

    private void llenar_combo() {

        comboproducto.removeAllItems();
        comboproducto.addItem(null);
        combocliente.addItem(null);
        Object[][] rs = proveedorDao.LISTADO_PROVEEDORS();
        if (rs.length > 0) {
            for (Object[] objects : rs) {
                combocliente.addItem(objects[2].toString());
            }
        }

        productoDao.LISTA_PRODUCTOS().stream().forEach((producto) -> {
            comboproducto.addItem(producto.getDescripcion());
        });
    }

    private void accionesfml() {
        comboproducto.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (evt.getStateChange() == ItemEvent.SELECTED && comboproducto.getSelectedItem().toString().isEmpty() != true) {
                CARGAR_PRODUCTO(comboproducto.getSelectedItem().toString());
            }
        });

        txtcantidad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CALCULARTOTALCOMPRA();
            }
        });

        txtcostound.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CALCULARTOTALCOMPRA();
            }
        });
    }

    private void CALCULARTOTALCOMPRA() {
        int totalcompra = edicion.toNumeroEntero(txtcostound.getText())
                * edicion.toNumeroEntero(txtcantidad.getText());
        txtcostototal.setText("$ " + formatoTexto.numerico(totalcompra));
    }

    private void CARGAR_PRODUCTO(String text) {

        Producto producto = productoDao.READ_PRODUCTO(text);
        if (producto != null) {
            txtreferencia.setText(producto.getReferencia());
            comboproducto.setSelectedItem(producto.getDescripcion());
            txtcostound.setText("$ " + formatoTexto.numerico(producto.getCosto_und()));
            txtcantidad.selectAll();
            txtcantidad.requestFocus();

        } else {

            int SI_NO = (int) edicion.msjQuest(1, "el producto no se encuentra registrado, deseas registrarlo?");
            if (SI_NO == 0) {
                JInternalFrame ji = validador.getJInternalFrame(FormProducto.class.getName());
                if (ji == null || ji.isClosed()) {
                    ji = new FormProducto();
                    ControllerContenedor.getjDesktopPane1().add(ji, 0);
                    validador.addJIframe(FormProducto.class.getName(), ji);
                    ji.setVisible(true);
                } else {
                    ji.show(true);
                    try {
                        ji.setIcon(false);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    private Object[] DATOS_FACTURA(int opcion) {
        Object[] datos = new Object[10];
        String FORMA_PAGO;
        if (opcion == 0 | opcion == 1 | opcion == 2) {
            datos[0] = opcion;
        }
        if (RadioArticulo.isSelected()) {
            FORMA_PAGO = RadioArticulo.getText();
        } else {
            FORMA_PAGO = RadioOrden.getText();
        }
        datos[1] = "'" + edicion.formatearFechaSQL(JDateFactura.getDate()) + "'";
        datos[3] = "'" + txtnumfactura.getText() + "'";
        datos[4] = "'" + FORMA_PAGO + "'";
        datos[5] = proveedorDao.CONSULTAR_PROVEEDOR("'" + combocliente.getSelectedItem() + "'").getIdproveedor();
        datos[6] = "'" + Variables_Gloabales.EMPLEADO.getIdentificacion() + "'";
        datos[7] = edicion.toNumeroEntero(txtcantidad.getText());
        datos[8] = edicion.toNumeroEntero(txtcostound.getText());
        datos[9] = "'" + txtreferencia.getText() + "'";
        return datos;
    }

    private void calculatotalesfactura() {
        edicion.calcula_total(TB_detalle, lb_item, txtsubtotal, 5);
        facturaCompra = factCompraDao.SELECT_COMPRA(txtnumfactura.getText());
        if (facturaCompra != null) {
            txtsaldo.setText("$ " + formatoTexto.numerico(facturaCompra.getSaldo()));
        }
        int totalpagar = edicion.toNumeroEntero(txtsubtotal.getText())
                - edicion.toNumeroEntero(txtsaldo.getText());
        txtvalorpago.setText("$ " + formatoTexto.numerico(totalpagar));
    }

    private void CARGAR_CLIENTE(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
