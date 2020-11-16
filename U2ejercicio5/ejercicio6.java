package U2.U2ejercicio2.U2ejercicio5;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce el Tiempo para hallar la velocidad");
        int num = teclado.nextInt();
        if (num>0)
        {
            System.out.println(num*9.8);
        }
        else
            if (num<=0)
            {
                System.out.println("El tiempo es incorrecto");
            }
    }
}
