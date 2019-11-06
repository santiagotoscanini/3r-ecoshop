
package Modelos;

public class Alimento {
    
//Atributos    
    private String nombre;
    private String codigo;
    private int stock;
    private int precio;
    private String descripcion;
    
//Constructor
    public Alimento(String nombre, String codigo, int stock, int precio, String descripcion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = Math.abs(stock);
        this.precio = precio;
        this.descripcion = descripcion;
    }

//Metodos
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
    
}
