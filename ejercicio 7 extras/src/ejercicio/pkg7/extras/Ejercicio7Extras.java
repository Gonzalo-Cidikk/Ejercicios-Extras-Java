package ejercicio.pkg7.extras;

import java.util.Scanner;

public class Ejercicio7Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que va a introducir");
        int N = leer.nextInt();
        int contT = 0, num, max = 0, min = 99999999, sumaT = 0;
        while (contT < N) {
            System.out.println("Ingrese el " + (contT + 1) + " numero: ");
            num = leer.nextInt();
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            contT++;
            if (num > 0) {
                sumaT += num;
            }
        }
        System.out.println("El mayor numero es: " + max);
        System.out.println("El menor numero es: " + min);
        double prom = sumaT / contT;
        System.out.println("El promedio de todos los numeros es de: " + prom);
    }

}
