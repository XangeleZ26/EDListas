package View;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class vistaComprar extends javax.swing.JFrame {

    int xMouse, yMouse;

    public vistaComprar() {
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4,new Color(191,142,51)));
        this.cantidad.getCaret().setVisible(false);
        this.direccionP.getCaret().setVisible(false);
        this.nombreP.getCaret().setVisible(false);
        this.emailP.getCaret().setVisible(false);
        this.dniP.getCaret().setVisible(false);
        
        this.direccionP.setLineWrap(true);
        this.direccionP.setWrapStyleWord(true);

        this.descripciontxt.setLineWrap(true); //para hacer salto de linea
        this.descripciontxt.setWrapStyleWord(true); //para que no parta las palabras cuando hace salto de linea
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        cantidad = new javax.swing.JTextField();
        btnPagar = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        costoTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dniP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        direccionP = new javax.swing.JTextArea();
        Barra = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        textSalir = new javax.swing.JLabel();
        panelMini = new javax.swing.JPanel();
        textMini = new javax.swing.JLabel();
        nombretxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 221, 158));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(imagenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 160));

        nombre3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombre3.setText("Precio (S/.):");
        jPanel1.add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 80, 20));

        descripciontxt.setEditable(false);
        descripciontxt.setBackground(new java.awt.Color(255, 221, 158));
        descripciontxt.setColumns(20);
        descripciontxt.setRows(5);
        jScrollPane1.setViewportView(descripciontxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 476, 240, 90));

        jPanel2.setBackground(new java.awt.Color(255, 201, 93));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Encantos");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad a comprar:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Costo total (S/.):");

        costoUnitario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cantidad.setBackground(new java.awt.Color(255, 201, 93));
        cantidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cantidadMousePressed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pagar.png"))); // NOI18N
        btnPagar.setText("jLabel6");
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPagarMousePressed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Precio unitario (S/.):");

        costoTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Realiza tu compra en solo 1 minuto!");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Tu nombre:");

        nombreP.setBackground(new java.awt.Color(255, 201, 93));
        nombreP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombreP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombreP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nombreP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombrePMousePressed(evt);
            }
        });
        nombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePActionPerformed(evt);
            }
        });
        nombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrePKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Email:");

        emailP.setBackground(new java.awt.Color(255, 201, 93));
        emailP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        emailP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emailP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailPMousePressed(evt);
            }
        });
        emailP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailPKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("DNI:");

        dniP.setBackground(new java.awt.Color(255, 201, 93));
        dniP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dniP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dniP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dniP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dniPMousePressed(evt);
            }
        });
        dniP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniPKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Dirección:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Del producto:");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        direccionP.setBackground(new java.awt.Color(255, 201, 93));
        direccionP.setColumns(20);
        direccionP.setRows(5);
        direccionP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        direccionP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionPMousePressed(evt);
            }
        });
        direccionP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionPKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(direccionP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(costoUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(costoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreP)
                            .addComponent(emailP)
                            .addComponent(dniP)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(costoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 370, 570));

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

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Detalles del producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 30));

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
        if (!(this.cantidad.getText().isEmpty())) {
            this.costoTotal.setText(String.valueOf(Integer.parseInt(this.cantidad.getText()) * Double.parseDouble(this.costoUnitario.getText())));
        } else {
            this.costoTotal.setText("");
        }
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
        if (!(this.cantidad.getText().isEmpty())) {
            this.costoTotal.setText(String.valueOf(Integer.parseInt(this.cantidad.getText()) * Double.parseDouble(this.costoUnitario.getText())));
        } else {
            this.costoTotal.setText("");
        }
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

        this.cantidad.getCaret().setVisible(false);
        this.direccionP.getCaret().setVisible(false);
        this.nombreP.getCaret().setVisible(false);
        this.emailP.getCaret().setVisible(false);
        this.dniP.getCaret().setVisible(false);
        
        if (!(this.cantidad.getText().isEmpty())) {
            this.costoTotal.setText(String.valueOf(Integer.parseInt(this.cantidad.getText()) * Double.parseDouble(this.costoUnitario.getText())));
        } else {
            this.costoTotal.setText("");
        }

    }//GEN-LAST:event_BarraMousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        this.cantidad.getCaret().setVisible(false);
        this.direccionP.getCaret().setVisible(false);
        this.nombreP.getCaret().setVisible(false);
        this.emailP.getCaret().setVisible(false);
        this.dniP.getCaret().setVisible(false);    
        
        if (!(this.cantidad.getText().isEmpty())) {
            this.costoTotal.setText(String.valueOf(Integer.parseInt(this.cantidad.getText()) * Double.parseDouble(this.costoUnitario.getText())));
        } else {
            this.costoTotal.setText("");
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        this.cantidad.getCaret().setVisible(false);
        this.direccionP.getCaret().setVisible(false);
        this.nombreP.getCaret().setVisible(false);
        this.emailP.getCaret().setVisible(false);
        this.dniP.getCaret().setVisible(false);

        if (!(this.cantidad.getText().isEmpty())) {
            this.costoTotal.setText(String.valueOf(Integer.parseInt(this.cantidad.getText()) * Double.parseDouble(this.costoUnitario.getText())));
        } else {
            this.costoTotal.setText("");
        }
    }//GEN-LAST:event_jPanel2MousePressed

    private void cantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMousePressed
        this.cantidad.getCaret().setVisible(true);
        this.direccionP.getCaret().setVisible(false);
        this.nombreP.getCaret().setVisible(false);
        this.emailP.getCaret().setVisible(false);
        this.dniP.getCaret().setVisible(false);
    }//GEN-LAST:event_cantidadMousePressed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9')) {
            evt.consume();
        }

    }//GEN-LAST:event_cantidadKeyTyped

    private void btnPagarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarMousePressed
        
    }//GEN-LAST:event_btnPagarMousePressed

    private void nombrePMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombrePMousePressed
        this.cantidad.getCaret().setVisible(false);
        this.direccionP.getCaret().setVisible(false);
        this.nombreP.getCaret().setVisible(true);
        this.emailP.getCaret().setVisible(false);
        this.dniP.getCaret().setVisible(false);
    }//GEN-LAST:event_nombrePMousePressed

    private void nombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePKeyTyped
        if ((evt.getKeyChar() != 32)
                && (evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57)) {
            evt.consume();
        }
    }//GEN-LAST:event_nombrePKeyTyped

    private void emailPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailPMousePressed
       this.cantidad.getCaret().setVisible(false);
        this.direccionP.getCaret().setVisible(false);
        this.nombreP.getCaret().setVisible(false);
        this.emailP.getCaret().setVisible(true);
        this.dniP.getCaret().setVisible(false);
    }//GEN-LAST:event_emailPMousePressed

    private void emailPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_emailPKeyTyped

    private void nombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePActionPerformed

    private void dniPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dniPMousePressed
        this.cantidad.getCaret().setVisible(false);
        this.direccionP.getCaret().setVisible(false);
        this.nombreP.getCaret().setVisible(false);
        this.emailP.getCaret().setVisible(false);
        this.dniP.getCaret().setVisible(true);
    }//GEN-LAST:event_dniPMousePressed

    private void dniPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniPKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_dniPKeyTyped

    private void direccionPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionPKeyTyped

    }//GEN-LAST:event_direccionPKeyTyped

    private void direccionPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionPMousePressed
        this.cantidad.getCaret().setVisible(false);
        this.direccionP.getCaret().setVisible(true);
        this.nombreP.getCaret().setVisible(false);
        this.emailP.getCaret().setVisible(false);
        this.dniP.getCaret().setVisible(false);
    }//GEN-LAST:event_direccionPMousePressed
    public boolean verificarEmail() {
        boolean result = false;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(this.emailP.getText());
        if (mather.find() == true) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean verificarValidezDNI() {
        boolean result = false;
        if (this.dniP.getText().length() == 8) {
            result = true;
        }
        return result;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    public javax.swing.JLabel btnPagar;
    public javax.swing.JTextField cantidad;
    public javax.swing.JLabel categoriatxt;
    public javax.swing.JLabel costoTotal;
    public javax.swing.JLabel costoUnitario;
    public javax.swing.JTextArea descripciontxt;
    public javax.swing.JTextArea direccionP;
    public javax.swing.JTextField dniP;
    public javax.swing.JTextField emailP;
    public javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    public javax.swing.JTextField nombreP;
    public javax.swing.JLabel nombretxt;
    private javax.swing.JPanel panelMini;
    private javax.swing.JPanel panelSalir;
    public javax.swing.JLabel porcionestxt;
    public javax.swing.JLabel preciotxt;
    private javax.swing.JLabel textMini;
    private javax.swing.JLabel textSalir;
    // End of variables declaration//GEN-END:variables
}
