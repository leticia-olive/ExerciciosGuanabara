package ExerciciosGuanabara;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("o idioma do computador é: ");
        System.out.println(idioma.getDisplayLanguage());
    }
}
