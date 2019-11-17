package Modelos;

import javafx.util.Pair;
import java.util.Date;
import java.util.List;

public class Factura {

    private final Date fechaEmision;
    private final Date fechaEntrega;
    // si no paga con tarjeta paga con efectivo
    private boolean pagoConTarjeta;
    private List<Pair> productos;
    private Sucursal sucursal;
    private Usuario usuario;

    public Factura(Date fechaEntrega, boolean pagoConTarjeta, List<Pair> productos, Sucursal sucursal) {
        this.fechaEntrega = fechaEntrega;
        this.fechaEmision = new Date();
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

    public String getFechaFormateada(Sistema sis) {
        return sis.getFormat().format(this.fechaEmision);
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }
}
