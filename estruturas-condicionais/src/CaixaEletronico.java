public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 26;
        double saque = 6;

        if(saque < saldo)
            saldo = saldo - saque;

            System.err.println(saldo);
    }
}
