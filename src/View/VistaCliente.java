package View;

import Controller.ControllerComprar;
import Controller.ControllerCreacion;
import Model.Configuracion;
import Model.Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author GIGABYTE
 */
public class VistaCliente extends javax.swing.JFrame {

    public VistaCliente() {

        //modificacion de tamaño de JFrame
        this.setExtendedState(MAXIMIZED_BOTH);
        //modificacion de paneles

        //panel Background
        JPanel panelBackground = new JPanel();
        panelBackground.setLayout(null);
        panelBackground.setBounds(0, 0, 100, 800);
        panelBackground.setBackground(Color.blue);
        
        //panel Banner
        JPanel panelPresentacion = new JPanel();
        panelPresentacion.setLayout(null);
        panelPresentacion.setBounds(0, 0, 1170, 100);
        panelPresentacion.setBackground(Color.white);
        JLabel pruebaTitulo = new JLabel();
        pruebaTitulo.setText("Esto es un titulo");
        pruebaTitulo.setBounds(0, 50, 1100, 20);
        pruebaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelPresentacion.add(pruebaTitulo);
                //boton refrescar (panel Banner)
        JLabel refrescarPag=new JLabel();
        refrescarPag.setBounds(8, 0, 40, 30);
        ImageIcon imagenResfrescar = new ImageIcon(getClass().getResource("/Images/refrescar.png"));
        refrescarPag.setIcon(imagenResfrescar);
        panelPresentacion.add(refrescarPag);
        
        refrescarPag.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            
            new VistaCliente();
            setVisible(true);
            setLocationRelativeTo(null);
            dispose();
        }
        });
        //panel Productos
        JPanel panelProducto = new JPanel();
        panelProducto.setLayout(null);
        panelProducto.setBounds(33, 150, 1070, 600);
        panelProducto.setBackground(Color.white);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(33, 150, 1070, 600); //el scrollPane inicialmente tendra el tamaño del panelProducto (no aparecerán scrolls en un primer momento)
        scrollPane.setViewportView(panelProducto); //es como si scrollPane tomara poseción de panelProducto y ahora se hubieran combinado
        scrollPane.getViewport().setView(panelProducto);

        //Implementar paneles al panel background
        panelBackground.add(panelPresentacion);
        panelBackground.add(scrollPane);

        //Inicio de colocacion de imagenes
        int left = 0;
        int down = 0;
        int ImagesXFila = 0;
        for (int i = 0; i< Configuracion.arrProductos.getIndice(); i++) {
               
                JLabel imagenLabel = new JLabel();
                JLabel nombreLabel = new JLabel();
                JLabel precioLabel = new JLabel();
                
                imagenLabel.setIcon(scaleImage((ImageIcon) Configuracion.arrProductos.getArregloP()[i].getImagen(), 240, 250));

                nombreLabel.setText(Configuracion.arrProductos.getArregloP()[i].getNombreProducto());
                nombreLabel.setHorizontalAlignment(SwingConstants.CENTER);

                precioLabel.setText("S/. " + String.valueOf(Configuracion.arrProductos.getArregloP()[i].getValorXUnidad()));
                precioLabel.setHorizontalAlignment(SwingConstants.CENTER);

                Producto datoProducto = Configuracion.arrProductos.getArregloP()[i];
                //MOUSE LISTENER
                imagenLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        ControllerComprar controller=new ControllerComprar(datoProducto);
                        controller.run();
//                            ControllerCreacion xd=new ControllerCreacion();
                    }
                });

                imagenLabel.setBounds(80 + left, 30+down, 240, 250);
                nombreLabel.setBounds(80 + left, 245+down, 240, 20);
                precioLabel.setBounds(80 + left, 265+down, 240, 14);
                panelProducto.add(imagenLabel);
                panelProducto.add(nombreLabel);
                panelProducto.add(precioLabel);
                left += 329; //para mover hacia la derecha
                
                //ESTO ES PARA QUE SE FORME LAS SIGUIENTES FILAS CON 3 IMAGENES CADA UNA
                 ImagesXFila++;
                if(ImagesXFila>=3){
                    down+=270;
                    left=0;
                    if(!(Configuracion.arrProductos.getIndice()%3==0)){ //Si el indice de arrProducto no es multiplo de 3
                        panelProducto.setPreferredSize(new Dimension(1050, 327+down));
                    }
                    ImagesXFila=0;
                }
            
        }

        add(panelBackground);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("TODO EL CODIGO DE VISTA ESTÁ EN EL SOURCE DE ESTA CLASE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 390, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaCliente().setVisible(true);
//            }
//        });
//    }
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
