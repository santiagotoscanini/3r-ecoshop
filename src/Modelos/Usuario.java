package Modelos;

import java.util.LinkedList;
import java.util.List;

public class Usuario {

    private String nombre;
    private int puntos;
    private int telefono;

    private final List<String> direcciones;
    private final List<Alimento> carrito;
    private final List<Factura> facturas;

    public Usuario(String nombre, int puntos, int telefono) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.telefono = telefono;
        this.direcciones = new LinkedList<>();
        this.carrito = new LinkedList<>();
        this.facturas = new LinkedList<>();
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<String> getDirecciones() {
        return this.direcciones;
    }

    public void addDireccion(String direccion) {
        this.direcciones.add(direccion);
    }

    public void removeDireccion(String direccion) {
        this.direcciones.remove(direccion);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void addFactura(Factura factura) {
        this.facturas.add(factura);
    }

    public List<Alimento> getCarrito() {
        return this.carrito;
    }

    public void addDElementoCarrito(Alimento alimento) {
        this.carrito.add(alimento);
    }

    public void removeElementoCarrit(Alimento alimento) {
        this.carrito.remove(alimento);
    }

}
