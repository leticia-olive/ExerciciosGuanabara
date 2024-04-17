package ExerciciosGuanabara;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalculaIdade {
    public static  void main(String[] args) {
        System.out.println("digite o ano que nasceu");
        Scanner teclado = new Scanner(System.in);
        Integer ano = teclado.nextInt();
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        Integer idade = ano - cal.get(Calendar.YEAR);
        System.out.println("sua idade é: \n"+ idade);

    }
}
