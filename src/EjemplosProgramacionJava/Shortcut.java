package EjemplosProgramacionJava;

public class Shortcut {
    public static void main(String[] args) {
        String world = "goodbye";
        leerNumero(world);
    }

    public static String leerNumero(String input){
        String frase = "";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e'|| input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){}
            else frase = frase+input.charAt(i);

        }
        return frase;
    }


}



