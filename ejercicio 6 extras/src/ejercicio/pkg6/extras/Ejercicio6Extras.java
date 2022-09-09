package ejercicio.pkg6.extras;

import java.util.Scanner;

public class Ejercicio6Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que va a medir");
        int N = leer.nextInt();
        int contTotal = 0, contM = 0;
        double sumaAltura = 0, sumaAlturaM = 0, altura;
        do {
            System.out.println("Ingrese la altura de la " + (contTotal + 1) + " persona: ");
            altura = leer.nextDouble();
            if (altura < 1.60) {
                contM++;
                sumaAlturaM += altura;
            }
            contTotal++;
            sumaAltura += altura;
        } while (contTotal < N);
        if (contM != 0) {
            System.out.println("El promedio de los que se encontran por debajo de 1.60 mts. es de: " + (sumaAlturaM / contM) + " mts.");
            System.out.println("El promedio total de todas las alturas es de: " + (sumaAltura / contTotal) + " mts.");

        } else {
            System.out.println("No se registraron alturas de menos de 1.60 mts.");
            System.out.println("El promedio total de todas las alturas es de: " + (Math.round(sumaAltura / contTotal)) + " mts.");
        }

    }

}
