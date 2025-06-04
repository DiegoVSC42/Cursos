public class Ebook extends Midia{
    String formato;

    public Ebook(String titulo, int anoDePublicacao,String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Ebook: %s | Formato: %s\n", codigo, titulo, formato);
    }
}
