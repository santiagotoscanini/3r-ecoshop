package Modelos;

import java.util.Date;
import java.util.List;

public class Factura {

    private static int contador = 0;

    private final int id;
    private final int montoTotal;
    private final Date fechaEmision;
    private final Date fechaEntrega;
    private boolean pagoConTarjeta; // si no paga con tarjeta paga con efectivo
    private List<ElementoCarrito> productos;
    private String direccion;
    private Usuario usuario;

    public Factura(Date fechaEntrega, boolean pagoConTarjeta, List<ElementoCarrito> productos, String direccion, Usuario usuario, int montoTotal) {
        this.fechaEntrega = fechaEntrega;
        this.fechaEmision = new Date();
        this.pagoConTarjeta = pagoConTarjeta;
        this.productos = productos;
        this.direccion = direccion;
        this.usuario = usuario;
        this.montoTotal = montoTotal;
        this.id = contador;
        contador++;
    }

    public int getId() {
        return this.id;
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

    public void calcularMontoTotal(int montoTotal) {
        int monto = 0;
        for (int i = 0; i < this.productos.size(); i++) {
            monto = monto + (this.productos.get(i).getAlimento().getPrecio() * this.productos.get(i).getUnidades());
        }
    }
}
