package EjemplosProgramacionJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivos {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File archivo = new File("/home/werewolf/Escritorio/EjerciciosJava/EjemplosJava/src/" +
                    "EjemplosProgramacionJava/texto.txt");
            Scanner sc = new Scanner(archivo);
            while(sc.hasNext()) {
                System.out.println(sc.next());
               
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

    }
}

