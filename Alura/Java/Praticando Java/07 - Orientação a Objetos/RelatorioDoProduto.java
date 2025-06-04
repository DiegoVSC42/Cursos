public class RelatorioDoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mouse gamer";
        produto.preco = 159.9;
        produto.quantidade = 25;

        produto.mostrarInformacoes();
    }
}
