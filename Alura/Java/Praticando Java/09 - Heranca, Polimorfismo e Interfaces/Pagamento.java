public class Pagamento {
    double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    void confirmarPagamento(){
        System.out.printf("Pagamento de R$%.2f confirmado\n",
                valor, calcularTaxa());
    }

    public double calcularTaxa() {
        return valor * 0.0;
    }
}
