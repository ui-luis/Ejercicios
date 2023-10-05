package EjemplosProgramacionJava;

/**
 * Hallar el numero de terminos para la progresion siguiente
 * 1, 2, 4, 16, 32,.......10000
 */
public class Progresion2 {
    public static void main(String[] args) {
        terminos();
    }

    public static void terminos() {
        int con = 0;
        for (int i = 1; i <= 100000; i *= 2)
            con++;
        System.out.println("La cantidad que existe en esta serie es :" + con);
    }
}
