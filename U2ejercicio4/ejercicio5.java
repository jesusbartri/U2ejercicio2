package U2.U2ejercicio2.U2ejercicio4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ejercicio5 {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("Hora actual" + dateFormat.format(date));
    }
}
