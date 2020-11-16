package U2.U2ejercicio2.U2ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu primer numero");
        float pN = teclado.nextFloat();
        System.out.println("Introduce tu segundo numero");
        float sN = teclado.nextFloat();
        System.out.println("El resultado es: ");
        System.out.println( pN/sN );
    }
}
