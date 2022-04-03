
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
    private ObjectOutputStream escribir;
    private ObjectInputStream lector;
    
    public Serializacion(){
        
    }
    
    public void serializar(String direccion,Object objeto) throws IOException{
             try { 
            this.escribir=new ObjectOutputStream(new FileOutputStream(direccion));
            escribir.writeObject(objeto);
            escribir.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            this.escribir.close();
        }
    }
    
    public Object deserializar(String archivo) throws Exception{
        Object  arreglo = null;
 
        try {
            this.lector = new ObjectInputStream(new FileInputStream(archivo));
            arreglo = (Object)lector.readObject();
        } catch (Exception ex) {
        }finally{
            this.lector.close();
        }
        return arreglo;  
    }
}
