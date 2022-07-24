
package Model;
import java.io.*;

public class Nodo_Producto implements Serializable{
private static final long serialVersionUID = 2L;
Nodo_Producto anterior;
Producto contenido;
Nodo_Producto siguiente;  

    public Nodo_Producto() {
        anterior=siguiente=null;
        contenido=null;
    }

    public Nodo_Producto(Producto contenido) {
        this.contenido = contenido;
        anterior=siguiente=null;
    }
     
    public Nodo_Producto(Nodo_Producto anterior, Producto contenido, Nodo_Producto siguiente) {
        this.anterior = anterior;
        this.contenido = contenido;
        this.siguiente = siguiente;
    }

    public Nodo_Producto getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_Producto anterior) {
        this.anterior = anterior;
    }

    public Producto getContenido() {
        return contenido;
    }

    public void setContenido(Producto contenido) {
        this.contenido = contenido;
    }

    public Nodo_Producto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Producto siguiente) {
        this.siguiente = siguiente;
    }


}
