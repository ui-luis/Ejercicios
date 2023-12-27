package EjemplosProgramacionJava;

import java.util.Scanner;
/* Matriz de la forma :
* 5  6  12  13  15
  0  4  7   11  14
  0  0  3   8   10
  0  0  0   2   9
  0  0  0   0   1
* */

public class gradita_inferior_viborita {
    public static void main(String[] args) {
        int vec[][] = new int[20][20];
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite dimension : ");
        int nu = obj.nextInt();
        llenado(nu, vec);
        imprimir(nu, vec);
    }

    public static void llenado(int nu, int vec[][]) {
        int inc = 1, cont = 0, aum = 1;
        boolean verdad = true;
        for (int j = nu - 1; j >= 0; j--) {
            if (verdad == true) {
                int jj = j;
                for (int i = (nu - 1); i >= cont; i--) {
                    vec[jj][i] = inc++;
                    jj--;
                }//fin de 1er blucle interno
                cont += 2;
                verdad = false;
            } else {
                int aum1 = aum;
                for (int i = 0; i <= j; i++) {
                    vec[i][aum1] = inc++;
                    aum1++;
                }//fin de 2do blucle interno
                aum +=2;
                verdad = true;
            }//fin de la condicion
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
