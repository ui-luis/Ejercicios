package EjemplosProgramacionJava;

import java.util.Scanner;

public class matriz_continua_inferior {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension : ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu, vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1, cont = 0;
        for (int i = nu - 1; i >= 0; i--) {
            int ii = i;
            for (int j = nu - 1; j >= cont; j--) {
                vec[ii][j] = inc++;
                ii--;
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
