public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            System.out.println("Preço inválido");
            this.preco = 0;
        }else
            this.preco = preco;
    }

    public void mostrarInformacoes(){
        System.out.printf("Produto: %s\n",nome);
        System.out.printf("Preço: %.2f\n",preco);

    }
}
