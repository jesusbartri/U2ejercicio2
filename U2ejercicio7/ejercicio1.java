package U2.U2ejercicio2.U2ejercicio7;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int pn = teclado.nextInt();
        System.out.println("Escriba otro numero");
        int sn = teclado.nextInt();

        System.out.println("Ahora " + sn + " es el primer numero y " + pn + " es el segundo.");
    }
}
