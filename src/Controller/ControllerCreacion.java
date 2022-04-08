package Controller;

import Model.Configuracion;
import Model.Producto;
import View.VistaCreacionProducto;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Interleaved25;

public class ControllerCreacion {

    private VistaCreacionProducto vista;
    private Icon imagencita;
    private JBarcodeBean barcode = new JBarcodeBean();
    private BufferedImage imagenBarras = null;

    public ControllerCreacion() {
        this.vista = new VistaCreacionProducto();

        this.vista.btnSelectImage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "";
                JFileChooser buscarImage = new JFileChooser();
                //para solo admitir imagenes png o jpg
                FileNameExtensionFilter filtrado = new FileNameExtensionFilter(".jpg o .png", "jpg", "png");
                buscarImage.setFileFilter(filtrado);

                int respuestaSelect = buscarImage.showOpenDialog(vista); //la respuesta que otorge en el JFileChooser (dentro de vista)

                if (respuestaSelect == JFileChooser.APPROVE_OPTION) {
                    url = buscarImage.getSelectedFile().getPath(); //se captura la ruta de la imagen seleccionada
                    Image imagen = new ImageIcon(url).getImage(); //obtengo la imagen
                    imagencita = new ImageIcon(imagen.getScaledInstance(vista.imagenProductoimg.getWidth(), vista.imagenProductoimg.getHeight(), Image.SCALE_SMOOTH));
                    vista.imagenProductoimg.setIcon(imagencita);
                }
            }
        });

        this.vista.btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
//                if (datosLlenos()) {

                    SimpleDateFormat fechaVencimiento = new SimpleDateFormat("dd/MM/yyyy");
                    Producto NuevoProducto = new Producto(vista.nombretxt.getText().trim(),
                            vista.categoriatxt.getText().trim(), vista.descripciontxt.getText().trim(),
                            fechaVencimiento.format(vista.fechaVencimientotxt.getDate()),imagencita,
                            Integer.parseInt(vista.stockInicialtxt.getText().trim()), Double.parseDouble(vista.valorUnidadtxt.getText().trim()));
                        //Agregamos estado del objeto
                        NuevoProducto.setEstado("VIGENTE");
                       //aqui pasamos a agregar un codigo
                            NuevoProducto.setNumberEtiqueta(codigoAleatorio());
                       //pasamos a agregar la imagen de codigo de barras
                            NuevoProducto.setImagenBarras(generarBarras(NuevoProducto.getNumberEtiqueta()));              
                            //GUARDAMOS AL VECTOR
                            Configuracion.arrProductos.agregar(NuevoProducto);
                            //GUARDAMOS AL ARCHIVO
          
        try {
            Configuracion.serial.serializar("archivoProductos.dat", Configuracion.arrProductos);
          
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");

        }
//                            
//                } else {
//                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos.");
//                }
            }
        });
    }

    public void run() {
        this.vista.setVisible(true);
    }

    public String codigoAleatorio() {
        //AQUI TIENE QUE IR EL METODO QUE DEVUELVE UN CODIGO DIFERENTE DE CUALQUIER OTRO CREADO 
        int aleatorio = 0;
        Random r;
        int codigoPosi;
        boolean repite;
        String codigoCadena;
        do {
            repite=false;
            r = new Random();
            aleatorio = (int) (r.nextInt());
            codigoPosi = Math.abs(aleatorio);
            codigoCadena = String.valueOf(codigoPosi);
            
            for(int i=0;i<Configuracion.arrProductos.getIndice();i++){
                if(codigoCadena.equalsIgnoreCase(Configuracion.arrProductos.getArregloP()[i].getNumberEtiqueta())){
                    repite=true;
                }
            }
        } while (repite);
        
        return codigoCadena;
    }
       public Icon generarBarras(String codigo) {

        String codigoCadena = codigo;

        barcode.setCodeType(new Interleaved25());
        barcode.setCode(codigoCadena);
        barcode.setCheckDigit(true);
        barcode.setBackground(new Color(121, 127, 139));
        barcode.setBarcodeBackground(new Color(121, 127, 139));
        imagenBarras = barcode.draw(new BufferedImage(180, 230, BufferedImage.TYPE_INT_RGB));
        ImageIcon barras = new ImageIcon(imagenBarras);
        //ESTO VA EN LA PROXIMA VISTA QUE CREARÉ, RESPECTO A MÁS INFO
//        vistaBoleta.lblCodigoBarras.setIcon(barras);
        return barras;
    }
       
    public boolean datosLlenos() {
        return (this.vista.nombretxt.getText().trim().length() != 0
                && this.vista.categoriatxt.getText().trim().length() != 0
                && this.vista.descripciontxt.getText().trim().length() != 0
                && this.vista.fechaVencimientotxt.getDate() != null
                && this.vista.stockInicialtxt.getText().trim().length() != 0
                && this.vista.valorUnidadtxt.getText().trim().length() != 0
                && this.imagencita != null);
    }

    public VistaCreacionProducto getVista() {
        return vista;
    }

    public void setVista(VistaCreacionProducto vista) {
        this.vista = vista;
    }

}
