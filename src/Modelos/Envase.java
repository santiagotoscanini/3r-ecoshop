
package Modelos;

public class Envase {
    
//Atributos    
    private String tipo;
    private int inpacto;
    private String descripcion;

//Constructor
    public Envase(String tipo, int inpacto, String descripcion) {
        this.tipo = tipo;
        this.inpacto = inpacto;
        this.descripcion = descripcion;
    }

//Metodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getInpacto() {
        return inpacto;
    }

    public void setInpacto(int inpacto) {
        this.inpacto = inpacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
