package ejercicio.pkg4.extras;

import java.util.Scanner;

public class Ejercicio4Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int num = leer.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("Vuelva a ingresar el numero");
            num = leer.nextInt();
        }

        switch (num) {
            case 1:
                System.out.println("1 convertido a numeros romanos es: I");
                break;
            case 2:
                System.out.println("2 convertido a numeros romanos es: II");
                break;
            case 3:
                System.out.println("3 convertido a numeros romanos es: III");
                break;
            case 4:
                System.out.println("4 convertido a numeros romanos es: IV");
                break;
            case 5:
                System.out.println("5 convertido a numeros romanos es: V");
                break;
            case 6:
                System.out.println("6 convertido a numeros romanos es: VI");
                break;
            case 7:
                System.out.println("7 convertido a numeros romanos es: VII");
                break;
            case 8:
                System.out.println("8 convertido a numeros romanos es: VIII");
                break;
            case 9:
                System.out.println("9 convertido a numeros romanos es: IX");
                break;
            case 10:
                System.out.println("10 convertido a numeros romanos es: X");

        }
    }

}
