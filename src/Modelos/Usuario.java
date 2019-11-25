package Modelos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Usuario implements Comparable<Usuario> {

    private final List<Factura> facturas;
    private List<ElementoCarrito> elementosCarrito;
    private final List<String> direcciones;

    private String nombre;
    private final String cedula;
    private double puntos;
    
    

    public Usuario(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.puntos = 0;
        this.cedula = cedula;
        this.direcciones = new LinkedList<>();
        this.direcciones.add(direccion);
        this.facturas = new LinkedList<>();
        this.elementosCarrito = new ArrayList<>();
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

    public void sumarPunto(double puntos) {
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
//
//    public void cambiarCantidadElemento(String operacion, Alimento alimento) {
//        int indice = (this.carrito.indexOf(new Triplet(alimento, 0, true)));
//        if (operacion.equals("suma")) {
//            this.carrito.get(indice).setSecond((int) this.carrito.get(indice).getSecond() + 1);
//        } else if (operacion.equals("resta")) {
//            this.carrito.get(indice).setSecond((int) this.carrito.get(indice).getSecond() - 1);
//        }
//    }
//  
//    public void removeElementFromCarrito(Alimento alimento) {
//        this.carrito.remove(new Triplet(alimento, 0, false));
//    }

    @Override
    public int compareTo(Usuario o) {
        if (this.puntos < o.getPuntos()) {
            return -1;
        } else if (o.getPuntos() < this.puntos) {
            return 1;
        }
        return 0;
    }

    public List<ElementoCarrito> getElementosCarrito() {
        return elementosCarrito;
    }
    
    public void agregarElementoCarrito(ElementoCarrito elementoCarrito){
        this.elementosCarrito.add(elementoCarrito);
    }

    public void setElementosCarrito(List<ElementoCarrito> elementosCarrito) {
        this.elementosCarrito = elementosCarrito;
    }

    @Override
    public boolean equals(Object obj) {
        Usuario aux = (Usuario) obj;
        return this.cedula.equals(aux.cedula);
    }
    
}
