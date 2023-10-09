package EjemplosProgramacionJava;

/**
 * Programa que donde verifica que son numeros amigos
 * Se dice que la suma de los  divisores de un numero genera al otro numero amigo
 * y biceversa si cumple ese principio entonces son amigos
 *
 * Falta generar lo numeros amigos.
 */
public class numerosAmigos {
    public static void main(String[] args) {

        numberAmigos();
    }

    public static void numberAmigos() {
        int nu1 = 220, nu2 = 284;
        //int inc = 0;

            int suma1 = 1, suma2 = 1;
            for (int i = 2; i <= nu1/2 ; i++) {
                if (nu1 % i == 0) {
                    suma1 += i;
                    System.out.println(suma1);
                }
            }
        System.out.println("la suma es "+suma1);

            for (int j = 2; j <= nu2 / 2; j++) {
                if (nu2 % j == 0) {
                    suma2 += j;
                }
            }


            if (suma1 == nu2 && suma2 == nu1) {
                System.out.println(suma1 + "  " + suma2);
            }




    }
}

