package ejercicio.pkg20.extras;

public class Ejercicio20Extras {

    public static void main(String[] args) {
        int[] vector = new int[5];
        rellenarVector(vector);
        mostrarMatriz(vector);
    }

    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void mostrarMatriz(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

}
