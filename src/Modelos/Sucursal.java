package Modelos;

import java.util.LinkedList;
import java.util.List;

public class Sucursal {

    private static int contador = 1;

    private final List<Factura> facturas;
    private final int id;

    private int telefono;
    private String direccion;

    public Sucursal(String direccion, int telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.facturas = new LinkedList<>();
        id = contador;
        contador++;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
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

    public int getId() {
        return this.id;
    }

}
