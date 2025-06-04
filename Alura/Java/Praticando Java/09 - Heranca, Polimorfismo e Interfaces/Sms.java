public class Sms extends Notificacao{

    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    void enviar() {
        System.out.printf("Enviando SMS para: %s\n", destinatario);
        System.out.printf("Mensagem: %s\n", mensagem);
    }
}
