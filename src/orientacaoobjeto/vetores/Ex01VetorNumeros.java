package orientacaoobjeto.vetores;

import java.util.Scanner;

public class Ex01VetorNumeros {

    /*
    Fazer um programa para ler um número inteiro positivo N, depois ler N números
    quaisquer e armazená-los em um vetor. Em seguida, mostrar na tela todos elementos
    do vetor.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho para o vetor");
        int tamanho = scanner.nextInt();

        if (tamanho > 0){
            int [] numeros = new int[tamanho];
            // aqui eu entro com os valores
            for (int i = 0; i < tamanho; i++){
                numeros[i] = scanner.nextInt();
            }
            // aqui eu imprimo os valores
            for (int i = 0; i < tamanho; i++) {
                System.out.println(numeros[i]);
            }
        }else {
            System.out.println("O tamanho digitado precisa ser um valor positivo");
        }
        scanner.close();
    }
}
