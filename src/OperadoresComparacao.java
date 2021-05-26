public class OperadoresComparacao {
    public static void main(String[] args) {
        // MENOR QUE
        boolean menorQue = 5 < 10;
        System.out.println("MENOR QUE ->" + menorQue);
        // MAIOR QUE
        boolean maiorQue = 5 > 10;
        System.out.println("MAIOR QUE ->" + maiorQue);

        // MENOR OU IGUAL A QUE

        System.out.println(5 <= 10);
        // MAIOR OU IGUAL A QUE

        System.out.println(5 >= 10);

        // IGUALDADE

        System.out.println(5 == 10);
        // DIFERENTE

        System.out.println(5 != 10);


        System.out.println("---------------------------------------------------------");

        int X = 5;

        System.out.println(X > 0);//true
        System.out.println(X == 3);//false
        System.out.println(10 <= 30);//true
        System.out.println(X != 2);//true

        System.out.println("-------------------OPERADORES LOGICOS --- AND ou E -----------------");

        System.out.println(X <= 20 && X == 10);
        System.out.println(X > 0 && X != 3);
        System.out.println(X <= 20 && X == 10 && X != 3);


        System.out.println("-------------------OPERADORES LOGICOS --- OR ou OU -----------------");

        System.out.println(X <= 20 || X == 10);
        System.out.println(X > 0 || X != 3);
        System.out.println(X <= 20 || X == 10 || X != 3);

        System.out.println("-------------------OPERADORES LOGICOS --- NÃO ou NOT -----------------");

    }
}
