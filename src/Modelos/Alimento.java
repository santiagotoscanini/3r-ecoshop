package Modelos;

import java.util.Date;

public class Alimento {

    private static int contador = 0;

    private final int id;

    private int precio;
    private String nombre;
    private String descripcion;
    private String categoria;
    private Date aPartirDe;

    public Alimento(String nombre, String descripcion, int precio, String categoria, Date aPartirDe) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id = contador;
        this.categoria = categoria;
        this.aPartirDe = aPartirDe;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getaPartirDe() {
        return aPartirDe;
    }

    public void setaPartirDe(Date aPartirDe) {
        this.aPartirDe = aPartirDe;
    }

    @Override
    public boolean equals(Object obj) {
        Alimento aux = (Alimento) obj;
        return this.id == aux.id;
    }
}
