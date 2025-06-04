public class Relatorio implements Imprimivel {
    String titulo;
    String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.printf("Titulo: %s\n", titulo);
        System.out.printf("Conteúdo: %s\n", conteudo);
    }
}
