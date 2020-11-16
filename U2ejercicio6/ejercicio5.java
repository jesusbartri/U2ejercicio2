package U2.U2ejercicio2.U2ejercicio6;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Dame el valor del radio de una circunferencia");
        int num = teclado.nextByte();
        System.out.println("Menu   " + "   1. Calcular diametro   " + "   2. Clacular perímertro   " + "   3. Calcular área   ");
        int select = teclado.nextInt();

        if (select==1) {
            System.out.println(2 * num);
        }
        else
            if (select==2){
                System.out.println(2*3.14*num);
            }
        else
            if (select==3){
                System.out.println(3.14*num*num);
            }
        }
    }

