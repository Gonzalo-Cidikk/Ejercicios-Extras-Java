package ejercicio.pkg5.extras;

import java.util.Scanner;

public class Ejercicio5Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto del tratamiento");
        double monto = leer.nextDouble();
        System.out.println("Ingrese el Tipo de Socio");
        String socio = leer.next();
        socio = socio.toUpperCase();
        switch (socio) {
            case "A":
                System.out.println("El monto a pagar es: " + monto + " $");
                System.out.println("Pero como es Socio Tipo A");
                System.out.println("El monto final quedaria: " + (monto - (monto * 0.5)) + " $");
                break;
            case "B":
                System.out.println("El monto a pagar es: " + monto + " $");
                System.out.println("Pero como es Socio Tipo B");
                System.out.println("El monto final quedaria: " + (monto - (monto * 0.35)) + " $");
                break;
            case "C":
                System.out.println("Lamentabemente usted no posee descuentos para este tratamiento");
                System.out.println("Su monto final es de: " + monto + " $");
                break;
            default:
                System.out.println("No ingreso un tipo de Socio válido");
                System.out.println("Vuelva a intentarlo");
        }

    }

}
