
package Controller;

import Model.Producto;
import View.vistaComprar;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ControllerComprar {
    private vistaComprar vista;
    private Producto producto;
    public ControllerComprar(Producto producto){
        this.vista=new vistaComprar();
        this.producto=producto;
        
    }
    public ControllerComprar(){
        
    };
    public void llenarDatos(){
        vista.imagenLabel.setIcon(scaleImage((ImageIcon) producto.getImagen(),190,160));
        vista.nombretxt.setText(producto.getNombreProducto());
        if(producto.getPorciones()==1){
          vista.porcionestxt.setText(" ("+producto.getPorciones()+" porción)");  
        }else{
            vista.porcionestxt.setText(" ("+producto.getPorciones()+" porciones)");
        }
        vista.categoriatxt.setText(producto.getCategoria());
        vista.preciotxt.setText(String.valueOf(producto.getValorXUnidad()));
        vista.descripciontxt.setText(producto.getDescripcion());
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
    public void run(){
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        llenarDatos();
    }
}
