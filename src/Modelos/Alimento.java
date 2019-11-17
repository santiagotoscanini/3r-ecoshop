package Modelos;

public class Alimento {

    private static int contador = 0;

    private final int id;

    private int precio;
    private String nombre;
    private String descripcion;
    private String categoria;

    public Alimento(String nombre, String descripcion, int precio, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id = contador;
        this.categoria = categoria;
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

    @Override
    public boolean equals(Object obj) {
        Alimento aux = (Alimento) obj;
        return this.id == aux.id;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
}
