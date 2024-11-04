
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    
    // Construtor da ContaCorrente
    public ContaCorrente(int agencia, double saldo) {
        super(agencia, saldo); // Chama o construtor da superclasse (Conta)
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) { // Verifica se há saldo suficiente
            saldo -= valor; // Decrementa o saldo
            
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente");
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
