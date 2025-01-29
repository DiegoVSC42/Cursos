public class Produto implements Comparable<Produto> {
    String descricao;
    Double valor;

    @Override
    public int compareTo(Produto o) {
        return this.valor.compareTo(o.valor);
    }
}
