
package Model;
import java.io.*;
public class Nodo_Factura implements Serializable{
private static final long serialVersionUID = 2L;
Nodo_Factura anterior;
Facturas contenido;
Nodo_Factura siguiente;

    public Nodo_Factura(){}
    public Nodo_Factura(Facturas contenido){
    anterior=siguiente=null;
    this.contenido=contenido;}
    
    public Nodo_Factura(Nodo_Factura anterior, Facturas contenido, Nodo_Factura siguiente) {
        this.anterior = anterior;
        this.contenido = contenido;
        this.siguiente = siguiente;
    }

    public Nodo_Factura getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_Factura anterior) {
        this.anterior = anterior;
    }

    public Facturas getContenido() {
        return contenido;
    }

    public void setContenido(Facturas contenido) {
        this.contenido = contenido;
    }

    public Nodo_Factura getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Factura siguiente) {
        this.siguiente = siguiente;
    }
    

}
