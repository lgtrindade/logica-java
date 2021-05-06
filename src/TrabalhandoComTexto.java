import java.util.Scanner;

public class TrabalhandoComTexto {

    public static void main (String[] arg){

        Scanner scanner = new Scanner(System.in);
        // *** ENTRADA DE DADOS ***
        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        //*** PROCESSAMENTO ***
        String valoresConcatenados = "Oi, meu nome é " + nome + ", tenho " + idade + " anos, minha altura é " + altura + " e estou pesando " + peso + " kg";

        //*** SAIDA DE DADOS ***
        System.out.println(valoresConcatenados);

        scanner.close();



    }
}
