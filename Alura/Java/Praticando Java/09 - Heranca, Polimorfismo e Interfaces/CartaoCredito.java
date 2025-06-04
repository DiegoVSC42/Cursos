public class CartaoCredito extends Pagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    void confirmarPagamento() {
        double taxa = calcularTaxa();
        System.out.printf("Pagamento de R$ %.2f confirmado no Cartão de Crédito (Taxa: R$ %.2f)\n",valor,taxa);
    }

    @Override
    public double calcularTaxa(){
        return valor * 0.03;
    }
}
