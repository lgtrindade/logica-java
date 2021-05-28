import java.util.Scanner;

public class CalculoImcCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();


        double resultado = peso /(altura * altura);

        if (resultado < 18.5){
            System.out.println("Magreza");
        } else if (resultado >= 18.5 && resultado <= 24.9){
            System.out.println("Normal");
        } else if (resultado >= 24.9 && resultado <= 30){
            System.out.println("Sobrepeso");
        } else{
            System.out.println("Obesidade");
        }
        scanner.close();
    }
}
