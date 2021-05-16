import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        /*
        --- DISTANCIA ---
        Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem,
        ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de
        um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas)
        e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida,
        calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

        Entrada
        O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas)
        e o segundo é a velocidade média durante a mesma (em km/h).

        Saída
        Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal

        Exemplos de Entrada                	Exemplos de Saída

                 10                             70.833
                 85

                 2                              15.333
                 92

                 22                             122.833
                 67
         */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        System.out.println("Digite o tempo gasto na viagem (Horas): ");
        int tempoGasto = scanner.nextInt();
        System.out.println("Digite a velocidade média durante a mesma (Km/h): ");
        int velocidadeMedia = scanner.nextInt();

        //*** PROCESSAMENTO ***
        double distPercorrida = (velocidadeMedia * tempoGasto);
        double qtdLitros = (distPercorrida / 12);

        //*** SAIDA DE DADOS ***
        System.out.printf("%.3f%n", qtdLitros);

        scanner.close();
    }
}
