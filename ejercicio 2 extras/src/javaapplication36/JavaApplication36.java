package javaapplication36;

public class JavaApplication36 {

    public static void main(String[] args) {
        int A = 1, B = 20, C = 300, D = 4000, aux;
        System.out.println("A vale: " + A);
        System.out.println("B vale: " + B);
        System.out.println("C vale: " + C);
        System.out.println("D vale: " + D);
        System.out.println("------------");

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("A vale: " + A);
        System.out.println("B vale: " + B);
        System.out.println("C vale: " + C);
        System.out.println("D vale: " + D);
    }

}
