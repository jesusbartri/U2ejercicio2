package U2.U2ejercicio2;

import java.util.Scanner;

public class calculadora4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce las millas ");
        int pN = teclado.nextInt();



        System.out.println( pN*1609 );
    }
}
