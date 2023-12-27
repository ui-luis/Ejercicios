package EjemplosProgramacionJava;
/*
* Matriz de la forma :
 1 2 3 4 5
 10 9 8 7 6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25
* */

public class matriz_S_inversa {
    public static void main(String[] args) {
        int nu = 5;
        int inc = 1;
        int vec[][] = new int[nu][nu];
        llenado(inc, vec);
        imprimir(vec);
    }
    public static void llenado(int inc, int vec[][]) {
        boolean verdad = true;
        for (int i = 0; i < vec.length; i++) {
            if (verdad == true) {
                for (int j = 0; j < vec.length; j++) {
                    vec[i][j] = inc++;
                }
                verdad = false;
            } else {
                for (int k = vec.length -1; k >= 0; k--) {
                    vec[i][k] = inc++;
                }
                verdad = true;
            }

        }

    }

    public static void imprimir(int vec[][]) {
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                System.out.print(" "+vec[i][j]);
            }
            System.out.println("");
        }
    }

}
