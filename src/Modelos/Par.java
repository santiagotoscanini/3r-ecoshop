package Modelos;

public class Par<T, W> implements Comparable<Par> {

    private T primerValor;
    private W segundoValor;

    public Par(T primerValor, W segundoValor) {
        this.primerValor = primerValor;
        this.segundoValor = segundoValor;
    }

    public T getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(T primerValor) {
        this.primerValor = primerValor;
    }

    public W getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(W segundoValor) {
        this.segundoValor = segundoValor;
    }

    @Override
    public int compareTo(Par t) {
        if (t.getSegundoValor() == this.getSegundoValor()) {
            return 0;
        }
        if ((Integer) t.getSegundoValor() > (Integer) this.getSegundoValor()) {
            return -1;
        } else {
            return 1;
        }
    }
}
