package orientacaoobjeto.matriz;

import java.util.Scanner;

public class Ex01MatrizPapel {
    public static void main(String[] args) {

        int n = 3;

        int[][] matriz = new int[n][n];

        for (int i = 0; i< n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = 1 + i + j;
            }
        }

        for (int i = 0; i< n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

}
