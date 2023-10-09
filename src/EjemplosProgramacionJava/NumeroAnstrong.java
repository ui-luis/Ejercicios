package EjemplosProgramacionJava;

/**
 * Programa que genera los numeros cubo perfectos (anstrong)
 * Se dice que cada digito elevado al cubo genera el mismo numero.
 */
public class NumeroAnstrong {
    public static void main(String[] args) {
        for (int dato = 1; dato < 1000; dato++) {
            anstrong(dato);
        }
    }

    public static void anstrong(int valor) {
        int nu = valor, suma = 0;
        while (nu > 0) {
            int aux = nu % 10;
            suma += (aux * aux * aux);
            nu /= 10;
        }
        if (suma==valor)
            System.out.println(""+valor);



    }
}
