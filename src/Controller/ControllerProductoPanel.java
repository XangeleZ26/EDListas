package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class ControllerProductoPanel {

    ArregloProductos arrProductos;
    ProductoPanel frmProducto;

    public ControllerProductoPanel() {
        this.frmProducto = new ProductoPanel();
        this.arrProductos = Configuracion.arrProductos;

        this.frmProducto.btnLupa.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            
            
                   if (frmProducto.Buscadortxt.getText().isEmpty()||frmProducto.Buscadortxt.getText().equalsIgnoreCase("Ingrese nombre del producto")) {
                    arrProductos = Configuracion.arrProductos;
                       System.out.println(arrProductos.getArregloP()[1].getNombreProducto());
                } else {

                    paraBuscar(frmProducto.Buscadortxt.getText().trim());
                }
                llenarTabla();
                frmProducto.cantidadProductos.setText(Integer.toString(arrProductos.getIndice()));
                
        }        
        });

    }

    public void paraBuscar(String dato) {
        ArregloProductos extra = new ArregloProductos();
        for (int i = 0; i < Configuracion.arrProductos.getIndice(); i++) {
            //Esto es para que se filtren nombres con un tamaño de cadena mayor o igual que el dato a buscar
            if (Configuracion.arrProductos.getArregloP()[i].getNombreProducto().length() >= dato.length()) {
            
            //Esto es para comparar el dato a buscar con los nombres de los productos    
                if (dato.equalsIgnoreCase(Configuracion.arrProductos.getArregloP()[i].getNombreProducto().substring(0, dato.length()))) {
                    extra.agregar(Configuracion.arrProductos.getArregloP()[i]);
                }
            }
          
        }
        arrProductos = extra;
    }
    
    public void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(this.arrProductos.data(), this.arrProductos.header());
        this.frmProducto.tableProducto.setModel(modelo);
    }

    public void run() {
        llenarTabla();
         frmProducto.cantidadProductos.setText(Integer.toString(arrProductos.getIndice()));
        this.frmProducto.setVisible(true);

    }

    public ArregloProductos getArrProductos() {
        return arrProductos;
    }

    public void setArrProductos(ArregloProductos arrProductos) {
        this.arrProductos = arrProductos;
    }

    public ProductoPanel getFrmProducto() {
        return frmProducto;
    }

    public void setFrmProducto(ProductoPanel frmProducto) {
        this.frmProducto = frmProducto;
    }

}
