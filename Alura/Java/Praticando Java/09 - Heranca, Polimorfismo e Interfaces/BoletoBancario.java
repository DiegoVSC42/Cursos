public class BoletoBancario extends Pagamento{

    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    void confirmarPagamento() {
        double taxa = calcularTaxa();
        System.out.printf("Boleto de R$ %.2f gerado com sucesso (Taxa: R$ %.2f)\n", valor,taxa);
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.01;
    }
}
