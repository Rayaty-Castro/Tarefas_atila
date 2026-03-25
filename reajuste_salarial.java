import java.util.Scanner;

public class reajuste_salarial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário (R$): ");
        double salarioAtual = leitor.nextDouble();

        double percentual;
        double valorAumento;
        double novoSalario;

        // Lógica para determinar o percentual de aumento
        if (salarioAtual <= 1000.00) {
            percentual = 20.0;
        } else if (salarioAtual <= 1700.00) {
            percentual = 15.0;
        } else if (salarioAtual <= 2300.00) {
            percentual = 10.0;
        } else {
            percentual = 5.0;
        }

        // Cálculos
        valorAumento = salarioAtual * (percentual / 100);
        novoSalario = salarioAtual + valorAumento;

        // Exibição dos resultados
        System.out.println("\n--- RESUMO DO REAJUSTE ---");
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentual);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário, após o aumento: R$ %.2f%n", novoSalario);
        System.out.println("--------------------------");

        leitor.close();
    }
}