package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
 21 20 11 10 1
 22 19 12 9 2
 23 18 13 8 3
 24 17 14 7 4
 25 16 15 6 5
* */

public class matriz_S_Derecha {
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
        for (int j = nu-1; j >= 0; j--) {
            if (verdad == true) {
                for (int i = 0; i < nu; i++) {
                    vec[i][j] = inc++;
                }
                verdad = false;
            } else {
                for (int i = nu - 1; i >= 0; i--) {
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
