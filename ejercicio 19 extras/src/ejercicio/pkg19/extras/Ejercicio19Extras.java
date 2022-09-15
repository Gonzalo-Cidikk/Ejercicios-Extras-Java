package ejercicio.pkg19.extras;

import java.util.Scanner;

public class Ejercicio19Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño para los vectores");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        generarVectores(vector1, vector2, leer, n);
        compararVectores(vector1, vector2, n);
    }

    public static void generarVectores(int[] vector1, int[] vector2, Scanner leer, int n) {
        int num;
        System.out.println("Ingrese los numeros para los vectores");
        for (int i = 0; i < n; i++) {
            System.out.println("En la posición " + (i + 1));
            num = leer.nextInt();
            vector1[i] = num;
            vector2[i] = num;
        }
    }

    public static void compararVectores(int[] vector1, int[] vector2, int n) {
        boolean ban = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                ban = false;
                break;
            }
        }
        if (ban == false) {
            System.out.println("Los vectores NO son iguales");
        } else {
            System.out.println("Los vectores son iguales");
        }
    }

}
