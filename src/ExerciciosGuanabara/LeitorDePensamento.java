package ExerciciosGuanabara;

import java.util.Scanner;

public class LeitorDePensamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Adivinhe o numero: \n");
        Integer numero = teclado.nextInt();
        double n = 1 + Math.random() * (5-1);
        int valor = (int) n;

        String f1 = "Acertou";
        String f2 = "Errou o valor era \n" + valor;
        String res = (valor == numero)?f1 : f2;
        System.out.println(res);

    }
}
