public class Email extends Notificacao{
    private String assunto;
    public Email(String destinatario, String mensagem,String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    void enviar() {
        System.out.printf("Enviando email para: %s\n", destinatario);
        System.out.printf("Assunto: %s\n", assunto);
        System.out.printf("Corpo: %s\n",mensagem);
    }
}
