import java.util.Scanner;

public class turno_estuda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Identificação de Turno ---");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        System.out.print("Em que turno você estuda? ");

        // Lendo a entrada como String
        String turno = leitor.next();

        // Processamento com switch-case
        switch (turno) {
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
                break;
        }

        leitor.close();
    }
}