
package Model;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;

public class Plantilla {
    
    String nombreOperador;
    String fecha;
    String rutaImagen;
    List<Facturas> facturas;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public Plantilla(String nombreOperador,
            String fecha,
            String rutaImagen,
            List<Facturas> facturas)
    {
        this.nombreOperador = nombreOperador;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.facturas = facturas;
        
        documento = new Document();
        titulo  = new Paragraph("Pasteleria *Encantos* ");        
    }
    
    public void crearPlantilla(){
        try {
            archivo = new FileOutputStream(nombreOperador + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            Image image = null;
            try {
                image =  Image.getInstance(rutaImagen);//carga imagen
                image.scaleAbsolute(100, 100);//cambia tamaño
                image.setAbsolutePosition(415, 750);//coloca imagen en la posicion
                
            } catch (Exception e) {
            }
            
            documento.add(image);//agrega la imagen al documento
            
            documento.add(titulo);
            
            documento.add(new Paragraph("Nombre del operador: " + nombreOperador));
            
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("La pasteleria *Encantos* les agradece por su compra."
                    + "Si tiene alguna duda, no olvide en consultarnos.");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(100);
            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            nombre.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell cantidad = new PdfPCell(new Phrase("Cantidad"));
            cantidad.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell codigo = new PdfPCell(new Phrase("Codigo"));
            codigo.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell producto = new PdfPCell(new Phrase("Producto"));
            producto.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell monto = new PdfPCell(new Phrase("Monto"));
            monto.setBackgroundColor(BaseColor.YELLOW);      
            
            tabla.addCell(nombre);
            tabla.addCell(cantidad);
            tabla.addCell(codigo);
            tabla.addCell(producto);
            tabla.addCell(monto);
            
            for(Facturas factura: this.facturas){
                tabla.addCell(factura.getNombre());                
                tabla.addCell(factura.getCantidad()+"");
                tabla.addCell(factura.getCodigo());
                tabla.addCell(factura.getProducto());  
                tabla.addCell(factura.getMonto());
            }
            documento.add(tabla);          
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha));
            
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch(DocumentException e){
            System.err.println(e.getMessage());
        }
        
    }
    
    
    
    
}
