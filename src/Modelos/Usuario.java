package Modelos;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
   
//Atributos    
    private String nombre;
    private int puntos;
    private List<String> direcciones;
    private List<Factura> facturas;
    
//Constructor    
    Usuario(String nombre){
        this.nombre = nombre;
        direcciones = new LinkedList<>();
        this.puntos = 0;
    }
    
//Metodos    
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
        return direcciones;
    }

    public void setDirecciones(List<String> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public void agregarDireccion(String direccion){
        this.direcciones.add(direccion);
    }
    
    public void quitarDireccion(String direccion){
        this.direcciones.remove(direccion);
    }
    
    public void agregarFactura(Factura factura){
        this.facturas.add(factura);
    }

    
}
