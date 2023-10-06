package EjemplosProgramacionJava;

/**
 * Hallar los numeros primos gemelos,
 * Se dice que cada numero primo tiene un gemelo si la diferencia
 * de la distancia entre es 2.
 */
public class numeroPrimosgemelos {
    public static void main(String[] args) {

        int vec[] = new int[25];
        numeroPrimos(vec);
        imprimirPrimos(vec);
        imprimirGemelos(vec);

    }

    /**
     *
     * @param vec
     * @return El metodo devuelve los numeros primos del 1 al 100  dentro de
     * un vector
     */
    public static int[] numeroPrimos(int vec[]) {
        int inc = 0;
        for (int valor = 2; valor < 100; valor++) {
            int cont = 0;
            for (int j = 1; j <= valor; j++)
                if (valor % j == 0) cont++;

            if (cont == 2) {
                inc++;
                for (int j = inc - 1; j < inc; j++) vec[j] = valor;

            }
        }
        return vec;
    }

    /**
     *
     * @param vec
     * El metodo imprime los numeros primos del 1 al 100 dentro del vector
     */

    public static void imprimirPrimos(int vec[]) {
        for (int i = 0; i < vec.length; i++)
            System.out.print("[" + vec[i] + "]");

    }

    /**
     *
     * @param vec
     * Imprime los todos los numeros primos gemelos
     */
    public static void imprimirGemelos(int vec[]) {
        System.out.println("");
        for (int i = 0; i < vec.length - 1; i++) {
            if (vec[i] == vec[i + 1] - 2)
                System.out.print("[" + vec[i] + "]");
        }
    }


}


