import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // Verificar se a idade do cliente
        // Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
        // Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta bancaria."

        if(idade >= 18) {
            System.out.println("Você está elegível para criar uma conta bancária.");
        }
        else {
            System.out.println("Você não está elegível para criar uma conta bancária.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}