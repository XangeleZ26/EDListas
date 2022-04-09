package Controller;

import Model.*;
import View.Principal;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControllerPrincipal {

    private Principal vista;

    public ControllerPrincipal() {
        vista = new Principal();

    }

    public void run() {
        vista.setVisible(true);

        vista.setLocationRelativeTo(null);
    }
}
