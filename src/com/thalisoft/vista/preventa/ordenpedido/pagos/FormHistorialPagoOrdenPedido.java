package com.thalisoft.vista.preventa.ordenpedido.pagos;

import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.report.Manager_Report;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedidoDao;

public class FormHistorialPagoOrdenPedido extends javax.swing.JInternalFrame {

    OrdenPedidoDao pedidoDao;
    Edicion edicion = new Edicion();
    Manager_Report report = new Manager_Report();

    public FormHistorialPagoOrdenPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JD_INICIO = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        JD_FINAL = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TXTNUMPEDIDO = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_HIS_CLIENTE = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        LBCNT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTABONOSCLIENTES = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_HIS_PROVEEDOR = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LBCNTPGPRO = new javax.swing.JLabel();
        TXTABONOSPROVEEDOR = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Historial de Pagos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTORIAL DE PAGOS ORDEN DE PEDIDO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 0, 18))); // NOI18N
        jPanel1.setToolTipText("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        JD_INICIO.setDateFormatString("EEE, dd MMM yyyy");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Periodo de Fechas");

        JD_FINAL.setDateFormatString("EEE, dd MMM yyyy");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No. de Orden de Pedido");

        TXTNUMPEDIDO.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/printer.png"))); // NOI18N
        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/liberacion-de-la-puerta-icono-9156-32.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTNUMPEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(JD_INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JD_FINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JD_FINAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JD_INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTNUMPEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TB_HIS_CLIENTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID. PAGO", "FECHA HORA REG.", "MEDIO DE PAGO", "ORDEN DE PEDIDO", "No. RECIBO", "$ ABONO", "$ SALDO", "$ RECIBIDO", "$ DEVUELTO", "CLIENTE", "ESTADO", "REGISTRADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TB_HIS_CLIENTE.setRowHeight(22);
        TB_HIS_CLIENTE.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TB_HIS_CLIENTE);
        if (TB_HIS_CLIENTE.getColumnModel().getColumnCount() > 0) {
            TB_HIS_CLIENTE.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_HIS_CLIENTE.getColumnModel().getColumn(1).setMinWidth(150);
            TB_HIS_CLIENTE.getColumnModel().getColumn(9).setMinWidth(120);
        }

        jLabel3.setText("CANT. PAGOS REGISTRADOS");

        LBCNT.setBackground(new java.awt.Color(153, 255, 153));
        LBCNT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBCNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBCNT.setText("0");
        LBCNT.setOpaque(true);

        jLabel4.setText("SUB-TOTAL ABONOS");

        TXTABONOSCLIENTES.setEditable(false);
        TXTABONOSCLIENTES.setBackground(new java.awt.Color(102, 255, 102));
        TXTABONOSCLIENTES.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TXTABONOSCLIENTES.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        TXTABONOSCLIENTES.setText("$ 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LBCNT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTABONOSCLIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBCNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTABONOSCLIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("PAGOS CLIENTES", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TB_HIS_PROVEEDOR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID. PAGO", "F.H INGRESO", "No. Pedido", "$ ABONO", "$ SALDO", "MEDIO DE PAGO", "$ CNT. RECIBIDA", "$ CNT. DEVUELTA", "No. RECIBO", "PROVEEDOR", "ESTADO"
            }
        ));
        TB_HIS_PROVEEDOR.setRowHeight(22);
        TB_HIS_PROVEEDOR.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TB_HIS_PROVEEDOR);
        if (TB_HIS_PROVEEDOR.getColumnModel().getColumnCount() > 0) {
            TB_HIS_PROVEEDOR.getColumnModel().getColumn(0).setMaxWidth(60);
            TB_HIS_PROVEEDOR.getColumnModel().getColumn(1).setMinWidth(150);
        }

        jLabel5.setText("SUB-TOTAL ABONOS");

        jLabel6.setText("CANT. PAGOS REGISTRADOS");

        LBCNTPGPRO.setBackground(new java.awt.Color(153, 255, 153));
        LBCNTPGPRO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBCNTPGPRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBCNTPGPRO.setText("0");
        LBCNTPGPRO.setOpaque(true);

        TXTABONOSPROVEEDOR.setEditable(false);
        TXTABONOSPROVEEDOR.setBackground(new java.awt.Color(102, 255, 102));
        TXTABONOSPROVEEDOR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TXTABONOSPROVEEDOR.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        TXTABONOSPROVEEDOR.setText("$ 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBCNTPGPRO, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTABONOSPROVEEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBCNTPGPRO, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(TXTABONOSPROVEEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("PAGOS PROVEEDORES", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CONSULTAR_HISTORIAL();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:.
        Object[] key = {JD_INICIO.getDate(), JD_FINAL.getDate(), TXTNUMPEDIDO.getText()};
        report.HISTORIAL_PAGOS_CLIENTES_PROVEEDOR(key);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JD_FINAL;
    private com.toedter.calendar.JDateChooser JD_INICIO;
    private javax.swing.JLabel LBCNT;
    private javax.swing.JLabel LBCNTPGPRO;
    private javax.swing.JTable TB_HIS_CLIENTE;
    private javax.swing.JTable TB_HIS_PROVEEDOR;
    private javax.swing.JTextField TXTABONOSCLIENTES;
    private javax.swing.JTextField TXTABONOSPROVEEDOR;
    private javax.swing.JTextField TXTNUMPEDIDO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void CONSULTAR_HISTORIAL() {

        if (JD_FINAL.getDate() == null && JD_INICIO.getDate() == null
                | TXTNUMPEDIDO.getText() == null && TXTNUMPEDIDO.getText().isEmpty()) {
            edicion.mensajes(1, "seleccione un criterio de busqueda. Periodo de fechas o # de orden de pedido.");
            return;
        }
        if (DateUtil.daysDiff(JD_INICIO.getDate(), JD_FINAL.getDate()) < 0) {
            edicion.mensajes(1, "la fecha de inicio no puede ser mayor a la fecha final.");
            return;
        }
        Object[] key = {edicion.formatearFechaSQL(JD_INICIO.getDate()),
            edicion.formatearFechaSQL(JD_FINAL.getDate()), TXTNUMPEDIDO.getText()};
        pedidoDao = new OrdenPedidoDao();
        Object[][] rs = pedidoDao.HISTORIAL_PAGOS_PROVEEDOR(key);
        if (rs.length > 0) {
            edicion.llenarTabla(TB_HIS_PROVEEDOR, rs);
        } else {
            edicion.limpiar_tablas(TB_HIS_PROVEEDOR);
        }
        rs = pedidoDao.HISTORIAL_PAGOS_CLIENTES(key);
        if (rs.length > 0) {
            edicion.llenarTabla(TB_HIS_CLIENTE, rs);
        } else {
            edicion.limpiar_tablas(TB_HIS_CLIENTE);
        }
        edicion.calcula_total(TB_HIS_CLIENTE, LBCNT, TXTABONOSCLIENTES, 5);
        edicion.calcula_total(TB_HIS_PROVEEDOR, LBCNTPGPRO, TXTABONOSPROVEEDOR, 3);
    }
}
