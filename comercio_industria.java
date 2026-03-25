import java.util.Scanner;

public class comercio_industria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Cálculo de Consumo: Comercial / Industrial ---");
        System.out.print("Digite o consumo de água (m³): ");
        double consumo = leitor.nextDouble();
        double valorConta;

        // Lógica de cálculo conforme as regras comerciais/industriais
        if (consumo <= 10) {
            // Valor fixo até 10m³
            valorConta = 44.95;
        } else if (consumo <= 20) {
            // R$ 8,75 por m³
            valorConta = consumo * 8.75;
        } else if (consumo <= 50) {
            // R$ 16,76 por m³
            valorConta = consumo * 16.76;
        } else {
            // Acima de 50m³: R$ 17,46 por m³
            valorConta = consumo * 17.46;
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Tipo de Imóvel: Comercial/Industrial%n");
        System.out.printf("Consumo: %.2f m³%n", consumo);
        System.out.printf("Valor Total a Pagar: R$ %.2f%n", valorConta);
        System.out.println("-------------------------------------------");

        leitor.close();
    }
}