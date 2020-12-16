package javaapplication132;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner V = new Scanner(System.in);
        ArbolBB a = new ArbolBB();
        int dato;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un dato");
            dato = V.nextInt();
            a.add(dato);
        }
        System.out.println("PreOrden - Arbol Normal");
        a.PreOrden(a.getRaizN());
        System.out.println("\nPreOrden - Arbol Espejo");
        a.PreOrden(a.getRaizE());
        System.out.println("\n\nInOrden - Arbol Normal");
        a.InOrden(a.getRaizN());
        System.out.println("\nInOrden - Arbol Espejo");
        a.InOrden(a.getRaizE());
        System.out.println("\n\nPostOrden - Arbol Normal");
        a.PostOrden(a.getRaizN());
        System.out.println("\nPostOrden - Arbol Espejo");
        a.PostOrden(a.getRaizE());
        System.out.println("");
    }

}
