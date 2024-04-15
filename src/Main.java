import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno \n");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno \n");
        float nota = teclado.nextFloat();
        System.out.println("A nota de \n "+ nome +"\n é \n" +nota );


    }
}