package com.thalisoft.vista.preventa.cotizacion;

import com.thalisoft.controller.index.ControllerContenedor;
import com.thalisoft.main.util.CambiaFormatoTexto;
import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.main.util.report.Manager_Report;
import com.thalisoft.model.maestros.cliente.Cliente;
import com.thalisoft.model.maestros.cliente.ClienteDao;
import com.thalisoft.model.maestros.producto.Producto;
import com.thalisoft.model.maestros.producto.ProductoDao;
import com.thalisoft.model.preventa.cotizacion.Cotizacion;
import com.thalisoft.model.preventa.cotizacion.CotizacionDao;
import com.thalisoft.vista.maestros.cliente.FormCliente;
import com.thalisoft.vista.maestros.producto.FormProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class FormCotizacion extends javax.swing.JInternalFrame {

    Edicion edicion = new Edicion();
    CambiaFormatoTexto formatoTexto = new CambiaFormatoTexto();
    CotizacionDao cotizacionDao;
    Cliente cliente;
    Producto producto;
    ClienteDao clienteDao;
    ProductoDao productoDao;

    public FormCotizacion() {
        clienteDao = new ClienteDao();
        productoDao = new ProductoDao();
        cotizacionDao = new CotizacionDao();
        initComponents();
        AccionesFormulario();
        llenarcombos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnumcotizacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JD_fechaEmision = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        combocliente = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        comboproducto = new javax.swing.JComboBox<>();
        txtcantidad = new javax.swing.JTextField();
        txtvalorunidad = new javax.swing.JTextField();
        txtvalortotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_DETALLE = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lbitem = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/delete.png"))); // NOI18N
        jMenuItem6.setText("ELIMINAR");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem6);

        setClosable(true);
        setIconifiable(true);
        setTitle("Cotizador de Productos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("COTIZACIÓN DE PRODUCTOS");

        jLabel2.setText("No. COTIZACION");

        txtnumcotizacion.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel3.setText("FECHA DE EMISION");

        JD_fechaEmision.setDateFormatString("EEE dd MMM yyyy");

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel5.setText("No. DE IDENTIFICACION");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TELFONOS");

        txtidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentificacionActionPerformed(evt);
            }
        });

        jLabel7.setText("NOMBRES Y APELLIDOS");

        txttelefono.setEditable(false);

        jLabel8.setText("DIRECCIÓN");

        txtdireccion.setEditable(false);

        combocliente.setEditable(true);
        combocliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel8)))
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdireccion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combocliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REFERENCIA");

        jLabel10.setText("DESCRIPCIÓN");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CANTIDAD");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("VALOR UNIDAD");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("VALOR TOTAL");

        txtreferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreferenciaActionPerformed(evt);
            }
        });

        comboproducto.setEditable(true);
        comboproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboproducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboproductoItemStateChanged(evt);
            }
        });

        txtcantidad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcantidad.setText("0");

        txtvalorunidad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtvalorunidad.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtvalorunidad.setText("$ 0");
        txtvalorunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorunidadActionPerformed(evt);
            }
        });

        txtvalortotal.setEditable(false);
        txtvalortotal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtvalortotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtvalortotal.setText("$ 0");
        txtvalortotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalortotalActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/save.png"))); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TB_DETALLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID.", "Referencia", "Descripcion", "Cantidad", "Vr. Unidad", "Vr. Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
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
        TB_DETALLE.setComponentPopupMenu(jPopupMenu1);
        TB_DETALLE.setRowHeight(23);
        TB_DETALLE.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TB_DETALLE);
        if (TB_DETALLE.getColumnModel().getColumnCount() > 0) {
            TB_DETALLE.getColumnModel().getColumn(0).setMaxWidth(50);
            TB_DETALLE.getColumnModel().getColumn(2).setMinWidth(200);
        }

        jLabel4.setText("ITEM AGREGADOS");

        lbitem.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbitem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbitem.setText("0");

        jLabel15.setText("SUB-TOTAL");

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsubtotal.setText("$ 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtvalorunidad)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtvalortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbitem, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalorunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbitem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumcotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JD_fechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(210, 210, 210))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumcotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(JD_fechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/userconfig-icono-8183-32.png"))); // NOI18N
        jMenu1.setText("Gestion");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/add-page.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/reload.png"))); // NOI18N
        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/view-employed.png"))); // NOI18N
        jMenuItem3.setText("Consultar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/printer.png"))); // NOI18N
        jMenuItem4.setText("Imprimir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/cancel.png"))); // NOI18N
        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void txtidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentificacionActionPerformed
        CARGAR_CLIENTE(txtidentificacion.getText());
    }//GEN-LAST:event_txtidentificacionActionPerformed

    private void txtreferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreferenciaActionPerformed
        CARGAR_PRODUCTO(txtreferencia.getText());
    }//GEN-LAST:event_txtreferenciaActionPerformed

    private void comboproductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboproductoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboproductoItemStateChanged

    private void txtvalorunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorunidadActionPerformed

    }//GEN-LAST:event_txtvalorunidadActionPerformed

    private void txtvalortotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalortotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalortotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Validar_Formulario() != false) {
            if (cotizacionDao.CRUD_COTIZACION(CARGAR_DATOS(0)) != false) {
                CARGAR_DETALLE();
                txtreferencia.setText(null);
                comboproducto.setSelectedItem(null);
                txtcantidad.setText("0");
                txtvalorunidad.setText("$ 0");
                txtvalortotal.setText("$ 0");
                txtreferencia.grabFocus();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int row = TB_DETALLE.getSelectedRow();
        cotizacionDao.SELECT_COTIZACION(3 + "," + edicion.toNumeroEntero(TB_DETALLE.getValueAt(row, 0).toString()));
        CARGAR_DETALLE();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Object key = edicion.msjQuest(2, "ingresa el numero de la cotizacion.");
        CONSULTAR_COTIZACION(key);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        NUEVA_COTIZACION();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas modificar la cotizacion.");
        if (SI_NO == 0) {
            if (cotizacionDao.CRUD_COTIZACION(CARGAR_DATOS(1)) != false) {
                edicion.mensajes(2, "modificacion realizada correctamente.");
            }
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Manager_Report mr = new Manager_Report();
        mr.COTIZACION(txtnumcotizacion.getText());
    }//GEN-LAST:event_jMenuItem4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JD_fechaEmision;
    private javax.swing.JTable TB_DETALLE;
    private javax.swing.JComboBox<String> combocliente;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbitem;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnumcotizacion;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtvalortotal;
    private javax.swing.JTextField txtvalorunidad;
    // End of variables declaration//GEN-END:variables

    private void CARGAR_CLIENTE(String text) {
        cliente = clienteDao.CONSULTAR_CLIENTE(text);
        if (cliente != null) {
            txtidentificacion.setText(cliente.getIdentificacion());
            combocliente.setSelectedItem(cliente.getNombrecompleto());
            txttelefono.setText(cliente.getTelefono());
            txtdireccion.setText(cliente.getDireccion());
        } else {
            int SI_NO = (int) edicion.msjQuest(1, "el cliente no se encuentra registrado, deseas registrarlo?");
            if (SI_NO == 0) {
                JInternalFrame ji = validador.getJInternalFrame(FormCliente.class.getName());
                if (ji == null || ji.isClosed()) {
                    ji = new FormCliente();
                    ControllerContenedor.getjDesktopPane1().add(ji, 0);
                    validador.addJIframe(FormCliente.class.getName(), ji);
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

    private void NUEVA_COTIZACION() {
        llenarcombos();
        txtidentificacion.setText(null);
        txttelefono.setText(null);
        txtdireccion.setText(null);
        combocliente.setSelectedItem(null);
        CARGAR_DETALLE();
        txtreferencia.setText(null);
        comboproducto.setSelectedItem(null);
        txtcantidad.setText("0");
        txtvalorunidad.setText("$ 0");
        txtvalortotal.setText("$ 0");
        lbitem.setText("0");
        txtsubtotal.setText("$ 0");
    }

    private boolean CONSULTAR_COTIZACION(Object key) {
        Object[][] rs = cotizacionDao.SELECT_COTIZACION(0 + "," + key);
        if (rs.length > 0) {
            txtnumcotizacion.setText(rs[0][0].toString());
            JD_fechaEmision.setDate(DateUtil.getDateTime(rs[0][1]));
            CARGAR_CLIENTE(rs[0][2].toString());
            CARGAR_DETALLE();
            return true;
        } else {
            edicion.mensajes(1, "la cotizacion # " + key + " no se encuentra registrada.");
        }
        return false;
    }

    private void CARGAR_PRODUCTO(String text) {
        producto = productoDao.READ_PRODUCTO(text);
        if (producto != null) {
            txtreferencia.setText(producto.getReferencia());
            comboproducto.setSelectedItem(producto.getDescripcion());
            txtvalorunidad.setText("$ " + formatoTexto.numerico(producto.getPrecio_venta()));
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

    private boolean Validar_Formulario() {
        if (txtidentificacion.getText().isEmpty() | txtidentificacion.getText() == null) {
            edicion.mensajes(1, "ingresa el numero de identidad del cliente.");
            return false;
        }

        if (txtreferencia.getText().isEmpty() | txtreferencia.getText() == null) {
            edicion.mensajes(1, "ingresa la referencia del producto.");
            return false;
        }

        if (edicion.toNumeroEntero(txtcantidad.getText()) < 1) {
            edicion.mensajes(1, "la cantidad debe ser mayor a cero (0).");
            return false;
        }
        return true;
    }

    private void CARGAR_DETALLE() {
        Object[][] rs = cotizacionDao.SELECT_COTIZACION("1," + txtnumcotizacion.getText());
        if (rs.length > 0) {
            edicion.llenarTabla(TB_DETALLE, rs);
            edicion.calcula_total(TB_DETALLE, lbitem, txtsubtotal, 5);
        } else {
            edicion.limpiar_tablas(TB_DETALLE);
        }
    }

    private void llenarcombos() {
        combocliente.removeAllItems();
        comboproducto.removeAllItems();
        combocliente.addItem("");
        comboproducto.addItem("");
        for (Object[] objects : clienteDao.LISTADO_CLIENTES()) {
            combocliente.addItem(objects[2].toString());
        }
        for (Producto p : productoDao.LISTA_PRODUCTOS()) {
            comboproducto.addItem(p.getDescripcion());
        }

        JD_fechaEmision.setDate(DateUtil.newDateTime());
        txtnumcotizacion.setText(cotizacionDao.NUMERO_COTIZACION());
    }

    private void AccionesFormulario() {
        AutoCompleteDecorator.decorate(combocliente);
        AutoCompleteDecorator.decorate(comboproducto);
        combocliente.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CARGAR_CLIENTE(combocliente.getSelectedItem().toString());
            }
        });
        comboproducto.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CARGAR_PRODUCTO(comboproducto.getSelectedItem().toString());
            }
        });
        txtcantidad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CALCULARTOTALCOMPRA();
            }
        });
        txtvalorunidad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CALCULARTOTALCOMPRA();
            }
        });
    }

    private void CALCULARTOTALCOMPRA() {
        int totalcompra = edicion.toNumeroEntero(txtvalorunidad.getText())
                * edicion.toNumeroEntero(txtcantidad.getText());
        txtvalortotal.setText("$ " + formatoTexto.numerico(totalcompra));
    }

    private Object[] CARGAR_DATOS(int opcion) {
        Object[] datos = new Object[7];
        if (opcion == 0 | opcion == 1 | opcion == 2 | opcion == 3) {
            datos[0] = opcion;
        }
        datos[1] = edicion.toNumeroEntero(txtnumcotizacion.getText());
        datos[2] = "'" + txtreferencia.getText() + "'";
        datos[3] = edicion.toNumeroEntero(txtcantidad.getText());
        datos[4] = edicion.toNumeroEntero(txtvalorunidad.getText());
        datos[5] = "'" + txtidentificacion.getText() + "'";
        datos[6] = "'" + Variables_Gloabales.EMPLEADO.getIdentificacion() + "'";
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
