
package Model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArregloFacturas implements Serializable{
    
    private static final long serialVersionUID = 2L;
    
    private Facturas arregloF[];
    private int indice;
    
    public ArregloFacturas(){
        this.indice = 0;
        this.arregloF = new Facturas[5];
    }
    
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
        Object tmp[][] = new Object[this.indice][6];
        for (int i = 0; i < this.indice; i++) {
            tmp[i][0] = this.arregloF[i].getNombre();
            tmp[i][1] = this.arregloF[i].getCodigo();
            tmp[i][2] = this.arregloF[i].getProducto();
            SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
            tmp[i][3] = formateadorFecha.format(this.arregloF[i].getFechaVenta());
            tmp[i][4] = this.arregloF[i].getCantidad();
            tmp[i][5] = this.arregloF[i].getMonto();
        }
        return tmp;
    }
    
    public boolean agregar(Facturas factura) {
        if (!this.documentoRegistrado(factura.getCodigo())) {
            if (this.estaLleno()) {
                this.crecerArreglo();
            }
            this.arregloF[this.indice] = factura;
            this.indice++;
            return true;
        }
        return false;
    }
    
    public boolean eliminar(Facturas factura) {
        boolean resultado = false;
        if (!this.estaVacio()) {
            int encontrado = this.buscar(factura.getCodigo());
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
    
    public int buscar(String codigo) {
        int resultado = -1;
        for (int pos = 0; pos < this.indice; pos++) {
            if (this.arregloF[pos].getCodigo().equalsIgnoreCase(codigo)) {
                resultado = pos;
                break;
            }
        }
        return resultado;
    }
    
    public void moverElementosParaEliminar(int posicion) {
        this.indice--;
        while (posicion < this.indice) {
            this.arregloF[posicion] = this.arregloF[posicion + 1];
            posicion++;
        }
        this.arregloF[indice] = null;
    }
    
    public Facturas getUsuario(String codigo) {
        for (int i = 0; i < this.indice; i++) {
            if (arregloF[i].getCodigo().equals(codigo)) {
                return arregloF[i];
            }
        }
        return null;
    }
    
    public boolean documentoRegistrado(String codigo) {
        for (int i = 0; i < this.indice; i++) {
            if (arregloF[i].getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
    
    private void crecerArreglo() {
        int nuevoTamaño = arregloF.length + 3;
        Facturas[] nuevoArr = new Facturas[nuevoTamaño];
        for (int i = 0; i < this.indice; i++) {
            nuevoArr[i] = this.arregloF[i];
        }
        this.arregloF = nuevoArr;
    }
    
    private boolean estaLleno() {
        return this.arregloF.length == this.indice;
    }

    public boolean estaVacio() {
        return this.indice == 0;
    }
    
    public Facturas[] getArregloP() {
        return arregloF;
    }

    public void setArregloP(Facturas[] arregloF) {
        this.arregloF = arregloF;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "ArregloFacturas{" + "arregloF=" + arregloF + ", indice=" + indice + '}';
    }
    
    
}
