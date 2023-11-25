package EjemplosProgramacionJava;

public class SerieFibonacci {
    public static void main(String[] args) {

        fibonacci(40);


    }

    static void fibonacci(int datos) {
        int p = 0, u = 1, resul = p + u;
        System.out.print(0 +" "+0+" "+1+" "+1);
        for (int i = 4; i < datos; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + resul);

            } else {
                System.out.print(" " + resul * resul);
                p = u;
                u = resul;
                resul = p + u;
            }
        }


    }
}
