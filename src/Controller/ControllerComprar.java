
package Controller;

import Model.Producto;
import View.vistaComprar;

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
        vista.nombretxt.setText(producto.getNombreProducto());
    }
    public void run(){
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        llenarDatos();
    }
}
