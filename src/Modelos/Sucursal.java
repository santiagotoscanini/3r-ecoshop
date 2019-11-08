package Modelos;

import java.util.LinkedList;
import java.util.List;

public class Sucursal {

    private String direccion;
    private int telefono;
    private final List<Factura> facturas;

    public Sucursal(String direccion, int telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.facturas = new LinkedList<>();
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Factura> getFacturas() {
        return this.facturas;
    }

    public void addFactura(Factura factura) {
        this.facturas.add(factura);
    }

}
