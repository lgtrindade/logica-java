package orientacaoobjeto.matriz;

import java.util.Scanner;

public class Ex01Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Fazer um programa para ler dois números inteiros positivos M e N, depois ler uma
        matriz de M linhas e N colunas contendo números inteiros. Em seguida, mostrar na
        tela a matriz lida conforme exemplo.

        Entrada             |       Saída
        2 3                         6 3 10
        6 3 10                      8 12 5
        8 12 5
         */

        System.out.println("Digite um valor N");
        int M = scanner.nextInt(); //linha

        System.out.println("Digite um valor M"); //coluna
        int N = scanner.nextInt();


        int[][] matriz = new int[M][N];

        // Entrada de valores
        for (int i = 0; i< M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Impessao de valores
        for (int i = 0; i< M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Posicao [" + i + "] [ " + j + "] " + matriz[i][j] + " ");
            }
        }
        scanner.close();
    }
}
