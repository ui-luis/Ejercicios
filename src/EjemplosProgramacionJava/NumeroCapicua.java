package EjemplosProgramacionJava;

/**
 * Programa que genera los numeros capicua, Los numeros capicua
 * son aquelos que al invertir sus digitos resultal ser el mismo
 * numero
 */
public class NumeroCapicua {
    public static void main(String[] args) {
        for (int i = 1; i <= 12321; i++)
            capicua(i);
    }

    public static void capicua(int datos) {
        int num = datos, suma = 0, aux = num;
        while (aux > 0) {
            int valor = aux % 10;
            suma = (suma * 10) + valor;
            aux /= 10;
        }
        if (suma == num)
            System.out.println("Capicua " + num);

    }
}
