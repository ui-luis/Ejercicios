package EjemplosProgramacionJava;

import java.util.Scanner;

public class gradita_inferior_viborita2 {
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
                    vec[i][jj] = inc++;
                    jj--;
                }//fin de 1er blucle interno
                cont += 2;
                verdad = false;
            } else {
                int aum1 = aum;
                for (int k = 0; k <= j; k++) {
                    vec[aum1][k] = inc++;
                    aum1++;
                }//fin de 2do blucle interno
                aum += 2;
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
