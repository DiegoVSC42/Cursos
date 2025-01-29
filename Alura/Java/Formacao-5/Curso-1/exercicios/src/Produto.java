public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade ) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Double getPreco() {
        return preco;
    }
}
