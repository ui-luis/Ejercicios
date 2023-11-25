package EjemplosProgramacionJava;

/**
 * Programa que genera los numeros perfectos menores a 10000.
 * Un numero perfecto es cuando sus divisores menores que el
 * numero suman el mismo numero,
 */
public class NumeroPerfecto {
    public static void main(String[] args) {
        for (int i = 1; i <10000 ; i++)
            perfecto(i);

    }

    static void perfecto(int valor) {
        int nu = valor, suma = 0;
        for (int i = 1; i <= nu / 2; i++) {
            if (nu % i == 0)
                suma += i;
        }
        if (nu==suma)
            System.out.println("Perfecto : "+valor);


    }
}
