package Modelos;

import java.util.Objects;

public class Triplet<A, B, C> {

    private A a;
    private B b;
    private C c;

    public Triplet(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getFirst() {
        return a;
    }

    public void setFirst(A a) {
        this.a = a;
    }

    public B getSecond() {
        return b;
    }

    public void setSecond(B b) {
        this.b = b;
    }

    public C getThird() {
        return c;
    }

    public void setThird(C c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        Triplet aux = (Triplet) obj;
        return aux.getFirst().equals(this.a);
    }

}
