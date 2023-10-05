package EjemplosProgramacionJava;

import java.util.Scanner;

/**Calcular el Area de un triangulo a partir las funciones
 * de sus lados
 */
public class CalculaAreaTriangulo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Ingrese el lado 1 del triangulo");
        lado1 = obj.nextDouble();

        System.out.println("Ingrese el lado 2 del triangulo");
        lado2 = obj.nextFloat();

        System.out.println("Ingrese el lado 3 del triangulo");
        lado3 = obj.nextFloat();

        double resultado = areaTriangulo(lado1,lado2,lado3);
        System.out.println("El Area del triangulo es: " + resultado);

    }

    public static double areaTriangulo(double lado1, double lado2, double lado3){
        double pe;
        pe = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt( (pe - lado1) * (pe - lado2) * (pe - lado3) );
        return area;
    }


}
