package ejercicio.pkg11.extras;

import java.util.Scanner;

public class Ejercicio11Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        medirNumero(num);
    }

    public static void medirNumero(int num) {
        int cont = 0;
        do {
            num /= 10;
            cont++;
        } while (num > 0);
        System.out.println("El numero tiene " + cont + " digitos");

    }
}
