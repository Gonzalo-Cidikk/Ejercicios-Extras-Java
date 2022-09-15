package ejercicio.pkg18.extras;

import java.util.Scanner;

public class Ejercicio18Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int[] vectorEnteros = new int[leer.nextInt()];
        generarVector(vectorEnteros, leer);
    }

    public static void generarVector(int[] vectorEnteros, Scanner leer) {
        int suma = 0;
        System.out.println("Ingrese los numeros del vector");
        for (int i = 0; i < vectorEnteros.length; i++) {
            System.out.println("Para la posición " + (i + 1));
            vectorEnteros[i] = leer.nextInt();
            suma += vectorEnteros[i];
        }
        System.out.println("La suma de todos los numeros del vector es: " + suma);
    }
}
