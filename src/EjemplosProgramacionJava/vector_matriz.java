package EjemplosProgramacionJava;

import java.util.Scanner;

public class vector_matriz {
    public static void main(String[] args) {
        int vec[] = new int[10];
        int inc = 1;
        llenado(inc, vec);
        imprimir(vec);
        promedio(vec);
        inverso(vec);
        max_min(vec);
    }
    public static void max_min(int vec[]){
        int max = vec[0], min = vec[0];
        for (int i : vec) {
            if ( i < min )
                min = i;
            else if (i > max)
                max = i;

        }
        System.out.println("\n El numero min es: "+ min);
        System.out.println("El numero max es: "+ max);
    }

    public static void llenado(int inc, int vec[]) {

        for (int i = 0; i < vec.length; i++) {
            vec[i] = inc++;
        }
    }


    public static void imprimir(int vec[]) {
        for (int i : vec) {
            System.out.print(" " + i);
        }
    }

    public static void promedio(int vec[]) {
        int su = 0;
        for (int i : vec) {
            su += i;
        }
        float prom = su / vec.length;
        System.out.println(" \n El promedio es : " + prom);
    }

    public static void inverso(int vec[]) {

        //System.out.println(" ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(" "+ (vec.length-i) );
        }

    }


}
