package Controller;

import Model.*;
import View.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerProductoPanel {

    ArregloProductos Productos;
    ProductoPanel frmProducto;

    public ControllerProductoPanel() {
        this.frmProducto = new ProductoPanel();
        this.Productos = Configuracion.arrProductos;
        Object[] opciones = {"Aceptar", "Cancelar"};

        this.frmProducto.btnLupa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (frmProducto.Buscadortxt.getText().isEmpty() || frmProducto.Buscadortxt.getText().equalsIgnoreCase("Ingrese nombre del producto")) {
                    Productos = Configuracion.arrProductos;
                    frmProducto.btnCancelarBusqueda.setVisible(false);
                } else {

                    paraBuscar(frmProducto.Buscadortxt.getText().trim());
                    frmProducto.btnCancelarBusqueda.setVisible(true);
                }
                llenarTabla();
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.getIndice()));

            }
        });
        this.frmProducto.btnCancelarBusqueda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frmProducto.Buscadortxt.getCaret().setVisible(false);
                frmProducto.Buscadortxt.setText("Ingrese nombre del producto");
                frmProducto.Buscadortxt.setForeground(Color.gray);
                frmProducto.btnCancelarBusqueda.setVisible(false);
                Productos = Configuracion.arrProductos;
                llenarTabla();
            }
        });
        //FALTA ARREGLAR ELIMINACION CUANDO HAGO BUSQUEDA 
        this.frmProducto.btnElim.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int seleccionado = frmProducto.tableProducto.getSelectedRow();
                
                //opcion de eliminar el producto seleccionado
                if (frmProducto.RadioElimSelect.isSelected()) {
                    if (seleccionado != -1) {
                        int xd = JOptionPane.showOptionDialog(null, "¿Está seguro que desea eliminar este stock?", null, 0, 0, null, opciones, opciones[0]);
                        if (xd == 0) {
                            String codigo = frmProducto.tableProducto.getValueAt(seleccionado, 0).toString();
                            Configuracion.arrProductos.eliminarPorCodigo(codigo);
                            JOptionPane.showMessageDialog(null, "Eliminado con éxito.");
                            try {
                                Configuracion.serial.serializar("archivoProductos.txt", Configuracion.arrProductos);

                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");

                            }
                            frmProducto.Buscadortxt.getCaret().setVisible(false);
                            frmProducto.Buscadortxt.setText("Ingrese nombre del producto");
                            frmProducto.Buscadortxt.setForeground(Color.gray);
                            frmProducto.btnCancelarBusqueda.setVisible(false);
                            Productos = Configuracion.arrProductos;
                            llenarTabla();
                            frmProducto.cantidadProductos.setText(Integer.toString(Productos.getIndice()));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "¡Primero debe seleccionar un stock de inventario!");
                    }
                }
                //opcion de eliminar todos los productos vencidos
                if (frmProducto.RadioElimVencido.isSelected()) {
                    System.out.println(Configuracion.arrProductos.getIndice());
                    int xd = JOptionPane.showOptionDialog(null, "¿Está seguro que desea eliminar\n los stocks de inventario vacíos?", null, 0, 0, null, opciones, opciones[0]);
                    if (xd == 0) {

                        Configuracion.arrProductos.colocarNullParaVencidos();
                        concretarElim();
                        JOptionPane.showMessageDialog(null, "Eliminado con éxito.");
                        try {
                                Configuracion.serial.serializar("archivoProductos.txt", Configuracion.arrProductos);

                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");

                            }
                        frmProducto.Buscadortxt.getCaret().setVisible(false);
                        frmProducto.Buscadortxt.setText("Ingrese nombre del producto");
                        frmProducto.Buscadortxt.setForeground(Color.gray);
                        frmProducto.btnCancelarBusqueda.setVisible(false);
                        Productos = Configuracion.arrProductos;
                        llenarTabla();
                        frmProducto.cantidadProductos.setText(Integer.toString(Productos.getIndice()));
                    }
                }

            }
        });
    }

    public void concretarElim() {
        ArregloProductos extra = new ArregloProductos();
        for (int i = 0; i < Configuracion.arrProductos.getIndice(); i++) {
            if (!Configuracion.arrProductos.getArregloP()[i].getEstado().equals("ELIMINANDO")) {
                extra.agregar(Configuracion.arrProductos.getArregloP()[i]);
            }
        }
        Configuracion.arrProductos = extra;
        this.Productos = Configuracion.arrProductos;
        //Aqui tengo que hacer que se cancele cualquier busqueda o filtro incurrido
        //tambien ocultar el boton equis
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
        Productos = extra;
    }

    public void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(this.Productos.data(), this.Productos.header());
        this.frmProducto.tableProducto.setModel(modelo);
    }

    public void run() {
        llenarTabla();
        frmProducto.cantidadProductos.setText(Integer.toString(Productos.getIndice()));
        this.frmProducto.setVisible(true);

    }

    public ArregloProductos getArrProductos() {
        return Productos;
    }

    public void setArrProductos(ArregloProductos arrProductos) {
        this.Productos = arrProductos;
    }

    public ProductoPanel getFrmProducto() {
        return frmProducto;
    }

    public void setFrmProducto(ProductoPanel frmProducto) {
        this.frmProducto = frmProducto;
    }

}
