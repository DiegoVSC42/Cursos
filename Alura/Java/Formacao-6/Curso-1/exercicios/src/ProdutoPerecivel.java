import java.time.LocalDateTime;

public class ProdutoPerecivel extends Produto{
    private LocalDateTime dataValidade;

    public ProdutoPerecivel(String nome, Double preco, Integer quantidade, LocalDateTime dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }


}
