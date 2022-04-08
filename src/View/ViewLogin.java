/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerPrincipal;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author GIGABYTE
 */
public class ViewLogin extends javax.swing.JFrame {
    int xMouse, yMouse;
    /**
     * Creates new form ViewLog
     */
    public ViewLogin() {
        initComponents();
        TamanioDinamico("/Images/LoginPicture.png", fondoInicio);
        this.imagenOcultarContra.setVisible(false);
//        contraseniaText.setText("●●●●●●");
    contraseniaText.setEchoChar('●');
    }
    private void TamanioDinamico(String direccion, javax.swing.JLabel Borde){
        ImageIcon imagen = new ImageIcon(getClass().getResource(direccion));
        Icon fondo1=new ImageIcon((imagen.getImage().getScaledInstance(Borde.getWidth(), Borde.getHeight(), Image.SCALE_DEFAULT)));
        Borde.setIcon(fondo1);
        this.repaint();
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
        barraArrastra = new javax.swing.JLabel();
        fondoInicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        textSalir = new javax.swing.JLabel();
        panelMini = new javax.swing.JPanel();
        textMini = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contraseniaText = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        panelEntrar = new javax.swing.JPanel();
        textEntrar = new javax.swing.JLabel();
        imagenOcultarContra = new javax.swing.JLabel();
        imagenVerContra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraArrastra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraArrastraMouseDragged(evt);
            }
        });
        barraArrastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraArrastraMousePressed(evt);
            }
        });
        jPanel1.add(barraArrastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        fondoInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoInicioMousePressed(evt);
            }
        });
        jPanel1.add(fondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 630));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 150, 30));

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

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));

        textSalir.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
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
                .addComponent(textSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Barra.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        panelMini.setBackground(new java.awt.Color(255, 255, 255));

        textMini.setBackground(new java.awt.Color(255, 255, 255));
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
                .addComponent(textMini, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMiniLayout.setVerticalGroup(
            panelMiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMiniLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textMini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Barra.add(panelMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 40, -1));

        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        usuarioText.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(204, 204, 204));
        usuarioText.setText("Ingrese su nombre de usuario");
        usuarioText.setBorder(null);
        usuarioText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioTextMousePressed(evt);
            }
        });
        usuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextActionPerformed(evt);
            }
        });
        usuarioText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioTextKeyTyped(evt);
            }
        });
        jPanel1.add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 240, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("USUARIO ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        contraseniaText.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        contraseniaText.setForeground(new java.awt.Color(204, 204, 204));
        contraseniaText.setBorder(null);
        contraseniaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseniaTextMousePressed(evt);
            }
        });
        contraseniaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseniaTextActionPerformed(evt);
            }
        });
        jPanel1.add(contraseniaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 240, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 240, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 240, 20));

        panelEntrar.setBackground(new java.awt.Color(204, 155, 64));
        panelEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEntrarMouseClicked(evt);
            }
        });

        textEntrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEntrar.setText("ENTRAR");
        textEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEntrarLayout = new javax.swing.GroupLayout(panelEntrar);
        panelEntrar.setLayout(panelEntrarLayout);
        panelEntrarLayout.setHorizontalGroup(
            panelEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        panelEntrarLayout.setVerticalGroup(
            panelEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntrarLayout.createSequentialGroup()
                .addComponent(textEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 170, 50));

        imagenOcultarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ocultarcontra.png"))); // NOI18N
        imagenOcultarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenOcultarContraMouseClicked(evt);
            }
        });
        jPanel1.add(imagenOcultarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        imagenVerContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vercontra.png"))); // NOI18N
        imagenVerContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenVerContraMouseClicked(evt);
            }
        });
        jPanel1.add(imagenVerContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_textMiniMouseClicked

    private void textMiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseExited
        panelMini.setBackground(Color.white);
    }//GEN-LAST:event_textMiniMouseExited

    private void textMiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMiniMouseEntered
        panelMini.setBackground(new Color(235, 235, 235));
    }//GEN-LAST:event_textMiniMouseEntered

    private void textSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseClicked
        //this.setExtendedState(ICONIFIED);
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

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
        
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void usuarioTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTextMousePressed
          if (usuarioText.getText().equals("Ingrese su nombre de usuario")){
            usuarioText.setText("");
            usuarioText.setForeground(Color.black);
        }
        if (String.valueOf(contraseniaText.getPassword()).isEmpty()){
//            contraseniaText.setText("●●●●●●");
//            contraseniaText.setForeground(Color.gray);            
        }
        usuarioText.getCaret().setVisible(true);
    }//GEN-LAST:event_usuarioTextMousePressed

    private void contraseniaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseniaTextActionPerformed
        
    }//GEN-LAST:event_contraseniaTextActionPerformed

    private void contraseniaTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseniaTextMousePressed
//      if (String.valueOf(contraseniaText.getPassword()).equals("")){
//            contraseniaText.setText("");
            contraseniaText.setForeground(Color.black);
//        }
        if (usuarioText.getText().isEmpty()){
            usuarioText.setText("Ingrese su nombre de usuario");
            usuarioText.setForeground(Color.gray);
        }
         contraseniaText.getCaret().setVisible(true);
    }//GEN-LAST:event_contraseniaTextMousePressed

    private void textEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEntrarMouseClicked
        ControllerPrincipal controller=new ControllerPrincipal();
        controller.run();
       
        dispose();

    }//GEN-LAST:event_textEntrarMouseClicked

    private void textEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEntrarMouseEntered
        panelEntrar.setBackground(new Color(250,206,126));
    }//GEN-LAST:event_textEntrarMouseEntered

    private void textEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEntrarMouseExited
        panelEntrar.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_textEntrarMouseExited

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged

    }//GEN-LAST:event_BarraMouseDragged

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        
    }//GEN-LAST:event_BarraMousePressed

    private void panelEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEntrarMouseClicked
 /*       String usuario = usuarioText.getText();
        String paswd = contraseniaText.getText();
        
        if(usuario.isEmpty() || paswd.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite ambos campos");
            
        }else{
             if(usuario.equals("Administrador") && paswd.equals("1234")){
*/        
                 ControllerPrincipal controller=new ControllerPrincipal();
                 controller.run();
                 this.dispose();
 /*                                 
             }else{
                 JOptionPane.showMessageDialog(null,"Usuario y/o contraseña incorrecto");
             }
        }
 */
    }//GEN-LAST:event_panelEntrarMouseClicked

    private void fondoInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoInicioMousePressed
       if(usuarioText.getText().isEmpty()){
            usuarioText.setText("Ingrese su nombre de usuario");
            usuarioText.setForeground(Color.gray);
        } 
//       if (String.valueOf(contraseniaText.getPassword()).isEmpty()){
//            contraseniaText.setText("●●●●●●");
//            contraseniaText.setForeground(Color.gray);            
//        }
       
       usuarioText.getCaret().setVisible(false);
       contraseniaText.getCaret().setVisible(false);
    }//GEN-LAST:event_fondoInicioMousePressed

    private void usuarioTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTextKeyTyped
       if (usuarioText.getText().equals("Ingrese su nombre de usuario")){
        usuarioText.setText("");
        usuarioText.setForeground(Color.black);
        }
    }//GEN-LAST:event_usuarioTextKeyTyped

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      if(usuarioText.getText().isEmpty()){
            usuarioText.setText("Ingrese su nombre de usuario");
            usuarioText.setForeground(Color.gray);
        } 
//       if (String.valueOf(contraseniaText.getPassword()).isEmpty()){
//            contraseniaText.setText("●●●●●●");
//            contraseniaText.setForeground(Color.gray);            
//        }
       
       usuarioText.getCaret().setVisible(false);
       contraseniaText.getCaret().setVisible(false);
    }//GEN-LAST:event_jPanel1MousePressed

    private void barraArrastraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraArrastraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        if(usuarioText.getText().isEmpty()){
            usuarioText.setText("Ingrese su nombre de usuario");
            usuarioText.setForeground(Color.gray);
        } 
//       if (String.valueOf(contraseniaText.getPassword()).isEmpty()){
//            contraseniaText.setText("●●●●●●");
//            contraseniaText.setForeground(Color.gray);            
//        }
       
       usuarioText.getCaret().setVisible(false);
       contraseniaText.getCaret().setVisible(false);
    }//GEN-LAST:event_barraArrastraMousePressed

    private void barraArrastraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraArrastraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_barraArrastraMouseDragged

    private void imagenVerContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenVerContraMouseClicked
        // TODO add your handling code here:
        imagenVerContra.setVisible(false);
        imagenOcultarContra.setVisible(true);
        contraseniaText.setEchoChar((char)0);
        
    }//GEN-LAST:event_imagenVerContraMouseClicked

    private void imagenOcultarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenOcultarContraMouseClicked
        // TODO add your handling code here:
        imagenVerContra.setVisible(true);
        imagenOcultarContra.setVisible(false);
        contraseniaText.setEchoChar('●');
    }//GEN-LAST:event_imagenOcultarContraMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
////        /* Set the Nimbus look and feel */
////        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
////        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
////         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
////         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
////        //</editor-fold>
////        //</editor-fold>
////
////        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new ViewLogin().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel barraArrastra;
    public javax.swing.JPasswordField contraseniaText;
    public javax.swing.JLabel fondoInicio;
    private javax.swing.JLabel imagenOcultarContra;
    private javax.swing.JLabel imagenVerContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JPanel panelEntrar;
    private javax.swing.JPanel panelMini;
    private javax.swing.JPanel panelSalir;
    public javax.swing.JLabel textEntrar;
    private javax.swing.JLabel textMini;
    private javax.swing.JLabel textSalir;
    public javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
