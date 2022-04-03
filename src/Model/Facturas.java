package Model;

import java.io.*;
import java.util.Date;

public class Facturas implements Serializable {

    private static final long serialVersionUID = 2L;
    private String nombre;
    private String codigo;
    private String producto;
    private Date fechaVenta;
    private int Cantidad;
    private float monto;

    public Facturas() {

    }

    public Facturas(String nombre, String codigo, String producto, Date fechaVenta, int Cantidad, float monto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.producto = producto;
        this.fechaVenta = fechaVenta;
        this.Cantidad = Cantidad;
        this.monto = monto;
    }


    /*
    public void guardarFactura() throws ClassNotFoundException{
        FileOutputStream fichero = null;
        try {
            String ruta = "C:\\Users\\usuario\\Desktop\\DAAProyectPasteleria"
                    + "\\src\\main\\java\\Archivos\\Facturas.txt";
            fichero = new FileOutputStream(ruta);
            
            Facturas obj = new Facturas(this.nombre, this.producto, 
                    this.fechaVenta, this.Cantidad, this.monto);
            obj.codigo = generarCodigo()+"";
            ObjectOutputStream facturas = new ObjectOutputStream(fichero);
            
            facturas.writeObject(obj);

            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex){
            
        } finally{
            try{
                fichero.close();
            } catch(IOException ex){
                
            }
        }
    }
    
    private int generarCodigo() throws ClassNotFoundException{
        int codigo=0;
        ObjectInputStream facturas = null;
        FileInputStream fichero = null;
        try {
            String ruta = "C:\\Users\\usuario\\Desktop\\DAAProyectPasteleria"
                + "\\src\\main\\java\\Archivos\\Facturas.txt";
            fichero = new FileInputStream(ruta);
            facturas = new ObjectInputStream(fichero);
            Facturas f = (Facturas)facturas.readObject();
            while(f != null) {
                f = (Facturas)facturas.readObject();
                if(Integer.parseInt(f.getCodigo()) >= codigo){
                    codigo = Integer.parseInt(f.getCodigo()) + 1;
                }
            }
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex){
            
        } finally{
            try{
                facturas.close();
            } catch(IOException ex){
                
            }
        }
        return codigo;
    }*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

}
