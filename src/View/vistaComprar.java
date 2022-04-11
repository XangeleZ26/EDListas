
package View;

import java.awt.Color;

public class vistaComprar extends javax.swing.JFrame {
    int xMouse, yMouse;

    public vistaComprar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombre = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        preciotxt = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        porcionestxt = new javax.swing.JLabel();
        categoriatxt = new javax.swing.JLabel();
        imagenLabel = new javax.swing.JLabel();
        nombre3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        costoUnitario = new javax.swing.JLabel();
        cantidadCosto = new javax.swing.JTextField();
        btnPagar = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        costoTotal = new javax.swing.JLabel();
        agradecimientoLogo = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        textSalir = new javax.swing.JLabel();
        panelMini = new javax.swing.JPanel();
        textMini = new javax.swing.JLabel();
        nombretxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Detalles del producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 860, 20));

        nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombre.setText("Descripción:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 80, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 41, 10, 570));

        preciotxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        preciotxt.setText("jLabel");
        jPanel1.add(preciotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 210, 20));

        nombre1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombre1.setText("Producto:");
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 70, 20));

        nombre2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombre2.setText("Categoría:");
        jPanel1.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 70, 20));

        porcionestxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        porcionestxt.setText("jLabel");
        jPanel1.add(porcionestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 290, 20));

        categoriatxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        categoriatxt.setText("jLabel");
        jPanel1.add(categoriatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 210, 20));

        imagenLabel.setBackground(new java.awt.Color(255, 255, 255));
        imagenLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imagenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 160));

        nombre3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombre3.setText("Precio:");
        jPanel1.add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 50, 20));

        descripciontxt.setColumns(20);
        descripciontxt.setRows(5);
        jScrollPane1.setViewportView(descripciontxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 476, 250, 100));

        jPanel2.setBackground(new java.awt.Color(255, 201, 93));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Encantos");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Costo total:");

        costoUnitario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        costoUnitario.setText("jLabel");

        cantidadCosto.setBackground(new java.awt.Color(255, 201, 93));
        cantidadCosto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cantidadCosto.setText("jTextField1");
        cantidadCosto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pagar.png"))); // NOI18N
        btnPagar.setText("jLabel6");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Precio unitario:");

        costoTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        costoTotal.setText("jLabel");

        agradecimientoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agradecimiento.png"))); // NOI18N
        agradecimientoLogo.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(costoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(costoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantidadCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agradecimientoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(costoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(agradecimientoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 41, 370, 570));

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

        textSalir.setBackground(new java.awt.Color(255, 255, 255));
        textSalir.setFont(new java.awt.Font("Dubai", 0, 30)); // NOI18N
        textSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSalir.setText("X");
        textSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textSalirMouseExited(evt);
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

        Barra.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

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

        Barra.add(panelMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        nombretxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombretxt.setText("jLabel");
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 290, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        dispose();
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

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel agradecimientoLogo;
    public javax.swing.JLabel btnPagar;
    public javax.swing.JTextField cantidadCosto;
    public javax.swing.JLabel categoriatxt;
    public javax.swing.JLabel costoTotal;
    public javax.swing.JLabel costoUnitario;
    public javax.swing.JTextArea descripciontxt;
    public javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    public javax.swing.JLabel nombretxt;
    private javax.swing.JPanel panelMini;
    private javax.swing.JPanel panelSalir;
    public javax.swing.JLabel porcionestxt;
    public javax.swing.JLabel preciotxt;
    private javax.swing.JLabel textMini;
    private javax.swing.JLabel textSalir;
    // End of variables declaration//GEN-END:variables
}
