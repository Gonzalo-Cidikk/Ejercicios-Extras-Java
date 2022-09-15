package ejercicio.pkg21.extras;

import java.util.Scanner;

public class Ejercicio21Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] vectorNombres = new String[3];
        double[][] matrizNotas = new double[3][5];
        cargaDeVectores(vectorNombres, matrizNotas, leer);
        mostrarResultados(vectorNombres, matrizNotas);
    }

    public static void cargaDeVectores(String[] vectorNombres, double[][] matrizNotas, Scanner leer) {
        for (int i = 0; i < vectorNombres.length; i++) {
            System.out.println("Ingrese el numbre de su " + (i + 1) + " alumno");
            vectorNombres[i] = leer.next();
        }
        double suma = 0;
        for (int i = 0; i < matrizNotas.length; i++) {
            suma = 0;
            System.out.println("Alumno: " + vectorNombres[i]);
            for (int j = 0; j < (matrizNotas[0].length - 1); j++) {
                switch (j) {
                    case 0:
                        System.out.println("Ingrese la nota del Primer Trabajo Practico");
                        matrizNotas[i][j] = leer.nextInt();
                        while (matrizNotas[i][j] <= 0 || matrizNotas[i][j] > 10) {
                            System.out.println("Vuelva a ingresar la nota: ");
                            matrizNotas[i][j] = leer.nextInt();
                        }
                        suma += (matrizNotas[i][j] * 0.1);
                        break;
                    case 1:
                        System.out.println("Ingrese la nota del Segundo Trabajo Practico");
                        matrizNotas[i][j] = leer.nextInt();
                        while (matrizNotas[i][j] <= 0 || matrizNotas[i][j] > 10) {
                            System.out.println("Vuelva a ingresar la nota: ");
                            matrizNotas[i][j] = leer.nextInt();
                        }
                        suma += (matrizNotas[i][j] * 0.15);
                        break;
                    case 2:
                        System.out.println("Ingrese la nota del Primer Integrador");
                        matrizNotas[i][j] = leer.nextInt();
                        while (matrizNotas[i][j] <= 0 || matrizNotas[i][j] > 10) {
                            System.out.println("Vuelva a ingresar la nota: ");
                            matrizNotas[i][j] = leer.nextInt();
                        }
                        suma += (matrizNotas[i][j] * 0.25);
                        break;
                    default:
                        System.out.println("Ingrese la nota del Segundo Integrador");
                        matrizNotas[i][j] = leer.nextInt();
                        while (matrizNotas[i][j] <= 0 || matrizNotas[i][j] > 10) {
                            System.out.println("Vuelva a ingresar la nota: ");
                            matrizNotas[i][j] = leer.nextInt();
                        }
                        suma += (matrizNotas[i][j] * 0.5);
                        break;
                }
            }
            matrizNotas[i][4] = suma;
        }
    }

    public static void mostrarResultados(String[] vectorNombres, double[][] matrizNotas) {
        for (int i = 0; i < vectorNombres.length; i++) {
            System.out.println("Alumno: " + vectorNombres[i]);
            if (matrizNotas[i][4] < 7) {
                System.out.println("Tiene un promedio de " + matrizNotas[i][4]);
                System.out.println("Por lo que no aprobó la materia");
            } else {
                System.out.println("Tiene un promedio de " + matrizNotas[i][4]);
                System.out.println("Por lo que Aprobó la materia!");
            }
            System.out.println("-------------------------");
        }
    }

}
