
package Controller;

import View.vistaComprar;

public class ControllerComprar {
    private vistaComprar vista;
    
    public ControllerComprar(){
        this.vista=new vistaComprar();
        
        
    }
    
    
    public void run(){
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
    }
}
