package estruturarepeticao.enquanto;

public class Ex3 {
    public static void main(String[] args) {

        double x = 100;
        double y = 100;

        while (x != y) {
            System.out.print("olha");
            x = Math.sqrt(y);
        }
    }
}
