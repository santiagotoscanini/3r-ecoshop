package Modelos;

public class ElementoCarrito {

    private Alimento alimento;
    private int unidades;
    private boolean esCompostable;   // true es compostable, false es reutilizable

    public ElementoCarrito(Alimento alimento) {
        this.alimento = alimento;
        this.unidades = 1;
        this.esCompostable = true;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public int getUnidades() {
        return unidades;
    }

    public Boolean getCompostable() {
        return esCompostable;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setCompostable(Boolean envase) {
        this.esCompostable = envase;
    }

    @Override
    public boolean equals(Object obj) {
        ElementoCarrito aux = (ElementoCarrito) obj;
        return this.alimento == aux.getAlimento();
    }
}
