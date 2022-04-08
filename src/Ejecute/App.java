
package Ejecute;

import Controller.*;
import Model.*;
import View.*;
import java.io.File;

public class App {
    public static void main(String[] args) {
        ControllerViewLogin controller=new ControllerViewLogin();
        controller.run();
        //xd
        File archivoProductos=new File("archivoProductos.dat");
        if(archivoProductos.exists()){
        try {
            ArregloProductos extra = (ArregloProductos) Configuracion.serial.deserializar("archivoProductos.dat");
            Configuracion.arrProductos = extra;
        } catch (Exception ex) {
            System.out.println("archivo vacio, primer guardado y/o archivo inexistente");
        }}
    
        File archivoFacturas = new File("facturas.txt");
        if(archivoFacturas.exists()){
        try {
            ArregloFacturas extra2 = (ArregloFacturas) Configuracion.serial.deserializar("facturas.txt");
            Configuracion.arrFacturas = extra2;
            System.out.println(Configuracion.arrFacturas);
        } catch (Exception ex) {
            System.out.println("archivo vacio, primer guardado y/o archivo inexistente");
        }}
    }
}
