import java.util.Scanner;

    /*



     */


public class CalculaRetangulo {
    public static void main(String[] args) {

        double base = 5.0;
        double altura = 4.0;

        double area = (base * altura);
        double perimetro = 2 * base + 2 * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("Área = %.4f%n", area);
        System.out.printf("Perimetro = %.4f%n", perimetro);
        System.out.printf("Diagonal = %.4f%n", diagonal);





    }
}
