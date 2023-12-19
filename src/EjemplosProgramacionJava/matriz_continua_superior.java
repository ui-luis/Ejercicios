package EjemplosProgramacionJava;

import java.util.Scanner;

public class matriz_continua_superior {
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
        for (int j = 0; j < nu; j++) {
            int jj = j;
            for (int i = 0; i < (nu - j); i++) {
                vec[i][jj] = inc++;
                jj++;
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
