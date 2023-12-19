package EjemplosProgramacionJava;

public class cadena_inversa {
    public static void main(String[] args) {
        String cad = "hola como!!";
        inversa(cad);
        System.out.println(inversa(cad));
    }

    static String inversa(final String original) {
        String newCad = "";
        String cadFinal = "";

        for (int i = 0; i < original.length(); i++) {
            //char newCad = cad.charAt(i);
            if (original.charAt(i) == ' ') {
                for (int j = newCad.length() - 1; j >= 0; j--) {
                    cadFinal = cadFinal + newCad.charAt(j);
                }
                newCad = "";
                cadFinal = cadFinal + " ";

            } else {
                newCad = newCad + original.charAt(i);

            }//fin del la condision

        }//fin del bucle
        for (int j = newCad.length()-1; j >=0 ; j--) {
            cadFinal = cadFinal +newCad.charAt(j);
        }

        return cadFinal;
    }


}
