
public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, double saldo) {
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
