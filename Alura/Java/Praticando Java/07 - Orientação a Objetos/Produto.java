public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void mostrarInformacoes(){
        System.out.printf("Produto: %s\n", nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("Quantidade em estoque: %s\n", quantidade);
    }
    public double valorTotal(){
        return preco * quantidade;
    }
}
