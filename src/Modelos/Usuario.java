package Modelos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Usuario implements Comparable<Usuario> {

    private final List<Factura> facturas;
    private final List<Triplet> carrito;
    private final List<String> direcciones;

    private String nombre;
    private final String cedula;
    private double puntos;

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.puntos = 0;
        this.cedula = cedula;
        this.direcciones = new LinkedList<>();
        this.carrito = new LinkedList<>();
        this.facturas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntos() {
        return puntos;
    }

    public void sumarPunto(int puntos) {
        this.puntos += puntos;
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

    public List<Triplet> getCarrito() {
        return this.carrito;
    }

    public void addElementToCarrito(Alimento alimento, boolean esReut) {
        this.carrito.add(new Triplet(alimento, 1, esReut));
    }

    public void cambiarCantidadElemento(String operacion, Alimento alimento) {
        int indice = (this.carrito.indexOf(new Triplet(alimento, 0, true)));
        if (operacion.equals("suma")) {
            this.carrito.get(indice).setSecond((int) this.carrito.get(indice).getSecond() + 1);
        } else if (operacion.equals("resta")) {
            this.carrito.get(indice).setSecond((int) this.carrito.get(indice).getSecond() - 1);
        }
    }

    public void removeElementFromCarrito(Alimento alimento) {
        this.carrito.remove(new Triplet(alimento, 0, false));
    }

    @Override
    public int compareTo(Usuario o) {
        if (this.puntos < o.getPuntos()) {
            return -1;
        } else if (o.getPuntos() < this.puntos) {
            return 1;
        }
        return 0;
    }

}
