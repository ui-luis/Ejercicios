package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
 21 22 23 24 25
 20 19 18 17 16
 11 12 13 14 15
 10 9 8 7 6
 1 2 3 4 5
* */

public class matriz_S_subida {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu,vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1;
        boolean verdad = true;
        for (int i = nu-1; i >= 0; i--) {
            if (verdad == true) {
                for (int j = 0; j < nu; j++) {
                    vec[i][j] = inc++;
                }
                verdad = false;
            } else {
                for (int j = nu - 1; j >= 0; j--) {
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
