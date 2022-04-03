
package Controller;

import View.ViewLogin;

public class ControllerViewLogin {
    private ViewLogin vista;
    public ControllerViewLogin(){
        this.vista=new ViewLogin();
    }
    public void run(){
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.vista.usuarioText.getCaret().setVisible(false);
       this.vista.contraseniaText.getCaret().setVisible(false);
    }
}
