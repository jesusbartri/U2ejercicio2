package U2.U2ejercicio2.U2ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int pn, sn, tn;
        System.out.println("Dame el primer numero");
        pn = teclado.nextInt();
        System.out.println("Dame el segundo numero");
        sn = teclado.nextInt();
        System.out.println("Dame el tercer numero");
        tn = teclado.nextInt();

        if (pn>sn && pn>tn)
        {
            System.out.println(pn +"Es el mayor");
        }
        else
            if (sn>pn && sn>tn){
                System.out.println(sn +"Es el mas alto");
            }
        else
            if (tn>pn && tn>sn)
            {
                System.out.println(tn+"Es el mayor");
            }

    }
}
