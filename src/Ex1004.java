import java.util.Locale;
import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {

        /*
        --- PRODUTO SIMPLES ---

        Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua
        esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.

        Entrada
        O arquivo de entrada contém 2 valores inteiros.

        Saída
        Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo,
        com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto,
        caso contrário seu programa apresentará a mensagem: “Presentation Error”.

        Exemplos de Entrada            	Exemplos de Saída

                30                          PROD = 27
                10

               -30                          PROD = -300
                10

                0                           PROD = 0
                9
         */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        //*** PROCESSAMENTO ***
        int PROD = (A * B);

        //*** SAIDA DE DADOS ***
        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
