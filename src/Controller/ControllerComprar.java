package Controller;

import Model.Configuracion;
import Model.Facturas;
import Model.Producto;
import View.vistaComprar;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerComprar {

    private vistaComprar vista;
    private Producto producto;

    public ControllerComprar(Producto producto) {
        this.vista = new vistaComprar();
        this.producto = producto;
        this.vista.btnPagar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("xddd");
                if (producto.getStock()>0) {
                    if(!(Integer.parseInt(vista.cantidad.getText())<1)){
                        
                         vista.costoTotal.setText(String.valueOf(Integer.parseInt(vista.cantidad.getText()) * Double.parseDouble(vista.costoUnitario.getText())));
                         
                        if(producto.getStock()>=Integer.parseInt(vista.cantidad.getText())){
                        
                            if(vista.verificarEmail()){  
                         if(vista.verificarValidezDNI()){   
                    
                    producto.setCantidadVendido(producto.getCantidadVendido() + Integer.parseInt(vista.cantidad.getText()));
                    producto.setStock(producto.getStock() - Integer.parseInt(vista.cantidad.getText()));
                    JOptionPane.showMessageDialog(null, "Compra realizada con éxito!");
                    llenarFactura();
                    vista.dispose();
                    //COMENTÉ EL CODIGO DEL ARCHIVO PARA QUE SE HAGAN PRUEBAS SIN MODIFICARLO
                    
//                    try {
//                        Configuracion.serial.serializar("archivoProductos.dat", Configuracion.arrProductos);
//
//                    } catch (Exception ex) {
//                        JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");
//
//                    }
                        }else{
                         JOptionPane.showMessageDialog(null,"Dni inválido, debe contener 8 dígitos."); 
                         vista.dniP.setText("");
                         }
                        }else{
                       JOptionPane.showMessageDialog(null,"Correo inválido, escriba correctamente."); 
                       vista.emailP.setText("");
                        }
                        }else{
                      JOptionPane.showMessageDialog(null, "Su intento de compra excede el stock en almacén.\nStock disponible: "+producto.getStock());      
                        vista.cantidad.setText("");
                        }
                    }else{
                      JOptionPane.showMessageDialog(null,"No se admite '0' ni números negativos.");   
                      vista.cantidad.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "¡Stock agotado! Vuelva a recargar la página."); 
                    vista.dispose();
                }
                
            }
        });

    }

    ;
    public void llenarFactura(){
        int auxiliar;
        if(Configuracion.arrFacturas.getIndice()==0){
            auxiliar = 1;
        }else{
            auxiliar = (Integer.parseInt(Configuracion.arrFacturas.getArregloP()[Configuracion.arrFacturas.getIndice()-1].getCodigo())+1);
        }
        Configuracion.arrFacturas.agregar(new Facturas(
                vista.nombreP.getText(),
                auxiliar+"",
                producto.getNombreProducto(),
                new Date(),
                Integer.parseInt(vista.cantidad.getText()), 
                (float) (Float.parseFloat(vista.cantidad.getText())*
                        producto.getValorXUnidad())));
                    
        try{
            Configuracion.serial.serializar("facturas.txt",Configuracion.arrFacturas); 
            System.out.println(" Prueba"+Configuracion.arrFacturas+" "+Float.parseFloat(vista.cantidad.getText())*
                        producto.getValorXUnidad());
        } catch (IOException ex) {
            //F
        }
    }
    
    public void llenarDatos() {
        vista.imagenLabel.setIcon(scaleImage((ImageIcon) producto.getImagen(), 190, 160));
        vista.nombretxt.setText(producto.getNombreProducto());
        if (producto.getPorciones() == 1) {
            vista.porcionestxt.setText(" (" + producto.getPorciones() + " porción)");
        } else {
            vista.porcionestxt.setText(" (" + producto.getPorciones() + " porciones)");
        }
        vista.categoriatxt.setText(producto.getCategoria());
        vista.preciotxt.setText(String.valueOf(producto.getValorXUnidad()));
        vista.descripciontxt.setText(producto.getDescripcion());
        vista.costoUnitario.setText(String.valueOf(producto.getValorXUnidad()));
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

    public void run() {
        llenarDatos();
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);

    }
}
