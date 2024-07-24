import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Tel Tocando");
        } while(tocando());
            System.out.println("Atendeu");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? ---- " + (atendeu ? "Sim" : "Não"));
        //negando ato de continuar tocando
        return ! atendeu;
    }
}
