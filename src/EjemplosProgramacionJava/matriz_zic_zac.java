package EjemplosProgramacionJava;

import java.util.Scanner;
/**
Matriz  de la forma Zic Zac :
 1  2  6  7  15
 3  5  8  14  16
 4  9  13  17  22
 10  12  18  21  23
 11  19  20  24  25
 * */

public class matriz_zic_zac {
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
        boolean verdad = true;
        for (int j = 0; j < nu; j++) {
            int jj = j;
            if (verdad == true) {
                //int ii = j;
                for (int i = 0; i <= j; i++) {
                    vec[jj][i] = inc++;
                    jj--;
                }//fin de bucle interno
                verdad = false;
            } else {
                // int jj = j;
                for (int i = 0; i <= j; i++) {
                    vec[i][jj] = inc++;
                    jj--;
                }//fin de bucle interno
                verdad = true;
            }//fin de condicion
        }//fin de bucle externo
        boolean verdad2 = true;
        if (nu % 2 == 0) {
            for (int j = 1; j <= nu - 1; j++) {
                if (verdad2 == true) {
                    int jj = j;
                    for (int i = nu - 1; i >= j; i--) {
                        vec[i][jj] = inc++;
                        jj++;
                    }//fin de bucle interno
                    verdad2 = false;
                } else {
                    int ii = j;
                    for (int ji = nu - 1; ji >= j; ji--) {
                        vec[ii][ji] = inc++;
                        ii++;
                    }//fin del bucle interno
                    verdad2 = true;
                }//fin de condision

            }//fin de bucle interno
        } else {
            for (int i = 1; i <= nu - 1; i++) {
                if (verdad2 == true) {
                    int cont1 = nu - 1;
                    for (int j = i; j < nu; j++) {
                        vec[j][cont1] = inc++;
                        cont1--;
                    }//fin de bucle interno
                    verdad2 = false;
                } else {
                    int cont2 = nu - 1;
                    for (int j = i; j < nu; j++) {
                        vec[cont2][j] = inc++;
                        cont2--;
                    }//fin de bucle interno
                    verdad2 = true;

                }//fin de condision  interna
            }//fin de bucle interno
        }//fin de condision


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
