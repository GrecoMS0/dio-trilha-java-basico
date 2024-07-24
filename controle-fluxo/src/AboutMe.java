import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Nome");
            String nome = scanner.next();

            System.out.println("Sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Idade");
            int idade = scanner.nextInt();

            System.out.println("Altura");
            double altura = scanner.nextDouble();

            System.out.println("Nome: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Altura: " + altura + "cm");

            scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos 'Idade' e 'Altura' devem ser numéricos!");
        }
    }
}