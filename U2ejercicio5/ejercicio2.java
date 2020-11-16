package U2.U2ejercicio2.U2ejercicio5;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce 12 si no atente a las consecuencias");
        int num = teclado.nextInt();

        if (num==12)
        {
            System.out.println("Muy bien sigue obedeciendo");
        }
        else
            if (num!=12)
            {
                System.out.println("Arrieritos somos");
            }
    }
}
