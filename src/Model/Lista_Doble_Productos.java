
package Model;
import java.io.*;
public class Lista_Doble_Productos implements Serializable{
private static final long serialVersionUID = 2L;
Nodo_Producto primero;
Nodo_Producto ultimo;
    
    public Lista_Doble_Productos(){
    primero=ultimo=null;}
    
    public Object[] header() {
        Object tmp[] = new Object[9];
        tmp[0] = "Código";
        tmp[1] = "Nombre";
        tmp[2] = "Categoria";
        tmp[3] = "Valor c/u(S/.)";
        tmp[4] = "Cant. inicial";
        tmp[5] = "Cant. actual";
        tmp[6] = "Cant. ventas"; 
        tmp[7] = "Ganancias(S/.)";
        tmp[8] = "Estado";
        return tmp;
    }

    public Object[][] data() {
        Object tmp[][] = new Object[this.Contar()][9];
        int i =0;
        Nodo_Producto pos = primero ;
        while(pos != null) {
            tmp[i][0] = pos.getContenido().getNumberEtiqueta();
            tmp[i][1] = pos.getContenido().getNombreProducto();
            tmp[i][2] = pos.getContenido().getCategoria();
            tmp[i][3] = pos.getContenido().getValorXUnidad();
            tmp[i][4] = pos.getContenido().getStockInicial();
            tmp[i][5] = pos.getContenido().getStock();
            tmp[i][6] = pos.getContenido().getCantidadVendido();
            tmp[i][7] = pos.getContenido().getCantidadVendido()*pos.getContenido().getValorXUnidad();
            tmp[i][8] = pos.getContenido().getEstado();
                pos=pos.siguiente;
        i++;
        }
        return tmp;
    }
    
    public Lista_Doble_Productos(Nodo_Producto primero,Nodo_Producto ultimo){
    this.primero= primero;
    this.ultimo = ultimo;}
    
    public Nodo_Producto Buscar(String codigo){
    Nodo_Producto pos = primero ;
    while(pos!=null && !codigo.equalsIgnoreCase(pos.getContenido().getNumberEtiqueta())){
        pos=pos.siguiente;
        }
    return pos;}

    public void Insertar_Ultimo(Nodo_Producto llegado){
        if(primero == null){
        primero = ultimo = llegado;
        }
        else{
        ultimo.setSiguiente(llegado);
        llegado.setAnterior(ultimo);
        ultimo = llegado;
        }
    }
    
    public void Elimina_Nodo(Nodo_Producto Auxiliar){
    
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
            Nodo_Producto Izquierda = Auxiliar.getAnterior();
            Nodo_Producto Derecha = Auxiliar.getSiguiente();
            Izquierda.setSiguiente(Derecha);
            Derecha.setAnterior(Izquierda);}
    }

    public Nodo_Producto getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo_Producto primero) {
        this.primero = primero;
    }

    public Nodo_Producto getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo_Producto ultimo) {
        this.ultimo = ultimo;
    }

    public int Contar(){
    Nodo_Producto pos = primero ;
    int contador=0;
    while(pos!=null){
    pos=pos.siguiente;
    contador++;
    }
    return contador;}
    
    public void colocarEliminandoParaAgotados() {
    Nodo_Producto pos = primero;
    while( pos!=null && pos.getContenido().getEstado().equalsIgnoreCase("AGOTADO") ){
        pos.getContenido().setEstado("ELIMINANDO");
        pos=pos.siguiente;}
    }

    public void colocarEliminandoParaCaducados() {
    Nodo_Producto pos = primero;
    while( pos!=null && pos.getContenido().getEstado().equalsIgnoreCase("CADUCADO") ){
        pos.getContenido().setEstado("ELIMINANDO");
        pos=pos.siguiente;}
    }
    
    public void Ordenar_Por_Nombre(){
    Producto temp;
    Nodo_Producto auxiliar_J, auxiliar_X, menor;
    auxiliar_J = primero;
    while(auxiliar_J !=null){
    menor=auxiliar_J;
    auxiliar_X = menor.getSiguiente();
        while(auxiliar_J !=null){
            String N1= auxiliar_X.getContenido().getNombreProducto();
            String N2= menor.getContenido().getNombreProducto();
            if(N1.compareTo(N2)<0){
                menor=auxiliar_X;
            }
            auxiliar_X = auxiliar_X.getSiguiente();
        
        }
        temp = auxiliar_J.getContenido();
        auxiliar_J.setContenido(menor.getContenido());
        menor.setContenido(temp);
        auxiliar_J =auxiliar_J .siguiente;
        }
    }
    
    public void Ordenar_Por_Stock(){
    Producto temp;
    Nodo_Producto auxiliar_J, auxiliar_X, menor;
    auxiliar_J = primero;
    while(auxiliar_J !=null){
    menor=auxiliar_J;
    auxiliar_X = menor.getSiguiente();
        while(auxiliar_J !=null){
            if(auxiliar_X.getContenido().getStock()<menor.getContenido().getStock()){
                menor=auxiliar_X;
            }
            auxiliar_X = auxiliar_X.getSiguiente();
        }
        temp = auxiliar_J.getContenido();
        auxiliar_J.setContenido(menor.getContenido());
        menor.setContenido(temp);
        auxiliar_J =auxiliar_J .siguiente;
        }
    }
    
    public void Ordenar_Por_Stock_Inicial(){
    Producto temp;
    Nodo_Producto auxiliar_J, auxiliar_X, menor;
    auxiliar_J = primero;
    while(auxiliar_J !=null){
    menor=auxiliar_J;
    auxiliar_X = menor.getSiguiente();
        while(auxiliar_J !=null){
            if(auxiliar_X.getContenido().getStockInicial()<menor.getContenido().getStockInicial()){
                menor=auxiliar_X;
            }
            auxiliar_X = auxiliar_X.getSiguiente();
        }
        temp = auxiliar_J.getContenido();
        auxiliar_J.setContenido(menor.getContenido());
        menor.setContenido(temp);
        auxiliar_J =auxiliar_J .siguiente;
        }
    }
    
    public void Ordenar_Por_Ganancia(){
    Producto temp;
    Nodo_Producto auxiliar_J, auxiliar_X, menor;
    auxiliar_J = primero;
    while(auxiliar_J !=null){
    menor=auxiliar_J;
    auxiliar_X = menor.getSiguiente();
        while(auxiliar_J !=null){
            if(auxiliar_X.getContenido().getCantidadVendido()*auxiliar_X.getContenido().getValorXUnidad()<menor.getContenido().getCantidadVendido()*menor.getContenido().getValorXUnidad()){
                menor=auxiliar_X;
            }
            auxiliar_X = auxiliar_X.getSiguiente();
        }
        temp = auxiliar_J.getContenido();
        auxiliar_J.setContenido(menor.getContenido());
        menor.setContenido(temp);
        auxiliar_J =auxiliar_J .siguiente;
        }
    }
    
    public void Ordenar_Por_Ventas(){
    Producto temp;
    Nodo_Producto auxiliar_J, auxiliar_X, menor;
    auxiliar_J = primero;
    while(auxiliar_J !=null){
    menor=auxiliar_J;
    auxiliar_X = menor.getSiguiente();
        while(auxiliar_J !=null){
            if(auxiliar_X.getContenido().getCantidadVendido()<menor.getContenido().getCantidadVendido()){
                menor=auxiliar_X;
            }
            auxiliar_X = auxiliar_X.getSiguiente();
        }
        temp = auxiliar_J.getContenido();
        auxiliar_J.setContenido(menor.getContenido());
        menor.setContenido(temp);
        auxiliar_J =auxiliar_J .siguiente;
        }
    }
    
    public boolean estaVacio() {    
    if(primero==null){return true;}
    return false;
    }
}
