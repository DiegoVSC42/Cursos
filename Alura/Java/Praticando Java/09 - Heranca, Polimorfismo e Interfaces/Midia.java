public class Midia {
    String titulo;
    int anoDePublicacao;
    String codigo;

    public Midia(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.codigo = gerarCodigo();
    }

    private String gerarCodigo(){
        return "LIB-" + titulo.substring(0,3).toUpperCase() +anoDePublicacao;
    }

    public void exibirInfo(){
        System.out.printf("Código: %s | Titulo: %s | Ano: %d\n", codigo, titulo, anoDePublicacao);
    }
}
