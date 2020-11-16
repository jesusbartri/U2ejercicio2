package U2.U2ejercicio2.U2ejercicio8;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = teclado.nextInt();

        do {
            System.out.println("Dame un numero");

            if (num % 2 == 0) {
                System.out.println("Es par");
            }
            else
                if (num % 2 != 0) {
                    System.out.println("Es impar");
            }

        }
        while (num==0);

    }
}
