package Model;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;
import javax.swing.Icon;

public class Producto implements Serializable {

    private static final long serialVersionUID = 2L;

    private String nombreProducto;
    private String categoria;
    private String descripcion; 
    private String fechaVencimiento;
    private Icon imagen;
    //private int stockInicial; 
    private double valorXUnidad;
    private Icon imagenBarras;
    private int porciones;
    
    private int cantidadVendido; //esto varía segun las ventas
    //private double valorTotalStock; //esto se añade solo
    private String estado; //esto se añade solo (según el relog)
    private int stock;  //esto se determina según las ventas
    private String NumberEtiqueta; //esto se crea solo (automatico e irrepetible)
    
    public Producto() {

    }
       
     //ESTE CONSTRUCTOR ES EL VERÍDICO (EL QUE USAMOS HABITUALMENTE)
       public Producto(String nombreProducto, String categoria, String descripcion, String fechaVencimiento, Icon imagen, int stockInicial, double valorXUnidad,int porciones) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.imagen = imagen;
        this.stock=stockInicial;
        this.valorXUnidad = valorXUnidad;
        this.porciones=porciones;
        //agregar luego la etiqueta
    }
  
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadVendido() {
        return cantidadVendido;
    }

    public void setCantidadVendido(int cantidadVendido) {
        this.cantidadVendido = cantidadVendido;
    }
    
    public Icon getImagen() {
        return imagen;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public Icon getImagenBarras() {
        return imagenBarras;
    }

    public void setImagenBarras(Icon imagenBarras) {
        this.imagenBarras = imagenBarras;
    }

    
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumberEtiqueta() {
        return NumberEtiqueta;
    }

    public void setNumberEtiqueta(String NumberEtiqueta) {
        this.NumberEtiqueta = NumberEtiqueta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getValorXUnidad() {
        return valorXUnidad;
    }

    public void setValorXUnidad(double valorXUnidad) {
        this.valorXUnidad = valorXUnidad;
    }


}
