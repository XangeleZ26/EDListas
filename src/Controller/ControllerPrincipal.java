package Controller;

import Model.*;
import View.Principal;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControllerPrincipal {

    private Principal vista;

    public ControllerPrincipal() {
        vista = new Principal();
//       //ESTOS PRODUCTOS YA LOS TENGO AGREGADOS EN EL ARCHIVO
//        
//        Producto produccion = new Producto("Cocoa", "desayuno", "VIGENTE", "10/04/2021", "12", 101, 20, 12);
//        Configuracion.arrProductos.agregar(produccion);
//        Producto aa = new Producto("XD", "comercio", "VIGENTE","10/03/2022", "11", 200, 21, 11);
//        Configuracion.arrProductos.agregar(aa);
//        Producto zz = new Producto("zzz", "comercio", "VIGENTE","30/04/2022", "123", 10, 23, 14);
//        Configuracion.arrProductos.agregar(zz);
//        Producto ae = new Producto("zzz", "establo", "VIGENTE","30/04/2022", "534", 50, 2, 16);
//        Configuracion.arrProductos.agregar(ae);
//        Producto xd = new Producto("Cocoa", "desayuno", "VIGENTE","01/04/2022", "34", 300, 10, 2);
//        Configuracion.arrProductos.agregar(xd);
//        Producto qw = new Producto("cereal", "desayuno", "VIGENTE","04/04/2022", "865", 500, 33, 3);
//        Configuracion.arrProductos.agregar(qw);
//
//
//    //ESTE ALGORTIMO DE SERIALIZACION DEBE SER AGREGADO INMEDIATAMENTE DESPUÉS 
//    //DE QUE SE HALLA CREADO UN OBJETO NUEVO O SE HALLA HECHO UNA MODIFICACION (FALTA QUE IMPLEMENTEN LA PARTE DE "AGREGAR PRODUCTOS")
//        try {
//            Configuracion.serial.serializar("archivoProductos.dat", Configuracion.arrProductos);
//          
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");
//
//        }

    }

    public void run() {
        vista.setVisible(true);

        vista.setLocationRelativeTo(null);
    }
}
