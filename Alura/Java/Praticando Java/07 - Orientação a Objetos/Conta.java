public class Conta {
    double saldo;

    public void exibirSaldo() {
        System.out.printf("Saldo Atual: R$ %.2f\n" , saldo);
    }
    public void zerarSaldo() {
        saldo = 0;
    }
}
