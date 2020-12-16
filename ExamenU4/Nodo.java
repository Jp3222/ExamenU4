package javaapplication132;

public class Nodo {

    private int dato;
    private Nodo Hizq, Hder;

    public Nodo(int d) {
        this.dato = d;
        this.Hizq = null;
        this.Hder = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHizq() {
        return Hizq;
    }

    public void setHizq(Nodo Hizq) {
        this.Hizq = Hizq;
    }

    public Nodo getHder() {
        return Hder;
    }

    public void setHder(Nodo Hder) {
        this.Hder = Hder;
    }

    @Override
    public String toString() {
        return "[" + dato + "]";
    }

}
