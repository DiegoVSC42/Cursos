public class CarrinhoDeCompras {
    public static void main(String[] args) {
        Produto i1 = new Produto();
        Produto i2 = new Produto();

        i1.nome = "Teclado";
        i1.preco = 120.0;
        i1.quantidade = 1;

        i2.nome = "Mouse";
        i2.preco = 60.0;
        i2.quantidade = 2;
        double totalI1 = i1.valorTotal();
        double totalI2 = i2.valorTotal();
        System.out.printf("Total da compra R$ %.2f", totalI1 + totalI2);
    }
}
