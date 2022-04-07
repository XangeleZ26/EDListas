package Model;

import java.io.Serializable;
import java.util.Date;

public class Producto implements Serializable {

    private static final long serialVersionUID = 2L;

    private String nombreProducto;
    private String categoria;
    private String estado;
    private String fechaVencimiento;
    private String NumberEtiqueta;
    private int stockInicial;
    private int stock;
    private double valorXUnidad;
    private double valorTotalStock;

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
