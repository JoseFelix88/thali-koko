/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thalisoft.vista.index;

import com.thalisoft.main.util.styles.Imagen_Fondo;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Contenedor extends javax.swing.JFrame {
  
    static java.awt.Point Variable_Movimiento;

    public Contenedor() {
        //si no quieren borde redondeado comentan esta linea de codigo y 
        //las que les indicare dejando la letra Z
//        setUndecorated(true);
        initComponents();

        JM_venta.setVisible(true);
        MENU_COMPRAS.setVisible(true);
        jMenu4.setVisible(false);
        jMenu5.setVisible(false);
        //this.setExtendedState(this.MAXIMIZED_BOTH);
//        this.setSize(1010, 720);//Z
        setLocationRelativeTo(null);
        setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Z ... no borde redondeado :COMENTEN ESTAS DOS LINEAS
       /* java.awt.Shape forma = new java.awt.geom.RoundRectangle2D.Double(0, 0, this.getBounds().width,
                this.getBounds().height, 30, 30);
        com.sun.awt.AWTUtilities.setWindowShape(this, forma);*/

//        this.setDefaultCloseOperation(javax.swing.JFrame.ICONIFIED);
        java.awt.Image Icono = java.awt.Toolkit.getDefaultToolkit().getImage(getClass().
                getResource("/Iconos/Planeta.png"));
        this.setIconImage(Icono);
        this.setTitle("ThaliSoft");
        this.setForeground(Color.WHITE);

        Variable_Movimiento = null;

        //Z ... no borde redondeado :COMENTEN TODO this.addMouseListener Y this.addMouseMotionListener
       /* this.addMouseListener(new java.awt.event.MouseListener() {
            public void mouseReleased(java.awt.event.MouseEvent e) {
                Variable_Movimiento = null;
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                Variable_Movimiento = e.getPoint();
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {

                if (e.getClickCount() == 2) {
                    setExtendedState(MAXIMIZED_BOTH);
                }
            }
        });

        this.addMouseMotionListener(new java.awt.event.MouseMotionListener() {
            public void mouseMoved(java.awt.event.MouseEvent e) {
            }

            public void mouseDragged(java.awt.event.MouseEvent e) {
                java.awt.Point currCoords = e.getLocationOnScreen();
                if (Variable_Movimiento != null) {
                    setLocation(currCoords.x - Variable_Movimiento.x, currCoords.y - Variable_Movimiento.y);
                }
            }
        });
*/
        Obtener_Eventos_De_SubMenu(JM_FacturaCompras);
        Obtener_Eventos_De_SubMenu(JM_OrdenCompra);
        Obtener_Eventos_De_SubMenu(R_Salir);

        Contenedor.Panel_Contenedor.setBorder(new Imagen_Fondo());

        Contenedor.Panel_Contenedor.setUI(new javax.swing.plaf.basic.BasicDesktopPaneUI() {
            @Override
            public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
                javax.swing.ImageIcon Img = new javax.swing.ImageIcon(getClass().getResource("/Iconos/vilma.png"));
                g.drawImage(Img.getImage(), 0, 0, c.getWidth(), c.getHeight(), null);

            }
        });

        this.Contenedor_Menu_General.setUI(new javax.swing.plaf.basic.BasicMenuBarUI() {
            @Override
            public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
                // g.setColor ( java.awt.Color.RED );
                g.setColor(new java.awt.Color(61, 100, 135));
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Contenedor = new javax.swing.JDesktopPane();
        Contenedor_Menu_General = new javax.swing.JMenuBar();
        JM_venta = new javax.swing.JMenu();
        JM_FacturaVenta = new javax.swing.JMenuItem();
        JM_despachoproducto = new javax.swing.JMenuItem();
        MENU_COMPRAS = new javax.swing.JMenu();
        JM_FacturaCompras = new javax.swing.JMenuItem();
        JM_CompraRegistrada = new javax.swing.JMenuItem();
        JM_OrdenCompra = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        R_Producto = new javax.swing.JMenuItem();
        JM_Lotes = new javax.swing.JMenuItem();
        JM_DevolucionPunto = new javax.swing.JMenuItem();
        JM_Ubicarproducto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JM_Orden_Compra = new javax.swing.JMenuItem();
        JM_Cotizacion = new javax.swing.JMenuItem();
        JM_PlanSepare = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        JM_conteofisico = new javax.swing.JMenuItem();
        JM_SalidaAutorizada = new javax.swing.JMenuItem();
        JM_inventariobodega = new javax.swing.JMenuItem();
        JM_ConsumoSaldoGeneral = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        JM_inventariopunto = new javax.swing.JMenuItem();
        JM_consumosaldopunto = new javax.swing.JMenuItem();
        JM_pedidoPunto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JM_Empleado = new javax.swing.JMenuItem();
        JM_Clientes = new javax.swing.JMenuItem();
        JM_Producto = new javax.swing.JMenuItem();
        JM_Proveedor = new javax.swing.JMenuItem();
        JM_Profile = new javax.swing.JMenu();
        R_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout Panel_ContenedorLayout = new javax.swing.GroupLayout(Panel_Contenedor);
        Panel_Contenedor.setLayout(Panel_ContenedorLayout);
        Panel_ContenedorLayout.setHorizontalGroup(
            Panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        Panel_ContenedorLayout.setVerticalGroup(
            Panel_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        Contenedor_Menu_General.setBackground(new java.awt.Color(255, 153, 102));
        Contenedor_Menu_General.setPreferredSize(new java.awt.Dimension(494, 70));

        JM_venta.setForeground(new java.awt.Color(255, 255, 0));
        JM_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/la-lucha-contra-la-caja-registradora-icono-4028-48.png"))); // NOI18N
        JM_venta.setText("VENTAS");
        JM_venta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JM_FacturaVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_FacturaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/get-money.png"))); // NOI18N
        JM_FacturaVenta.setText("Factura de Venta");
        JM_FacturaVenta.setOpaque(true);
        JM_venta.add(JM_FacturaVenta);

        JM_despachoproducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_despachoproducto.setText("Relacion de Ventas");
        JM_despachoproducto.setActionCommand("Despachosproducto");
        JM_despachoproducto.setOpaque(true);
        JM_venta.add(JM_despachoproducto);

        Contenedor_Menu_General.add(JM_venta);

        MENU_COMPRAS.setForeground(new java.awt.Color(255, 255, 51));
        MENU_COMPRAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/carrito-de-la-compra-icono-7565-48.png"))); // NOI18N
        MENU_COMPRAS.setText("COMPRAS");
        MENU_COMPRAS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MENU_COMPRAS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JM_FacturaCompras.setBackground(new java.awt.Color(51, 51, 51));
        JM_FacturaCompras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_FacturaCompras.setForeground(new java.awt.Color(255, 255, 51));
        JM_FacturaCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/receipt.png"))); // NOI18N
        JM_FacturaCompras.setText("Factura de Compra");
        JM_FacturaCompras.setActionCommand("FacturaCompra");
        JM_FacturaCompras.setOpaque(true);
        MENU_COMPRAS.add(JM_FacturaCompras);

        JM_CompraRegistrada.setBackground(new java.awt.Color(51, 51, 51));
        JM_CompraRegistrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_CompraRegistrada.setForeground(new java.awt.Color(255, 255, 0));
        JM_CompraRegistrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/presentation.png"))); // NOI18N
        JM_CompraRegistrada.setText("Compras Registradas");
        JM_CompraRegistrada.setActionCommand("CompraRegistrada");
        JM_CompraRegistrada.setOpaque(true);
        MENU_COMPRAS.add(JM_CompraRegistrada);

        JM_OrdenCompra.setBackground(new java.awt.Color(51, 51, 51));
        JM_OrdenCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_OrdenCompra.setForeground(new java.awt.Color(255, 255, 51));
        JM_OrdenCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/cart2.png"))); // NOI18N
        JM_OrdenCompra.setText("Orden de Compra");
        JM_OrdenCompra.setOpaque(true);
        MENU_COMPRAS.add(JM_OrdenCompra);

        Contenedor_Menu_General.add(MENU_COMPRAS);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/canasto-icono-6453-48.png"))); // NOI18N
        jMenu4.setText("Productos");
        jMenu4.setFocusable(false);
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        R_Producto.setBackground(new java.awt.Color(51, 51, 51));
        R_Producto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        R_Producto.setForeground(new java.awt.Color(255, 204, 0));
        R_Producto.setText("Gestionar Producto");
        jMenu4.add(R_Producto);

        JM_Lotes.setBackground(new java.awt.Color(51, 51, 51));
        JM_Lotes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_Lotes.setForeground(new java.awt.Color(255, 204, 0));
        JM_Lotes.setText("Lotes Almacenados");
        jMenu4.add(JM_Lotes);

        JM_DevolucionPunto.setBackground(new java.awt.Color(51, 51, 51));
        JM_DevolucionPunto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_DevolucionPunto.setForeground(new java.awt.Color(255, 204, 0));
        JM_DevolucionPunto.setText("Devolucion Punto de Entrega");
        JM_DevolucionPunto.setActionCommand("devolucionpunto");
        jMenu4.add(JM_DevolucionPunto);

        JM_Ubicarproducto.setBackground(new java.awt.Color(51, 51, 51));
        JM_Ubicarproducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_Ubicarproducto.setForeground(new java.awt.Color(255, 204, 0));
        JM_Ubicarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bulbgrey-codigo-pin-de-ubicacion-icono-3949-32.png"))); // NOI18N
        JM_Ubicarproducto.setText("Ubicacion de Producto");
        jMenu4.add(JM_Ubicarproducto);

        Contenedor_Menu_General.add(jMenu4);

        jMenu1.setForeground(new java.awt.Color(255, 255, 51));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/cart.png"))); // NOI18N
        jMenu1.setText("PRE-VENTA");

        JM_Orden_Compra.setBackground(new java.awt.Color(51, 51, 51));
        JM_Orden_Compra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_Orden_Compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/money.png"))); // NOI18N
        JM_Orden_Compra.setText("Gestionar Orden de Pedido");
        JM_Orden_Compra.setActionCommand("ORDENCOMPRA");
        JM_Orden_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_Orden_CompraActionPerformed(evt);
            }
        });
        jMenu1.add(JM_Orden_Compra);

        JM_Cotizacion.setBackground(new java.awt.Color(51, 51, 51));
        JM_Cotizacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_Cotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/tablet-with-price-tag.png"))); // NOI18N
        JM_Cotizacion.setText("Cotizador de Productos");
        JM_Cotizacion.setActionCommand("cotizacion");
        JM_Cotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_CotizacionActionPerformed(evt);
            }
        });
        jMenu1.add(JM_Cotizacion);

        JM_PlanSepare.setBackground(new java.awt.Color(51, 51, 51));
        JM_PlanSepare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_PlanSepare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/hand-holding-money-bills.png"))); // NOI18N
        JM_PlanSepare.setText("Plan Separe");
        JM_PlanSepare.setActionCommand("plansepare");
        JM_PlanSepare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_PlanSepareActionPerformed(evt);
            }
        });
        jMenu1.add(JM_PlanSepare);

        Contenedor_Menu_General.add(jMenu1);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/plantilla-de-hoja-de-calculo-de-office-x-icono-8697-48.png"))); // NOI18N
        jMenu5.setText("Inventario");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOpaque(true);
        jMenu5.add(jSeparator6);

        JM_conteofisico.setBackground(new java.awt.Color(51, 51, 51));
        JM_conteofisico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_conteofisico.setForeground(new java.awt.Color(255, 153, 0));
        JM_conteofisico.setText("Tomar Conteo Fisico");
        JM_conteofisico.setActionCommand("Formconteofisico");
        JM_conteofisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_conteofisicoActionPerformed(evt);
            }
        });
        jMenu5.add(JM_conteofisico);

        JM_SalidaAutorizada.setBackground(new java.awt.Color(51, 51, 51));
        JM_SalidaAutorizada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_SalidaAutorizada.setForeground(new java.awt.Color(255, 153, 0));
        JM_SalidaAutorizada.setText("Salida Autorizada");
        JM_SalidaAutorizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_SalidaAutorizadaActionPerformed(evt);
            }
        });
        jMenu5.add(JM_SalidaAutorizada);

        JM_inventariobodega.setBackground(new java.awt.Color(51, 51, 51));
        JM_inventariobodega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_inventariobodega.setForeground(new java.awt.Color(255, 153, 0));
        JM_inventariobodega.setText("Inventario Bodega");
        JM_inventariobodega.setActionCommand("Forminventariobodega");
        JM_inventariobodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_inventariobodegaActionPerformed(evt);
            }
        });
        jMenu5.add(JM_inventariobodega);

        JM_ConsumoSaldoGeneral.setBackground(new java.awt.Color(51, 51, 51));
        JM_ConsumoSaldoGeneral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_ConsumoSaldoGeneral.setForeground(new java.awt.Color(255, 153, 0));
        JM_ConsumoSaldoGeneral.setText("Consumos y Saldos Generales");
        JM_ConsumoSaldoGeneral.setActionCommand("formconsumosaldogeneral");
        JM_ConsumoSaldoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_ConsumoSaldoGeneralActionPerformed(evt);
            }
        });
        jMenu5.add(JM_ConsumoSaldoGeneral);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOpaque(true);
        jMenu5.add(jSeparator7);

        JM_inventariopunto.setBackground(new java.awt.Color(51, 51, 51));
        JM_inventariopunto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_inventariopunto.setForeground(new java.awt.Color(255, 153, 0));
        JM_inventariopunto.setText("Inventario Punto de Entrega");
        JM_inventariopunto.setActionCommand("forminventariopunto");
        JM_inventariopunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_inventariopuntoActionPerformed(evt);
            }
        });
        jMenu5.add(JM_inventariopunto);

        JM_consumosaldopunto.setBackground(new java.awt.Color(51, 51, 51));
        JM_consumosaldopunto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_consumosaldopunto.setForeground(new java.awt.Color(255, 153, 0));
        JM_consumosaldopunto.setText("Consumos y Saldos Finales Punto de Entrega");
        JM_consumosaldopunto.setActionCommand("formconsumosaldo");
        JM_consumosaldopunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_consumosaldopuntoActionPerformed(evt);
            }
        });
        jMenu5.add(JM_consumosaldopunto);

        JM_pedidoPunto.setBackground(new java.awt.Color(51, 51, 51));
        JM_pedidoPunto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_pedidoPunto.setForeground(new java.awt.Color(255, 153, 0));
        JM_pedidoPunto.setText("Pedido Punto de Entrega");
        JM_pedidoPunto.setActionCommand("formpedidopunto");
        JM_pedidoPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_pedidoPuntoActionPerformed(evt);
            }
        });
        jMenu5.add(JM_pedidoPunto);

        Contenedor_Menu_General.add(jMenu5);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setForeground(new java.awt.Color(204, 204, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/settings.png"))); // NOI18N
        jMenu3.setText("MAESTROS");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JM_Empleado.setBackground(new java.awt.Color(255, 51, 51));
        JM_Empleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Empleado.png"))); // NOI18N
        JM_Empleado.setText("EMPLEADOS");
        JM_Empleado.setActionCommand("EMPLEADO");
        jMenu3.add(JM_Empleado);

        JM_Clientes.setBackground(new java.awt.Color(255, 51, 51));
        JM_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/team.png"))); // NOI18N
        JM_Clientes.setText("CLIENTES");
        jMenu3.add(JM_Clientes);

        JM_Producto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/baby-clothes.png"))); // NOI18N
        JM_Producto.setText("PRODUCTOS");
        jMenu3.add(JM_Producto);

        JM_Proveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JM_Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thalisoft/image/iconos/employee.png"))); // NOI18N
        JM_Proveedor.setText("PROVEEDORES");
        jMenu3.add(JM_Proveedor);

        Contenedor_Menu_General.add(jMenu3);

        JM_Profile.setBackground(new java.awt.Color(255, 255, 255));
        JM_Profile.setForeground(new java.awt.Color(255, 255, 255));
        JM_Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Profile.png"))); // NOI18N
        JM_Profile.setToolTipText("");
        JM_Profile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        R_Salir.setBackground(new java.awt.Color(0, 0, 0));
        R_Salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        R_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vista_style_business_and_data_icons_icons_pack_120673/liberacion-de-la-puerta-icono-9156-48.png"))); // NOI18N
        R_Salir.setText("Salir");
        JM_Profile.add(R_Salir);

        Contenedor_Menu_General.add(JM_Profile);

        setJMenuBar(Contenedor_Menu_General);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JM_CotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_CotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_CotizacionActionPerformed

    private void JM_conteofisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_conteofisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_conteofisicoActionPerformed

    private void JM_Orden_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_Orden_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_Orden_CompraActionPerformed

    private void JM_PlanSepareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_PlanSepareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_PlanSepareActionPerformed

    private void JM_SalidaAutorizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_SalidaAutorizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_SalidaAutorizadaActionPerformed

    private void JM_consumosaldopuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_consumosaldopuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_consumosaldopuntoActionPerformed

    private void JM_inventariopuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_inventariopuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_inventariopuntoActionPerformed

    private void JM_inventariobodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_inventariobodegaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_inventariobodegaActionPerformed

    private void JM_pedidoPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_pedidoPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_pedidoPuntoActionPerformed

    private void JM_ConsumoSaldoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_ConsumoSaldoGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_ConsumoSaldoGeneralActionPerformed

    private void Obtener_Eventos_De_SubMenu(javax.swing.JMenuItem SubMenu) {
        SubMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                Obtener_Resultado_Click(evento);
            }
        }
        );
    }

    private void Obtener_Resultado_Click(java.awt.event.ActionEvent evt) {
        if (evt.getActionCommand().equals("Registrar Empleados")) {

            /* if (Obtener_Estado_Formulario(null, this.Panel_Contenedor)) {

             new controllerProducto().GO();
             productoII = new FormProducto();
             Panel_Contenedor.add(productoII);
             productoII.show();
             java.awt.Dimension Tamaño_Panel = Panel_Contenedor.getSize();
             java.awt.Dimension Tamaño_InternalFrame = productoII.getSize();
             productoII.setLocation((Tamaño_Panel.width - Tamaño_InternalFrame.width) / 2,
             (Tamaño_Panel.height - Tamaño_InternalFrame.height) / 2);
             } else {
                 
             //                productoII.show(true);
                
             }*/
        } else if (evt.getActionCommand().equals("Registrar Clientes")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Aqui PONER TU SIGUIENTE FORMULARIO");
        } else if (evt.getActionCommand().equals("Salir")) {
            System.exit(0);
        }

    }

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Contenedor_Menu_General;
    public javax.swing.JMenuItem JM_Clientes;
    public javax.swing.JMenuItem JM_CompraRegistrada;
    public javax.swing.JMenuItem JM_ConsumoSaldoGeneral;
    public javax.swing.JMenuItem JM_Cotizacion;
    public javax.swing.JMenuItem JM_DevolucionPunto;
    public javax.swing.JMenuItem JM_Empleado;
    public javax.swing.JMenuItem JM_FacturaCompras;
    public javax.swing.JMenuItem JM_FacturaVenta;
    public javax.swing.JMenuItem JM_Lotes;
    public javax.swing.JMenuItem JM_OrdenCompra;
    public javax.swing.JMenuItem JM_Orden_Compra;
    public javax.swing.JMenuItem JM_PlanSepare;
    public javax.swing.JMenuItem JM_Producto;
    public javax.swing.JMenu JM_Profile;
    public javax.swing.JMenuItem JM_Proveedor;
    public javax.swing.JMenuItem JM_SalidaAutorizada;
    public javax.swing.JMenuItem JM_Ubicarproducto;
    public javax.swing.JMenuItem JM_consumosaldopunto;
    public javax.swing.JMenuItem JM_conteofisico;
    public javax.swing.JMenuItem JM_despachoproducto;
    public javax.swing.JMenuItem JM_inventariobodega;
    public javax.swing.JMenuItem JM_inventariopunto;
    public javax.swing.JMenuItem JM_pedidoPunto;
    private javax.swing.JMenu JM_venta;
    private javax.swing.JMenu MENU_COMPRAS;
    public static javax.swing.JDesktopPane Panel_Contenedor;
    public javax.swing.JMenuItem R_Producto;
    private javax.swing.JMenuItem R_Salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
