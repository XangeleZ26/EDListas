package View;

import Controller.ControllerComprar;
import Controller.ControllerCreacion;
import Model.Configuracion;
import Model.Producto;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
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
int xMouse, yMouse;
    public VistaCliente() {
        configuracionCodigoVista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("TODO EL CODIGO DE VISTA ESTÁ EN EL SOURCE DE ESTA CLASE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 390, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void configuracionCodigoVista(){
        
        //modificacion de tamaño de JFrame
        this.setSize(1130, 800);
        this.setUndecorated(true);
        //modificacion de paneles

        //panel Background
        JPanel panelBackground = new JPanel();
        panelBackground.setLayout(null);
        panelBackground.setBounds(0, 0, 1130, 800);
        panelBackground.setBackground(Color.blue);

        //panel Barra
        JPanel panelBarra = new JPanel();
        panelBarra.setLayout(null);
        panelBarra.setBounds(0, 0, 1130, 40);
        panelBarra.setBackground(Color.white);
        
        panelBarra.addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(java.awt.event.MouseEvent evt) {
               barraArrastraMouseDragged(evt); 
            }
        });
        
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraArrastraMousePressed(evt);
            }
        });
        //***boton refrescar (dentro de panel barra)
        JLabel refrescarPag = new JLabel();
        refrescarPag.setBounds(8, 5, 40, 30);
        ImageIcon imagenResfrescar = new ImageIcon(getClass().getResource("/Images/refrescar.png"));
        refrescarPag.setIcon(imagenResfrescar);
        panelBarra.add(refrescarPag);

        refrescarPag.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                new VistaCliente();
                setVisible(true);
                setLocationRelativeTo(null);
                dispose();
            }
        });
        //***boton minimizar (dentro de panel barra)
        JPanel panelMini=new JPanel();
        panelMini.setLayout(null);
        panelMini.setBounds(1050, 0,40, 40);
        panelMini.setBackground(Color.white);

        JLabel minitxt=new JLabel();
        minitxt.setBounds(0,0,40, 40);
        minitxt.setBackground(new java.awt.Color(255, 255, 255));
        minitxt.setFont(new java.awt.Font("Eras Medium ITC", 1, 30)); // NOI18N
        minitxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minitxt.setText("--");
        minitxt.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minitxtMouseClicked(evt);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minitxtMouseEntered(evt,panelMini);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minitxtMouseExited(evt,panelMini);
            }
        });
        panelMini.add(minitxt);
        panelBarra.add(panelMini);
        
        
        //***boton cerrar (dentro de panel barra)
        JPanel panelCerrar=new JPanel();
        panelCerrar.setLayout(null);
        panelCerrar.setBounds(1090, 0,40 , 40);
        panelCerrar.setBackground(Color.white);
        
        JLabel cerrartxt=new JLabel();
        cerrartxt.setBounds(0,0,40,40);
//        cerrartxt.setBackground(new java.awt.Color(255, 255, 255));
        cerrartxt.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        cerrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrartxt.setText("X");
        cerrartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrartxtMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrartxtMouseExited(evt,panelCerrar,cerrartxt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrartxtMouseEntered(evt,panelCerrar,cerrartxt);
            }
        });
        panelCerrar.add(cerrartxt);
        panelBarra.add(panelCerrar);
        
        
        //panel Banner
        JPanel panelPresentacion = new JPanel();
        panelPresentacion.setLayout(null);
        panelPresentacion.setBounds(0, 0, 1130, 100);
        panelPresentacion.setBackground(Color.yellow);
        JLabel pruebaTitulo = new JLabel();
        pruebaTitulo.setText("Esto es un titulo");
        pruebaTitulo.setBounds(0, 50, 1100, 20);
        pruebaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelPresentacion.add(pruebaTitulo);
        panelPresentacion.add(panelBarra);
        
        //panel Productos
        JPanel panelProducto = new JPanel();
        panelProducto.setLayout(null);
        panelProducto.setBounds(33, 150, 1030, 600);
        panelProducto.setBackground(Color.white);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(33, 150, 1030, 600); //el scrollPane inicialmente tendra el tamaño del panelProducto (no aparecerán scrolls en un primer momento)
        scrollPane.setViewportView(panelProducto); //es como si scrollPane tomara poseción de panelProducto y ahora se hubieran combinado
        scrollPane.getViewport().setView(panelProducto);

        //Implementar paneles al panel background
        panelBackground.add(panelPresentacion);
        panelBackground.add(scrollPane);

        //Inicio de colocacion de imagenes
        
        int left = 0;
        int down = 0;
        int ImagesXFila = 0;
        int imagenesMostradas=0;
        int cantTotalImagesAUsar = 0;
        //ESTO ES PARA SABER CON CUANTAS IMAGENES SE TRABAJARÁN DE ANTEMANO
        for (int i = 0; i < Configuracion.arrProductos.getIndice(); i++) {
            if(Configuracion.arrProductos.getArregloP()[i].getStock()>0&&!(Configuracion.arrProductos.getArregloP()[i].getEstado().equals("VENCIDO"))){
               cantTotalImagesAUsar++; 
            }
        }
        
        for (int i = 0; i < Configuracion.arrProductos.getIndice(); i++) {
            
            if(Configuracion.arrProductos.getArregloP()[i].getStock()>0&&!(Configuracion.arrProductos.getArregloP()[i].getEstado().equals("VENCIDO"))){
                
            JLabel imagenLabel = new JLabel();
            JLabel nombreLabel = new JLabel();
            JLabel precioLabel = new JLabel();

            imagenLabel.setIcon(scaleImage((ImageIcon) Configuracion.arrProductos.getArregloP()[i].getImagen(), 240, 250));
            
            nombreLabel.setText(Configuracion.arrProductos.getArregloP()[i].getNombreProducto());
            nombreLabel.setHorizontalAlignment(SwingConstants.CENTER);

            precioLabel.setText("S/. " + String.valueOf(Configuracion.arrProductos.getArregloP()[i].getValorXUnidad()));
            precioLabel.setHorizontalAlignment(SwingConstants.CENTER);

            Producto datoProducto = Configuracion.arrProductos.getArregloP()[i];
            //MOUSE LISTENER
            imagenLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ControllerComprar controller = new ControllerComprar(datoProducto);
                    controller.run();
                }
            });

            imagenLabel.setBounds(60 + left, 30 + down, 240, 250);
            nombreLabel.setBounds(60 + left, 245 + down, 240, 20);
            precioLabel.setBounds(60 + left, 265 + down, 240, 14);
            
            imagenLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            
            panelProducto.add(imagenLabel);
            panelProducto.add(nombreLabel);
            panelProducto.add(precioLabel);
            left += 329; //para mover hacia la derecha

            //ESTO ES PARA QUE SE FORME LAS SIGUIENTES FILAS CON 3 IMAGENES CADA UNA
            ImagesXFila++;
            imagenesMostradas++;
            if (ImagesXFila >= 3) {
                down += 270;
                left = 0;
                //si NO ha llegado al final y el indice NO es multiplo de 3
                if(!(imagenesMostradas==cantTotalImagesAUsar&&cantTotalImagesAUsar % 3 == 0)){
                    panelProducto.setPreferredSize(new Dimension(1010, 327 + down));
                }
                ImagesXFila = 0;
            }
        }
        }

        add(panelBackground);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    
    
    public void barraArrastraMousePressed(java.awt.event.MouseEvent evt){
        xMouse = evt.getX();
        yMouse = evt.getY();
    }
    public void barraArrastraMouseDragged(java.awt.event.MouseEvent evt){
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }
    
       private void minitxtMouseClicked(java.awt.event.MouseEvent evt) {                                      
        this.setExtendedState(ICONIFIED);
    }                                     

    private void minitxtMouseExited(java.awt.event.MouseEvent evt,JPanel panelMini) {                                     
        panelMini.setBackground(Color.white);
    }                                    

    private void minitxtMouseEntered(java.awt.event.MouseEvent evt,JPanel panelMini) {                                      
        panelMini.setBackground(new Color(235, 235, 235));
    }                                     
     private void cerrartxtMouseClicked(java.awt.event.MouseEvent evt) {                                       
        //this.setExtendedState(ICONIFIED);
        dispose();
    }                                      

    private void cerrartxtMouseExited(java.awt.event.MouseEvent evt,JPanel panel,JLabel text) {                                      
        panel.setBackground(Color.white);
        text.setForeground(Color.black);
    }                                     

    private void cerrartxtMouseEntered(java.awt.event.MouseEvent evt,JPanel panel,JLabel text) {                                       
        panel.setBackground(Color.red);
        text.setForeground(Color.white);
    }  
    public ImageIcon scaleImage(ImageIcon icon, int w, int h) {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if (icon.getIconWidth() > w) {
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if (nh > h) {
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
