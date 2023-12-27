package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
 1 1 1 1 1
 0 0 0 1 0
 0 0 1 0 0
 0 1 0 0 0
 1 1 1 1 1
* */

public class matriz_Z_1 {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu,vec);
    }

    public static void llenado(int nu, int vec[][]) {

        for (int i = 0; i < nu; i++) {
            for (int j = 0; j < nu; j++) {
                if(i ==0 || (i+j == nu-1) || nu-1 ==i)
                    vec[i][j] = 1;

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
