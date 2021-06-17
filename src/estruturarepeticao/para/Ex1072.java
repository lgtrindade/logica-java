package estruturarepeticao.para;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int contIn = 0;
        int contOut = 0;

        for (int i = 1; i <= n; i++){
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20){
                contIn++;

            }else {
                contOut++;
            }
        }
        System.out.println(contIn + "In");
        System.out.println(contOut + "Out");

        scanner.close();
    }
}
