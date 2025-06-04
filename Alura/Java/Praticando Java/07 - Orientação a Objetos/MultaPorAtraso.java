public class MultaPorAtraso {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.titulo = "Dom Casmurro";
        pedido.diasAtraso = 3;

        pedido.exibirDetalhes();
    }
}
