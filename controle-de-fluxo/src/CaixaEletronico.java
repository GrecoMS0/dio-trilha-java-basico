public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        System.out.println("Saldo: " + saldo);
        System.out.println("Valor Solicitado: " + valorSolicitado);

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo: " + saldo);
        }
        else {
            System.out.println("Valor excede saldo atual");
        }        
    }
}
