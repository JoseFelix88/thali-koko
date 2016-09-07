package com.thalisoft.vista.pagos;

import com.thalisoft.main.util.CambiaFormatoTexto;
import com.thalisoft.main.util.DateUtil;
import com.thalisoft.main.util.Edicion;
import com.thalisoft.main.util.Variables_Gloabales;
import com.thalisoft.main.util.report.Manager_Report;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedido;
import com.thalisoft.model.preventa.ordenpedido.OrdenPedidoDao;
import com.thalisoft.model.preventa.ordenpedido.pagos.cliente.PagosClientes;
import com.thalisoft.model.preventa.ordenpedido.pagos.cliente.PagosClientesDao;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormPagosCliente extends javax.swing.JInternalFrame {

    OrdenPedido ordenCompra;
    Edicion edicion = new Edicion();
    CambiaFormatoTexto formatoNumero = new CambiaFormatoTexto();
    static String FORMA_PAGO;
    OrdenPedidoDao ordenDao;
    PagosClientesDao pagoDao;
    private Object NUMERO_RECIBO_PAGO;
    Manager_Report report = new Manager_Report();

    public FormPagosCliente() {
        pagoDao = new PagosClientesDao();
        initComponents();
        AccionesFormulario();
        nuevo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        radioefectivo = new javax.swing.JRadioButton();
        radiotarjeta = new javax.swing.JRadioButton();
        radiocheque = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtnumrecibo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jdfechaemision = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtnumidpago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnumorden = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtabono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcntrecibo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcntdevuelta = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtsaldoactual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtabonoacumulado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbabono = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/imprimir-icono-3650-32.png"))); // NOI18N
        jMenuItem7.setText("Imprimir Comprobante");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem7);

        setClosable(true);
        setIconifiable(true);
        setTitle("Pagos Cliente");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTIONAR PAGOS DEL CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Medio de Pago"));

        buttonGroup1.add(radioefectivo);
        radioefectivo.setText("Efectivo");
        radioefectivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioefectivoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(radiotarjeta);
        radiotarjeta.setText("Tarjeta");
        radiotarjeta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiotarjetaItemStateChanged(evt);
            }
        });

        buttonGroup1.add(radiocheque);
        radiocheque.setText("Cheque");
        radiocheque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiochequeItemStateChanged(evt);
            }
        });

        jLabel3.setText("No. del Recibo");

        txtnumrecibo.setEditable(false);
        txtnumrecibo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radioefectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiotarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiocheque)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumrecibo)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioefectivo)
                    .addComponent(radiotarjeta)
                    .addComponent(radiocheque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnumrecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel2.setText("Fecha de Emisión");

        jdfechaemision.setDateFormatString("EEE, dd MMM yyyy");
        jdfechaemision.setEnabled(false);

        jLabel1.setText("No. ID de Pago");

        txtnumidpago.setEditable(false);
        txtnumidpago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setText("No. Orden de Pedido");

        txtnumorden.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnumorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumordenActionPerformed(evt);
            }
        });

        jLabel5.setText("Cliente Titular");

        txtcliente.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcliente)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumidpago, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumorden, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumidpago, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel6.setText("VALOR DEL ABONO");

        txtabono.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtabono.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtabono.setText("$ 0");

        jLabel9.setText("CANT. RECIBIDA");

        txtcntrecibo.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtcntrecibo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcntrecibo.setText("$ 0");

        jLabel10.setText("CANT. DEVUELTA");

        txtcntdevuelta.setEditable(false);
        txtcntdevuelta.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtcntdevuelta.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtcntdevuelta.setText("$ 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtabono, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtcntrecibo)
                    .addComponent(txtcntdevuelta))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtabono)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcntrecibo)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcntdevuelta)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel7.setText("SUB-TOTAL");

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsubtotal.setText("$ 0");

        jLabel8.setText("SALDO ACTUAL");

        txtsaldoactual.setEditable(false);
        txtsaldoactual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtsaldoactual.setForeground(new java.awt.Color(255, 0, 51));
        txtsaldoactual.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtsaldoactual.setText("$ 0");

        jLabel11.setText("TOTAL ABONOS");

        txtabonoacumulado.setEditable(false);
        txtabonoacumulado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtabonoacumulado.setForeground(new java.awt.Color(0, 153, 255));
        txtabonoacumulado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtabonoacumulado.setText("$ 0");

        jLabel12.setText("CANT. ABONOS");

        lbabono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbabono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbabono.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsaldoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtabonoacumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbabono, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsaldoactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtabonoacumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbabono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(4, 4, 4))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial de Pagos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Pago", "Fecha de Emision", "Vr. Abono", "Vr. Saldo", "Medio de Pago", "Cnt. Recibida", "Cnt. Devuelta", "No. de Recibo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setRowHeight(22);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/money-bag.png"))); // NOI18N
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

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/save.png"))); // NOI18N
        jMenuItem2.setText("Registrar");
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
        jMenu1.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/imprimir-icono-3650-32.png"))); // NOI18N
        jMenuItem4.setText("Imprimir Comprobante");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cerrar.png"))); // NOI18N
        jMenuItem5.setText("Devolver Comprobante");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioefectivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioefectivoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FORMA_PAGO = radioefectivo.getText();
            txtcntrecibo.setEditable(true);
            txtnumrecibo.setEditable(false);
            txtnumrecibo.setText("");
            txtcntrecibo.selectAll();
            txtcntrecibo.requestFocus();
        }
    }//GEN-LAST:event_radioefectivoItemStateChanged

    private void radiotarjetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radiotarjetaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FORMA_PAGO = radiotarjeta.getText();
            txtcntrecibo.setEditable(false);
            txtcntrecibo.setText("$ 0");
            txtcntdevuelta.setText("$ 0");
            txtnumrecibo.setEditable(true);
            txtnumrecibo.selectAll();
            txtnumrecibo.requestFocus();
        }
    }//GEN-LAST:event_radiotarjetaItemStateChanged

    private void radiochequeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radiochequeItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FORMA_PAGO = radiocheque.getText();
            txtcntrecibo.setEditable(false);
            txtcntrecibo.setText("$ 0");
            txtcntdevuelta.setText("$ 0");
            txtnumrecibo.setEditable(true);
            txtnumrecibo.selectAll();
            txtnumrecibo.requestFocus();
        }
    }//GEN-LAST:event_radiochequeItemStateChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if (validacionFormulario() != false) {
            int si_no = (int) edicion.msjQuest(1, "estas seguro que deseas registrar el pago?");
            if (si_no == 0) {
                if (pagoDao.CRUD_PAGO_CLIENTE(Cargar_Data_Pago(0)) != false) {
                    CARGAR_HISTORICO_PAGO(txtnumorden.getText());
                    edicion.mensajes(2, "pago registrado correctamente.");
                }
            }
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void txtnumordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumordenActionPerformed
        try {
            ordenDao = new OrdenPedidoDao();
            ordenCompra = ordenDao.CONSULTA_ORDEN_COMPRA(txtnumorden.getText());
            if (ordenCompra != null) {
                txtcliente.setText(ordenCompra.getCliente().getIdentificacion() + " - " + ordenCompra.getCliente().getNombrecompleto());
                txtsubtotal.setText("$ " + formatoNumero.numerico(ordenCompra.getSubtotal()));
                txtsaldoactual.setText("$ " + formatoNumero.numerico(ordenCompra.getSaldo()));
                CARGAR_HISTORICO_PAGO(ordenCompra.getIdordencompra());
                txtabono.selectAll();
                txtabono.requestFocus();
            } else {
                edicion.mensajes(1, "la orden de pedido # " + txtnumorden.getText() + " no se encuentra registrada.");
            }
        } catch (ParseException ex) {
            Logger.getLogger(FormPagosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtnumordenActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        NUMERO_RECIBO_PAGO = edicion.msjQuest(2, "ingresa el numero de recibo de pago o comprobante.");
        report.RECIBO_DE_PAGO_CLIENTE(NUMERO_RECIBO_PAGO);
//        Montar_Data_Pago(key);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        report.RECIBO_DE_PAGO_CLIENTE(txtnumidpago.getText());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        NUMERO_RECIBO_PAGO = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        report.RECIBO_DE_PAGO_CLIENTE(NUMERO_RECIBO_PAGO);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        nuevo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdfechaemision;
    private javax.swing.JLabel lbabono;
    private javax.swing.JRadioButton radiocheque;
    private javax.swing.JRadioButton radioefectivo;
    private javax.swing.JRadioButton radiotarjeta;
    private javax.swing.JTextField txtabono;
    private javax.swing.JTextField txtabonoacumulado;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcntdevuelta;
    private javax.swing.JTextField txtcntrecibo;
    private javax.swing.JTextField txtnumidpago;
    private javax.swing.JTextField txtnumorden;
    private javax.swing.JTextField txtnumrecibo;
    private javax.swing.JTextField txtsaldoactual;
    private javax.swing.JTextField txtsubtotal;
    // End of variables declaration//GEN-END:variables

    private boolean validacionFormulario() {
        if (txtnumorden.getText().isEmpty() | txtnumorden.getText() == null) {
            edicion.mensajes(1, "ingresa el numero de la orden de pedido.");
            return false;
        }

        if (!radioefectivo.isSelected() && !radiocheque.isSelected() && !radiotarjeta.isSelected()) {
            edicion.mensajes(1, "selecciona un medio de pago.");
            return false;
        }

        if (edicion.toNumeroEntero(txtabono.getText()) < 1) {
            edicion.mensajes(1, "el valor del abono o pago debe ser mayor a cero (0).");
            return false;
        }

        if (edicion.toNumeroEntero(txtabono.getText()) > edicion.toNumeroEntero(txtsaldoactual.getText())) {
            edicion.mensajes(1, "el valor del abono no debe ser mayor al saldo.");
            return false;
        }

        if (radiocheque.isSelected() | radiotarjeta.isSelected() & txtnumrecibo.getText().isEmpty()) {
            edicion.mensajes(1, "ingresa el numero de serie del recibo o cheque.");
            return false;
        }

        if (radioefectivo.isSelected() && edicion.toNumeroEntero(txtcntrecibo.getText()) < 1) {
            edicion.mensajes(1, "por favor ingresa la cantidad de dinero recibida.");
            return false;
        }

        if (radioefectivo.isSelected() && edicion.toNumeroEntero(txtcntrecibo.getText()) < edicion.toNumeroEntero(txtabono.getText())) {
            int diferencia = edicion.toNumeroEntero(txtabono.getText()) - edicion.toNumeroEntero(txtcntrecibo.getText());
            String str = "el Dinero recibido es Insuficiente debido aque "
                    + "la cantidad de dinero recibida no puede ser menor al valor del abono."
                    + "\nAbono $ " + formatoNumero.numerico(edicion.toNumeroEntero(txtabono.getText())) + ", "
                    + "Recibido $ " + formatoNumero.numerico(edicion.toNumeroEntero(txtcntrecibo.getText())) + ", "
                    + "hacen falta $ " + formatoNumero.numerico(diferencia) + "";
            edicion.mensajes(3, str);
            return false;
        }

        return true;
    }

    private void CARGAR_HISTORICO_PAGO(Object KEY) {
        pagoDao = new PagosClientesDao();
        Object[][] rs = pagoDao.HISTORIAL_PAGOS_CLIENTE(KEY);
        if (rs.length > 0) {
            edicion.llenarTabla(jTable1, rs);
            edicion.calcula_total(jTable1, lbabono, txtabonoacumulado, 2);
            int saldofinal = edicion.toNumeroEntero(txtsubtotal.getText()) - edicion.toNumeroEntero(txtabonoacumulado.getText());
            txtsaldoactual.setText("$ " + formatoNumero.numerico(saldofinal));
        } else {
            edicion.limpiar_tablas(jTable1);
        }
    }

    private int CALCULAR_SALDO_ACTUAL() {
        int SALDO_ACTUAL = edicion.toNumeroEntero(txtsaldoactual.getText())
                - edicion.toNumeroEntero(txtabono.getText());
        return SALDO_ACTUAL;
    }

    private void AccionesFormulario() {
        txtabono.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                txtabono.setText("$ " + formatoNumero.numerico(edicion.toNumeroEntero(txtabono.getText())));
            }
        });
        txtnumorden.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                txtnumorden.setText(edicion.AGREGAR_CEROS_LEFT(edicion.toNumeroEntero(txtnumorden.getText())));
            }
        });
        txtcntrecibo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                txtcntrecibo.setText("$ " + formatoNumero.numerico(edicion.toNumeroEntero(txtcntrecibo.getText())));
                if (edicion.toNumeroEntero(txtabono.getText()) < edicion.toNumeroEntero(txtcntrecibo.getText())) {
                    int CNT_DEVUELTA = edicion.toNumeroEntero(txtcntrecibo.getText()) - edicion.toNumeroEntero(txtabono.getText());
                    txtcntdevuelta.setText("$ " + formatoNumero.numerico(CNT_DEVUELTA));
                } else {
                    txtcntdevuelta.setText("$ " + formatoNumero.numerico(0));
                }
            }

        });
    }

    private void CALCULAR_CNT_DEVUELTA() {
        if (edicion.toNumeroEntero(txtcntrecibo.getText()) > edicion.toNumeroEntero(txtabono.getText())) {
            int CNT_DEVUELTA = edicion.toNumeroEntero(txtcntrecibo.getText()) - edicion.toNumeroEntero(txtabono.getText());
            txtcntdevuelta.setText("$ " + formatoNumero.numerico(CNT_DEVUELTA));
        } else {
            txtcntdevuelta.setText("$ " + formatoNumero.numerico(0));
        }

    }

    private Object[] Cargar_Data_Pago(int opcion) {
        Object[] DATA_PAGO = new Object[10];
        if (opcion == 0 | opcion == 1) {
            DATA_PAGO[0] = opcion;
        }
        DATA_PAGO[1] = edicion.toNumeroEntero(txtabono.getText());
        DATA_PAGO[2] = "'" + FORMA_PAGO + "'";
        DATA_PAGO[3] = edicion.toNumeroEntero(txtnumorden.getText());
        DATA_PAGO[4] = "'" + Variables_Gloabales.EMPLEADO.getIdentificacion() + "'";
        DATA_PAGO[5] = edicion.toNumeroEntero(txtnumidpago.getText());
        DATA_PAGO[6] = edicion.toNumeroEntero(txtcntrecibo.getText());
        DATA_PAGO[7] = edicion.toNumeroEntero(txtcntrecibo.getText()) - edicion.toNumeroEntero(txtabono.getText());
        DATA_PAGO[8] = edicion.toNumeroEntero(txtsaldoactual.getText()) - edicion.toNumeroEntero(txtabono.getText());
        DATA_PAGO[9] = "'" + txtnumrecibo.getText() + "'";
        return DATA_PAGO;
    }

    private void Montar_Data_Pago(Object key) {
        PagosClientes pc = pagoDao.CONSULTA_PAGO_CLIENTE(key);
        if (pc != null) {
            txtnumidpago.setText(edicion.AGREGAR_CEROS_LEFT(pc.getIdpagocliente()));
            jdfechaemision.setDate(pc.getFechahoraemision());
            txtnumorden.setText(edicion.AGREGAR_CEROS_LEFT(pc.getOrdenCompra().getIdordencompra()));
            txtcliente.setText(pc.getOrdenCompra().getCliente().getIdentificacion() + " - "
                    + "" + pc.getOrdenCompra().getCliente().getNombrecompleto());
            txtabono.setText("$ " + formatoNumero.numerico(pc.getValorpago()));
            txtcntrecibo.setText("$ " + formatoNumero.numerico(pc.getCntrecibida()));
            txtcntdevuelta.setText("$ " + formatoNumero.numerico(pc.getCntdevuelta()));
            txtnumrecibo.setText(pc.getNumrecibo());
            txtsubtotal.setText("$ " + formatoNumero.numerico(pc.getOrdenCompra().getSubtotal()));
            txtsaldoactual.setText("$ " + formatoNumero.numerico(pc.getOrdenCompra().getSaldo()));
            CARGAR_HISTORICO_PAGO(pc.getOrdenCompra().getIdordencompra());
        } else {
            edicion.mensajes(1, "el comprobante aun no se ha registrado.");
        }
    }

    private void nuevo() {
        PagosClientes pc = new PagosClientes();
        jdfechaemision.setDate(DateUtil.newTimestamp());
        txtnumidpago.setText(pagoDao.NUMERO_RECIBO_PAGO());
        txtnumorden.setText(null);
        txtcliente.setText("");
        txtabono.setText("$ " + formatoNumero.numerico(pc.getValorpago()));
        txtcntrecibo.setText("$ " + formatoNumero.numerico(pc.getCntrecibida()));
        txtcntdevuelta.setText("$ " + formatoNumero.numerico(pc.getCntdevuelta()));
        txtnumrecibo.setText(pc.getNumrecibo());
        txtsubtotal.setText("$ 0");
        txtsaldoactual.setText("$ 0");
        txtabonoacumulado.setText("$ 0");
        lbabono.setText("0");
        edicion.limpiar_tablas(jTable1);
    }

}
