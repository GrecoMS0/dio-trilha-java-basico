import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double saldo = 50;
        int quantidade = 0;

        while(saldo > 0) {
            Double valor = valorAleatorio();
            if(valor > saldo) {
                valor = saldo;
            }
            System.out.println("Valor gasto: " + valor + " adicionado");
            saldo = saldo - valor;
            quantidade ++;
        }

        System.out.println("Saldo: " + saldo);
        System.out.println("Quantidade adicionada: " + quantidade);
        System.out.println("Todo o saldo foi gasto");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
