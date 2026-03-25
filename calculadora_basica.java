import java.util.Scanner;

public class calculadora_basica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- CALCULADORA MULTIFUNÇÃO ---");
        System.out.print("Digite o primeiro número (n1): ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite o segundo número (n2): ");
        double n2 = leitor.nextDouble();

        System.out.println("\nESCOLHA A OPERAÇÃO:");
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.println("5 - Potência (n1 elevado a n2)\n6 - Raiz quadrada (de n1)");
        System.out.println("7 - n1 é Par?\n8 - n1 é Ímpar?");
        System.out.print("Opção: ");
        int opcao = leitor.nextInt();

        System.out.println("---------------------------------------");

        switch (opcao) {
            case 1:
                System.out.printf("Resultado: %.2f + %.2f = %.2f%n", n1, n2, (n1 + n2));
                break;
            case 2:
                System.out.printf("Resultado: %.2f - %.2f = %.2f%n", n1, n2, (n1 - n2));
                break;
            case 3:
                System.out.printf("Resultado: %.2f * %.2f = %.2f%n", n1, n2, (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.printf("Resultado: %.2f / %.2f = %.2f%n", n1, n2, (n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não permitida!");
                }
                break;
            case 5:
                System.out.printf("Resultado: %.2f elevado a %.2f = %.2f%n", n1, n2, Math.pow(n1, n2));
                break;
            case 6:
                if (n1 >= 0) {
                    System.out.printf("Raiz quadrada de %.2f = %.2f%n", n1, Math.sqrt(n1));
                } else {
                    System.out.println("Erro: Não existe raiz quadrada real de número negativo!");
                }
                break;
            case 7:
                if (n1 % 2 == 0) {
                    System.out.printf("O número %.0f é PAR.%n", n1);
                } else {
                    System.out.printf("O número %.0f NÃO é par.%n", n1);
                }
                break;
            case 8:
                if (n1 % 2 != 0) {
                    System.out.printf("O número %.0f é ÍMPAR.%n", n1);
                } else {
                    System.out.printf("O número %.0f NÃO é ímpar.%n", n1);
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("---------------------------------------");
        leitor.close();
    }
}