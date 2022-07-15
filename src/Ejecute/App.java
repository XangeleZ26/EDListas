package Ejecute;

import Controller.*;
import Model.*;
import View.*;
import java.io.File;

//PROYECTO REALIZADO USANDO JDK 15
public class App {

    public static void main(String[] args) {
        System.out.println("PROYECTO REALIZADO USANDO JDK 15");

        File archivoProductos = new File("archivoProductos.dat");
        if (archivoProductos.exists()) {
            try {
                ArregloProductos extra = (ArregloProductos) Configuracion.serial.deserializar("archivoProductos.dat");
                Configuracion.arrProductos = extra;
                if(Configuracion.arrProductos == null){
                    Configuracion.arrProductos = new ArregloProductos();
                }
            } catch (Exception ex) {
                System.out.println("archivo vacio, primer guardado y/o archivo inexistente");
            }
        }

        File archivoFacturas = new File("facturas.txt");
        if (archivoFacturas.exists()) {
            try {
                ArregloFacturas extra2 = (ArregloFacturas) Configuracion.serial.deserializar("facturas.txt");
                Configuracion.arrFacturas = extra2;
                if (Configuracion.arrFacturas == null) {
                    Configuracion.arrFacturas = new ArregloFacturas();
                }
            } catch (Exception ex) {
                System.out.println("archivo vacio, primer guardado y/o archivo inexistente");
            }
        }
        try{
            Configuracion.relog=new Relog(); 
        }catch(Exception ex){
            System.out.println("error en relog"); 
        }
        System.out.println("PROYECTO REALIZADO USANDO JDK 15");
        ControllerViewLogin controller = new ControllerViewLogin();
        controller.run();
        
        VistaCliente xd = new VistaCliente();
        xd.setVisible(true);
        xd.setLocationRelativeTo(null);
    }
}
