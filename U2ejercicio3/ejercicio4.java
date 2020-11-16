package U2.U2ejercicio2.U2ejercicio3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        float pN;

        teclado = new Scanner(System.in);
        System.out.println("Introduzca su distacia en millas");
        pN = teclado.nextFloat();

        System.out.println(pN*1.609);
    }
}
