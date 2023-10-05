package EjemplosProgramacionJava;

/**
 * Generacion de numeros multiplos de 3 y 5 hasta 10.000
 */
public class IteracionMultiplos3y5 {
    public static void main(String[] args) {
        multiplos();
    }
    public static void multiplos() {
        for (int i = 1; i < 10000; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                System.out.println("1.- " + i);
        }
    }
}
