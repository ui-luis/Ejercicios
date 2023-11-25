package EjemplosProgramacionJava;

/**
 * Convierte la suma de dos numeros enteros y devuleve una cadena
 * en Binario
 */

public class conversionBinario {
    public static void main(String[] args) {
        int nun1 = 20, num2 = 16;

        System.out.println("Resultado es : " +  binary(nun1, num2));
    }

    public static String binary(int num1, int num2) {
        String resultado = "";
        int suma = num1 + num2;
        while (suma > 0) {
            resultado = (suma % 2) + resultado;
            suma /= 2;
        }
        //StringBuilder str = new StringBuilder(resultado);
        //return  resultado = str.reverse().toString();
        return resultado;

    }
}
