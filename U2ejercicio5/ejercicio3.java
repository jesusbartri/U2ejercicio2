package U2.U2ejercicio2.U2ejercicio5;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero que desea analizar");
        int num = teclado.nextInt();
        if (num%2==0)
        {
            System.out.println(" No es impar");
        }
        //esta parte no sabia si poner si era par o no por el enunciado
    else
        if (num%1==0) // Profesor aqui valdria poner "num%1!=0"??
        {
            System.out.println("Es impar");
        }
    }
}
