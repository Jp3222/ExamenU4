package javaapplication132;

public class ArbolBB {

    private Nodo raizN;
    private Nodo raizE;

    public boolean isEmptyN() {
        return raizN == null;
    }

    public boolean isEmptyE() {
        return raizE == null;
    }

    public Nodo getRaizN() {
        return raizN;
    }

    public Nodo getRaizE() {
        return raizE;
    }

    public void add(int d) {
        add(raizN, raizE, d);
    }

    private void add(Nodo r, Nodo r2, int d) {
        if (isEmptyN()) {
            raizN = new Nodo(d);
            raizE = new Nodo(d);
        } else if (r.getDato() > d) {
            if (r.getHizq() == null) {
                r.setHizq(new Nodo(d));
                //
                r2.setHder(new Nodo(d));
            } else {
                add(r.getHizq(), r2.getHder(), d);
            }
        } else {
            if (r.getHder() == null) {
                r.setHder(new Nodo(d));
                //
                r2.setHizq(new Nodo(d));
            } else {
                add(r.getHder(), r2.getHizq(), d);
            }
        }
    }

    public void PreOrden(Nodo r) {
        if (r != null) {
            System.out.print(r);
            PreOrden(r.getHizq());
            PreOrden(r.getHder());
        }
    }

    public void InOrden(Nodo r) {
        if (r != null) {
            InOrden(r.getHizq());
            System.out.print(r);
            InOrden(r.getHder());
        }
    }

    public void PostOrden(Nodo r) {
        if (r != null) {
            PostOrden(r.getHizq());
            PostOrden(r.getHder());
            System.out.print(r);
        }
    }

}
