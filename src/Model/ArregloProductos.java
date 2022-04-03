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
        tmp[5] = "Valor unidad";
        tmp[6] = "Valor total";
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
            tmp[i][6] = this.arregloP[i].getStockInicial() * this.arregloP[i].getValorXUnidad();
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

    public boolean eliminar(Producto producto) {
        boolean resultado = false;
        if (!this.estaVacio()) {
            int encontrado = this.buscar(producto.getNumberEtiqueta());
            if (encontrado >= 0) {
                moverElementosParaEliminar(encontrado);
                resultado = true;
            }
        }
        return resultado;
    }

    public boolean eliminar(String codigo) {
        boolean resultado = false;
        int encontrado = this.buscar(codigo);
        if (encontrado >= 0) {
            moverElementosParaEliminar(encontrado);
            resultado = true;
        }
        return resultado;
    }

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
