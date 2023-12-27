package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
 5 4 3 2 1
 6 7 8 9 10
 15 14 13 12 11
 16 17 18 19 20
 25 24 23 22 21
* */
public class matriz_S {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension : ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu,vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1;
        boolean verdad = true;
        for (int i = 0; i < nu; i++) {
            if (verdad == true) {
                for (int j = nu-1; j >= 0; j--) {
                    vec[i][j] = inc++;
                }
                verdad = false;
            } else {
                for (int j = 0; j < nu; j++) {
                    vec[i][j] = inc++;
                }
                verdad = true;
            }

        }

    }

    public static void imprimir(int nu, int vec[][]) {
        for (int i = 0; i < nu; i++) {
            for (int j = 0; j < nu; j++) {
                System.out.print(" " + vec[i][j]);
            }
            System.out.println("");
        }
    }

}
