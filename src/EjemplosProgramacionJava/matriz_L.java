package EjemplosProgramacionJava;

import java.util.Scanner;

public class matriz_L {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension : ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu, vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1, cont = 1;

        for (int j = 0; j < nu; j++) {
            for (int i = 0; i < (nu - cont); i++) {
                vec[i][j] = inc++;
            }
            int k = (nu - cont);
            vec[k][j] = inc++;
            for (int i = (j + 1); i < nu; i++) {
                vec[k][i] = inc++;
            }
            cont++;

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
