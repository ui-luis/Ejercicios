package EjemplosProgramacionJava;

import java.util.Scanner;
/*
   Matriz de la forma :
*   1   2   9  10  25
    4   3   8  11  24
    5   6   7  12  23
   16  15  14  13  22
   17  18  19  20  21
* */

public class matriz_gusanito_elevador {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension : ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu, vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int incremento = 1, cont_i = 0, cont_j = -1, cont = 1;
        boolean verdad = true;
        for (int i = 0; i < nu; i++) {
            if (verdad == true) {
                for (int j = 0; j <= cont_i; j++) {
                    vec[i][j] = incremento++;
                }//fin de 1er bucle interno
                for (int j = cont_j; j >= 0; j--) {
                    vec[j][i] = incremento++;
                }//fin de 2do bucle interno
                cont_i += 2;
                cont_j += 2;
                verdad = false;
            } else {
                for (int j = 0; j < cont; j++) {
                    vec[j][i] = incremento++;
                }//fin de 3er bucle interno
                for (int j = cont; j >= 0; j--) {
                    vec[i][j] = incremento++;
                }//fin de 4to bucle interno
                cont += 2;
                verdad = true;
            }//fin de la condicion
        }//fin de bucle principal


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
