package ejercicio.pkg8.extras;

import java.util.Scanner;

public class Ejercicio8Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Contador de numeros (si es multiplo de 5 el programa finaliza)");
        int contT = 0, num, contPares = 0, contImpares = 0;
        do {
            System.out.println("Ingrese el " + (contT + 1) + " numero");
            num = leer.nextInt();
            if (num % 5 != 0) {
                if (num > 0) {
                    contT++;
                    if (num % 2 == 0) {
                        contPares++;
                    } else {
                        contImpares++;
                    }
                }
            }
        } while (num % 5 != 0);
        System.out.println("Se contaron " + contT + " numeros en Total");
        System.out.println(contPares + " fueron Pares");
        System.out.println(contImpares + " fueron Impares");
        System.out.println("Gracias por usarnos!");
    }

}
