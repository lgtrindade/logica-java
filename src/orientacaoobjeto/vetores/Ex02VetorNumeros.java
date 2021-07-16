package orientacaoobjeto.vetores;

import java.util.Scanner;

public class Ex02VetorNumeros {
    /*
     Faça um programa que leia N números inteiros e armazene-os
        em um vetor. Em seguida, mostrar na tela todos os números
        negativos lidos.
        Exemplo:

        Entrada             | Saida
        6                   |  -2
        8 -2 9 10 -3 -7     | -3
                            | -7
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor N");
        int valorN = scanner.nextInt();

        int[] numeros = new int[valorN];

        for (int i = 0; i < valorN; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < valorN; i++) {
            if (numeros[i] < 0){
                System.out.println(numeros[i]);
            }
            scanner.close();
        }
    }
}


