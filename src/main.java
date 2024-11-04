public class Main {
    public static void main(String[] args) {
        Cliente vitor = new Cliente();
        String nome = "Vitor";
        vitor.setNome(nome);



        // Criar instâncias de ContaCorrente e ContaPoupanca com dados apropriados
        ContaCorrente cc = new ContaCorrente(1, 500.00); // Exemplo de inicialização
        ContaPoupanca poupanca = new ContaPoupanca(1, 1000.00); // Exemplo de inicialização

        

        cc.transferir(500.00, poupanca);

        // Exibir extrato da conta corrente
        cc.imprimirExtrato();

        // Exibir extrato da conta poupança
        poupanca.imprimirExtrato();
    }
}
