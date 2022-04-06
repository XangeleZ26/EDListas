
package Model;

import javax.swing.SwingUtilities;

public class Configuracion {
    public static ArregloProductos arrProductos=new ArregloProductos();
    public static ArregloFacturas arrFacturas = new ArregloFacturas();
    public static Relog relog=new Relog();
    
    //solo esto es necesario para poder serializar y deserializar cualquier archivo
    public static Serializacion serial=new Serializacion();
 
}

