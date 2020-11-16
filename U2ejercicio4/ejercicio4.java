package U2.U2ejercicio2.U2ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        float num;
        teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero a redondear");
        num = teclado.nextFloat();
        System.out.println(Math.round(num));
    }
}
