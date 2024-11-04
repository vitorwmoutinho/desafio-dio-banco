public abstract class Conta implements iConta {

    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(double valor){

    }

    public void depositar(double valor){
        
    }

    public void transferir(double valor, Conta contaDestino){
        
    }
    

    

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(){

    }

    public void depositar(){
        
    }

    public void transferir(){
        
    }


}
