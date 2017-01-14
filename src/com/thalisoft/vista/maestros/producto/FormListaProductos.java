package com.thalisoft.vista.maestros.producto;

import com.thalisoft.controller.index.ControllerContenedor;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.model.maestros.producto.ProductoDao;
import com.thalisoft.vista.maestros.empleado.FormEmpleado;
import com.thalisoft.vista.ventas.FormFacturaVenta;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jose Felix
 */
public class FormListaProductos extends javax.swing.JInternalFrame {

    Edicion edicion = new Edicion();
    ProductoDao Pdao;
    private final TableRowSorter trsFiltro;
    int opcionFiltro = 2;

    public FormListaProductos() {
        Pdao = new ProductoDao();
        initComponents();
        LLENAR_LISTADO_DE_REFERENCIAS();
        txtfiltro.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadenafiltra = (txtfiltro.getText());
                txtfiltro.setText(cadenafiltra.toUpperCase());
                repaint();
                filtro();
            }

            private void filtro() {
                if (radioreferencia.isSelected()) {
                    opcionFiltro = 2;
                }
                if (radioreferencia.isSelected()) {
                    opcionFiltro = 1;
                }
                if (radiodescripcion.isSelected() | radioreferencia.isSelected()) {
                    trsFiltro.setRowFilter(RowFilter.regexFilter(txtfiltro.getText(), opcionFiltro));
                    edicion.calcula_total(TB_LISTAPRODUCTOS, LB_ITEM, txtcostototal, 7);
                } else {
                    edicion.mensajes(1, "selecciona una opcion para filtrar.");
                }
            }
        });
        trsFiltro = new TableRowSorter(TB_LISTAPRODUCTOS.getModel());
        TB_LISTAPRODUCTOS.setRowSorter(trsFiltro);
        txtfiltro.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_LISTAPRODUCTOS = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        radioreferencia = new javax.swing.JRadioButton();
        radiodescripcion = new javax.swing.JRadioButton();
        txtfiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcostototal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LB_ITEM = new javax.swing.JLabel();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/tag-mod.png"))); // NOI18N
        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2), "REFERENCIAS REGISTRADAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        TB_LISTAPRODUCTOS.setBackground(new java.awt.Color(0, 102, 153));
        TB_LISTAPRODUCTOS.setForeground(new java.awt.Color(255, 255, 255));
        TB_LISTAPRODUCTOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Ficha", "No. Referencia", "Descripción", "Stock Actual", "Costo Unid", "Precio Venta", "$ Utilidad", "Costo Total Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TB_LISTAPRODUCTOS.setComponentPopupMenu(jPopupMenu1);
        TB_LISTAPRODUCTOS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TB_LISTAPRODUCTOS.setRowHeight(22);
        TB_LISTAPRODUCTOS.setSelectionBackground(new java.awt.Color(255, 102, 102));
        TB_LISTAPRODUCTOS.getTableHeader().setReorderingAllowed(false);
        TB_LISTAPRODUCTOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_LISTAPRODUCTOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_LISTAPRODUCTOS);
        if (TB_LISTAPRODUCTOS.getColumnModel().getColumnCount() > 0) {
            TB_LISTAPRODUCTOS.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_LISTAPRODUCTOS.getColumnModel().getColumn(1).setMaxWidth(65);
            TB_LISTAPRODUCTOS.getColumnModel().getColumn(2).setMinWidth(250);
            TB_LISTAPRODUCTOS.getColumnModel().getColumn(3).setMaxWidth(75);
        }

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/price-tag.png"))); // NOI18N
        jButton1.setToolTipText("Nueva Referencia");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/printer.png"))); // NOI18N
        jButton2.setToolTipText("Imprimir Referencias");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/exit.png"))); // NOI18N
        jButton3.setToolTipText("Salir");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Por"));

        buttonGroup1.add(radioreferencia);
        radioreferencia.setText("Referencia");

        buttonGroup1.add(radiodescripcion);
        radiodescripcion.setText("Descripción");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfiltro)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(radioreferencia)
                        .addGap(18, 18, 18)
                        .addComponent(radiodescripcion)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioreferencia)
                    .addComponent(radiodescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setText("COSTO DE INVENTARIO ACTUAL");

        txtcostototal.setEditable(false);
        txtcostototal.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        txtcostototal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcostototal.setText("$ 0");

        jLabel2.setText("ITEM ACTUALES:");

        LB_ITEM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LB_ITEM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_ITEM.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LB_ITEM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtcostototal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcostototal, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LB_ITEM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OPEN_FRM_REFERENCIA();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormProducto fp = new FormProducto(this);
        JInternalFrame ji = validador.getJInternalFrame(FormProducto.class.getName());

        if (ji == null || ji.isClosed()) {
            if (fp.CONSULTA_PRODUCTO(TB_LISTAPRODUCTOS.getValueAt(TB_LISTAPRODUCTOS.getSelectedRow(), 0)) != false) {
                fp.LOAD_PRODUCT_COMPONET();
            }

            ji = fp;

            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormProducto.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        OPEN_FRM_REFERENCIA();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void TB_LISTAPRODUCTOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_LISTAPRODUCTOSMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_TB_LISTAPRODUCTOSMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_ITEM;
    private javax.swing.JTable TB_LISTAPRODUCTOS;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton radiodescripcion;
    private javax.swing.JRadioButton radioreferencia;
    private javax.swing.JTextField txtcostototal;
    private javax.swing.JTextField txtfiltro;
    // End of variables declaration//GEN-END:variables

    private void OPEN_FRM_REFERENCIA() {
        JInternalFrame ji = validador.getJInternalFrame(FormProducto.class.getName());

        if (ji == null || ji.isClosed()) {
            ji = new FormProducto(this);
            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormProducto.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void LLENAR_LISTADO_DE_REFERENCIAS() {
        edicion.llenarTabla(TB_LISTAPRODUCTOS, Pdao.LISTADO_DE_PRODUCTOS());
        edicion.calcula_total(TB_LISTAPRODUCTOS, LB_ITEM, txtcostototal, 7);
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
