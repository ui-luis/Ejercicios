package EjemplosProgramacionJava;


import java.util.*;

public class ArrayListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<String>();
        while (words.size() < 5) {
            String nombres = scanner.nextLine();
            words.add(nombres);
        }

        for (String word : words) {
            if (word.length() > 4)
                System.out.println(word);

        }


    }
}
