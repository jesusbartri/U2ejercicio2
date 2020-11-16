package U2.U2ejercicio2.U2ejercicio4;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado;
        float pN, sN;
        teclado = new Scanner(System.in);

        System.out.println("Introduce tu primera nota");
        pN = teclado.nextFloat();
        System.out.println("Introduce tu segunda mota");
        sN = teclado.nextFloat();
        float re = pN+sN;
        System.out.println(  re/2 );
    }
}
