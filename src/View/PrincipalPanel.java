/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Configuracion;
import Model.Producto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class PrincipalPanel extends javax.swing.JPanel {
    javax.swing.JLabel[] textCaducar;
    javax.swing.JLabel[] textCaduco;
    javax.swing.JLabel[] textGanancias;
    javax.swing.JLabel[] textVendidos;
    /**
     * Creates new form PrincipalPanel
     */
    public PrincipalPanel() {
        initComponents();
        iniciarCaducar();
        iniciarCaducos();
        iniciarGanancias();
        iniciarVendidos();
    }
    void iniciarCaducar(){
        textCaducos1.setText("");
        textCaducos2.setText("");
        textCaducos3.setText("");
        textCaducos4.setText("");
        textCaducos5.setText("");
        textCaduco = new javax.swing.JLabel[] {
            textCaducos1,
            textCaducos2,
            textCaducos3,
            textCaducos4,
            textCaducos5
        };
        Producto[] aux = Configuracion.arrProductos.getArregloP();
        int index = Configuracion.arrProductos.getIndice();
        int cont = 0;
        for(int i=0; i<index; i++){
            if("CADUCADO".equals(aux[i].getEstado()) && cont<=5){
                textCaduco[cont].setText(aux[i].getNombreProducto()+"   "+aux[i].getFechaVencimiento());
                cont++;
            } else {
            }
        }
        if( textCaduco[0].getText()==""){
            textCaduco[0].setText("No hay productos caducados");
        }
    }
    void iniciarCaducos(){
        try{
            textCaducar1.setText("");
            textCaducar2.setText("");
            textCaducar3.setText("");
            textCaducar4.setText("");
            textCaducar5.setText("");
            textCaducar = new javax.swing.JLabel[] {
                textCaducar1,
                textCaducar2,
                textCaducar3,
                textCaducar4,
                textCaducar5
            };
            Producto[] aux = Configuracion.arrProductos.getArregloP();
            int index = Configuracion.arrProductos.getIndice();
            boolean[] estado = new boolean[index];
            int cont = 0;
            SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
            Date hoy = new Date();
            System.out.println(hoy.getTime() - formato.parse(aux[0].getFechaVencimiento()).getTime());
            long mayor=0;
            int indM=0;
            for(int i=0; i<index; i++){
                estado[i]=false;
            }
            for(int i=0; i<5; i++){
                mayor = -1;
                for(int j=0; j<index; j++){
                    if(mayor<formato.parse(aux[j].getFechaVencimiento()).getTime() 
                            && !estado[j]
                            && !("CADUCADO".equals(aux[j].getEstado()))){
                        mayor = formato.parse(aux[j].getFechaVencimiento()).getTime();
                        indM = j;
                    }
                }
                estado[indM]=true;
                if(!(mayor == -1))
                    textCaducar[i].setText(aux[indM].getNombreProducto()+"  "+aux[indM].getFechaVencimiento());
            }
            if("".equals(textCaducar[0].getText())){
                textCaducar[0].setText("No hay productos disponibles");
            }
        }catch(Exception e){
            
        }
        
    }
    void iniciarGanancias(){
        textGanancias = new javax.swing.JLabel[] {
        textGanancias1,
        textGanancias2,
        textGanancias3,
        textGanancias4,
        textGanancias5
        };
        textGanancias1.setText("");
        textGanancias2.setText("");
        textGanancias3.setText("");
        textGanancias4.setText("");
        textGanancias5.setText("");
        Producto[] aux = Configuracion.arrProductos.getArregloP();
        int index = Configuracion.arrProductos.getIndice();
        boolean[] estado = new boolean[index];
        for(int i=0; i<index; i++){
            estado[i]=false;
        }
        float mayor;
        int indM;
        int cont;
        do {
            cont = 0;
            mayor = 0;
            indM =-1;
            for(int i=0; i<index; i++){
                if(mayor >= (float) (aux[i].getValorXUnidad()*aux[i].getCantidadVendido())
                        && !estado[i]
                        && aux[i].getCantidadVendido()!= 0){
                    mayor = (float) (aux[i].getValorXUnidad()*aux[i].getCantidadVendido());
                    indM = i;
                }
            }
            if(!(mayor == 0)){
                estado[indM]= true;
                textGanancias[cont].setText(aux[indM].getNombreProducto()+"  "+aux[indM].getValorXUnidad()*aux[indM].getCantidadVendido());
                cont++;
            }
            
        }while(!(mayor == 0));
        if(textGanancias[0].getText()==""){
            textGanancias[0].setText("No hay ganancias");
        }
    }
    void iniciarVendidos(){
         textVendidos = new javax.swing.JLabel[] {
        textVendidos1,
        textVendidos2,
        textVendidos3,
        textVendidos4,
        textVendidos5
        };
        textVendidos1.setText("");
        textVendidos2.setText("");
        textVendidos3.setText("");
        textVendidos4.setText("");
        textVendidos5.setText("");
        Producto[] aux = Configuracion.arrProductos.getArregloP();
        int index = Configuracion.arrProductos.getIndice();
        boolean[] estado = new boolean[index];
        for(int i=0; i<index; i++){
            estado[i]=false;
        }
        int mayor;
        int indM;
        int cont;
        do {
            cont = 0;
            mayor = 0;
            indM =-1;
            for(int i=0; i<index; i++){
                if(mayor >= aux[i].getCantidadVendido()
                        && !estado[i]
                        && aux[i].getCantidadVendido()!= 0){
                    mayor = aux[i].getCantidadVendido();
                    indM = i;
                }
            }
            if(!(mayor == 0)){
                estado[indM]= true;
                textVendidos[cont].setText(aux[indM].getNombreProducto()+"  "+aux[indM].getCantidadVendido());
                cont++;
            }
            
        }while(!(mayor == 0));
        if(textVendidos[0].getText()==""){
            textVendidos[0].setText("No hay ventas");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textCaducos1 = new javax.swing.JLabel();
        textCaducos2 = new javax.swing.JLabel();
        textCaducos3 = new javax.swing.JLabel();
        textCaducos4 = new javax.swing.JLabel();
        textCaducos5 = new javax.swing.JLabel();
        textCaducar1 = new javax.swing.JLabel();
        textCaducar2 = new javax.swing.JLabel();
        textCaducar3 = new javax.swing.JLabel();
        textCaducar4 = new javax.swing.JLabel();
        textCaducar5 = new javax.swing.JLabel();
        textVendidos1 = new javax.swing.JLabel();
        textVendidos2 = new javax.swing.JLabel();
        textVendidos3 = new javax.swing.JLabel();
        textVendidos4 = new javax.swing.JLabel();
        textVendidos5 = new javax.swing.JLabel();
        textGanancias1 = new javax.swing.JLabel();
        textGanancias2 = new javax.swing.JLabel();
        textGanancias3 = new javax.swing.JLabel();
        textGanancias4 = new javax.swing.JLabel();
        textGanancias5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(950, 600));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pasteleria (1).jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 0, -1, 154));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Productos Caducos:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 187, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Productos por caducar:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 215, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Productos más vendidos:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Productos con más ganancias:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        textCaducos1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducos1.setForeground(new java.awt.Color(102, 102, 102));
        textCaducos1.setText("jLabel6");
        add(textCaducos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 299, 27));

        textCaducos2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducos2.setForeground(new java.awt.Color(102, 102, 102));
        textCaducos2.setText("jLabel6");
        add(textCaducos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 299, 27));

        textCaducos3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducos3.setForeground(new java.awt.Color(102, 102, 102));
        textCaducos3.setText("jLabel6");
        add(textCaducos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 299, 27));

        textCaducos4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducos4.setForeground(new java.awt.Color(102, 102, 102));
        textCaducos4.setText("jLabel6");
        add(textCaducos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 299, 27));

        textCaducos5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducos5.setForeground(new java.awt.Color(102, 102, 102));
        textCaducos5.setText("jLabel6");
        add(textCaducos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 299, 27));

        textCaducar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducar1.setForeground(new java.awt.Color(102, 102, 102));
        textCaducar1.setText("jLabel6");
        add(textCaducar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 299, 27));

        textCaducar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducar2.setForeground(new java.awt.Color(102, 102, 102));
        textCaducar2.setText("jLabel6");
        add(textCaducar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 299, 27));

        textCaducar3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducar3.setForeground(new java.awt.Color(102, 102, 102));
        textCaducar3.setText("jLabel6");
        add(textCaducar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 299, 27));

        textCaducar4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducar4.setForeground(new java.awt.Color(102, 102, 102));
        textCaducar4.setText("jLabel6");
        add(textCaducar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 299, 27));

        textCaducar5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCaducar5.setForeground(new java.awt.Color(102, 102, 102));
        textCaducar5.setText("jLabel6");
        add(textCaducar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 299, 27));

        textVendidos1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textVendidos1.setForeground(new java.awt.Color(102, 102, 102));
        textVendidos1.setText("jLabel6");
        add(textVendidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 299, 27));

        textVendidos2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textVendidos2.setForeground(new java.awt.Color(102, 102, 102));
        textVendidos2.setText("jLabel6");
        add(textVendidos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 299, 27));

        textVendidos3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textVendidos3.setForeground(new java.awt.Color(102, 102, 102));
        textVendidos3.setText("jLabel6");
        add(textVendidos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 299, 27));

        textVendidos4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textVendidos4.setForeground(new java.awt.Color(102, 102, 102));
        textVendidos4.setText("jLabel6");
        add(textVendidos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 299, 27));

        textVendidos5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textVendidos5.setForeground(new java.awt.Color(102, 102, 102));
        textVendidos5.setText("jLabel6");
        add(textVendidos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 299, 27));

        textGanancias1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textGanancias1.setForeground(new java.awt.Color(102, 102, 102));
        textGanancias1.setText("jLabel6");
        add(textGanancias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 299, 27));

        textGanancias2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textGanancias2.setForeground(new java.awt.Color(102, 102, 102));
        textGanancias2.setText("jLabel6");
        add(textGanancias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 299, 27));

        textGanancias3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textGanancias3.setForeground(new java.awt.Color(102, 102, 102));
        textGanancias3.setText("jLabel6");
        add(textGanancias3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 299, 27));

        textGanancias4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textGanancias4.setForeground(new java.awt.Color(102, 102, 102));
        textGanancias4.setText("jLabel6");
        add(textGanancias4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 299, 27));

        textGanancias5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textGanancias5.setForeground(new java.awt.Color(102, 102, 102));
        textGanancias5.setText("jLabel6");
        add(textGanancias5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 299, 27));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel textCaducar1;
    private javax.swing.JLabel textCaducar2;
    private javax.swing.JLabel textCaducar3;
    private javax.swing.JLabel textCaducar4;
    private javax.swing.JLabel textCaducar5;
    private javax.swing.JLabel textCaducos1;
    private javax.swing.JLabel textCaducos2;
    private javax.swing.JLabel textCaducos3;
    private javax.swing.JLabel textCaducos4;
    private javax.swing.JLabel textCaducos5;
    private javax.swing.JLabel textGanancias1;
    private javax.swing.JLabel textGanancias2;
    private javax.swing.JLabel textGanancias3;
    private javax.swing.JLabel textGanancias4;
    private javax.swing.JLabel textGanancias5;
    private javax.swing.JLabel textVendidos1;
    private javax.swing.JLabel textVendidos2;
    private javax.swing.JLabel textVendidos3;
    private javax.swing.JLabel textVendidos4;
    private javax.swing.JLabel textVendidos5;
    // End of variables declaration//GEN-END:variables
}
