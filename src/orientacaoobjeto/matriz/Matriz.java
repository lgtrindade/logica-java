package orientacaoobjeto.matriz;

public class Matriz {
    /*
    Tamanho fixo
    Homogenea
    indexada
    bidimensional
     */

    public static void main(String[] args) {


        int[][] matriz = new int[2][2];

        matriz[0][0] = 18;
        matriz[1][0] = 65;
        matriz[0][1] = 2;
        matriz[1][1] = 6;


        for (int i = 0; i < 2; i++){// percorre linhas
            for (int j = 0; j < 2; j++){// percorre coluna
                System.out.println(matriz[i][j]);
            }
        }
    }
}
