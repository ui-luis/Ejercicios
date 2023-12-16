package EjemplosProgramacionJava;

import java.util.Scanner;

public class matriz_cubo_1 {
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
            for (int j = 0; j < nu; j++) {
                if (i == 0 || j == 0 || (nu - 1 == i) || (nu - 1 == j))
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
