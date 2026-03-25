import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu peso (kg): ");
        double peso = leitor.nextDouble();

        System.out.print("Digite a sua altura (m): ");
        double altura = leitor.nextDouble();

        // Cálculo do IMC: peso / (altura * altura)
        double valorImc = peso / Math.pow(altura, 2);
        String classificacao = "";

        // Estrutura de decisão para a classificação
        if (valorImc < 16) {
            classificacao = "Magreza grave";
        } else if (valorImc < 17) {
            classificacao = "Magreza moderada";
        } else if (valorImc < 18.5) {
            classificacao = "Magreza leve";
        } else if (valorImc < 25) {
            classificacao = "Saudável";
        } else if (valorImc < 30) {
            classificacao = "Sobrepeso";
        } else if (valorImc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (valorImc < 40) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        System.out.println("---------------------------------------");
        System.out.printf("Seu IMC é: %.2f%n", valorImc);
        System.out.println("Classificação: " + classificacao);
        System.out.println("---------------------------------------");

        leitor.close();
    }
}