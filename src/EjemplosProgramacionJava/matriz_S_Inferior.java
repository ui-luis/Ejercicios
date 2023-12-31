package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
 5 6 15 16 25
 4 7 14 17 24
 3 8 13 18 23
 2 9 12 19 22
 1 10 11 20 21
* */

public class matriz_S_Inferior {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu, vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1;
        boolean verdad = true;
        for (int i = 0; i < nu; i++) {
            if (verdad == true) {
                for (int j = nu-1; j >= 0; j--) {
                    vec[j][i] = inc++;
                }
                verdad = false;
            } else {
                for (int j = 0; j < nu; j++) {
                    vec[j][i] = inc++;
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
