import java.util.Scanner;

public class situacao_escolar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1. Leitura das quatro notas
        System.out.print("Digite a 1ª nota: ");
        double n1 = leitor.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double n2 = leitor.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        double n3 = leitor.nextDouble();
        System.out.print("Digite a 4ª nota: ");
        double n4 = leitor.nextDouble();

        // 2. Cálculo da média final
        double media = (n1 + n2 + n3 + n4) / 4;
        String conceito = "";
        String status = "";

        // 3. Atribuição de Conceitos
        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
        } else if (media >= 7.5) {
            conceito = "B";
        } else if (media >= 6.0) {
            conceito = "C";
        } else if (media >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // 4. Determinação de Aprovação/Reprovação
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            status = "APROVADO";
        } else {
            status = "REPROVADO";
        }

        // Exibição dos resultados
        System.out.println("\n======= BOLETIM ESCOLAR =======");
        System.out.printf("Notas: %.1f | %.1f | %.1f | %.1f%n", n1, n2, n3, n4);
        System.out.printf("Média Final: %.2f%n", media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + status);
        System.out.println("===============================");

        leitor.close();
    }
}