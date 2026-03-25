import java.util.Scanner;

public class dia_semana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7 para saber o dia da semana: ");
        int opcao = leitor.nextInt();
        String dia;

        // Utilizando switch-case para testar valores exatos
        switch (opcao) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Opção inválida!";
                break;
        }

        System.out.println(dia);

        leitor.close();
    }
}