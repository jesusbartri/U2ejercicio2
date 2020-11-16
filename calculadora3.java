package U2.U2ejercicio2;

import java.util.Scanner;

public class calculadora3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Primer numero");
        int pN = teclado.nextInt();
        System.out.println("Segundo numero");
        int sN = teclado.nextInt();

        System.out.println("El resultado es ");
        System.out.println( pN/sN );
    }
}
