package U2.U2ejercicio2.U2ejercicio3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el primer numero");
        short pN = teclado.nextShort();
        System.out.println("Introduzca su segundo numero");
        Short sN = teclado.nextShort();
        System.out.println( pN+sN );
    }
}
