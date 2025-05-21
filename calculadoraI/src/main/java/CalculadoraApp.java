import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

        try {
            do {
                System.out.println("Digite o valor um: ");
                valorUm = scanner.nextDouble();

                System.out.println("Digite a operação( +, -, /, *): ");
                operacao = scanner.next();

                System.out.println("Digite o valor dois: ");
                valorDois = scanner.nextDouble();

                System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operacao));

                continuar = verificarNovaOperacao();
            } while (continuar);
        } catch (InputMismatchException ex) {
            System.out.println("Os valores para calculo devem ser numéricos =)");
        }
    }
}