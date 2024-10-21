public class Main {

    public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    

    Conta cp = new ContaPoupanca();
    

    cc.depositar(107.30);
    cc.transferir(50.30, cp);
    cc.imprimirExtrato();
    cp.imprimirExtrato();
    cp.imprimirExtrato();

}
}
