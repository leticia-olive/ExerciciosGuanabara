package ExerciciosGuanabara;
import javax.swing.JOptionPane;
public class Repita {
    public static void main(String[] args) {
        int n,s=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Informe um numero (Valor 0 interrompe)"));
            s+=n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "Somatorio vale: "+s);
    }
}
