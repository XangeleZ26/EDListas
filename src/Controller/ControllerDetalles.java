
package Controller;

import Model.Producto;
import View.VistaDetalles;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class ControllerDetalles {
    private VistaDetalles vista;
    private Producto producto;
    
    public ControllerDetalles(Producto producto){
        this.producto=producto;
        vista=new VistaDetalles();
        this.vista.btnRefrescar.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e){
               llenar();
           }
        });
    }
    public void llenar(){
        vista.barrastxt.setIcon(producto.getImagenBarras());
//        vista.barrastxt.setIcon(scaleImage((ImageIcon) producto.getImagenBarras(), 220,70));
        vista.cantidadVendidatxt.setText(String.valueOf(producto.getCantidadVendido()));
        vista.categoriatxt.setText(producto.getCategoria());
        vista.codigotxt.setText(producto.getNumberEtiqueta());
        vista.descripciontxt.setText(producto.getDescripcion());
        vista.estadotxt.setText(producto.getEstado());
        vista.gananciatxt.setText(String.valueOf(producto.getCantidadVendido()*producto.getValorXUnidad()));
        vista.imagentxt.setIcon(scaleImage((ImageIcon) producto.getImagen(), 220,200));
        vista.nombretxt.setText(producto.getNombreProducto());
        if(producto.getPorciones()==1){
            vista.porcionestxt.setText(producto.getPorciones()+ "porción"); 
        }else{
            vista.porcionestxt.setText(producto.getPorciones()+ "porciones"); 
        }
        vista.precioUnitariotxt.setText(String.valueOf(producto.getValorXUnidad()));
        vista.stockActualtxt.setText(String.valueOf(producto.getStock()));
        vista.stockinicialtxt.setText(String.valueOf(producto.getStockInicial()));
        vista.valorActualDeStocktxt.setText(String.valueOf(producto.getStock()*producto.getValorXUnidad()));
        vista.valorInicialtxt.setText(String.valueOf(producto.getValorTotalStock()));
        vista.vencimientotxt.setText(producto.getFechaVencimiento());
        
    }
    public void run(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        llenar();
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
}
