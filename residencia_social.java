import java.util.Scanner;

public class residencia_social {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o consumo de água em m³: ");
        double consumo = leitor.nextDouble();
        double valorConta;

        // Lógica de cálculo baseada nas faixas informadas
        if (consumo <= 10) {
            valorConta = 7.59;
        } else if (consumo <= 20) {
            valorConta = consumo * 1.31;
        } else if (consumo <= 30) {
            valorConta = consumo * 4.64;
        } else if (consumo <= 50) {
            valorConta = consumo * 6.62;
        } else {
            valorConta = consumo * 7.31;
        }

        System.out.printf("O valor da conta para um consumo de %.2f m³ é: R$ %.2f%n", consumo, valorConta);

        leitor.close();
    }
}
