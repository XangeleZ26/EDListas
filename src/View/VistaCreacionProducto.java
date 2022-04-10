
package View;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VistaCreacionProducto extends javax.swing.JPanel {

    public VistaCreacionProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        categoriatxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stockInicialtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        valorUnidadtxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        imagenProductoimg = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSelectImage = new javax.swing.JButton();
        fechaVencimientotxt = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Aqui colocar el logo o algo decorativo xd");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 22, 234, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Categoría:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        nombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombretxtKeyTyped(evt);
            }
        });
        add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Nombre del producto:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        categoriatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriatxtActionPerformed(evt);
            }
        });
        categoriatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoriatxtKeyTyped(evt);
            }
        });
        add(categoriatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 170, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Stock inicial:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        stockInicialtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockInicialtxtActionPerformed(evt);
            }
        });
        stockInicialtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockInicialtxtKeyTyped(evt);
            }
        });
        add(stockInicialtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 170, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Valor por unidad:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de vencimiento:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        valorUnidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorUnidadtxtActionPerformed(evt);
            }
        });
        valorUnidadtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorUnidadtxtKeyTyped(evt);
            }
        });
        add(valorUnidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 170, -1));

        descripciontxt.setColumns(20);
        descripciontxt.setRows(5);
        jScrollPane1.setViewportView(descripciontxt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 240, 130));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Imagen:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 79, 10, 530));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 960, 22));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Descripción del producto:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jTextPane1.setText("La imagen seleccionada será mostrada ante el público general.");
        jTextPane1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTextPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 200, 40));

        imagenProductoimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sinImagen.png"))); // NOI18N
        imagenProductoimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(imagenProductoimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 270, 190));

        btnGuardar.setText("Guardar");
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, 30));

        btnSelectImage.setText("Seleccionar imagen");
        add(btnSelectImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, 30));
        add(fechaVencimientotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void stockInicialtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockInicialtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockInicialtxtActionPerformed

    private void valorUnidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorUnidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorUnidadtxtActionPerformed

    private void nombretxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombretxtKeyTyped
          char caracter = evt.getKeyChar();
        
        if((caracter < 'a' || caracter > 'z')&&(caracter < 'A' || caracter > 'Z' )){
            evt.consume();
        }  
    }//GEN-LAST:event_nombretxtKeyTyped

    private void categoriatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriatxtActionPerformed

    private void categoriatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoriatxtKeyTyped
          char caracter = evt.getKeyChar();
        
        if((caracter < 'a' || caracter > 'z')&&(caracter < 'A' || caracter > 'Z' )){
            evt.consume();
        }  
    }//GEN-LAST:event_categoriatxtKeyTyped

    private void stockInicialtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockInicialtxtKeyTyped
        char caracter = evt.getKeyChar();
        
        if((caracter < '0' || caracter > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_stockInicialtxtKeyTyped

    private void valorUnidadtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorUnidadtxtKeyTyped
        char caracter = evt.getKeyChar();
        
        if((caracter < '0' || caracter > '9')&&(caracter != KeyEvent.VK_PERIOD)){
            evt.consume();
        }
    }//GEN-LAST:event_valorUnidadtxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnSelectImage;
    public javax.swing.JTextField categoriatxt;
    public javax.swing.JTextArea descripciontxt;
    public com.toedter.calendar.JDateChooser fechaVencimientotxt;
    public javax.swing.JLabel imagenProductoimg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    public javax.swing.JTextField nombretxt;
    public javax.swing.JTextField stockInicialtxt;
    public javax.swing.JTextField valorUnidadtxt;
    // End of variables declaration//GEN-END:variables
}
