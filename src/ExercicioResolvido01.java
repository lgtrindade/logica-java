import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {
    public static void main(String[] args) {

        /*
Fazer um programa para ler as medidas da largura e comprimento de um terreno  retangular com uma casa decimal,
bem como o valor do metro quadrado do terreno  com duas casas decimais.
Em seguida, o programa deve mostrar o valor da área do  terreno, bem como o valor do preço do terreno,
ambos com duas casas decimais,  conforme exemplo.
Exemplo:

 Entrada:       Saída:
10.0            AREA = 300.00
30.0            PRECO = 60000.00
200.00
 */
        Locale.setDefault(Locale.US);
        Scanner scanner  =  new   Scanner(System.in);


        double largura = scanner.nextDouble();
        double comprimento = scanner.nextDouble();
        double metroQuadrado = scanner.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        scanner.close();

    }

}
