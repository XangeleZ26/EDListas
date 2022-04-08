package Model;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;

public class Producto implements Serializable {

    private static final long serialVersionUID = 2L;

    private String nombreProducto;
    private String categoria;
    private String descripcion; 
    private String fechaVencimiento;
    private Image imagen;
    private int stockInicial; 
    private double valorXUnidad;
    private Image imagenBarras;
    
    private double valorTotalStock; //esto se añade solo
    private String estado; //esto se añade solo (según el relog)
    private int stock;  //esto se determina según las ventas
    private String NumberEtiqueta; //esto se crea solo (automatico e irrepetible)
    
    public Producto() {

    }

    public Producto(String nombreProducto, String categoria, String estado, String fechaVencimiento, String NumberEtiqueta, int stockInicial, int stock, double valorXUnidad) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.estado = estado;
        this.fechaVencimiento = fechaVencimiento;
        this.NumberEtiqueta = NumberEtiqueta;
        this.stockInicial = stockInicial;
        this.stock = stock;
        this.valorXUnidad = valorXUnidad;
        this.valorTotalStock = this.valorXUnidad*this.stockInicial;
    }
       public Producto(String nombreProducto, String categoria, String descripcion, String fechaVencimiento, Image imagen, int stockInicial, double valorXUnidad) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.imagen = imagen;
        this.stockInicial = stockInicial;
        this.valorXUnidad = valorXUnidad;
        this.valorTotalStock=this.valorXUnidad*this.stockInicial;
        //agregar luego la etiqueta
    }
  public Producto(String nombreProducto, String categoria, String descripcion, String fechaVencimiento, int stockInicial, double valorXUnidad) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.stockInicial = stockInicial;
        this.valorXUnidad = valorXUnidad;
        this.valorTotalStock=this.valorXUnidad*this.stockInicial;
        //agregar luego la etiqueta
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public Image getImagenBarras() {
        return imagenBarras;
    }

    public void setImagenBarras(Image imagenBarras) {
        this.imagenBarras = imagenBarras;
    }
       
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
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

    public double getValorTotalStock() {
        return valorTotalStock;
    }

    public void setValorTotalStock(double valorTotalStock) {
        this.valorTotalStock = valorTotalStock;
    }

}
