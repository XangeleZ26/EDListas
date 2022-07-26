/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerComprar;
import Model.Configuracion;
import Model.Nodo_Producto;
import Model.Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author GIGABYTE
 */
public class VistaCliente extends javax.swing.JFrame {

    int xMouse, yMouse;

    /**
     * Creates new form vista
     */
    public VistaCliente() {
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4,Color.BLACK));
        setIconImage(getIconImage());
        codigoAgregado();
            
    }
     @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/SegundoLogo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelProducto = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        textSalir = new javax.swing.JLabel();
        panelMini = new javax.swing.JPanel();
        textMini = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 221, 158));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelProducto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelProductoLayout = new javax.swing.GroupLayout(panelProducto);
        panelProducto.setLayout(panelProductoLayout);
        panelProductoLayout.setHorizontalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 156, 1030, 600));

        jPanel3.setBackground(new java.awt.Color(191, 142, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refrescar.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        Barra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));
        panelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Barra.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        panelMini.setBackground(new java.awt.Color(255, 255, 255));
        panelMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMiniLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textMini, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMiniLayout.setVerticalGroup(
            panelMiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMiniLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textMini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Barra.add(panelMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, -1));

        jPanel3.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Encantos");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 126, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 110, 14));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 110));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel2.setText("Contamos con los siguientes productos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 330, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoCliente (1) (1) (1).png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 114, 1120, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoAgregado() {
           //Inicio de colocacion de imagenes
        
        int left = 0;
        int down = 0;
        int ImagesXFila = 0;
        int imagenesMostradas=0;
        int cantTotalImagesAUsar = 0;
        //ESTO ES PARA SABER CON CUANTAS IMAGENES SE TRABAJARÁN DE ANTEMANO
        Nodo_Producto pos =Configuracion.arrProductos.getPrimero() ;
        while(pos!=null){
        if(pos.getContenido().getStock()>0&&!(pos.getContenido().getEstado().equals("CADUCADO"))){
               cantTotalImagesAUsar++; }    
            
        pos=pos.getSiguiente();
        }
        
        pos = Configuracion.arrProductos.getPrimero();
        
        while(pos!=null){
                      
            if(pos.getContenido().getStock()>0&&!(pos.getContenido().getEstado().equals("CADUCADO"))){
                
            JLabel imagenLabel = new JLabel();
            JLabel nombreLabel = new JLabel();
            JLabel precioLabel = new JLabel();

            imagenLabel.setIcon(scaleImage((ImageIcon) pos.getContenido().getImagen(), 240, 250));
            
            nombreLabel.setText(pos.getContenido().getNombreProducto());
            nombreLabel.setHorizontalAlignment(SwingConstants.CENTER);

            precioLabel.setText("S/. " + String.valueOf(pos.getContenido().getValorXUnidad()));
            precioLabel.setHorizontalAlignment(SwingConstants.CENTER);

            Producto datoProducto = pos.getContenido();
            //MOUSE LISTENER
            imagenLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ControllerComprar controller = new ControllerComprar(datoProducto);
                    controller.run();
                }
            });

            imagenLabel.setBounds(60 + left, 30 + down, 240, 250);
            nombreLabel.setBounds(60 + left, 245 + down, 240, 20);
            precioLabel.setBounds(60 + left, 265 + down, 240, 14);
            
            imagenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            
            panelProducto.add(imagenLabel);
            panelProducto.add(nombreLabel);
            panelProducto.add(precioLabel);
            left += 329; //para mover hacia la derecha

            //ESTO ES PARA QUE SE FORME LAS SIGUIENTES FILAS CON 3 IMAGENES CADA UNA
            ImagesXFila++;
            imagenesMostradas++;
            if (ImagesXFila >= 3) {
                down += 270;
                left = 0;
                //si NO ha llegado al final y el indice NO es multiplo de 3
                if(!(imagenesMostradas==cantTotalImagesAUsar&&cantTotalImagesAUsar % 3 == 0)){
                    panelProducto.setPreferredSize(new Dimension(1010, 327 + down));
                }
                ImagesXFila = 0;
            }
        }  
            
            
        pos=pos.getSiguiente();
        }
    }
    private void textMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_textMiniMouseClicked

    private void textMiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseEntered
        panelMini.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_textMiniMouseEntered

    private void textMiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseExited
        panelMini.setBackground(Color.white);
        textMini.setForeground(Color.black);
    }//GEN-LAST:event_textMiniMouseExited

    private void textSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_textSalirMouseClicked

    private void textSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseExited
        panelSalir.setBackground(Color.white);
        textSalir.setForeground(Color.black);
    }//GEN-LAST:event_textSalirMouseExited

    private void textSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseEntered
        panelSalir.setBackground(Color.red);
        textSalir.setForeground(Color.white);
    }//GEN-LAST:event_textSalirMouseEntered

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        VistaCliente control=new VistaCliente();
        control.setVisible(true);
        control.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jLabel1MousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCliente().setVisible(true);
            }
        });
    }

    public ImageIcon scaleImage(ImageIcon icon, int w, int h) {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if (icon.getIconWidth() > w) {
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if (nh > h) {
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelMini;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JLabel textMini;
    private javax.swing.JLabel textSalir;
    // End of variables declaration//GEN-END:variables
}
