import java.util.Scanner;

public class CalculoDeImc {

    public static void main (String[] arg){

        Scanner scanner = new Scanner(System.in);
        // *** ENTRADA DE DADOS ***
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        //*** PROCESSAMENTO ***
        double resultado = peso /(altura * altura);

        //*** SAIDA DE DADOS ***
        System.out.println("O seu IMC é " + resultado);

        scanner.close();
    }
}
