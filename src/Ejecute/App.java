
package Ejecute;

import Controller.*;
import Model.*;
import View.*;
import java.io.File;

public class App {
    public static void main(String[] args) {
        
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
        
//        Configuracion.arrProductos.getArregloP()[0].setPorciones(6);
//        Configuracion.arrProductos.getArregloP()[1].setStock(100);
//        Configuracion.arrProductos.getArregloP()[2].setPorciones(6);
//        Configuracion.arrProductos.getArregloP()[3].setPorciones(8);
//        Configuracion.arrProductos.getArregloP()[4].setPorciones(8);
//        Configuracion.arrProductos.getArregloP()[5].setPorciones(10);
//        Configuracion.arrProductos.getArregloP()[6].setPorciones(1);
//        Configuracion.arrProductos.getArregloP()[7].setPorciones(8);
//         try {
//            Configuracion.serial.serializar("archivoProductos.dat", Configuracion.arrProductos);
//          
//        } catch (Exception ex) {
//        }
        ControllerViewLogin controller=new ControllerViewLogin();
        controller.run();

//    VistaCliente vista=new VistaCliente();
//    vista.setVisible(true);
//    vista.setLocationRelativeTo(null);
//    
    vista xd=new vista();
    xd.setVisible(true);
    xd.setLocationRelativeTo(null);
    }
}
