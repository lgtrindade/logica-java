package estruturarepeticao.enquanto;

public class Ex4 {
    public static void main(String[] args) {

        int x = 0;

        while (x < 5) {
            int y = x * 3;
            System.out.print(y);
            x = x + 1;
        }
        System.out.println("fim");
    }
}
