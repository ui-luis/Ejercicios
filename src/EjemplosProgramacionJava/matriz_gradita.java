package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
 1  0  0  0  0
  2  3  0  0  0
  4  5  6  0  0
  7  8  9  10  0
  11  12  13  14  15
* */

public class matriz_gradita {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension : ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu, vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1;
        for (int i = 0; i < nu; i++) {
            for (int j = 0; j < i+1; j++) {
                vec[i][j] = inc++;
            }

        }


    }

    public static void imprimir(int nu, int vec[][]) {
        for (int i = 0; i < nu; i++) {
            for (int j = 0; j < nu; j++) {
                System.out.print("  " + vec[i][j]);
            }
            System.out.println("");
        }
    }

}
