package Modelos;

import javafx.util.Pair;
import java.util.Date;
import java.util.List;

public class Factura {

    private final Date fechaEmision;
    private final Date fechaEntrega;
    // si no paga con tarjeta paga con efectivo
    private boolean pagoConTarjeta;
    private List<ElementoCarrito> productos;
    private String direccion;
    private Usuario usuario;
    private int montoTotal;

    public Factura(Date fechaEntrega, boolean pagoConTarjeta, List<ElementoCarrito> productos, String direccion, Usuario usuario, int montoTotal) {
        this.fechaEntrega = fechaEntrega;
        this.fechaEmision = new Date();
        this.pagoConTarjeta = pagoConTarjeta;
        this.productos = productos;
        this.direccion = direccion;
        this.usuario = usuario;
        this.montoTotal = montoTotal;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public List<ElementoCarrito> getProductos() {
        return productos;
    }

    public void setProductos(List<ElementoCarrito> productos) {
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

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
}
