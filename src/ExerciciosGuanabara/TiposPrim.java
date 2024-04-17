package ExerciciosGuanabara;

import java.util.Scanner;

public class TiposPrim {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno \n");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno \n");
        float nota = teclado.nextFloat();
        System.out.println("A nota de "+ nome +" é " +nota );


    }
    }

