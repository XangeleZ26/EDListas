
package Controller;

import View.PagVistaCliente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerPagVistaCliente {
    private PagVistaCliente vista;
    public ControllerPagVistaCliente(){
        this.vista=new PagVistaCliente();
        
         //boton de refrescar
 
    }
    
    public void run(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
}
