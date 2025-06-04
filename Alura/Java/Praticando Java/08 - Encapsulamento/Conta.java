public class Conta {
     String titular;
     double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }
    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
        }
    }
    public void sacar(double valor) {
        if(valor > saldo){
            System.out.println("Saldo insuficiente para saque");
        }else{
            saldo -= valor;
        }
    }

    public void exibirSaldo(){
        System.out.printf("Saldo atual de %s: %.2f\n", titular, saldo);
    }
}
