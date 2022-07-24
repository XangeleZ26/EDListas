
package Model;

import javax.swing.SwingUtilities;

public class Configuracion {
     //solo esto es necesario para poder serializar y deserializar cualquier archivo
    public static Serializacion serial=new Serializacion();
    public static Lista_Doble_Productos arrProductos=new Lista_Doble_Productos();
    public static Lista_Doble_Facturas arrFacturas = new Lista_Doble_Facturas();
    public static Relog relog;

    public static Lista_Doble_Productos getArrProductos() {
        return arrProductos;
    }

    public static void setArrProductos(Lista_Doble_Productos arrProductos) {
        Configuracion.arrProductos = arrProductos;
    }

    public static Lista_Doble_Facturas getArrFacturas() {
        return arrFacturas;
    }

    public static void setArrFacturas(Lista_Doble_Facturas arrFacturas) {
        Configuracion.arrFacturas = arrFacturas;
    }
    
 
    
}

