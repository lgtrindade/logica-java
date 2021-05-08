import java.util.Locale;
import java.util.Scanner;

public class CalculoDeImc {

    public static void main (String[] arg){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        // *** ENTRADA DE DADOS ***
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        //*** PROCESSAMENTO ***
        double resultado = peso /(altura * altura);

        //*** SAIDA DE DADOS ***
        System.out.print("O seu IMC é " );

        System.out.printf("%.2f%n", resultado);
        scanner.close();
    }
}
