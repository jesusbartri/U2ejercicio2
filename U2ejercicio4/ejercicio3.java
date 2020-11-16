package U2.U2ejercicio2.U2ejercicio4;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado;
        float pN, sN, tN;
        teclado = new Scanner(System.in);

        System.out.println("Introduce tu primera nota");
        pN = teclado.nextFloat();
        System.out.println("Introduce tu segunda mota");
        sN = teclado.nextFloat();
        System.out.println("Introducw tu tercera nota");
        tN = teclado.nextFloat();

        float re = pN+sN+tN;
        System.out.println(  re/3 );
    }
}
