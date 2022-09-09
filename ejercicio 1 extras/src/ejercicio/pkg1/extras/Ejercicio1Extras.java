package ejercicio.pkg1.extras;

import java.util.Scanner;

public class Ejercicio1Extras {

    public static void main(String[] args) {
        int minutos, contDias = 0,contHoras = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        minutos = leer.nextInt();
        do {
            if (minutos >= 60) {
                minutos -= 60;
                contHoras++;
                if (contHoras == 24) {
                    contHoras = 0;
                    contDias++;
                }
            } else {
                break;
            }
        } while (minutos >= 60);
        System.out.println(contDias + " Dia/s con " + contHoras + " Hora/s");
    }

}
