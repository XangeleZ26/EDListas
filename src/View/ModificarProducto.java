/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.ArregloProductos;
import Model.Configuracion;
import Model.Producto;
import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class ModificarProducto extends javax.swing.JPanel {
    private Object obj[];
    /**
     * Creates new form ModificarProducto
     * @param obj
     */
    public ModificarProducto(Object obj[]) {
        initComponents();
        this.obj = obj;
        llenarDatos();
    }
    private void llenarDatos(){
        SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
        textNombre.setText((String) obj[1]);
        textCategoria.setText((String) obj[2]);
        textValor.setText((String) obj[5]);
        textValorStock.setText((String) obj[6]);
        labelCodigo.setText("Codigo: "+(String) obj[0]);
        labelStockInicial.setText("Stock Inicial: "+(String) obj[3]);
        labelStockActual.setText("Stock Actual: "+(String) obj[4]);
        labelVencimiento.setText("Fecha de Vencimiento: "+formateadorFecha.format((Date) obj[7]));
        labelEstado.setText("Estado: "+(String) obj[8]);
    }
    private void iniciarModificacion(){
        int index = Configuracion.arrProductos.buscar((String) this.obj[0]);
        Producto[] arreglo = Configuracion.arrProductos.getArregloP();
        arreglo[index].setNombreProducto(textNombre.getText());
        arreglo[index].setCategoria(textCategoria.getText());
        arreglo[index].setValorXUnidad(Float.parseFloat(textValor.getText()));
        arreglo[index].setValorTotalStock(Float.parseFloat(textValorStock.getText()));
        Configuracion.arrProductos.setArregloP(arreglo);
        try{
            Configuracion.serial.serializar("archivoProductos.dat",Configuracion.arrProductos); 
            System.out.println(" Prueba"+Configuracion.arrProductos);
        } catch (IOException ex) {
            //F
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textNombre = new javax.swing.JTextField();
        textCategoria = new javax.swing.JTextField();
        textValor = new javax.swing.JTextField();
        textValorStock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelStockInicial = new javax.swing.JLabel();
        labelStockActual = new javax.swing.JLabel();
        labelVencimiento = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        labelCodigo = new javax.swing.JLabel();
        panelCancelar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelGuardar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 349));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textNombre.setBackground(new java.awt.Color(255, 255, 255));
        textNombre.setForeground(new java.awt.Color(204, 204, 204));
        textNombre.setText("jTextField1");
        textNombre.setBorder(null);
        textNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textNombreMouseClicked(evt);
            }
        });
        add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, 20));

        textCategoria.setBackground(new java.awt.Color(255, 255, 255));
        textCategoria.setForeground(new java.awt.Color(204, 204, 204));
        textCategoria.setText("jTextField2");
        textCategoria.setBorder(null);
        textCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCategoriaMouseClicked(evt);
            }
        });
        add(textCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 120, 20));

        textValor.setBackground(new java.awt.Color(255, 255, 255));
        textValor.setForeground(new java.awt.Color(204, 204, 204));
        textValor.setText("jTextField3");
        textValor.setBorder(null);
        textValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textValorMouseClicked(evt);
            }
        });
        add(textValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 120, 20));

        textValorStock.setBackground(new java.awt.Color(255, 255, 255));
        textValorStock.setForeground(new java.awt.Color(204, 204, 204));
        textValorStock.setText("jTextField4");
        textValorStock.setBorder(null);
        textValorStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textValorStockMouseClicked(evt);
            }
        });
        add(textValorStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 120, 20));

        jLabel1.setForeground(new java.awt.Color(130, 130, 130));
        jLabel1.setText("Informacion del producto");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        labelStockInicial.setForeground(new java.awt.Color(153, 153, 153));
        labelStockInicial.setText("Stock inicial:");
        add(labelStockInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 210, -1));

        labelStockActual.setForeground(new java.awt.Color(153, 153, 153));
        labelStockActual.setText("Stock Actual:");
        add(labelStockActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 210, -1));

        labelVencimiento.setForeground(new java.awt.Color(153, 153, 153));
        labelVencimiento.setText("Vencimiento:");
        add(labelVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 210, -1));

        labelEstado.setForeground(new java.awt.Color(153, 153, 153));
        labelEstado.setText("Estado:");
        add(labelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 210, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Valor stock:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 80, 20));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, 10));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Nombre:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Categoría:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 80, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Valor c/u:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 80, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, 10));

        labelCodigo.setForeground(new java.awt.Color(153, 153, 153));
        labelCodigo.setText("Codigo: ");
        add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 210, -1));

        panelCancelar.setBackground(new java.awt.Color(204, 155, 64));
        panelCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCancelarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCancelarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCancelarMouseEntered(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cancelar");

        javax.swing.GroupLayout panelCancelarLayout = new javax.swing.GroupLayout(panelCancelar);
        panelCancelar.setLayout(panelCancelarLayout);
        panelCancelarLayout.setHorizontalGroup(
            panelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panelCancelarLayout.setVerticalGroup(
            panelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancelarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(panelCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, 50));

        panelGuardar.setBackground(new java.awt.Color(204, 155, 64));
        panelGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGuardarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelGuardarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelGuardarMouseEntered(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Guardar cambios");

        javax.swing.GroupLayout panelGuardarLayout = new javax.swing.GroupLayout(panelGuardar);
        panelGuardar.setLayout(panelGuardarLayout);
        panelGuardarLayout.setHorizontalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelGuardarLayout.setVerticalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuardarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(panelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 160, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("MODIFICAR  PRODUCTO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 290, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNombreMouseClicked
        textNombre.setText("");
        textNombre.setForeground(Color.black);
        
    }//GEN-LAST:event_textNombreMouseClicked

    private void textCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCategoriaMouseClicked
        textCategoria.setText("");
        textCategoria.setForeground(Color.black);
    }//GEN-LAST:event_textCategoriaMouseClicked

    private void textValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textValorMouseClicked
        textValor.setText("");
        textValor.setForeground(Color.black);
    }//GEN-LAST:event_textValorMouseClicked

    private void textValorStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textValorStockMouseClicked
        textValorStock.setText("");
        textValorStock.setForeground(Color.black);
    }//GEN-LAST:event_textValorStockMouseClicked

    private void panelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuardarMouseClicked
        iniciarModificacion();
        this.setVisible(false);
        //terminar
    }//GEN-LAST:event_panelGuardarMouseClicked

    private void panelCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCancelarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_panelCancelarMouseClicked

    private void panelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuardarMouseEntered
        panelGuardar.setBackground(new Color(210, 168, 89));
    }//GEN-LAST:event_panelGuardarMouseEntered

    private void panelCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCancelarMouseEntered
        panelCancelar.setBackground(new Color(210, 168, 89));
    }//GEN-LAST:event_panelCancelarMouseEntered

    private void panelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuardarMouseExited
        panelGuardar.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_panelGuardarMouseExited

    private void panelCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCancelarMouseExited
        panelCancelar.setBackground(new Color(204,155,64));
    }//GEN-LAST:event_panelCancelarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelStockActual;
    private javax.swing.JLabel labelStockInicial;
    private javax.swing.JLabel labelVencimiento;
    private javax.swing.JPanel panelCancelar;
    private javax.swing.JPanel panelGuardar;
    private javax.swing.JTextField textCategoria;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textValor;
    private javax.swing.JTextField textValorStock;
    // End of variables declaration//GEN-END:variables
}
