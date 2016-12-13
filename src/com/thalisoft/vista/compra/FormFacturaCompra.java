package com.thalisoft.vista.compra;

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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class FormFacturaCompra extends javax.swing.JInternalFrame {

    Edicion edicion = new Edicion();
    CambiaFormatoTexto formatoTexto = new CambiaFormatoTexto();
    ProductoDao productoDao;
    FacturaCompra facturaCompra;
    FacturaCompraDao factCompraDao;
    ProveedorDao proveedorDao;

    public FormFacturaCompra() {
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
        jLabel3 = new javax.swing.JLabel();
        JDateVence = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        comboproveedor = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Radiocontado = new javax.swing.JRadioButton();
        Radiocredito = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtvalorpago = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtdescuento = new javax.swing.JTextField();
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
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem1.setText("ELIMINAR");
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);
        setForeground(java.awt.Color.orange);
        setIconifiable(true);
        setTitle("Factura de Compra");

        jPanel1.setBackground(new java.awt.Color(209, 192, 192));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)), "COMPRAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 24))); // NOI18N

        jLabel1.setText("FACTURA No.");

        jLabel2.setText("FECHA FACTURA");

        JDateFactura.setDateFormatString("EEE, dd MMMM yyyy");

        jLabel3.setText("FECHA DE VENCIMIENTO");

        JDateVence.setDateFormatString("EEE, dd MMMM yyyy");

        jLabel5.setText("PROVEEDOR");

        comboproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setText("FORMA DE PAGO");

        buttonGroup1.add(Radiocontado);
        Radiocontado.setText("CONTADO");
        Radiocontado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadiocontadoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(Radiocredito);
        Radiocredito.setText("CREDITO");
        Radiocredito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadiocreditoItemStateChanged(evt);
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

        jLabel14.setText("TOTAL DESCUENTO");

        txtdescuento.setEditable(false);
        txtdescuento.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtdescuento.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtdescuento.setText("$ 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Radiocontado)
                        .addGap(18, 18, 18)
                        .addComponent(Radiocredito))
                    .addComponent(txtnumfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JDateVence, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addComponent(JDateFactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalorpago, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnumfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Radiocontado)
                    .addComponent(Radiocredito)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JDateFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JDateVence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvalorpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(212, 193, 114));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DETALLE COMPRA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel6.setText("REFERENCIA");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel7.setText("DESCRIPCION");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel8.setText("CANTIDAD");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel9.setText("COSTO UNIDAD");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("COSTO TOTAL");

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

        TB_detalle.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        TB_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id. Detalle", "Referencia", "Descripcion", "Cantidad", "Costo Unidad", "Costo Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(txtcostototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/view-employed.png"))); // NOI18N
        jMenuItem5.setText("Consultar");
        jMenu1.add(jMenuItem5);
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
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadiocontadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadiocontadoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            JDateFactura.setDate(DateUtil.newDateTime());
            JDateVence.setDate(DateUtil.newDateTime());
        }
    }//GEN-LAST:event_RadiocontadoItemStateChanged

    private void RadiocreditoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadiocreditoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            JDateFactura.setDate(null);
            JDateVence.setDate(null);
        }
    }//GEN-LAST:event_RadiocreditoItemStateChanged

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
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateFactura;
    private com.toedter.calendar.JDateChooser JDateVence;
    private javax.swing.JRadioButton Radiocontado;
    private javax.swing.JRadioButton Radiocredito;
    private javax.swing.JTable TB_detalle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.JComboBox<String> comboproveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcostototal;
    private javax.swing.JTextField txtcostound;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtnumfactura;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txtvalorpago;
    // End of variables declaration//GEN-END:variables

    private boolean VALIDAR_FORMULARIO() {

        if (txtnumfactura.getText().isEmpty() | txtnumfactura.getText() == null) {
            edicion.mensajes(1, "ingrese el numero de factura.");
            return false;
        }

        if (comboproveedor.getSelectedItem() == null) {
            edicion.mensajes(1, "por favor selecciona el proveedor.");
            return false;
        }

        if (!Radiocontado.isSelected() && !Radiocredito.isSelected()) {
            edicion.mensajes(1, "selecciona una forma de pago.");
            return false;
        }

        if (JDateFactura.getDate() == null) {
            edicion.mensajes(1, "selecciona la fecha de la factura.");
            return false;
        }
        if (JDateVence.getDate() == null) {
            edicion.mensajes(1, "selecciona la fecha de vencimiento de la factura.");
            return false;
        }
        if (JDateFactura.getDate().after(JDateVence.getDate()) != false) {
            edicion.mensajes(1, "LA FECHA DE LA FACTURA NO PUEDE SER MAYOR A LA FECHA DE VENCIMIENTO.");
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
        comboproveedor.removeAllItems();
        comboproducto.removeAllItems();
        comboproducto.addItem(null);
        comboproveedor.addItem(null);
        for (Object[] objects : proveedorDao.LISTADO_PROVEEDORS()) {
            comboproveedor.addItem(objects[2].toString());
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
        if (Radiocontado.isSelected()) {
            FORMA_PAGO = Radiocontado.getText();
        } else {
            FORMA_PAGO = Radiocredito.getText();
        }
        datos[1] = "'" + edicion.formatearFechaSQL(JDateFactura.getDate()) + "'";
        datos[2] = "'" + edicion.formatearFechaSQL(JDateVence.getDate()) + "'";
        datos[3] = "'" + txtnumfactura.getText() + "'";
        datos[4] = "'" + FORMA_PAGO + "'";
        datos[5] = proveedorDao.CONSULTAR_PROVEEDOR("'" + comboproveedor.getSelectedItem() + "'").getIdproveedor();
        datos[6] = "'" + Variables_Gloabales.EMPLEADO.getIdentificacion() + "'";
        datos[7] = edicion.toNumeroEntero(txtcantidad.getText());
        datos[8] = edicion.toNumeroEntero(txtcostound.getText());
        datos[9] = "'" + txtreferencia.getText() + "'";
        return datos;
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
