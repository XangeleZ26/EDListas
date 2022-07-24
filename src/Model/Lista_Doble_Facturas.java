
package Model;
import java.io.Serializable;
import java.text.SimpleDateFormat;

public class Lista_Doble_Facturas implements Serializable {
private static final long serialVersionUID = 2L;
Nodo_Factura primero;
Nodo_Factura ultimo;
    
    public Lista_Doble_Facturas(){
    primero=ultimo=null;}
    
    public Lista_Doble_Facturas(Nodo_Factura primero,Nodo_Factura ultimo){
    this.primero= primero;
    this.ultimo = ultimo;}
    
    public Object[] header() {
        Object tmp [] = new Object[6];
        tmp[0] = "Nombre";
        tmp[1] = "Codigo";
        tmp[2] = "Producto";
        tmp[3] = "Fecha de venta";
        tmp[4] = "Cantidad";
        tmp[5] = "Monto";
        return tmp;
    }
    public Object[][] data() {
        Object tmp[][] = new Object[Contar()][6];
        int i =0;
        Nodo_Factura pos = primero;
        while(pos!=null){
        tmp[i][0] = pos.getContenido().getNombre();
            tmp[i][1] = pos.getContenido().getCodigo();
            tmp[i][2] = pos.getContenido().getProducto();
            SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
            tmp[i][3] = formateadorFecha.format(pos.getContenido().getFechaVenta());
            tmp[i][4] = pos.getContenido().getCantidad();
            tmp[i][5] = pos.getContenido().getMonto();
        pos=pos.siguiente;
        i++;
        }
        return tmp;
    }
    
    public int Contar(){
    Nodo_Factura pos = primero ;
    int contador=0;
    while(pos!=null){
    pos=pos.siguiente;
    contador++;
    }
    return contador;}
    
    public Nodo_Factura Buscar(String codigo){
        Nodo_Factura pos = primero ;
    while(pos!=null && !codigo.equalsIgnoreCase(pos.getContenido().getCodigo())){
        pos=pos.siguiente;
        }
    return pos;}

    public void Insertar_Ultimo(Nodo_Factura llegado){
        if(primero == null){
        primero = ultimo = llegado;
        }
        else{
        ultimo.setSiguiente(llegado);
        llegado.setAnterior(ultimo);
        ultimo = llegado;
        }
    }
    
    public void Elimina_Nodo(Nodo_Factura Auxiliar){
    
    if(primero == ultimo){
    primero = ultimo = null;
    }
    
    else if(Auxiliar == primero)
        {
        primero = primero.getSiguiente();
        primero.setAnterior(null);
        }
        else if(Auxiliar ==  ultimo){
         ultimo =  ultimo.getAnterior();
         ultimo.setSiguiente(null);}
            else{
            Nodo_Factura Izquierda = Auxiliar.getAnterior();
            Nodo_Factura Derecha = Auxiliar.getSiguiente();
            Izquierda.setSiguiente(Derecha);
            Derecha.setAnterior(Izquierda);}
    }

    public Nodo_Factura getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo_Factura primero) {
        this.primero = primero;
    }

    public Nodo_Factura getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo_Factura ultimo) {
        this.ultimo = ultimo;
    }
    
}

