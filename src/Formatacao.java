import java.util.Locale;

//https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

public class Formatacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x = 10.35784;

        // Imprime o texto SEM uma nova linha
        System.out.print(x);
        // Imprime o texto COM uma nova linha
        System.out.println(x);
        // Imprime valor e formata a saida
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

    }
}
