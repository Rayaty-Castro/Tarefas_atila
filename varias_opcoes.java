import java.util.Scanner;

public class varias_opcoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Exibição do Menu
        System.out.println("--- MENU DE OPÇÕES ---");
        System.out.println("1 - Opção 1");
        System.out.println("2 - Opção 2");
        System.out.println("3 - Opção 3");
        System.out.println("4 - Sair");
        System.out.print("Digite uma opção: ");

        int opcao = leitor.nextInt();

        // Processamento da escolha
        switch (opcao) {
            case 1:
                System.out.println("Você selecionou a opção 1");
                break;
            case 2:
                System.out.println("Você selecionou a opção 2");
                break;
            case 3:
                System.out.println("Você selecionou a opção 3");
                break;
            case 4:
                System.out.println("Você selecionou sair");
                break;
            default:
                System.out.println("Opção inválida!!!");
                break;
        }

        // Mensagem final obrigatória
        System.out.println("Fim do programa!");

        leitor.close();
    }
}
