package U2.U2ejercicio2.U2ejercicio5;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado;
        int[] lista = new int[100];
        teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int pN = teclado.nextInt();
        System.out.println("Introduzca el segundo numero");
        int sN = teclado.nextInt();
            int contador = 0;
        for (int i = 0; i < 100; i++)
            if (lista[i] > 17)
                // no se como continuarlo
                contador++;

            {

            }
            System.out.println("hay" + contador + "numeros pares");
    }
}
