
package ejercicio.pkg13.extras;

import java.util.Scanner;


public class Ejercicio13Extras {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para hacer una escalera");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
               System.out.print((j+1)+" ");
            }
            System.out.println("");
        }
    }
}
