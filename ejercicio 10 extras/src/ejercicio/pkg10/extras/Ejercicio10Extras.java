/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.extras;

import java.util.Scanner;

public class Ejercicio10Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num2 = (int) (Math.random() * 10);
        int num1 = (int) (Math.random() * 10);
        int respuesta;
        do {
            System.out.println("Cuanto es " + num1 + " por " + num2);
            respuesta = leer.nextInt();
        } while (respuesta != (num1 * num2));
        System.out.println("Correcto!");
    }

}
