package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
 1 2 5 10 17
 4 3 6 11 18
 9 8 7 12 19
 16 15 14 13 20
 25 24 23 22 21
* */

public class matriz_L_inversa {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension : ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu, vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1, k = -1;

        for (int j = 0; j < nu; j++) {
            for (int i = 0; i < (j+1); i++) {
                vec[i][j] = inc++;
            }

            for (int i = k; i >= 0 ; i--) {
                vec[j][i] = inc++;
            }
            k++;

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
