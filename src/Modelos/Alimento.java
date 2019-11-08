package Modelos;

public class Alimento {

    private String nombre;
    private String codigo;
    private int precio;
    private String descripcion;
//  Si no es reutilizable es compostable  
    private boolean esReutilizable;

    public Alimento(String nombre, String codigo, int precio, String descripcion, boolean esReutilizable) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.esReutilizable = esReutilizable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean esReutilizable() {
        return this.esReutilizable;
    }

    public void setReutilizable(boolean reutilizable) {
        this.esReutilizable = reutilizable;
    }

}
