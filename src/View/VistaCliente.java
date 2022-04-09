
package View;

import Model.Configuracion;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author GIGABYTE
 */
public class VistaCliente extends javax.swing.JFrame {

    public VistaCliente() {
//    JPanel panelProductos = new JPanel();
//        panelProductos.setLayout(null);
//        int left=0;
//        int down=0;
//        setSize(1100, 800);
////        for (int i = 0; i < 5; i++) {
//            int leftDato=left;
//            int downDato=down;
//            JLabel imagenLabel = new JLabel();
//            JLabel nombreLabel=new JLabel();
//            JLabel precioLabel=new JLabel();
//            
//            imagenLabel.setIcon(scaleImage((ImageIcon) Configuracion.arrProductos.getArregloP()[7].getImagen(),170,170));
//            nombreLabel.setText("pruebita");
//            nombreLabel.setHorizontalAlignment(SwingConstants.CENTER);
//            precioLabel.setText("$50");
//            precioLabel.setHorizontalAlignment(SwingConstants.CENTER);
//            imagenLabel.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    System.out.println("XDDD perro ");
//                    
//                }
//            });
//
//            imagenLabel.setBounds(20+leftDato, 90, 170,170);
//            nombreLabel.setBounds(20+leftDato, 230, 150,20);
//            precioLabel.setBounds(20+leftDato, 250,150,10);
//            panelProductos.add(imagenLabel);
//            panelProductos.add(nombreLabel);
//            panelProductos.add(precioLabel);
//            left+=60;
////        }
//
//        add(panelProductos);
//        
//        setVisible(true);
//        setLocationRelativeTo(null);
//        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
    // End of variables declaration//GEN-END:variables
}
