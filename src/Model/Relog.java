package Model;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Relog implements Runnable {

    private String horaActual;
    private String fechaActual;
    private int diaActual;
    private int mesActual;
    private int anioActual;
    private Thread hilo;

    public Relog() {
        fecha();
        this.hilo = new Thread(this);
        this.hilo.start();
    }

    public void fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        this.fechaActual = formatoFecha.format(fecha);

        this.diaActual = Integer.parseInt(this.fechaActual.substring(0, 2));
        this.mesActual = Integer.parseInt(this.fechaActual.substring(3, 5));
        this.anioActual = Integer.parseInt(this.fechaActual.substring(6, 10));

    }

    public void hora() {
        Date horaActual = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        this.horaActual = formatoHora.format(horaActual);
    }

    public boolean comparacionFechas(String fechaVencimiento) {
        boolean result = false;
        int diaIndicado = Integer.parseInt(fechaVencimiento.substring(0, 2));
        int mesIndicado = Integer.parseInt(fechaVencimiento.substring(3, 5));
        int anioIndicado = Integer.parseInt(fechaVencimiento.substring(6, 10));

        if (this.anioActual > anioIndicado) {
            result = true; //SIGNIFICA QUE YA VENCIO

        } else {
            if (this.anioActual < anioIndicado) {
                result = false; //NO VENCIO
            } else {//EL AÑO DE VENCIMIENTO ES IGUAL AL AÑO ACTUAL
                if (this.mesActual > mesIndicado) {
                    result = true; //SIGNIFICA QUE YA VENCIO
                } else {
                    if (this.mesActual < mesIndicado) {
                        result = false; //NO VENCIO
                    } else { //AÑO Y MES DE VENCIMIENTO ES IGUAL AL AÑO Y MES ACTUAL
                        if (this.diaActual > diaIndicado) {
                            result = true; //SIGNIFICA QUE YA VENCIO
                        } else {
                            if (this.diaActual < diaIndicado) {
                                result = false; //NO VENCIO
                            } else {
                                result = true; //DIA, MES Y AÑO ACTUAL IDENTICO A LA FECHA DE VENCIMIENTO
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    @Override
    public void run() {
        Thread ex = Thread.currentThread();
        while (ex == hilo) {
            hora();

            if (this.horaActual.equalsIgnoreCase("00:00")) {
                fecha();
            }
            for (int i = 0; i < Configuracion.arrProductos.getIndice(); i++) {
                if (Configuracion.arrProductos.getArregloP()[i].getEstado().equals("VIGENTE")) {

                        if (comparacionFechas(Configuracion.arrProductos.getArregloP()[i].getFechaVencimiento())) {
                            Configuracion.arrProductos.getArregloP()[i].setEstado("CADUCADO");
                        }
                        if (Configuracion.arrProductos.getArregloP()[i].getStock() == 0) {
                            Configuracion.arrProductos.getArregloP()[i].setEstado("AGOTADO");
                        }
        
                    try {
                        Configuracion.serial.serializar("archivoProductos.dat", Configuracion.arrProductos);

                    } catch (IOException xd) {
                        JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");

                    }

                }
            }
            try {
                Thread.sleep(3 * 1000);

            } catch (InterruptedException e) {
            }
        }
    }

}
