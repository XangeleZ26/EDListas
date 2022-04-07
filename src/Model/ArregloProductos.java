package Model;

import java.io.Serializable;

public class ArregloProductos implements Serializable {

    private static final long serialVersionUID = 2L;

    private Producto arregloP[];
    private int indice;

    public ArregloProductos() {
        this.indice = 0;
        this.arregloP = new Producto[5];
    }

    public Object[] header() {
        Object tmp[] = new Object[9];
        tmp[0] = "Código";
        tmp[1] = "Nombre";
        tmp[2] = "Categoria";
        tmp[3] = "Stock inicial";
        tmp[4] = "Stock actual";
        tmp[5] = "Valor c/u(S/.)";
        tmp[6] = "Valor stock(S/.)";
        tmp[7] = "Vencimiento";
        tmp[8] = "Estado";
        return tmp;
    }

    public Object[][] data() {
        Object tmp[][] = new Object[this.indice][9];
        for (int i = 0; i < this.indice; i++) {
            tmp[i][0] = this.arregloP[i].getNumberEtiqueta();
            tmp[i][1] = this.arregloP[i].getNombreProducto();
            tmp[i][2] = this.arregloP[i].getCategoria();
            tmp[i][3] = this.arregloP[i].getStockInicial();
            tmp[i][4] = this.arregloP[i].getStock();
            tmp[i][5] = this.arregloP[i].getValorXUnidad();
            tmp[i][6] = this.arregloP[i].getValorTotalStock();
            tmp[i][7] = this.arregloP[i].getFechaVencimiento();
            tmp[i][8] = this.arregloP[i].getEstado();
        }
        return tmp;
    }

    public boolean agregar(Producto producto) {
        if (!this.documentoRegistrado(producto.getNumberEtiqueta())) {
            if (this.estaLleno()) {
                this.crecerArreglo();
            }
            this.arregloP[this.indice] = producto;
            this.indice++;
            return true;
        }
        return false;
    }

//    public boolean eliminar(Producto producto) {
//        boolean resultado = false;
//        if (!this.estaVacio()) {
//            int encontrado = this.buscar(producto.getNumberEtiqueta());
//            if (encontrado >= 0) {
//                moverElementosParaEliminar(encontrado);
//                resultado = true;
//            }
//        }
//        return resultado;
//    }
    public void colocarEliminandoParaVencidos() {

        for (int i = 0; i < this.indice; i++) {
            if (this.arregloP[i].getEstado().equals("VENCIDO")) {
//              System.out.println(i+" "+this.arregloP[i].getNumberEtiqueta()+" "+this.arregloP[i].getEstado());
                this.arregloP[i].setEstado("ELIMINANDO");
            }
        }

//      int indiceExtra=0;
//      Producto productoExtra[]=new Producto[5];
//      for(int i=0;i<this.indice;i++){
//          if(this.arregloP[i]!=null){
//              
//          }
//      }
        //Primero se debe encontrar el orden del objeto en el arreglo
//        for(int i=0; i<this.indice && orden==-1 ;i++){
//            if(producto == this.arregloP[i]){
//                orden=i;
//                result = true; //LOS PRODUCTOS VENCIDOS PASAN CORRECTAMENTE A ESTE METODO
//                System.out.println(i+" "+producto.getNumberEtiqueta()+" "+producto.getEstado());
//            }
//        }
        //Una vez ubicado el orden del objeto, se borra copiando los objetos de adelante hacia atrás
//        if(result==true){
//        for(int i=orden; i<this.indice-1; i++){
//            this.arregloP[i] = this.arregloP[i+1];
//        } 
//        //Se borra el espacio en memoria sobrante y se modifica la cantidad y el orden de objetos
//        this.arregloP[this.indice-1] = null;
//        this.indice--;
//        }
    }

    public void eliminarPorCodigo(String codigo) {
        boolean result = false;
        int orden = -1;
        //Primero se debe encontrar el orden del objeto en el arreglo
        for (int i = 0; i < this.indice && orden == -1; i++) {
            if (codigo == this.arregloP[i].getNumberEtiqueta()) {
                orden = i;
                result = true;
            }
        }
        //Una vez ubicado el orden del objeto, se borra copiando los objetos de adelante hacia atrás
        if (result == true) {
            for (int i = orden; i < this.indice - 1; i++) {
                this.arregloP[i] = this.arregloP[i + 1];
            }
            //Se borra el espacio en memoria sobrante y se modifica la cantidad y el orden de objetos
            this.arregloP[this.indice - 1] = null;
            this.indice--;
        }
    }
//    public boolean eliminar(String codigo) {
//        boolean resultado = false;
//        int encontrado = this.buscar(codigo);
//        if (encontrado >= 0) {
//            moverElementosParaEliminar(encontrado);
//            resultado = true;
//        }
//        return resultado;
//    }

    // Metodos para apoyar el proceso de eliminacion
    public int buscar(String codigo) {
        int resultado = -1;
        for (int pos = 0; pos < this.indice; pos++) {
            if (this.arregloP[pos].getNumberEtiqueta().equalsIgnoreCase(codigo)) {
                resultado = pos;
                break;
            }
        }
        return resultado;
    }

    public void moverElementosParaEliminar(int posicion) {
        this.indice--;
        while (posicion < this.indice) {
            this.arregloP[posicion] = this.arregloP[posicion + 1];
            posicion++;
        }
        this.arregloP[indice] = null;
    }

    public Producto getUsuario(String codigo) {
        for (int i = 0; i < this.indice; i++) {
            if (arregloP[i].getNumberEtiqueta().equals(codigo)) {
                return arregloP[i];
            }
        }
        return null;
    }
 public void ordenarPorNombre(boolean ascendente) { // método de la burbuja        
        int n = this.indice;
        Producto[] arr = this.arregloP.clone();
        try {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (ascendente) {
                        if( arr[j].getNombreProducto().compareTo(arr[j+1].getNombreProducto()) > 0 )   {
                            Producto temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                    else { // orden descendente
                        if( arr[j].getNombreProducto().compareTo(arr[j+1].getNombreProducto()) < 0 )   {
                            Producto temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }            
            }            
            this.arregloP = arr;
        }
        catch(Exception ex) {
            System.out.println("Error burbuja: " +ex.getMessage()); 
        }        
    }
    
    public void ordenarPorStockActual(boolean ascendente) { // método shell                
        Producto[] arr = this.arregloP.clone();
        int n = this.indice; //arr.length-1;
        int j=0, intervalo=0;
        try {            
            for (intervalo = n/2; intervalo > 0; intervalo /= 2) {                
                for (int i = intervalo; i < n; i++) {
                    Producto temp = arr[i];
                    j = i;
                    if (ascendente) {                        
                        while ( j >= intervalo && temp.getStock() < arr[j - intervalo].getStock() ) {
                            arr[j] = arr[j - intervalo];
                            j -= intervalo;
                        }
                    }
                    else { // descendente
                        while ( j >= intervalo && temp.getStock() > arr[j - intervalo].getStock()) {
                            arr[j] = arr[j - intervalo];
                            j -= intervalo;
                        }
                    }
                    arr[j] = temp;
                }            
            }            
            this.arregloP = arr;
        }
        catch(Exception ex) {            
            System.out.println("Error shell2: " + ex.toString());
        }        
    }
    
    public void ordenarPorStockInicial(boolean ascendente) { // método por inserción       
        int n = this.indice; //this.arregloP.length-1;
        Producto[] arr = this.arregloP.clone();        
        try {    
            for (int i = 1; i < n; i++) {
                Producto temp = arr[i];
                int j = i-1;                
                if (ascendente) { // orden ascendente
                    while ( j >= 0 && (temp.getStockInicial() < arr[j].getStockInicial()) ) {                    
                        arr[j+1] = arr[j];
                        j--;
                    }
                }
                else { // orden descendente                    
                    while ( j >= 0 && temp.getStockInicial() > arr[j].getStockInicial() ) {                    
                        arr[j+1] = arr[j];
                        j--;
                    }
                }
                arr[j+1] = temp;            
            }
            this.arregloP = arr;
        }
         catch(Exception ex) {            
            System.out.println("Error insercion: " +ex.toString()); 
        } 
    }
    
    public void ordenarPorValorStock(boolean ascendente) {    
        int n = this.indice;//this.arregloP.length-1;
        Producto[] arr = this.arregloP.clone();
        try {    
            for (int i = 1; i < n; i++) {
                Producto temp = arr[i];
                int j = i-1;                
                if (ascendente) { // orden ascendente
                    while ( j >= 0 && (temp.getValorTotalStock() < arr[j].getValorTotalStock()) ) {
                        //System.out.println("valorstock: " + temp.getValorTotalStock() );
                        arr[j+1] = arr[j];
                        j--;
                    }
                }
                else { // orden descendente                    
                    while ( j >= 0 && temp.getValorTotalStock() > arr[j].getValorTotalStock() ) {
                        arr[j+1] = arr[j];
                        j--;
                    }
                }
                arr[j+1] = temp;            
            }
            this.arregloP = arr;
        }
         catch(Exception ex) {            
            System.out.println("Error valorstock: " +ex.toString()); 
        } 
    }
    
    public void ordenarPorMayoresVentas(boolean ascendente) { // método shell                
        Producto[] arr = this.arregloP.clone();
        int n = this.indice; //arr.length-1;
        int j=0, intervalo=0;
        try {            
            for (intervalo = n/2; intervalo > 0; intervalo /= 2) {                
                for (int i = intervalo; i < n; i++) {
                    Producto temp = arr[i];
                    j = i;
                    if (ascendente) {                        
                        while ( j >= intervalo && 
                                (temp.getStockInicial()-temp.getStock() ) < ( arr[j - intervalo].getStockInicial()- arr[j - intervalo].getStock() ) ) {
                            arr[j] = arr[j - intervalo];
                            j -= intervalo;
                        }
                    }
                    else { // descendente
                        while ( j >= intervalo && 
                                (temp.getStockInicial()-temp.getStock() ) > ( arr[j - intervalo].getStockInicial()- arr[j - intervalo].getStock() ) ) {
                            arr[j] = arr[j - intervalo];
                            j -= intervalo;
                        }
                    }
                    arr[j] = temp;
                }            
            }            
            this.arregloP = arr;
        }
        catch(Exception ex) {            
            System.out.println("Error mayores ventas: " + ex.toString());
        }        
    }
    
    public boolean documentoRegistrado(String codigo) {
        for (int i = 0; i < this.indice; i++) {
            if (arregloP[i].getNumberEtiqueta().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    private void crecerArreglo() {
        int nuevoTamaño = arregloP.length + 3;
        Producto[] nuevoArr = new Producto[nuevoTamaño];
        for (int i = 0; i < this.indice; i++) {
            nuevoArr[i] = this.arregloP[i];
        }
        this.arregloP = nuevoArr;
    }

    private boolean estaLleno() {
        return this.arregloP.length == this.indice;
    }

    public boolean estaVacio() {
        return this.indice == 0;
    }

//    public void ordenarPorPaterno() {
//        int pos;
//        Producto aux = null;
//        for (int i = 0; i < this.indice; i++) {
//            aux = this.arregloP[i];
//            pos = i;
//            while ((pos > 0) && (this.arregloP[pos - 1].getPaterno().compareTo(aux.getPaterno())) > 0) {
//                this.arregloP[pos] = this.arregloP[pos - 1];
//                pos--;
//            }
//            this.arregloU[pos] = aux;
//        }
//    }
//
//    public void ordenarPorMaterno() {
//        int pos;
//        Producto aux = null;
//        for (int i = 0; i < this.indice; i++) {
//            aux = this.arregloP[i];
//            pos = i;
//            while ((pos > 0) && (this.arregloP[pos - 1].getMaterno().compareTo(aux.getMaterno())) > 0) {
//                this.arregloP[pos] = this.arregloP[pos - 1];
//                pos--;
//            }
//            this.arregloP[pos] = aux;
//        }
//    }
//
//    public void ordenarPorDocumento() {
//        int pos;
//        Producto aux = null;
//        for (int i = 0; i < this.indice; i++) {
//            aux = this.arregloP[i];
//            pos = i;
//            while ((pos > 0) && (this.arregloP[pos - 1].getDocumento().compareTo(aux.getDocumento())) > 0) {
//                this.arregloP[pos] = this.arregloP[pos - 1];
//                pos--;
//            }
//            this.arregloP[pos] = aux;
//        }
//    }
    public Producto[] getArregloP() {
        return arregloP;
    }

    public void setArregloP(Producto[] arregloP) {
        this.arregloP = arregloP;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

}
