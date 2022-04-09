
package View;

import Model.Configuracion;
import java.awt.Color;
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
    panelBackground.setBounds(0,0, 100, 800);
    panelBackground.setBackground(Color.black);
    //panel Banner
    JPanel panelPresentacion=new JPanel();
        panelPresentacion.setLayout(null);
    panelPresentacion.setBounds(0,0, 1170, 100); 
    panelPresentacion.setBackground(Color.white);
    JLabel pruebaTitulo=new JLabel();
    pruebaTitulo.setText("Esto es un titulo");
    pruebaTitulo.setBounds(0, 50,1100,20);
    pruebaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
    panelPresentacion.add(pruebaTitulo);
    
    //panel Productos
    JPanel panelProducto=new JPanel();
     panelProducto.setLayout(null);
     panelProducto.setBounds(33,150, 1070, 600);
     panelProducto.setBackground(Color.white);
     

     JLabel xd=new JLabel();
     xd.setText("hoaa");
     xd.setBounds(55,170,100,20);
     JLabel xd2=new JLabel();
     xd2.setText("hoaa222");
     xd2.setBounds(55,1000,100,20);
     xd2.setForeground(Color.red);
     panelProducto.add(xd);
     panelProducto.add(xd2);
     
     JScrollPane scrollPane=new JScrollPane(panelProducto, 
   ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,  
   ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
    //Implementar paneles al panel background
    panelBackground.add(panelPresentacion);
    panelBackground.add(scrollPane);
    //Inicio de colocacion de imagenes
//        int left=0;
//        int down=0;
//        for (int i = 0; i < 5; i++) {
//            int leftDato=left;
//            int downDato=down;
//            JLabel imagenLabel = new JLabel();
//            JLabel nombreLabel=new JLabel();
//            JLabel precioLabel=new JLabel();
//            
//            imagenLabel.setIcon(scaleImage((ImageIcon) Configuracion.arrProductos.getArregloP()[i].getImagen(),170,170));
//            nombreLabel.setText(Configuracion.arrProductos.getArregloP()[i].getNombreProducto());
//            nombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
//            precioLabel.setText("S/. "+String.valueOf(Configuracion.arrProductos.getArregloP()[i].getValorXUnidad()));
//            precioLabel.setHorizontalAlignment(SwingConstants.CENTER);
//            String dato=Configuracion.arrProductos.getArregloP()[i].getNombreProducto();
//            imagenLabel.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    System.out.println(dato);
//                    
//                }
//            });
//
//            imagenLabel.setBounds(40+leftDato, 100, 170,170);
//            nombreLabel.setBounds(40+leftDato, 245, 170,20);
//            precioLabel.setBounds(40+leftDato, 265,170,10);
//            panelProductos.add(imagenLabel);
//            panelProductos.add(nombreLabel);
//            panelProductos.add(precioLabel);
//            left+=200;
//        }

        add(panelBackground);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pruebitaaaaa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));

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
 public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
          nw = w;
          nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
          nh = h;
          nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
