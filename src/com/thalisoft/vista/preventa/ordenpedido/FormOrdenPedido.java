package com.thalisoft.vista.preventa.ordenpedido;

import com.thalisoft.controller.index.ControllerContenedor;
import com.thalisoft.main.util.CambiaFormatoTexto;
import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.main.util.report.Manager_Report;
import com.thalisoft.model.maestros.cliente.Cliente;
import com.thalisoft.model.maestros.cliente.ClienteDao;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedido;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedidoDao;
import com.thalisoft.model.maestros.producto.Producto;
import com.thalisoft.model.maestros.producto.ProductoDao;
import com.thalisoft.model.maestros.proveedor.Proveedor;
import com.thalisoft.model.maestros.proveedor.ProveedorDao;
import com.thalisoft.vista.maestros.cliente.FormCliente;
import com.thalisoft.vista.index.Contenedor;
import com.thalisoft.vista.preventa.ordenpedido.pagos.cliente.FormPagosCliente;
import com.thalisoft.vista.maestros.producto.FormProducto;
import com.thalisoft.vista.preventa.ordenpedido.pagos.FormHistorialPagoOrdenPedido;
import com.thalisoft.vista.preventa.ordenpedido.pagos.proveedor.FormPagosProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class FormOrdenPedido extends javax.swing.JInternalFrame {

    OrdenPedido ordenCompra;
    OrdenPedidoDao ordenCompraDao;
    ProductoDao productoDao;
    ProveedorDao proveedorDao;
    ClienteDao clienteDao;
    Manager_Report report;

    Edicion edicion = new Edicion();
    CambiaFormatoTexto formatoTexto = new CambiaFormatoTexto();
    int totalcompra, utilidad, utilidadneta, costounidad, costoneto;
    private Object KEY, IDDETALLEORDEN;
    private String NUMERO_ORDEN;

    public FormOrdenPedido() {
        report = new Manager_Report();
        clienteDao = new ClienteDao();
        productoDao = new ProductoDao();
        proveedorDao = new ProveedorDao();
        ordenCompraDao = new OrdenPedidoDao();

        initComponents();
        AccionesFormulario();
        llenarCombos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnumorden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JDfechaEmision = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        JDfechaEntrega = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        comboproveedor = new javax.swing.JComboBox<>();
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
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtespecificacion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_DETALLE = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lbitem = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtnumcotizacion = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/delete.png"))); // NOI18N
        jMenuItem8.setText("ELIMINAR");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem8);

        setClosable(true);
        setIconifiable(true);
        setTitle("Orden de Pedido");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORDEN DE PEDIDO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jLabel1.setText("NUMERO DE ORDEN");

        txtnumorden.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnumorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumordenActionPerformed(evt);
            }
        });

        jLabel2.setText("FECHA DE EMISIÓN");

        JDfechaEmision.setDateFormatString("EEE dd MMM yyyy");

        jLabel3.setText("FECHA DE ENTREGA");

        JDfechaEntrega.setDateFormatString("EEE dd MMM yyyy");

        jLabel4.setText(" PROVEEDOR");

        comboproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));

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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUCTO"));
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

        jLabel14.setText("ESPECIFICACIONES");

        txtespecificacion.setColumns(20);
        txtespecificacion.setLineWrap(true);
        txtespecificacion.setRows(5);
        jScrollPane2.setViewportView(txtespecificacion);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/save.png"))); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(txtreferencia))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtvalorunidad, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtvalortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(77, 77, 77))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalorunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap())
                    .addComponent(jScrollPane2)))
        );

        TB_DETALLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID.", "Referencia", "Descripcion", "Especificación", "Cantidad", "Vr. Unidad", "Vr. Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTALES"));

        jLabel15.setText("ITEM AGREGADOS");

        lbitem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbitem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbitem.setText("0");

        jLabel17.setText("SUB-TOTAL");

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsubtotal.setText("$ 0");

        txtsaldo.setEditable(false);
        txtsaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtsaldo.setForeground(new java.awt.Color(255, 51, 51));
        txtsaldo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsaldo.setText("$ 0");

        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("SALDO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(lbitem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(40, 40, 40)
                        .addComponent(txtsaldo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(lbitem, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setText("No. DE COTIZACION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumorden, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JDfechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JDfechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnumcotizacion))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnumorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(JDfechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtnumcotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(JDfechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/add-page.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
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
        jMenu1.add(jSeparator3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/folder.png"))); // NOI18N
        jMenuItem7.setText("Relacion de Pedidos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/imprimir-icono-3650-32.png"))); // NOI18N
        jMenu3.setText("Imprimir");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ads.png"))); // NOI18N
        jMenuItem9.setText("Pedido");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jSeparator4.setBackground(new java.awt.Color(204, 204, 0));
        jMenu3.add(jSeparator4);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/investment.png"))); // NOI18N
        jMenuItem10.setText("Orden de Pedido");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/exit.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pagos");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/money.png"))); // NOI18N
        jMenuItem5.setText("Pago a Proveedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/de-pago-con-tarjeta-de-credito-icono-3855-48.png"))); // NOI18N
        jMenuItem6.setText("Pago de Cliente");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/folder.png"))); // NOI18N
        jMenuItem11.setText("Historial de Pagos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 255));
        jSeparator1.setOpaque(true);
        jMenu2.add(jSeparator1);

        jMenuBar1.add(jMenu2);

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
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumordenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumordenActionPerformed

    private void txtvalortotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalortotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalortotalActionPerformed

    private void txtvalorunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorunidadActionPerformed

    }//GEN-LAST:event_txtvalorunidadActionPerformed

    private void txtidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentificacionActionPerformed
        CARGAR_CLIENTE(txtidentificacion.getText());
    }//GEN-LAST:event_txtidentificacionActionPerformed

    private void txtreferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreferenciaActionPerformed
        CARGAR_PRODUCTO(txtreferencia.getText());
    }//GEN-LAST:event_txtreferenciaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            KEY = edicion.msjQuest(2, "por favor INGRESA EL NUMERO DE LA ORDEN DE COMPRA.");
            ordenCompra = ordenCompraDao.CONSULTA_ORDEN_COMPRA(KEY);
            if (ordenCompra != null) {
                Montar_Data_Componente();
            } else {
                edicion.mensajes(1, "la orden ingresada no se encuentra registrada");
            }
        } catch (ParseException ex) {
            Logger.getLogger(FormOrdenPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        int SI_NO = (int) edicion.msjQuest(1, "estas seguro que deseas eliminar el producto?");
        if (SI_NO == 0) {
            IDDETALLEORDEN = TB_DETALLE.getValueAt(TB_DETALLE.getSelectedRow(), 0).toString();
            ordenCompraDao.CRUD_ORDENCOMPRA(Cargar_Data_Componente(2));
            edicion.menu_emergente(TB_DETALLE);
            edicion.calcula_total(TB_DETALLE, lbitem, txtsubtotal, 6);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        nuevo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Validar_Formulario() != false) {
            NUMERO_ORDEN = txtnumorden.getText();
            ordenCompraDao.CRUD_ORDENCOMPRA(Cargar_Data_Componente(0));
            CARGAR_DETALLE();
            txtreferencia.setText(null);
            comboproducto.setSelectedItem(null);
            txtcantidad.setText("0");
            txtvalorunidad.setText("$ 0");
            txtvalortotal.setText("$ 0");
            txtespecificacion.setText(null);
            txtreferencia.grabFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            NUMERO_ORDEN = txtnumorden.getText();
            if (ordenCompraDao.CONSULTA_ORDEN_COMPRA(NUMERO_ORDEN) != null) {
                if (Validar_Formulario() != false) {
                    int SI_NO = (int) edicion.msjQuest(1, "estas seguro que desea modificar la orden?");
                    if (SI_NO == 0) {
                        if (ordenCompraDao.CRUD_ORDENCOMPRA(Cargar_Data_Componente(1)) != false) {
                            CARGAR_DETALLE();
                            edicion.mensajes(2, "orden de pedido modificada correctamente");
                        }
                    }
                }
            } else {
                edicion.mensajes(1, "la orden aun no hacido registrada.");
            }
        } catch (ParseException ex) {
            Logger.getLogger(FormOrdenPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void comboproductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboproductoItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_comboproductoItemStateChanged

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            NUMERO_ORDEN = txtnumorden.getText();
            if (ordenCompraDao.CONSULTA_ORDEN_COMPRA(NUMERO_ORDEN) != null) {
                report.ORDEN_DE_COMPRA(NUMERO_ORDEN);
            } else {
                edicion.mensajes(1, "la orden de pedido # " + NUMERO_ORDEN + " no sea registrado.");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        try {
            NUMERO_ORDEN = txtnumorden.getText();
            if (ordenCompraDao.CONSULTA_ORDEN_COMPRA(NUMERO_ORDEN) != null) {
                report.ORDEN_DE_COMPRA_PEDIDO(NUMERO_ORDEN);
            } else {
                edicion.mensajes(1, "la orden de pedido # " + NUMERO_ORDEN + " no sea registrado.");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JInternalFrame ji = validador.getJInternalFrame(FormPagosCliente.class.getName());
        if (ji == null || ji.isClosed()) {
            ji = new FormPagosCliente();
            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormPagosCliente.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        JInternalFrame ji = validador.getJInternalFrame(FormPagosProveedor.class.getName());
        if (ji == null || ji.isClosed()) {
            ji = new FormPagosProveedor();
            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormPagosProveedor.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        JInternalFrame ji = validador.getJInternalFrame(FormHistorialPagoOrdenPedido.class.getName());
        if (ji == null || ji.isClosed()) {
            ji = new FormHistorialPagoOrdenPedido();
            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormHistorialPagoOrdenPedido.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormHistorialPagoOrdenPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        JInternalFrame ji = validador.getJInternalFrame(FormRelacionPedidos.class.getName());
        if (ji == null || ji.isClosed()) {
            ji = new FormRelacionPedidos();
            ControllerContenedor.getjDesktopPane1().add(ji, 0);
            validador.addJIframe(FormRelacionPedidos.class.getName(), ji);
            ji.setVisible(true);
        } else {
            ji.show(true);
            try {
                ji.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDfechaEmision;
    private com.toedter.calendar.JDateChooser JDfechaEntrega;
    private javax.swing.JTable TB_DETALLE;
    private javax.swing.JComboBox<String> combocliente;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.JComboBox<String> comboproveedor;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lbitem;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextArea txtespecificacion;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnumcotizacion;
    private javax.swing.JTextField txtnumorden;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtvalortotal;
    private javax.swing.JTextField txtvalorunidad;
    // End of variables declaration//GEN-END:variables

    private void llenarCombos() {
        combocliente.removeAllItems();
        comboproducto.removeAllItems();
        comboproveedor.removeAllItems();
        combocliente.addItem(null);
        comboproducto.addItem(null);
        comboproveedor.addItem(null);
        for (Object[] objects : clienteDao.LISTADO_CLIENTES()) {
            combocliente.addItem(objects[2].toString());
        }
        for (Producto producto : productoDao.LISTA_PRODUCTOS()) {
            comboproducto.addItem(producto.getDescripcion());
        }
        for (Object[] objects : proveedorDao.LISTADO_PROVEEDORS()) {
            comboproveedor.addItem(objects[2].toString());
        }
        Calendar cal = new GregorianCalendar();
        JDfechaEmision.setDate(cal.getTime());
        txtnumorden.setText(ordenCompraDao.NUMERO_ORDEN_COMPRA());
    }

    private void AccionesFormulario() {
        AutoCompleteDecorator.decorate(combocliente);
        AutoCompleteDecorator.decorate(comboproducto);
        combocliente.getEditor().addActionListener((ActionEvent e) -> {
            CARGAR_CLIENTE(combocliente.getSelectedItem());
        });
        combocliente.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (evt.getStateChange() == ItemEvent.SELECTED && combocliente.getSelectedItem().toString().isEmpty() != true) {
                CARGAR_CLIENTE(combocliente.getSelectedItem().toString());
            }
        });

        comboproducto.addItemListener((java.awt.event.ItemEvent evt) -> {
            if (evt.getStateChange() == ItemEvent.SELECTED && comboproducto.getSelectedItem().toString().isEmpty() != true) {
                CARGAR_PRODUCTO(comboproducto.getSelectedItem().toString());
            }
        });
        comboproducto.getEditor().addActionListener((ActionEvent e) -> {
            CARGAR_PRODUCTO(comboproducto.getSelectedItem());
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
        totalcompra = edicion.toNumeroEntero(txtcantidad.getText())
                * edicion.toNumeroEntero(txtvalorunidad.getText());
        txtvalorunidad.setText("$ " + formatoTexto.numerico(edicion.toNumeroEntero(txtvalorunidad.getText())));
        txtvalortotal.setText("$ " + formatoTexto.numerico(totalcompra));
        costoneto = costounidad * edicion.toNumeroEntero(txtcantidad.getText());
        utilidadneta = totalcompra - costoneto;
//        if (totalcompra < costoneto) {
//            edicion.mensajes(1, "no hay ganancia en este producto.");
//        }
    }

    private void CARGAR_CLIENTE(Object KEY) {
        Cliente cliente = clienteDao.CONSULTAR_CLIENTE(KEY);
        if (cliente != null) {
            txtidentificacion.setText(cliente.getIdentificacion());
            combocliente.setSelectedItem(cliente.getNombrecompleto());
            txttelefono.setText(cliente.getTelefono());
            txtdireccion.setText(cliente.getDireccion());
            txtreferencia.grabFocus();
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

    private void CARGAR_PRODUCTO(Object KEY) {

        if (KEY != null | !KEY.equals("") | KEY.toString().isEmpty() != true) {
            Producto producto = productoDao.READ_PRODUCTO(KEY);
            if (producto != null) {
                txtreferencia.setText(producto.getReferencia());
                comboproducto.setSelectedItem(producto.getDescripcion());
                txtvalorunidad.setText("$ " + formatoTexto.numerico(producto.getPrecio_venta()));
                utilidad = producto.getUtilidad();
                costounidad = producto.getCosto_und();
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
    }

    private boolean Validar_Formulario() {
        if (comboproveedor.getSelectedItem() == null) {
            edicion.mensajes(1, "por favor selecciona el proveedor.");
            return false;
        }
        if (txtidentificacion.getText().isEmpty() | combocliente.getSelectedItem().toString().isEmpty()
                | combocliente.getSelectedItem() == null) {
            edicion.mensajes(1, "por favor selecciona un cliente.");
            return false;
        }
        if (JDfechaEntrega.getDate() == null) {
            edicion.mensajes(1, "selecciona una fecha de entrega para la orden.");
            return false;
        }
        if (JDfechaEmision.getDate().after(JDfechaEntrega.getDate())
                | JDfechaEntrega.getDate().before(JDfechaEmision.getDate())) {
            edicion.mensajes(1, "la fecha de entrega no debe ser menor a la fecha de emision.");
            return false;
        }
        if (DateUtil.dateEquals(JDfechaEmision.getDate(), JDfechaEntrega.getDate())) {
            int SI_NO = (int) edicion.msjQuest(1, "la fecha de entrega es igual a la fecha de emision. "
                    + "Estas seguro que entregaras la orden hoy mismo?");
            if (SI_NO != 0) {
                return false;
            }
        }
        if (TB_DETALLE.getRowCount() < 1) {
            if (txtreferencia.getText().isEmpty() | comboproducto.getSelectedItem().toString().isEmpty()
                    | comboproducto.getSelectedItem() == null) {
                edicion.mensajes(1, "ingresa la referencia del producto o selecciona una de la lista.");
                return false;
            }

            if (edicion.toNumeroEntero(txtcantidad.getText()) < 1) {
                edicion.mensajes(1, "la cantidad debe ser mayor a cero(0).");
                return false;
            }
        }
        return true;
    }

    private void Montar_Data_Componente() {
        Formatter fmt = new Formatter();
        NUMERO_ORDEN = String.valueOf(ordenCompra.getIdordencompra());
        fmt.format("%04d", edicion.toNumeroEntero(NUMERO_ORDEN));
        txtnumorden.setText(fmt.toString());
        JDfechaEmision.setDate(ordenCompra.getFehcaEmision());
        JDfechaEntrega.setDate(ordenCompra.getFechaEntrega());
        txtnumcotizacion.setText((String) ordenCompra.getCotizacion());
        txtidentificacion.setText(ordenCompra.getCliente().getIdentificacion());
        txttelefono.setText(ordenCompra.getCliente().getTelefono());
        txtdireccion.setText(ordenCompra.getCliente().getDireccion());
        combocliente.setSelectedItem(ordenCompra.getCliente().getNombrecompleto());
        comboproveedor.setSelectedItem(ordenCompra.getProveedor().getRazonsocial());
        txtsubtotal.setText("$ " + formatoTexto.numerico(ordenCompra.getSubtotal()));
        txtsaldo.setText("$ " + formatoTexto.numerico(ordenCompra.getSaldo()));
        lbitem.setText("0");
        CARGAR_DETALLE();
    }

    private Object[] Cargar_Data_Componente(int opcion) {
        Object[] data = new Object[13];
        if (opcion == 0 | opcion == 1 | opcion == 2) {
            data[0] = opcion;
        }
        data[1] = NUMERO_ORDEN;
        data[2] = "'" + edicion.formatearFechaSQL(JDfechaEmision.getDate()) + "'";
        data[3] = "'" + edicion.formatearFechaSQL(JDfechaEntrega.getDate()) + "'";
        data[4] = proveedorDao.CONSULTAR_PROVEEDOR("'" + comboproveedor.getSelectedItem() + "'").getIdproveedor();
        data[5] = Variables_Gloabales.EMPLEADO.getIdentificacion();
        data[6] = "'" + txtidentificacion.getText() + "'";
        data[7] = "'" + txtnumcotizacion.getText() + "'";
        data[8] = "'" + txtreferencia.getText() + "'";
        data[9] = edicion.toNumeroEntero(txtcantidad.getText());
        data[10] = edicion.toNumeroEntero(txtvalorunidad.getText());
        data[11] = "'" + txtespecificacion.getText() + "'";
        data[12] = IDDETALLEORDEN;
        return data;
    }

    private void CARGAR_DETALLE() {
        Object[][] rs = ordenCompraDao.DETALLE_ORDEN_COMPRA(NUMERO_ORDEN);
        if (rs.length > 0) {
            edicion.llenarTabla(TB_DETALLE, rs);
            edicion.calcula_total(TB_DETALLE, lbitem, txtsubtotal, 6);
        } else {
            edicion.limpiar_tablas(TB_DETALLE);
        }

    }

    private void nuevo() {
        ordenCompra = new OrdenPedido();
        ordenCompra.setCliente(new Cliente());
        ordenCompra.setProveedor(new Proveedor());
        Montar_Data_Componente();
        txtreferencia.setText(null);
        txtvalortotal.setText("$ 0");
        txtvalorunidad.setText("$ 0");
        txtcantidad.setText("0");
        llenarCombos();
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
