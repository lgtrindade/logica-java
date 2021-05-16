import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {

        /*
        --- DISTANCIA ---
        Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h
        e o carro Y sai com velocidade constante de 90 Km/h.

        Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja,
        consegue se afastar um quilômetro a cada 2 minutos.

        Leia a distância (em Km) e calcule quanto tempo leva (em minutos)
        para o carro Y tomar essa distância do outro carro.

        Entrada
        O arquivo de entrada contém um número inteiro.

        Saída
        Imprima o tempo necessário seguido da mensagem "minutos".

        Exemplos de Entrada                	Exemplos de Saída

                 30                             60 minutos
                 110                            220 minutos
                 7                              14 minutos
        */
        Scanner scanner = new Scanner(System.in);

        // *** ENTRADA DE DADOS ***
        System.out.println("Distância (Km): ");
        int dist = scanner.nextInt();

        //*** PROCESSAMENTO ***
        // Considerando o afastamento 1Km a cada 2mim:
        int tempo = (dist * 2);

        //*** SAIDA DE DADOS ***
        System.out.println(+ tempo + " minutos ");

        scanner.close();
    }
}
