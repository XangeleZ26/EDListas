package View;

import Model.Configuracion;
import Model.Nodo_Producto;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VistaCreacionProducto extends javax.swing.JPanel {

    public VistaCreacionProducto() {
        initComponents();
        this.descripciontxt.setLineWrap(true); //para hacer salto de linea
        this.descripciontxt.setWrapStyleWord(true); //para que no parta las palabras cuando hace salto de linea
        llenarListaCategoria();
        sCrollCategoria.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        imagenProductoimg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sCrollCategoria = new javax.swing.JScrollPane();
        listaCategorias = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoriatxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stockInicialtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valorUnidadtxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        porcionestxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fechaVencimientotxt = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        btnSelectImage = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Imagen:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 79, 10, 530));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 960, 22));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Descripción del producto:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setText("La imagen seleccionada será mostrada ante el público general.");
        jTextPane1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTextPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 200, 40));

        imagenProductoimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sinImagen.png"))); // NOI18N
        imagenProductoimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(imagenProductoimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 270, 190));

        jPanel1.setBackground(new java.awt.Color(255, 221, 158));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaCategorias.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        listaCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCategoriasMouseClicked(evt);
            }
        });
        sCrollCategoria.setViewportView(listaCategorias);

        jPanel1.add(sCrollCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 170, 70));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Nombre del producto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        nombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombretxtKeyTyped(evt);
            }
        });
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 170, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Categoría:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        categoriatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriatxtMouseClicked(evt);
            }
        });
        categoriatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriatxtActionPerformed(evt);
            }
        });
        categoriatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoriatxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoriatxtKeyTyped(evt);
            }
        });
        jPanel1.add(categoriatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 170, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Stock inicial:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

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
        jPanel1.add(stockInicialtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 170, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Valor por producto (S/.):");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 190, 160, -1));

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
        jPanel1.add(valorUnidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 170, -1));

        descripciontxt.setColumns(20);
        descripciontxt.setRows(5);
        jScrollPane1.setViewportView(descripciontxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 240, 130));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("                por producto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 150, 20));

        porcionestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcionestxtActionPerformed(evt);
            }
        });
        porcionestxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                porcionestxtKeyTyped(evt);
            }
        });
        jPanel1.add(porcionestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 170, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de vencimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));
        jPanel1.add(fechaVencimientotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 170, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Porciones o unidades");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 140, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, 520));

        btnSelectImage.setBackground(new java.awt.Color(204, 155, 64));
        btnSelectImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelectImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectImageMouseExited(evt);
            }
        });

        jLabel13.setText("Seleccionar imagen");

        javax.swing.GroupLayout btnSelectImageLayout = new javax.swing.GroupLayout(btnSelectImage);
        btnSelectImage.setLayout(btnSelectImageLayout);
        btnSelectImageLayout.setHorizontalGroup(
            btnSelectImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSelectImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        btnSelectImageLayout.setVerticalGroup(
            btnSelectImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSelectImageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(btnSelectImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 140, -1));

        btnGuardar.setBackground(new java.awt.Color(204, 155, 64));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        jLabel14.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BannerExtendido.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void stockInicialtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockInicialtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockInicialtxtActionPerformed

    private void porcionestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcionestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porcionestxtActionPerformed

    private void nombretxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombretxtKeyTyped
        if ((evt.getKeyChar() != 32)
                && (evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57)) {
            evt.consume();
        }
    }//GEN-LAST:event_nombretxtKeyTyped

    private void categoriatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriatxtActionPerformed

    private void categoriatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoriatxtKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < 'a' || caracter > 'z') && (caracter < 'A' || caracter > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_categoriatxtKeyTyped

    private void stockInicialtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockInicialtxtKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_stockInicialtxtKeyTyped

    private void porcionestxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porcionestxtKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_porcionestxtKeyTyped

    private void valorUnidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorUnidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorUnidadtxtActionPerformed

    private void valorUnidadtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorUnidadtxtKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9') && (caracter != KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_valorUnidadtxtKeyTyped

    private void categoriatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoriatxtKeyPressed
        sCrollCategoria.setVisible(false);
    }//GEN-LAST:event_categoriatxtKeyPressed

    private void categoriatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriatxtMouseClicked

        if(!(Configuracion.arrProductos.Contar()==0)){
            sCrollCategoria.setVisible(true);
        }
    }//GEN-LAST:event_categoriatxtMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        sCrollCategoria.setVisible(false);
    }//GEN-LAST:event_formMousePressed

    private void listaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCategoriasMouseClicked
        categoriatxt.setText(listaCategorias.getSelectedValue());
        sCrollCategoria.setVisible(false);
    }//GEN-LAST:event_listaCategoriasMouseClicked

    private void btnSelectImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectImageMouseClicked
 
    }//GEN-LAST:event_btnSelectImageMouseClicked

    private void btnSelectImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectImageMouseEntered
        btnSelectImage.setBackground(new Color(210, 168, 89));
    }//GEN-LAST:event_btnSelectImageMouseEntered

    private void btnSelectImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectImageMouseExited

        btnSelectImage.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_btnSelectImageMouseExited

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseExited

    public void llenarListaCategoria() {
        DefaultListModel agregarElementos = new DefaultListModel();
        boolean esRepetido=false;
        Nodo_Producto pos =Configuracion.arrProductos.getPrimero() ;
        while(pos!=null){
        esRepetido=false;
        if(agregarElementos.isEmpty()){
             agregarElementos.addElement(pos.getContenido().getCategoria());
        }else{
             for(int j=0;j<agregarElementos.getSize();j++){
                 if(pos.getContenido().getCategoria().equals(agregarElementos.get(j))){
                    esRepetido=true;
                 }
             }
               if(esRepetido==false){
                      agregarElementos.addElement(pos.getContenido().getCategoria());
                 }
         }    
        pos=pos.getSiguiente();
        }
        listaCategorias.setModel(agregarElementos);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel btnGuardar;
    public javax.swing.JPanel btnSelectImage;
    public javax.swing.JTextField categoriatxt;
    public javax.swing.JTextArea descripciontxt;
    public com.toedter.calendar.JDateChooser fechaVencimientotxt;
    public javax.swing.JLabel imagenProductoimg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    public javax.swing.JList<String> listaCategorias;
    public javax.swing.JTextField nombretxt;
    public javax.swing.JTextField porcionestxt;
    private javax.swing.JScrollPane sCrollCategoria;
    public javax.swing.JTextField stockInicialtxt;
    public javax.swing.JTextField valorUnidadtxt;
    // End of variables declaration//GEN-END:variables
}
