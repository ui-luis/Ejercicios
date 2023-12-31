package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
  1 10 11 20 21
 2 9 12 19 22
 3 8 13 18 23
 4 7 14 17 24
 5 6 15 16 25
* */
public class matriz_S_Izquierda {
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
        for (int j = 0; j < nu; j++) {
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
