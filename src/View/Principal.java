package View;

import Controller.ControllerCreacion;
import Controller.ControllerFacturasPanel;
import Controller.ControllerProductoPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;

/**
 *
 * @author GIGABYTE
 */
public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse;
    boolean[] opciones = {true, true, true, true};

    public Principal() {
        initComponents();
        setIconImage(getIconImage());
        reset(0);
        opciones[0] = false;
        PrincipalPanel Pp = new PrincipalPanel();
        Pp.setSize(800, 600);
        Pp.setLocation(0, 0);
        panelCambiante.removeAll();
        panelCambiante.add(Pp, BorderLayout.CENTER);
        panelCambiante.revalidate();
        panelCambiante.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelPrincipal = new javax.swing.JPanel();
        principaltxt = new javax.swing.JLabel();
        panelAgregar = new javax.swing.JPanel();
        Agregartxt = new javax.swing.JLabel();
        panelProducto = new javax.swing.JPanel();
        productotxt = new javax.swing.JLabel();
        panelFactura = new javax.swing.JPanel();
        editartxt = new javax.swing.JLabel();
        textUsuario = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        panelMini = new javax.swing.JPanel();
        textMini = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        textSalir = new javax.swing.JLabel();
        panelCambiante = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(191, 142, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Encantos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 126, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, 14));

        panelPrincipal.setBackground(new java.awt.Color(204, 155, 64));
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseEntered(evt);
            }
        });

        principaltxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        principaltxt.setForeground(new java.awt.Color(255, 255, 255));
        principaltxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principaltxt.setText("Inicio");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principaltxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principaltxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, 60));

        panelAgregar.setBackground(new java.awt.Color(204, 155, 64));
        panelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAgregarMouseExited(evt);
            }
        });

        Agregartxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        Agregartxt.setForeground(new java.awt.Color(255, 255, 255));
        Agregartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Agregartxt.setText("Agregar producto");

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agregartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agregartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(panelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, 60));

        panelProducto.setBackground(new java.awt.Color(204, 155, 64));
        panelProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelProductoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelProductoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelProductoMouseEntered(evt);
            }
        });

        productotxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        productotxt.setForeground(new java.awt.Color(255, 255, 255));
        productotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productotxt.setText("Productos enlistados");

        javax.swing.GroupLayout panelProductoLayout = new javax.swing.GroupLayout(panelProducto);
        panelProducto.setLayout(panelProductoLayout);
        panelProductoLayout.setHorizontalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(panelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 60));

        panelFactura.setBackground(new java.awt.Color(204, 155, 64));
        panelFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFacturaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelFacturaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelFacturaMouseEntered(evt);
            }
        });

        editartxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        editartxt.setForeground(new java.awt.Color(255, 255, 255));
        editartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editartxt.setText("Ventas");

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(panelFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 190, 60));

        textUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        textUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textUsuario.setText("Usuario");
        jPanel2.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 520, 190, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 640));

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });
        Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMini.setBackground(new java.awt.Color(255, 255, 255));

        textMini.setFont(new java.awt.Font("Eras Medium ITC", 1, 30)); // NOI18N
        textMini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMini.setText("--");
        textMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textMiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textMiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textMiniMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMiniLayout = new javax.swing.GroupLayout(panelMini);
        panelMini.setLayout(panelMiniLayout);
        panelMiniLayout.setHorizontalGroup(
            panelMiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textMini, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        panelMiniLayout.setVerticalGroup(
            panelMiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMiniLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textMini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Barra.add(panelMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 50, 40));

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));

        textSalir.setBackground(new java.awt.Color(255, 255, 255));
        textSalir.setFont(new java.awt.Font("Dubai", 0, 30)); // NOI18N
        textSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSalir.setText("X");
        textSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSalirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textSalirMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textSalirMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addComponent(textSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Barra.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 50, 40));

        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 40));

        panelCambiante.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelCambianteLayout = new javax.swing.GroupLayout(panelCambiante);
        panelCambiante.setLayout(panelCambianteLayout);
        panelCambianteLayout.setHorizontalGroup(
            panelCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        panelCambianteLayout.setVerticalGroup(
            panelCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(panelCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 950, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/SegundoLogo.png"));
        return retValue;
    }
    private void panelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseClicked
        reset(0);
        opciones[0] = false;
        PrincipalPanel Pp = new PrincipalPanel();
        Pp.setSize(800, 600);
        Pp.setLocation(0, 0);
        panelCambiante.removeAll();
        panelCambiante.add(Pp, BorderLayout.CENTER);
        panelCambiante.revalidate();
        panelCambiante.repaint();
    }//GEN-LAST:event_panelPrincipalMouseClicked

    private void panelPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseEntered
        if (opciones[0])
            panelPrincipal.setBackground(new Color(210, 168, 89));
    }//GEN-LAST:event_panelPrincipalMouseEntered

    private void panelPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseExited
        if (opciones[0])
            panelPrincipal.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_panelPrincipalMouseExited

    private void panelAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgregarMouseEntered
        if (opciones[1])
            panelAgregar.setBackground(new Color(210, 168, 89));
    }//GEN-LAST:event_panelAgregarMouseEntered

    private void panelAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgregarMouseExited
        if (opciones[1])
            panelAgregar.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_panelAgregarMouseExited

    private void panelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgregarMouseClicked
           reset(1);
        ControllerCreacion VC=new ControllerCreacion();
        VC.run();
        VC.getVista().setSize(1000, 1000);
        VC.getVista().setLocation(0, 0);
        panelCambiante.removeAll();
        panelCambiante.add(VC.getVista(), BorderLayout.CENTER);
        panelCambiante.revalidate();
        panelCambiante.repaint();
    }//GEN-LAST:event_panelAgregarMouseClicked

    private void panelProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProductoMouseEntered
        if (opciones[2])
            panelProducto.setBackground(new Color(210, 168, 89));
    }//GEN-LAST:event_panelProductoMouseEntered

    private void panelProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProductoMouseExited
        if (opciones[2])
            panelProducto.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_panelProductoMouseExited

    private void panelProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProductoMouseClicked
        reset(2);
        ControllerProductoPanel Pp = new ControllerProductoPanel();
        Pp.run();
        Pp.getFrmProducto().setSize(1000, 1000);
        Pp.getFrmProducto().setLocation(0, 0);
        panelCambiante.removeAll();
        panelCambiante.add(Pp.getFrmProducto(), BorderLayout.CENTER);
        panelCambiante.revalidate();
        panelCambiante.repaint();
    }//GEN-LAST:event_panelProductoMouseClicked

    private void panelFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFacturaMouseEntered
        if (opciones[3])
            panelFactura.setBackground(new Color(210, 168, 89));
    }//GEN-LAST:event_panelFacturaMouseEntered

    private void panelFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFacturaMouseExited
        if (opciones[3])
            panelFactura.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_panelFacturaMouseExited

    private void panelFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFacturaMouseClicked
        reset(3);
        ControllerFacturasPanel Ep = new ControllerFacturasPanel();
        Ep.getFrmFactura().setSize(950, 600);
        Ep.getFrmFactura().setLocation(0, 0);
        panelCambiante.removeAll();
        panelCambiante.add(Ep.getFrmFactura(), BorderLayout.CENTER);
        panelCambiante.revalidate();
        panelCambiante.repaint();
    }//GEN-LAST:event_panelFacturaMouseClicked

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void textSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseEntered
        panelSalir.setBackground(Color.red);
        textSalir.setForeground(Color.white);
    }//GEN-LAST:event_textSalirMouseEntered

    private void textSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseExited
        panelSalir.setBackground(Color.white);
        textSalir.setForeground(Color.black);
    }//GEN-LAST:event_textSalirMouseExited

    private void textSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_textSalirMouseClicked

    private void textMiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseExited
        panelMini.setBackground(Color.white);
        textMini.setForeground(Color.black);
    }//GEN-LAST:event_textMiniMouseExited

    private void textMiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseEntered
        panelMini.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_textMiniMouseEntered

    private void textMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_textMiniMouseClicked

    public void reset(int opcion) {
        for (int i = 0; i < 4; i++) {
            opciones[i] = true;
        }
        opciones[opcion] = false;
        if (opcion != 0) {
            panelPrincipal.setBackground(new Color(204,155,64));
        }
        if (opcion != 1) {
            panelAgregar.setBackground(new Color(204,155,64));
        }
        if (opcion != 2) {
            panelProducto.setBackground(new Color(204,155,64));
        }
        if (opcion != 3) {
            panelFactura.setBackground(new Color(204,155,64));
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Agregartxt;
    private javax.swing.JPanel Barra;
    public javax.swing.JLabel editartxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JPanel panelAgregar;
    public javax.swing.JPanel panelCambiante;
    public javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelMini;
    public javax.swing.JPanel panelPrincipal;
    public javax.swing.JPanel panelProducto;
    private javax.swing.JPanel panelSalir;
    public javax.swing.JLabel principaltxt;
    public javax.swing.JLabel productotxt;
    private javax.swing.JLabel textMini;
    private javax.swing.JLabel textSalir;
    private javax.swing.JLabel textUsuario;
    // End of variables declaration//GEN-END:variables
}
