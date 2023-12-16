package EjemplosProgramacionJava;

import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        String cad = "test";
        // System.out.println(imprimir(cad));
        System.out.println(imprimir(cad));
    }

    public static String imprimir(String word) {
        String letras = "";
        int poss;
        poss = word.length() / 2;
        if (word.length() % 2 == 0)
            letras = letras + String.valueOf(word.charAt(poss - 1)) + String.valueOf(word.charAt(poss));
        else
            letras = letras + String.valueOf(word.charAt(poss));

        return letras;


    }


}
