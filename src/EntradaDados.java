import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String variavelSemEspaco = scanner.next();

        System.out.println(variavelSemEspaco);

        double valorComVirgula = scanner.nextDouble();

        int valorInteiroSemVirgula = scanner.nextInt();

        char variavelQueRecebeSomenteUmCaracter = scanner.next().charAt(0);



        scanner.close();

    }
}
