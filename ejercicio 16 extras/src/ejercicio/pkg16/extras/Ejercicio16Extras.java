package ejercicio.pkg16.extras;

import java.util.Scanner;

public class Ejercicio16Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la contidad de personas para cargar");
        int n = leer.nextInt();
        int[] edades = new int[n];
        String[] nombres = new String[n];
        cargarPersonas(n, leer, edades, nombres);
        mostrarPersonas(n, leer, edades, nombres);
    }

    public static void cargarPersonas(int n, Scanner leer, int[] edades, String[] nombres) {
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la " + (i + 1) + " persona");
            nombres[i] = leer.next();
            System.out.println("Ingrese la edad de la " + (i + 1) + " persona");
            edades[i] = leer.nextInt();
        }
    }

    public static void mostrarPersonas(int n, Scanner leer, int[] edades, String[] nombres) {
        String respuesta;
        for (int i = 0; i < n; i++) {
            System.out.print(nombres[i]);
            if (edades[i] < 18) {
                System.out.println(" Es menor de edad");
            } else {
                System.out.println(" Es mayor de edad");
            }
            System.out.println("Quiere continuar mostrando personas?");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

}
