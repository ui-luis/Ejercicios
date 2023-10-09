package EjemplosProgramacionJava;

/**
 * Programa donde se genera los numeros primos del 1 al 1000
 * Los numeros primos son aquellos que son divisibles solo
 * por la unidad y por si mismo.
 */
public class NumeroPrimo {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++)
            primos(i);

    }

    public static void primos(int datos) {
        int num = datos;
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                cont++;
        }

        if (cont == 2)
            System.out.println("Primo : " + datos);


    }
}
