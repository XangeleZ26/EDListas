/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ArregloFacturas;
import Model.Configuracion;
import Model.Facturas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class FacturasPanel extends javax.swing.JPanel {
    
    DefaultTableModel dtm = new DefaultTableModel();
    /**
     * Creates new form FacturasPanel
     */
    public FacturasPanel() {
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
        iniciarFactura();
    }
    
    private void iniciarFactura(){
        listP.setVisible(false);
        SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
        textFecha.setText(formateadorFecha.format(new Date())+"");
        
        String[] titulo = new String[]{"Nombre ","Codigo ","Producto","Cantidad ","Monto "};
        dtm.setColumnIdentifiers(titulo);
        tblDatos.setModel(dtm);
        llenarProductos();
    }
    private void llenarProductos(){
        int tamaño = Configuracion.arrProductos.getIndice();
        String[] listData = new String[tamaño];
        for(int i=0; i<tamaño; i++){
            listData[i] = Configuracion.arrProductos.getArregloP()[i].getNombreProducto();
        }
        listProductos.setListData(listData);
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
        listP = new javax.swing.JScrollPane();
        listProductos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        panelRegistrar = new javax.swing.JPanel();
        textRegistrar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        textMonto = new javax.swing.JTextField();
        productoSeleccionado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        textFecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(950, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listP.setBackground(new java.awt.Color(255, 255, 255));

        listProductos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        listProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "PASTEL", "PAN", "BOCADITOS", "TORTA" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listProductosMouseClicked(evt);
            }
        });
        listP.setViewportView(listProductos);

        jPanel1.add(listP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 100));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVA FACTURA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 162, 26));

        textNombre.setBorder(null);
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 149, -1));

        textCantidad.setBorder(null);
        textCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCantidadActionPerformed(evt);
            }
        });
        textCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(textCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 149, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("CANTIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("PRECIO UNITARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 149, 11));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 149, 15));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 149, 15));

        panelRegistrar.setBackground(new java.awt.Color(204, 155, 64));

        textRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textRegistrar.setText("REGISTRAR");
        textRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRegistrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textRegistrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textRegistrarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarLayout = new javax.swing.GroupLayout(panelRegistrar);
        panelRegistrar.setLayout(panelRegistrarLayout);
        panelRegistrarLayout.setHorizontalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        panelRegistrarLayout.setVerticalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(panelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 149, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("PRODUCTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 149, 11));

        textMonto.setBorder(null);
        textMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMontoActionPerformed(evt);
            }
        });
        textMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textMontoKeyTyped(evt);
            }
        });
        jPanel1.add(textMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 149, -1));

        productoSeleccionado.setBorder(null);
        productoSeleccionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productoSeleccionadoMouseClicked(evt);
            }
        });
        productoSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoSeleccionadoActionPerformed(evt);
            }
        });
        productoSeleccionado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productoSeleccionadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productoSeleccionadoKeyTyped(evt);
            }
        });
        jPanel1.add(productoSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, 20));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Código", "Producto", "Cantidad", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        textFecha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        textFecha.setForeground(new java.awt.Color(204, 204, 204));
        textFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("FACTURAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel4)
                        .addContainerGap(363, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCantidadActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyTyped
     
       
        char caracter = evt.getKeyChar();
        
        if((caracter < '0' || caracter > '9')
                &&(caracter != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        
        
    }//GEN-LAST:event_textCantidadKeyTyped

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
         char caracter = evt.getKeyChar();
        
        if((caracter < 'a' || caracter > 'z')&&(caracter < 'A' || caracter > 'Z' )){
            evt.consume();
        }     
    }//GEN-LAST:event_textNombreKeyTyped

    private void textRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistrarMouseClicked
//        String nombre = textNombre.getText();
//        String productoFactura = productoSeleccionado.getText();
//        int cantidadP = Integer.parseInt(textCantidad.getText());
//        float montoP = Float.parseFloat(textMonto.getText());
//        Facturas registro = new Facturas(nombre, new String(),productoFactura, new Date(), cantidadP, montoP);
        /*try {
            registro.guardarFactura();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturasPanel.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        agregar();
        borrarCampos();
    }//GEN-LAST:event_textRegistrarMouseClicked

    private void listProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listProductosMouseClicked
        productoSeleccionado.setText(listProductos.getSelectedValue());
        listP.setVisible(false);
    }//GEN-LAST:event_listProductosMouseClicked

    private void textMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMontoActionPerformed

    private void textMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMontoKeyTyped

        char caracter = evt.getKeyChar();
        
        if((caracter < '0' || caracter > '9')&&(caracter != KeyEvent.VK_PERIOD)){
            evt.consume();
        }
    }//GEN-LAST:event_textMontoKeyTyped

    private void productoSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoSeleccionadoActionPerformed

    private void productoSeleccionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoSeleccionadoMouseClicked
        listP.setVisible(true);
    }//GEN-LAST:event_productoSeleccionadoMouseClicked

    private void productoSeleccionadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productoSeleccionadoKeyPressed
        listP.setVisible(false);
    }//GEN-LAST:event_productoSeleccionadoKeyPressed

    private void productoSeleccionadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productoSeleccionadoKeyTyped
         char caracter = evt.getKeyChar();
        
        if((caracter < 'a' || caracter > 'z')&&(caracter < 'A' || caracter > 'Z' )){
            evt.consume();
        }  
    }//GEN-LAST:event_productoSeleccionadoKeyTyped

    private void textRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistrarMouseEntered
        panelRegistrar.setBackground(new Color(210, 168, 89));
    }//GEN-LAST:event_textRegistrarMouseEntered

    private void textRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistrarMouseExited
         panelRegistrar.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_textRegistrarMouseExited
    private void agregar(){
        SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
        dtm = (DefaultTableModel) tblDatos.getModel();
        dtm.addRow(new Object[] {
            textNombre.getText(),
            ""+(dtm.getRowCount()),
            productoSeleccionado.getText(),
            formateadorFecha.format(new Date()),
            textCantidad.getText(),
            Integer.parseInt(textCantidad.getText())
                    *Float.parseFloat(textMonto.getText())});
        
        Configuracion.arrFacturas.agregar(new Facturas(
                textNombre.getText(),
                ""+(dtm.getRowCount()-1),
                productoSeleccionado.getText(),
                new Date(),
                Integer.parseInt(textCantidad.getText()),
                Float.parseFloat(textMonto.getText())*
                        Integer.parseInt(textCantidad.getText())));
                    
        try{
            Configuracion.serial.serializar("facturas.txt",Configuracion.arrFacturas); 
            System.out.println(" Prueba"+Configuracion.arrFacturas);
        } catch (IOException ex) {
            //F
        }
    }

    private void borrarCampos(){
        textNombre.setText("");
        productoSeleccionado.setText("");
        textCantidad.setText("");
        textMonto.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JScrollPane listP;
    private javax.swing.JList<String> listProductos;
    private javax.swing.JPanel panelRegistrar;
    private javax.swing.JTextField productoSeleccionado;
    public javax.swing.JTable tblDatos;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JLabel textFecha;
    private javax.swing.JTextField textMonto;
    private javax.swing.JTextField textNombre;
    private javax.swing.JLabel textRegistrar;
    // End of variables declaration//GEN-END:variables
}
