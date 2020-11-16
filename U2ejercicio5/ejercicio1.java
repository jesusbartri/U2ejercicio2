package U2.U2ejercicio2.U2ejercicio5;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.println("Inserte el nunmero que desea analizar");
        int num = teclado.nextInt();
        if (num>0)
        {
            System.out.println( "Es positivo");
        }
        else
            if (num ==0)
                System.out.println("El numero debe ser diferente de 0");

            else
                System.out.println("El numero es negativo");
    }
}
