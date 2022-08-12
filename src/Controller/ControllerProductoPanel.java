package Controller;

import Model.*;
import View.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerProductoPanel {

    private Lista_Doble_Productos Productos;
    private Lista_Doble_Productos extraProductosFO; //almacenará el valor de Productos para que este sea usado en los filtros y ordenamiento
    private ProductoPanel frmProducto;
    private boolean puedeOrdenar;
    private boolean esAscendente;

    public ControllerProductoPanel() {
        this.frmProducto = new ProductoPanel();
        this.frmProducto.Buscadortxt.getCaret().setVisible(false);
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
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.Contar()));

            }
        });

        //BOTON APLICAR CAMBIOS DE FILTRO Y ORDENAMIENTO
        this.frmProducto.btnAplicarCambios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
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
                            ordenarStockActual(esAscendente);
                            break;
                        }
                        case 4: { //actidad actual de stock
                            ordenarNombre(esAscendente);
                            break;
                        }

                    }

                }

                //Procede a llenar tabla
                llenarTabla();
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.Contar()));
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
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.Contar()));
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
                            Configuracion.arrProductos.Elimina_Nodo(Configuracion.arrProductos.Buscar(codigo));
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
                            frmProducto.cantidadProductos.setText(Integer.toString(Productos.Contar()));
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
                        frmProducto.cantidadProductos.setText(Integer.toString(Productos.Contar()));
                    }
                }
                if (frmProducto.RadioElimAgotados.isSelected()) {

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
                        frmProducto.cantidadProductos.setText(Integer.toString(Productos.Contar()));
                    }
                }
            }
        });
        this.frmProducto.btnRefrescar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                llenarTabla();
                frmProducto.cantidadProductos.setText(Integer.toString(Productos.Contar()));

            }
        });

        this.frmProducto.textValor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || frmProducto.textValor.getText().contains("."))) {
                    e.consume();
                }
            }
        });

    }

    public void concretarElim() {
        Lista_Doble_Productos extra = new Lista_Doble_Productos();
        Nodo_Producto puntero;
        puntero = Configuracion.arrProductos.getPrimero();
        while (puntero != null) {

            if (!puntero.getContenido().getEstado().equalsIgnoreCase("ELIMINANDO")) {
                Nodo_Producto extraNodo = new Nodo_Producto(puntero.getContenido());
                extra.Insertar_Ultimo(extraNodo);
            }
            puntero = puntero.getSiguiente();
        }
 
        Configuracion.arrProductos = extra;
        this.Productos = Configuracion.arrProductos;

    }

    public void filtroCategoria() {
         Lista_Doble_Productos extra = new Lista_Doble_Productos();
        Nodo_Producto puntero;
        puntero = this.Productos.getPrimero();
        while (puntero != null) {

            if (puntero.getContenido().getCategoria().equalsIgnoreCase(this.frmProducto.filtroCategoriastxt.getText().trim())) {
                Nodo_Producto extraNodo = new Nodo_Producto(puntero.getContenido());
                extra.Insertar_Ultimo(extraNodo);
            }
            puntero = puntero.getSiguiente();
        }
        this.Productos = extra;
 
    }

    public boolean existeCategoria() {
        Nodo_Producto aux;
        aux = Productos.getPrimero();
        while (aux != null) {
            if (!aux.getContenido().getCategoria().equalsIgnoreCase(this.frmProducto.filtroCategoriastxt.getText().trim())) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;

    }

    public void filtroStocksVigentes() {
        Lista_Doble_Productos extra = new Lista_Doble_Productos();
        Nodo_Producto puntero;
        puntero = this.Productos.getPrimero();
        while (puntero != null) {

            if (puntero.getContenido().getEstado().equalsIgnoreCase("VIGENTE")) {
                Nodo_Producto extraNodo = new Nodo_Producto(puntero.getContenido());
                extra.Insertar_Ultimo(extraNodo);
            }
            puntero = puntero.getSiguiente();
        }
        this.Productos = extra;
 
    }

    public void filtroStocksVencidos() {
        Lista_Doble_Productos extra = new Lista_Doble_Productos();
        Nodo_Producto puntero;
        puntero = this.Productos.getPrimero();
        while (puntero != null) {

            if (puntero.getContenido().getEstado().equalsIgnoreCase("CADUCADO")) {
                Nodo_Producto extraNodo = new Nodo_Producto(puntero.getContenido());
                extra.Insertar_Ultimo(extraNodo);
            }
            puntero = puntero.getSiguiente();
        }
        this.Productos = extra;
 
    }

    public void filtroStocksAcabados() {
     
        Lista_Doble_Productos extra = new Lista_Doble_Productos();
        Nodo_Producto puntero;
        puntero = this.Productos.getPrimero();
        while (puntero != null) {

            if (puntero.getContenido().getStock()==0) {
                Nodo_Producto extraNodo = new Nodo_Producto(puntero.getContenido());
                extra.Insertar_Ultimo(extraNodo);
            }
            puntero = puntero.getSiguiente();
        }
        this.Productos = extra;
    }

    //el valor predeterminado de esAscendente es TRUE (ordenamiento ascendente)
    //a menos que se indique que se desea un ordenamiento descendente
    void ordenarNombre(boolean esAscendente) {
        this.Productos = this.Productos.Ordenar_Por_Nombre(esAscendente);
    }

    void ordenarPorGanancia(boolean esAscendente) {
        this.Productos = this.Productos.Ordenar_Por_Ganancia(esAscendente);
    }

    void ordenarMayoresVentas(boolean esAscendente) {
        this.Productos = this.Productos.Ordenar_Por_Ventas(esAscendente);
    }

    void ordenarStockActual(boolean esAscendente) {
        this.Productos = this.Productos.Ordenar_Por_Stock(esAscendente);
    }



    public void paraBuscar(String dato) {

        Lista_Doble_Productos extra = new Lista_Doble_Productos();
        Nodo_Producto puntero;
        puntero = Configuracion.arrProductos.getPrimero();
        while (puntero != null) {
            if (puntero.getContenido().getNombreProducto().length() >= dato.length()) {
                if (dato.equalsIgnoreCase(puntero.getContenido().getNombreProducto().substring(0, dato.length()))) {
                    Nodo_Producto extraNodo = new Nodo_Producto(puntero.getContenido());
                    extra.Insertar_Ultimo(extraNodo);
                }
            }
            puntero = puntero.getSiguiente();
        }

        this.Productos = extra;

    }

    public void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(this.Productos.data(), this.Productos.header());
        this.frmProducto.tableProducto.setModel(modelo);
    }

    public void run() {
        llenarTabla();
        frmProducto.cantidadProductos.setText(Integer.toString(Productos.Contar()));
        this.frmProducto.setVisible(true);

    }

    public Lista_Doble_Productos getProductos() {
        return Productos;
    }

    public void setProductos(Lista_Doble_Productos Productos) {
        this.Productos = Productos;
    }

    public Lista_Doble_Productos getExtraProductosFO() {
        return extraProductosFO;
    }

    public void setExtraProductosFO(Lista_Doble_Productos extraProductosFO) {
        this.extraProductosFO = extraProductosFO;
    }

    public ProductoPanel getFrmProducto() {
        return frmProducto;
    }

    public void setFrmProducto(ProductoPanel frmProducto) {
        this.frmProducto = frmProducto;
    }

    public boolean isPuedeOrdenar() {
        return puedeOrdenar;
    }

    public void setPuedeOrdenar(boolean puedeOrdenar) {
        this.puedeOrdenar = puedeOrdenar;
    }

    public boolean isEsAscendente() {
        return esAscendente;
    }

    public void setEsAscendente(boolean esAscendente) {
        this.esAscendente = esAscendente;
    }

}
