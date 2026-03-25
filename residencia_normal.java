import java.util.Scanner;

public class residencia_normal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o consumo de água da Residência Normal (m³): ");
        double consumo = leitor.nextDouble();
        double valorConta;

        // Lógica de cálculo conforme as regras da residência normal
        if (consumo <= 10) {
            // Valor fixo para a primeira faixa
            valorConta = 22.38;
        } else if (consumo <= 20) {
            // R$ 3,50 por m³
            valorConta = consumo * 3.50;
        } else if (consumo <= 50) {
            // R$ 8,75 por m³
            valorConta = consumo * 8.75;
        } else {
            // Acima de 50m³: R$ 9.64 por m³
            valorConta = consumo * 9.64;
        }

        System.out.println("---------------------------------------");
        System.out.printf("Consumo registrado: %.2f m³%n", consumo);
        System.out.printf("Valor total da conta: R$ %.2f%n", valorConta);
        System.out.println("---------------------------------------");

        leitor.close();
    }
}