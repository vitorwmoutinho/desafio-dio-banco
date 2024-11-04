
public abstract class Conta implements iConta {
    protected static final int AgenciaPadrao = 1; // Ajustado para um valor inteiro
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = agencia; // Usar o parâmetro passado
        this.numero = SEQUENCIAL++;
        this.saldo = saldo; // Inicializar saldo
        this.cliente = cliente;
    }

    public Conta(int agencia2, double saldo2) {
        //TODO Auto-generated constructor stub
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() { // Correção no nome do método
        return saldo;
    }

    public abstract void imprimirExtrato(); // Método abstrato para ser implementado nas subclasses
}
