package EjemplosProgramacionJava;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
public class Iterador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> nums = new LinkedList<Integer>();

        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }


        int sum = 0;
        //your code goes here
        Iterator<Integer> valor = nums.iterator();
        while (valor.hasNext()){
            sum += valor.next();
        }

        System.out.println(sum);


    }
}
