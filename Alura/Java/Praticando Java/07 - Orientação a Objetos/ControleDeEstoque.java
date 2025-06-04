public class ControleDeEstoque {
    public static void main(String[] args) {
        Item item = new Item();
        item.nome = "Camiseta";
        item.quantidade = 10;

        System.out.println(item.vender(3));
        System.out.println(item.vender(8));
    }
}
