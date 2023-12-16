package EjemplosProgramacionJava;

public class matriz {
    public static void main(String[] args) {
        int vec[][] = new int[5][5];
        int vec_2[] = new int[5];
        int vec_3[] = new int[5];
        int vec_4[][] = new int[5][5];
        int inc = 1;

        llenado(inc, vec);
        imprimir(vec);
        promedioFilas(vec);
        promedioColumna(vec);
        sumaDP(vec);
        sumaDSP(vec);
        max_min_vec(vec_2, vec);
        min_max_vec(vec_3, vec);
        matrizUnitaria(inc, vec_4);
    }

    public static void matrizUnitaria(int inc, int vec_4[][]) {
        for (int i = 0; i < vec_4.length; i++) {
            for (int j = 0; j < vec_4.length; j++) {
                if (i == j || (i + j) + 1 == vec_4.length)
                    vec_4[i][j] = inc;
            }
        }

        for (int i = 0; i < vec_4.length; i++) {
            for (int j = 0; j < vec_4.length; j++) {
                System.out.print(" "+ vec_4[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void min_max_vec(int vec_3[], int vec[][]) {
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                if ((i + j) + 1 == vec.length) {
                    vec_3[i] = vec[i][j];
                }
            }

        }
        int max = vec_3[0], min = vec_3[0];
        for (int i : vec_3) {
            if (i < min)
                min = i;
            else if (i > max) {
                max = i;
            }
        }
        System.out.println("\n Min de la Diagonal Secundaria : " + min);
        System.out.println(" Max de la Diagonal Principal : " + max);

    }


    public static void max_min_vec(int vec_2[], int vec[][]) {
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                if (i == j) {
                    vec_2[i] = vec[i][j];
                }
            }

        }
        int max = vec_2[0], min = vec_2[0];
        for (int i : vec_2) {
            if (i < min)
                min = i;
            else if (i > max) {
                max = i;
            }
        }
        System.out.println("\n Min de la diagonal principal : " + min);
        System.out.println(" Max de la diagonal principal : " + max);

    }

    public static void sumaDSP(int vec[][]) {
        int su = 0;
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                if ((i + j) + 1 == vec.length) {
                    su += vec[i][j];
                    //System.out.println(" , "+ vec[i][j]);
                }
            }
        }
        float prome = su / vec.length;
        System.out.print("\n Promedio Diagonal Secundaria : " + prome);
        System.out.print("\n Diagonal Secundaria : " + su);
    }


    public static void sumaDP(int vec[][]) {
        int su = 0;
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                if (i == j) {
                    su += vec[i][j];
                }
            }
        }
        float prome = su / vec.length;
        System.out.print("\n Promedio Diagonal Principal : " + prome);
        System.out.print("\n Diagonal Principal : " + su);
    }

    public static void promedioColumna(int vec[][]) {
        for (int j = 0; j < vec.length; j++) {
            int su = 0;
            for (int i = 0; i < vec.length; i++) {
                su += vec[i][j];
            }
            float prome = su / vec.length;
            System.out.print(" = " + prome);
        }
    }

    public static void promedioFilas(int vec[][]) {
        for (int i = 0; i < vec.length; i++) {
            int su = 0;
            for (int j = 0; j < vec.length; j++) {
                su += vec[i][j];
            }
            float prome = su / vec.length;
            System.out.println("= " + prome);
        }
    }

    public static void imprimir(int vec[][]) {
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                System.out.print("  " + vec[i][j]);
            }
            System.out.println(" ");
        }

    }

    public static void llenado(int inc, int vec[][]) {
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                vec[i][j] = inc++;
            }
        }

    }


}
