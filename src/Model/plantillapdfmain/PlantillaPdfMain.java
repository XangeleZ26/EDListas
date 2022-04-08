
package plantillapdfmain;

public class PlantillaPdfMain {

    public static void main(String[] args) {
        Plantilla miPlantilla = new Plantilla(
                "nombre",
                "Cualquier apellido",
                "23/04/2021",
                "C:\\pdf\\pasteleria.jpg");
        miPlantilla.crearPlantilla();
    }
    
}
