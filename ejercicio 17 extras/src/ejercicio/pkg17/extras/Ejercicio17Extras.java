package ejercicio.pkg17.extras;

import java.util.Scanner;

public class Ejercicio17Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo");
        int num = leer.nextInt();
        if (esPrimo(num)) {
            System.out.println("Es un numero Primo");
        } else {
            System.out.println("NO es un numero primo");
        }
    }

    public static boolean esPrimo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;   
            }
        }
        if (cont == 2) {
            return true;
        }
        return false;
        
    }
}
