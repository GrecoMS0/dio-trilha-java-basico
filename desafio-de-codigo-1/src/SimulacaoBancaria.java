import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Valor a ser depositado");
                    float valorDeposito = scanner.nextFloat();
                    saldo += valorDeposito;
                    System.out.println("Valor Depositado: R$ " + String.format("%.1f", valorDeposito));
                    break;
                case 2:
                    System.out.println("Valor a ser sacado");

                    float valorSaque = scanner.nextFloat();

                    if(valorSaque > saldo) {
                        System.out.println("Saldo insuficiente para o saque solicitado!");
                        System.out.println("Saldo Atual: R$ " + String.format("%.1f", saldo));
                        System.out.println("Valor do Saque solicitado: R$ " + String.format("%.1f", valorSaque));
                    }
                    else {
                        saldo -= valorSaque;
                        System.out.println("Saldo Atual: R$ " + String.format("%.1f", saldo));
                        System.out.println("Valor do Saque solicitado: R$ " + String.format("%.1f", valorSaque));
                    }
                    break;
                case 3:
                    System.out.println("Saldo Atual: R$ " + String.format("%.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("Novo Saldo após operação: R$ " + saldo);
        }
        scanner.close();
    }
}
