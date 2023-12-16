package EjemplosProgramacionJava;

public class array_1 {
    public static void main(String[] args) {

        int vec[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int vector[] = new int[9];
        llenado(vector,vec);
        imprimir(vector);
    }
    public static void llenado(int vector[],int vec[]){
        for (int i = 0; i < vec.length/2; i++) {
            vector[i+i] = vec[i];
            vector[i+i+1] = vec.length - i;

        }

    }
    public static void imprimir(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" "+vector[i]);
        }

    }

}
