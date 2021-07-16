package orientacaoobjeto.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex03VetorNumeros {
     /*
        Faça um programa que leia N números reais e armazene-os em um vetor.
        Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor

        Entrada             |       Saída
        4                           8.0 4.0 10.0 14.0
        8.0 4.0 10.0 14.0           36.00
                                    9.00
         */
     public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho para o vetor");
    int tamanho = scanner.nextInt();

    double[] numReais = new double[tamanho];
    // aqui eu entro com os valores
        for (int i = 0; i < tamanho; i++) {
        numReais[i] = scanner.nextDouble();
    }

    // imprimir na tela
        for (int i = 0; i < tamanho; i++) {
        System.out.println(numReais[i]);
    }

        System.out.println();
    double soma = 0.0;
        for (int i = 0; i < tamanho; i++) {
        soma += numReais[i];
        // soma = soma + numReais[i];
    }

        System.out.printf("Total soma: %.2f%n", soma);
        System.out.println();
        System.out.println();

    double media = soma / tamanho;
        System.out.printf("Media dos elementos do vetor : %.2f%n", media);

        scanner.close();
}
}
