public class Revista extends Midia {
    int edicao;

    public Revista(String titulo, int anoDePublicacao,int edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Revista: %s | Edicao: %d\n", codigo, titulo, edicao);
    }
}
