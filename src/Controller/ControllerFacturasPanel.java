package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControllerFacturasPanel {
    Lista_Doble_Facturas arrFacturas;
    FacturasPanel frmFactura;

    public ControllerFacturasPanel() {
        this.frmFactura = new FacturasPanel();
        this.arrFacturas = Configuracion.arrFacturas;
        llenarTabla();
    }

    
    public void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(this.arrFacturas.data(), this.arrFacturas.header());
        this.frmFactura.tblDatos.setModel(modelo);
    }

    public void run() {
        llenarTabla();
        this.frmFactura.setVisible(true);

    }

    public Lista_Doble_Facturas getArrFacturas() {
        return arrFacturas;
    }

    public void setArrFacturas(Lista_Doble_Facturas arrFacturas) {
        this.arrFacturas = arrFacturas;
    }

    public FacturasPanel getFrmFactura() {
        return frmFactura;
    }

    public void setFrmFactura(FacturasPanel frmFactura) {
        this.frmFactura = frmFactura;
    }
}
