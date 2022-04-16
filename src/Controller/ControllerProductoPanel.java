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

    private ArregloProductos Productos;
    private ArregloProductos extraProductosFO; //almacenará el valor de Productos para que este sea usado en los filtros y ordenamiento
    private ProductoPanel frmProducto;
    private boolean puedeOrdenar;
    private boolean esAscendente;

    public ControllerProductoPanel() {
        this.frmProducto = new ProductoPanel();
        this.Productos = Configuracion.arrProductos;
        this.extraProductosFO = Configuracion.arrProductos;
        Object[] opciones = {"Aceptar", "Cancelar"};

        //PRIORIDAD PARA LLENAR EL VECTOR DE ArregloProductos:
        //  1. BUSCADOR
        //  2. FILTRO
        //  3. ORDENAMIENTO
        //BOTON DE LUPA (BUSCAR)
        this.frmProducto.btnLupa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              
                if (frmProducto.Buscadortxt.getText().isEmpty() || frmProducto.Buscadortxt.getText().equalsIgnoreCase("Ingrese nombre del producto")) {
                    //if el boton aplicar cambios esta siendo usado en filtro u ordenamiento,
                    //entonces que esto no suceda
                    Productos = Configuracion.arrProductos;

                    frmProducto.btnCancelarBusqueda.setVisible(false);
                } else {
                    // 1° PRIORIDAD: BUSCADOR
                    paraBuscar(frmProducto.Buscadortxt.getText().trim());
                    frmProducto.btnCancelarBusqueda.setVisible(true);
                    //si busca algo, que el filtro y el ordenamiento se resetee

                }
                extraProductosFO = Productos;
                frmProducto.comboFiltro.setSelectedIndex(0); //para que vuelva a apuntar a "Sin filtro"
                frmProducto.comboOrdenar.setSelectedIndex(0); //para que vuelva a apuntar a "Sin ordenar"
                llenarTabla();
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.getIndice()));

            }
        });

        //BOTON APLICAR CAMBIOS DE FILTRO Y ORDENAMIENTO
        this.frmProducto.btnAplicarCambios.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                        puedeOrdenar = true;
                // 2° PRIORIDAD: FILTRO

                //ES NECESARIO QUE CONSIDERE LOS VALORES DE LA BUSQUEDA EN CASO SE QUIERA REVERTIR UN FILTRO/ORDENAMIENTO
                Productos = extraProductosFO;

                switch (frmProducto.comboFiltro.getSelectedIndex()) {
                    case 0: { //sin filtro

                        break;
                    }
                    case 1: {
                        if (!(frmProducto.filtroCategoriastxt.getText().equals("Ingrese categoría") || frmProducto.filtroCategoriastxt.getText().trim().isEmpty())) {
                            if (existeCategoria()) {
                                filtroCategoria();
                            } else {
                                JOptionPane.showMessageDialog(null, "Esta categoría no está disponible entre \nlos datos que la tabla muestra actualmente.");
                                frmProducto.filtroCategoriastxt.setText("Ingrese categoría");
                                frmProducto.filtroCategoriastxt.setForeground(Color.gray);
                                puedeOrdenar = false;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "¡Ingrese la categoría a filtrar!");
                            frmProducto.filtroCategoriastxt.setText("Ingrese categoría");
                            frmProducto.filtroCategoriastxt.setForeground(Color.gray);
                            puedeOrdenar = false;
                        }
                        break;
                    }
                    case 2: { //stocks vencidos
                        filtroStocksVencidos();
                        break;
                    }
                    case 3: { //stocks vigentes
                        filtroStocksVigentes();
                        break;
                    }
                    case 4: { //stocks agotados (acabados)
                        filtroStocksAcabados();
                        break;
                    }
//                    case 5: { //stocks activos
//                        filtroStocksActivos();
//                        break;
//                    }
                }
                // 3° PRIORIDAD: ORDENAMIENTO
                if (puedeOrdenar) {

                    if (frmProducto.radioAscendente.isSelected()) {
                        esAscendente = true;  //se ordenará en ascendente
                    } else {
                        esAscendente = false; //se ordenará en descendente
                        System.out.println("descendente"); //PRUEBA DE QUE FUNCIONA HASTA AQUI
                    }
                    switch (frmProducto.comboOrdenar.getSelectedIndex()) {
                        case 0: { //sin ordenar
                            break; //ESTE DEBE DE QUEDAR ASÍ, EN LOS SIGUIENTES cases AGREGAR METODOS
                        }
                        case 1: { //mayores ventas
                            ordenarMayoresVentas(esAscendente);
                            break;
                        }
                        case 2: { //valor inicial de stock
                            ordenarPorGanancia(esAscendente);
                            break;
                        }
                        case 3: { //cantidad inicial de stock
                            ordenarStockInicial(esAscendente);
                            break;
                        }
                        case 4: { //actidad actual de stock
                            ordenarStockActual(esAscendente);
                            break;
                        }
                        case 5: { //ordenamiento por nombre
                            ordenarNombre(esAscendente);
                            break;
                        }

                    }

                }

                //Procede a llenar tabla
                llenarTabla();
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.getIndice()));
            }
        });


        //BOTON DE CANCELAR BUSQUEDA
        this.frmProducto.btnCancelarBusqueda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frmProducto.Buscadortxt.getCaret().setVisible(false);
                frmProducto.Buscadortxt.setText("Ingrese nombre del producto");
                frmProducto.Buscadortxt.setForeground(Color.gray);
                frmProducto.btnCancelarBusqueda.setVisible(false);
                Productos = Configuracion.arrProductos;
                extraProductosFO = Configuracion.arrProductos;
                frmProducto.comboFiltro.setSelectedIndex(0); //para que vuelva a apuntar a "Sin filtro"
                frmProducto.comboOrdenar.setSelectedIndex(0); //para que vuelva a apuntar a "Sin ordenar"
                llenarTabla();
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.getIndice()));
            }
        });

        //BOTON DE ELIMINAR (CON SUS DOS VARIANTES ACTUALES: POR SELECCIÓN Y CONJUNTO DE VENCIDOS)
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
                                Configuracion.serial.serializar("archivoProductos.dat", Configuracion.arrProductos);

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
                if (frmProducto.RadioElimVencidos.isSelected()) {
                    
                    int xd = JOptionPane.showOptionDialog(null, "¿Está seguro que desea eliminar\n los stocks de inventario caducados?", null, 0, 0, null, opciones, opciones[0]);
                    if (xd == 0) {

                        Configuracion.arrProductos.colocarEliminandoParaCaducados();
                        concretarElim();
                        JOptionPane.showMessageDialog(null, "Eliminado con éxito.");
                        try {
                            Configuracion.serial.serializar("archivoProductos.dat", Configuracion.arrProductos);

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
                if(frmProducto.RadioElimAgotados.isSelected()){
  
                    int xd = JOptionPane.showOptionDialog(null, "¿Está seguro que desea eliminar\n los stocks de inventario agotados?", null, 0, 0, null, opciones, opciones[0]);
                    if (xd == 0) {

                        Configuracion.arrProductos.colocarEliminandoParaAgotados();
                        concretarElim();
                        JOptionPane.showMessageDialog(null, "Eliminado con éxito.");
                        try {
                            Configuracion.serial.serializar("archivoProductos.dat", Configuracion.arrProductos);

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
        this.frmProducto.btnRefrescar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                llenarTabla();
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.getIndice()));

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

    }

    public void filtroCategoria() {

        ArregloProductos extra = new ArregloProductos();
        for (int i = 0; i < Productos.getIndice(); i++) {
            if (Productos.getArregloP()[i].getCategoria().equalsIgnoreCase(this.frmProducto.filtroCategoriastxt.getText().trim())) {
                extra.agregar(Productos.getArregloP()[i]);
            }
        }
        Productos = extra;
    }

    public boolean existeCategoria() {
        boolean result = false;  //usando busqueda secuencial
        for (int i = 0; i < Productos.getIndice(); i++) {

            if (Productos.getArregloP()[i].getCategoria().equalsIgnoreCase(this.frmProducto.filtroCategoriastxt.getText().trim())) {
                return true;
            }
        }

        return false;
    }

    public void filtroStocksVigentes() {
        ArregloProductos extra = new ArregloProductos();
        for (int i = 0; i < Productos.getIndice(); i++) {
            if (Productos.getArregloP()[i].getEstado().equals("VIGENTE")) {
                extra.agregar(Productos.getArregloP()[i]);
            }
        }
        Productos = extra;
    }

    public void filtroStocksVencidos() {
        ArregloProductos extra = new ArregloProductos();
        for (int i = 0; i < Productos.getIndice(); i++) {
            if (Productos.getArregloP()[i].getEstado().equals("CADUCADO")) {
                extra.agregar(Productos.getArregloP()[i]);
            }
        }
        Productos = extra;
    }

    public void filtroStocksAcabados() {
        ArregloProductos extra = new ArregloProductos();
        for (int i = 0; i < Productos.getIndice(); i++) {
            if (Productos.getArregloP()[i].getStock() == 0) {
                extra.agregar(Productos.getArregloP()[i]);
            }
        }
        Productos = extra;
    }
//
//    public void filtroStocksActivos() {
//        ArregloProductos extra = new ArregloProductos();
//        for (int i = 0; i < Productos.getIndice(); i++) {
//            if (Productos.getArregloP()[i].getStock() > 0) {
//                extra.agregar(Productos.getArregloP()[i]);
//            }
//        }
//        Productos = extra;
//    }

    void ordenarNombre(boolean ascendente) {
        this.Productos = this.Productos.ordenarPorNombre(ascendente);
    }

    void ordenarPorGanancia(boolean ascendente) {
        this.Productos = this.Productos.ordenarPorGanancia(ascendente);
    }

    void ordenarMayoresVentas(boolean ascendente) {
        this.Productos = this.Productos.ordenarPorMayoresVentas(ascendente);
    }

    void ordenarStockActual(boolean ascendente) {
        this.Productos = this.Productos.ordenarPorStockActual(ascendente);
    }

    void ordenarStockInicial(boolean ascendente) {
        this.Productos = this.Productos.ordenarPorStockInicial(ascendente);
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
