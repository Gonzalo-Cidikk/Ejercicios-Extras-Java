package ejercicio.pkg12.extras;

public class Ejercicio12Extras {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(i + "-");
                    }
                    if (j == 3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(j + "-");
                    }
                    if (k == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(k);
                    }
                    System.out.println("");
                }
            }
        }
    }
}
