public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }
   
    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);     
    }

    public void depositar(double valor) {
        this.saldo += valor;
    } 

    protected void extratoConta() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    protected abstract void imprimirExtrato();

}
