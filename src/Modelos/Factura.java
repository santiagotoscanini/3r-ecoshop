package Modelos;

import javafx.util.Pair;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Factura {

    private final Date date;
    private static final DateFormat formato = new SimpleDateFormat("dd/mm/YYYY HH:mm:ss");
    // si no paga con tarjeta paga con efectivo
    private boolean pagoConTarjeta;
    private List<Pair> productos;
    private Sucursal sucursal;

    public Factura(Date date, boolean pagoConTarjeta, List<Pair> productos, Sucursal sucursal) {
        this.date = new Date();
        this.pagoConTarjeta = pagoConTarjeta;
        this.productos = productos;
        this.sucursal = sucursal;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getFechaFormateada() {
        return formato.format(this.date);
    }

    public boolean isPagoConTarjeta() {
        return pagoConTarjeta;
    }

    public void setPagoConTarjeta(boolean pagoConTarjeta) {
        this.pagoConTarjeta = pagoConTarjeta;
    }

    public List<Pair> getProductos() {
        return productos;
    }

    public void setProductos(List<Pair> productos) {
        this.productos = productos;
    }
}
