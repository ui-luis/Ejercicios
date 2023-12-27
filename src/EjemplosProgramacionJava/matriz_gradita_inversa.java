package EjemplosProgramacionJava;

import java.util.Scanner;
/*
* Matriz de la forma :
 1  2  3  4  5
  6  7  8  9  0
  10  11  12  0  0
  13  14  0  0  0
  15  0  0  0  0
* */
public class matriz_gradita_inversa {
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
        for (int i = 0; i < nu; i++) {
            for (int j = 0; j < nu-i; j++) {
                vec[i][j] = inc++;
            }

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
