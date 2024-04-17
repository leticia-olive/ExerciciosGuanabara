package ExerciciosGuanabara;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit rt= Toolkit.getDefaultToolkit();
        Dimension d = rt.getScreenSize(); // dimensao recebe tamanho da tela
        System.out.println("A resolucao da tela e: "+d.width+"x"+d.height);
    }
}
