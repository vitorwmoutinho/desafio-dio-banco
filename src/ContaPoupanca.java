
import javax.annotation.processing.SupportedOptions;

public class ContaPoupanca  extends Conta{
    
    public void imprimirExtrato(){
        System.out.println("Conta Poupanca");
        System.out.println("saldo: " + this.saldo);
    }

}
