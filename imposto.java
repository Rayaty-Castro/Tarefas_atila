import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do salário bruto (R$): ");
        double salarioBruto = leitor.nextDouble();

        // 1. Cálculo do INSS (Tabela Progressiva 2023)
        double inss = 0;
        if (salarioBruto <= 1320.00) {
            inss = salarioBruto * 0.075;
        } else if (salarioBruto <= 2571.29) {
            inss = (salarioBruto * 0.09) - 19.80;
        } else if (salarioBruto <= 3856.94) {
            inss = (salarioBruto * 0.12) - 96.94;
        } else if (salarioBruto <= 7507.49) {
            inss = (salarioBruto * 0.14) - 174.08;
        } else {
            inss = 877.24; // Teto do INSS em 2023
        }

        // 2. Base de cálculo para o IRRF
        double baseIrrf = salarioBruto - inss;
        double irrf = 0;

        // 3. Cálculo do IRRF (Tabela após Maio/2023)
        if (baseIrrf <= 2112.00) {
            irrf = 0;
        } else if (baseIrrf <= 2826.65) {
            irrf = (baseIrrf * 0.075) - 158.40;
        } else if (baseIrrf <= 3751.05) {
            irrf = (baseIrrf * 0.15) - 370.40;
        } else if (baseIrrf <= 4664.68) {
            irrf = (baseIrrf * 0.225) - 651.73;
        } else {
            irrf = (baseIrrf * 0.275) - 884.96;
        }

        double salarioLiquido = salarioBruto - inss - irrf;

        System.out.println("\n======= RECIBO DE PAGAMENTO (REF. 2023) =======");
        System.out.printf("Salário Bruto    : R$ %10.2f%n", salarioBruto);
        System.out.printf("(-) Desc. INSS   : R$ %10.2f%n", inss);
        System.out.printf("(-) Desc. IRRF   : R$ %10.2f%n", irrf);
        System.out.println("-----------------------------------------------");
        System.out.printf("SALÁRIO LÍQUIDO  : R$ %10.2f%n", salarioLiquido);
        System.out.println("===============================================");

        leitor.close();
    }
}