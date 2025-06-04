public class Push extends Notificacao{
    String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    void enviar() {
        System.out.printf("Enviando Push para: %s\n",destinatario);
        System.out.printf("Titulo: %s\n",titulo);
        System.out.printf("Conteúdo: %s\n",mensagem);

    }
}
