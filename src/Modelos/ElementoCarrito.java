
package Modelos;

public class ElementoCarrito {
    
    private Alimento alimento;
    private int unidades;
    private Boolean envase;   // true es compostable, false es reutilizable
    
    public ElementoCarrito(Alimento alimento){
        this.alimento = alimento;
        this.unidades = 1;
        this.envase = true;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public int getUnidades() {
        return unidades;
    }

    public Boolean getEnvase() {
        return envase;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setEnvase(Boolean envase) {
        this.envase = envase;
    }
    
    
}
