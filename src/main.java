public class Main {
    public static void main(String[] args) {
        // Criar instâncias de ContaCorrente e ContaPoupanca com dados apropriados
        ContaCorrente cc = new ContaCorrente(1, 500.00); // Exemplo de inicialização
        ContaPoupanca poupanca = new ContaPoupanca(1, 1000.00); // Exemplo de inicialização

        // Exibir extrato da conta corrente
        cc.imprimirExtrato();

        // Exibir extrato da conta poupança
        poupanca.imprimirExtrato();
    }
}
