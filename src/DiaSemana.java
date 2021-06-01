public class DiaSemana {
    public static void main(String[] args) {

        int idaSemana = 7;

        if (idaSemana == 1) {
            System.out.println("Domingo");
        } else if (idaSemana == 2) {
            System.out.println("Segunda-feira");
        } else if (idaSemana == 3) {
            System.out.println("Terca-feira");
        } else {
            System.out.println("Dia nao encontrado");
        }

        switch (idaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Sabado");
        }
    }
}
