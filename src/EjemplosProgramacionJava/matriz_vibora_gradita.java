package EjemplosProgramacionJava;

import java.util.Scanner;

public class matriz_vibora_gradita {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension : ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu, vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1, cont = 2;
        boolean verdad = true;
        for (int j = 0; j < nu; j++) {
            if (verdad == true) {
                int jj = j;
                for (int i = 0; i < (nu - j); i++) {
                    vec[i][jj] = inc++;
                    jj++;
                }//fin de bucle interno
                verdad = false;
            } else {
                int k = nu - 1;
                for (int i = nu-cont; i >=0 ; i--) {
                    vec[i][k] = inc++;
                    k--;
                }//fin del blucle interno
                verdad = true;
                cont +=2;
            }//fin de condicion

        }//fin de bucle primario


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
