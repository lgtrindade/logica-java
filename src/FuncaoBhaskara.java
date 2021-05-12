import java.util.Locale;
import java.util.Scanner;

public class FuncaoBhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double delta;
        double x1;
        double x2;


        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        delta = Math.pow(b, 2.0) -4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("O valor de delta é : " + delta);
        System.out.println("O valor de x¹ : " + x1);
        System.out.println("O valor de x² : " + x2);


        scanner.close();

    }
}
