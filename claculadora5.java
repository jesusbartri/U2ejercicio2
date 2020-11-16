package U2.U2ejercicio2;

import java.util.Scanner;

public class claculadora5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la temperatura en centígrados");
        int C = teclado.nextInt();

        System.out.println(C*9/5+32);
    }
}
