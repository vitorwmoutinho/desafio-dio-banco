

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    public ContaPoupanca(int agencia, double saldo) {
        super(agencia, saldo); // Chama o construtor da classe pai
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("==================================");
    }
}