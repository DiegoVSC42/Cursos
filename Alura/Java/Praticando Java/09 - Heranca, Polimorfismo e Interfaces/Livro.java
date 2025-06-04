public class Livro extends  Midia {
    String autor;

    public Livro(String titulo, int anoDePublicacao,String autor) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Livro: %s | Autor: %s\n", codigo, titulo, autor);
    }
}
