package U2.U2ejercicio2.U2ejercicio6;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int pN = teclado.nextByte();
        System.out.println("Introduce otro numero");
        int sN = teclado.nextByte();

        int mayor;
        mayor = (pN>sN)?pN:sN;
        System.out.println("El mas grande es " + mayor);
    }
}
