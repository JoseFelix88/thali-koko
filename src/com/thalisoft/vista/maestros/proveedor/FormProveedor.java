package com.thalisoft.vista.maestros.proveedor;

import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.model.maestros.producto.Producto;
import com.thalisoft.model.maestros.producto.ProductoDao;
import com.thalisoft.model.maestros.proveedor.BancoProveedor;
import com.thalisoft.model.maestros.proveedor.Proveedor;
import com.thalisoft.model.maestros.proveedor.ProveedorDao;
import java.awt.event.ItemEvent;

public class FormProveedor extends javax.swing.JInternalFrame {

    FormListarProveedor formListarProveedor;
    Edicion edicion = new Edicion();
    Proveedor proveedor;
    ProveedorDao Provdao;
    ProductoDao productoDao;
    private Object idsucursal;

    public FormProveedor() {
        initComponents();
    }

    public FormProveedor(FormListarProveedor aThis) {
        formListarProveedor = aThis;
        Provdao = new ProveedorDao();
        productoDao = new ProductoDao();
        initComponents();
        llenar_combos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPopuproducto = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopudescuento = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopuContable = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnumficha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcontacto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttelcontacto = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtrazonsocial = new javax.swing.JTextField();
        txtnit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Referencia = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        comboproducto = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_Descuentos = new javax.swing.JTable();
        txtdiahabil = new javax.swing.JTextField();
        txtporcdescuento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtsucursal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        combotipocta = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txttitular = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtnumcta = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_banco = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/delete.png"))); // NOI18N
        jMenuItem1.setText("ELIMINAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopuproducto.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/delete.png"))); // NOI18N
        jMenuItem2.setText("ELLIMINAR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopudescuento.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/delete.png"))); // NOI18N
        jMenuItem3.setText("ELIMINAR");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopuContable.add(jMenuItem3);

        setClosable(true);
        setIconifiable(true);
        setTitle("Proveedor");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3), "PROVEEDOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/identification-ard.png"))); // NOI18N

        jLabel2.setText("No. Ficha");

        jLabel3.setText("NIT");

        txtnumficha.setEditable(false);

        jLabel4.setText("Razon Social");

        jLabel5.setText("Direccion");

        jLabel6.setText("Telefono");

        jLabel7.setText("Contacto");

        jLabel8.setText("Tel. Contacto");

        jLabel9.setText("E-mail");

        txtcorreo.setText("@");

        jLabel10.setText("DESCRIPCION");

        TB_Referencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "REFERENCIA", "DESCRIPCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Referencia.setComponentPopupMenu(jPopuproducto);
        TB_Referencia.setRowHeight(22);
        TB_Referencia.getTableHeader().setReorderingAllowed(false);
        TB_Referencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_ReferenciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_Referencia);
        if (TB_Referencia.getColumnModel().getColumnCount() > 0) {
            TB_Referencia.getColumnModel().getColumn(1).setMinWidth(250);
        }

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("REFERENCIA");

        txtreferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreferenciaActionPerformed(evt);
            }
        });

        comboproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboproducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboproductoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtreferencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel10)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Productos Asociados", jPanel3);

        jPanel5.setBackground(new java.awt.Color(153, 153, 0));

        jLabel16.setText("DIAS HABILES ");

        jLabel17.setText("% DE DESCUENTO");

        TB_Descuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DIAS HABILES", "% DE DESCUENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_Descuentos.setComponentPopupMenu(jPopudescuento);
        TB_Descuentos.setRowHeight(22);
        TB_Descuentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TB_Descuentos);

        txtdiahabil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdiahabil.setText("0");

        txtporcdescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtporcdescuento.setText("0 %");
        txtporcdescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtporcdescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel17))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtdiahabil, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtporcdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtporcdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiahabil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Descuentos", jPanel5);

        jLabel13.setText("SUCURSAL BANCARIA");

        jLabel14.setText("TIPO DE CUENTA");

        combotipocta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "CUENTA  AHORRO", "CUENTA  CORRIENTE" }));

        jLabel15.setText("TITULAR DE LA CTA");

        jLabel18.setText("NUMERO DE CTA");

        TB_banco.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        TB_banco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SUCURSAL", "TIPO DE CTA", "TITULAR", "No. DE CTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_banco.setComponentPopupMenu(jPopuContable);
        TB_banco.setRowHeight(22);
        jScrollPane3.setViewportView(TB_banco);
        if (TB_banco.getColumnModel().getColumnCount() > 0) {
            TB_banco.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_banco.getColumnModel().getColumn(1).setMinWidth(100);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/file.png"))); // NOI18N
        jButton1.setToolTipText("Agregar Sucursal");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel13))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttitular, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combotipocta, javax.swing.GroupLayout.Alignment.TRAILING, 0, 239, Short.MAX_VALUE)
                            .addComponent(txtsucursal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnumcta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(combotipocta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txttitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtnumcta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informacion Contable", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/save.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/add-page.png"))); // NOI18N
        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/people-searcher.png"))); // NOI18N
        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/shift-change.png"))); // NOI18N
        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/exit.png"))); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtcorreo))
                                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnumficha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txttelcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txttelcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas registrar el proveedor?");
        if (SI_NO == 0) {
            if (validarProveedor() != false) {
                if (consulta_proveedor(txtnit.getText()) != true) {
                    if (Provdao.CRUD_PROVEEDOR(montar_proveedor(0))) {
                        edicion.mensajes(2, "proveedor registrado correctamente.");
                    }
                } else {
                    edicion.mensajes(1, "el proveedor se encuentra registrado.");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nuevo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object id_proveedor = edicion.msjQuest(2, "ingresa el numero de nit");
        if (id_proveedor != null) {
            if (consulta_proveedor("'" + id_proveedor + "'") != true) {
                edicion.mensajes(1, "el proveedor no se encuentra registrado.");
            } else {
                load_componet();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void comboproductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboproductoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Producto p = productoDao.READ_PRODUCTO("'" + comboproducto.getSelectedItem() + "'");
            if (p != null) {
                txtreferencia.setText(p.getReferencia());
            } else {
                txtreferencia.setText(null);
            }
        }
    }//GEN-LAST:event_comboproductoItemStateChanged

    private void txtreferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreferenciaActionPerformed
        if (validarProveedor() != false) {
            if (consulta_proveedor(txtnumficha.getText()) != true) {
                edicion.mensajes(3, "el proveedor no se encuentra registrado.");
                return;
            }
            if (consulta_proveedor(txtnumficha.getText()) == true) {
                Producto p = productoDao.READ_PRODUCTO("'" + txtreferencia.getText() + "'");
                if (p != null) {
                    comboproducto.setSelectedItem(p.getDescripcion());
                    registrar_proveedor(5);
                } else {
                    comboproducto.setSelectedItem(null);
                }
            }
        }
    }//GEN-LAST:event_txtreferenciaActionPerformed

    private void txtporcdescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtporcdescuentoActionPerformed
        if (validarProveedor() != false) {
            if (consulta_proveedor(txtnumficha.getText()) != false) {
                edicion.mensajes(3, "el proveedor no se encuentra registrado.");
                return;
            }
            if (edicion.toNumeroEntero(txtdiahabil.getText()) > 0
                    && edicion.toNumeroEntero(txtporcdescuento.getText()) > 0) {
                registrar_proveedor(3);
            } else {
                edicion.mensajes(1, "los dias habiles y % de descuento deben ser mayores a cero (0).");
            }
        }
    }//GEN-LAST:event_txtporcdescuentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CRUD_BANCO();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas eliminar el producto?");
        if (SI_NO == 0) {
            if (Provdao.CRUD_PROVEEDOR(montar_proveedor(6))) {
                edicion.menu_emergente(TB_Referencia);
                edicion.mensajes(2, "el producto fue eliminado.");
            }
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (validarProveedor() != false) {
            int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas modificar el proveedor?");
            if (SI_NO == 0) {
                System.out.println("modificar_numficha: "+consulta_proveedor(txtnumficha.getText())+""
                        + "\nmod_nit: "+consulta_proveedor(txtnit.getText()));
                if (consulta_proveedor(txtnumficha.getText()) != false) {
                    if (Provdao.CRUD_PROVEEDOR(montar_proveedor(1))) {
                        edicion.mensajes(2, "proveedor modificado correctamente.");
                    }
                } else {
                    edicion.mensajes(1, "el proveedor se no encuentra registrado.");
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas eliminar el descuento?");
        if (SI_NO == 0) {
            if (Provdao.CRUD_PROVEEDOR(montar_proveedor(4))) {
                edicion.menu_emergente(TB_Descuentos);
                edicion.mensajes(2, "el descuento fue eliminado.");
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void TB_ReferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ReferenciaMouseClicked
        if (evt.getClickCount() == 1) {
            txtreferencia.setText(TB_Referencia.getValueAt(TB_Referencia.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_TB_ReferenciaMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas eliminar la sucursal bancaria?");
        if (SI_NO == 0) {
            this.idsucursal = TB_banco.getValueAt(TB_banco.getSelectedRow(), 0);
            if (Provdao.CRUD_BANCO_PROVEEDOR(Cargar_Banco(1))) {
                edicion.menu_emergente(TB_banco);
                edicion.mensajes(2, "la sucursal fue eliminado.");
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_Descuentos;
    private javax.swing.JTable TB_Referencia;
    private javax.swing.JTable TB_banco;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.JComboBox<String> combotipocta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopuContable;
    private javax.swing.JPopupMenu jPopudescuento;
    private javax.swing.JPopupMenu jPopuproducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtcontacto;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdiahabil;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnumcta;
    private javax.swing.JTextField txtnumficha;
    private javax.swing.JTextField txtporcdescuento;
    private javax.swing.JTextField txtrazonsocial;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txtsucursal;
    private javax.swing.JTextField txttelcontacto;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttitular;
    // End of variables declaration//GEN-END:variables

    private void llenar_combos() {
        for (Producto producto : productoDao.LISTA_PRODUCTOS()) {
            comboproducto.addItem(producto.getDescripcion());
        }

        txtnumficha.setText(Provdao.NUMERO_FICHA());
    }

    boolean consulta_proveedor(Object key) {
        proveedor = Provdao.CONSULTAR_PROVEEDOR(key);
        return proveedor != null;
    }

    void nuevo() {
        proveedor = new Proveedor();
        load_componet();
        txtnumficha.setText(Provdao.NUMERO_FICHA());
    }

    Object[] montar_proveedor(int opcion) {
        Object[] key = new Object[13];
        if (opcion == 0) {
            key[0] = opcion;
        }
        if (opcion == 1) {
            key[0] = opcion;
        }
        if (opcion == 2) {
            key[0] = opcion;
        }
        if (opcion == 3) {
            key[0] = opcion;
        }
        if (opcion == 4) {
            key[0] = opcion;
        }
        if (opcion == 5) {
            key[0] = opcion;
        }
        if (opcion == 6) {
            key[0] = opcion;
        }
        key[1] = "'" + txtnit.getText() + "'";
        key[2] = "'" + txtrazonsocial.getText().toUpperCase() + "'";
        key[3] = "'" + txtdireccion.getText() + "'";
        key[4] = "'" + txttelefono.getText() + "'";
        key[5] = "'" + txtcontacto.getText().toUpperCase() + "'";
        key[6] = "'" + txttelcontacto.getText() + "'";
        key[7] = "'" + txtcorreo.getText() + "'";
        key[8] = Variables_Gloabales.EMPLEADO.getIdentificacion();
        key[9] = edicion.toNumeroEntero(txtnumficha.getText());
        key[10] = edicion.toNumeroEntero(txtdiahabil.getText());
        key[11] = edicion.toNumeroFloat(txtporcdescuento.getText());
        key[12] = "'" + txtreferencia.getText() + "'";
        return key;
    }

    void load_componet() {
        txtnumficha.setText("" + proveedor.getIdproveedor());
        txtnit.setText(proveedor.getNit());
        txtrazonsocial.setText(proveedor.getRazonsocial());
        txtdireccion.setText(proveedor.getDireccion());
        txttelefono.setText(proveedor.getTelefono());
        txtcontacto.setText(proveedor.getContacto());
        txttelcontacto.setText(proveedor.getTelcontacto());
        txtcorreo.setText(proveedor.getCorreo());
        txtsucursal.setText(null);
        txtnumcta.setText(null);
        combotipocta.setSelectedItem(null);
        txttitular.setText(null);
        edicion.llenarTabla(TB_Referencia, Provdao.PRODUCTOS_PROVEEDORS(proveedor.getIdproveedor()));
        edicion.llenarTabla(TB_Descuentos, Provdao.DESCUENTOS_PROVEEDOR(proveedor.getIdproveedor()));
        edicion.llenarTabla(TB_banco, Provdao.BANCO_PROVEEDOR(proveedor.getIdproveedor()));
    }

    boolean validarProveedor() {
        if (txtnit.getText().isEmpty() | txtnit.getText() == null) {
            edicion.mensajes(1, "ingresa el numero de nit.");
            return false;
        }
        if (txtrazonsocial.getText().isEmpty() | txtrazonsocial.getText() == null) {
            edicion.mensajes(1, "ingresa la razon social.");
            return false;
        }
        if (txttelefono.getText().isEmpty() | txttelefono.getText() == null) {
            edicion.mensajes(1, "ingresa el numero de telefono.");
        }
        return true;
    }

    private void registrar_proveedor(int i) {

        if (Provdao.CRUD_PROVEEDOR(montar_proveedor(i))) {
            edicion.llenarTabla(TB_Referencia, Provdao.PRODUCTOS_PROVEEDORS(txtnumficha.getText()));
            edicion.llenarTabla(TB_Descuentos, Provdao.DESCUENTOS_PROVEEDOR(txtnumficha.getText()));
            edicion.llenarTabla(TB_banco, Provdao.BANCO_PROVEEDOR(txtnumficha.getText()));
        }

    }

    Object[] Cargar_Banco(int opcion) {

        Object[] key = new Object[7];
        if (opcion == 0) {
            key[0] = opcion;
        }
        if (opcion == 1) {
            key[0] = opcion;
        }
        if (opcion == 2) {
            key[0] = opcion;
        }
        key[1] = idsucursal;
        key[2] = "'" + txtsucursal.getText().toUpperCase() + "'";
        key[3] = "'" + txtnumcta.getText() + "'";
        key[4] = "'" + txtnumficha.getText() + "'";
        key[5] = "'" + combotipocta.getSelectedItem() + "'";
        key[6] = "'" + txttitular.getText().toUpperCase() + "'";
        return key;
    }

    private void CRUD_BANCO() {
        if (validarProveedor() != false) {

            if (validar_banco() != false) {
                if (consulta_proveedor(txtnumficha.getText()) != true) {
                    edicion.mensajes(3, "el proveedor no se encuentra registrado.");
                    return;
                }
                if (Provdao.CRUD_BANCO_PROVEEDOR(Cargar_Banco(0))) {
                    txtsucursal.setText(null);
                    txtnumcta.setText(null);
                    combotipocta.setSelectedItem(null);
                    txttitular.setText(null);
                    edicion.llenarTabla(TB_banco, Provdao.BANCO_PROVEEDOR(txtnumficha.getText()));
                }
            }
        }
    }

    private boolean validar_banco() {
        if (txtsucursal.getText() == null | txtsucursal.getText().isEmpty()) {
            edicion.mensajes(1, "especifica el nombre de la sucursal.");
            txtsucursal.grabFocus();
            return false;
        }
        if (combotipocta.getSelectedItem() == null | combotipocta.getSelectedItem().equals("")) {
            edicion.mensajes(1, "seleccione el tipo de cuenta.");
            combotipocta.grabFocus();
            return false;
        }
        if (txttitular.getText() == null | txttitular.getText().isEmpty() != false) {
            edicion.mensajes(1, "especifica el nombre del titular de la cuenta.");
            txttitular.grabFocus();
            return false;
        }
        if (txtnumcta.getText() == null | txtnumcta.getText().isEmpty() != false) {
            edicion.mensajes(1, "especifica el numero de cuenta.");
            txtnumcta.grabFocus();
            return false;
        }
        return true;
    }
}
