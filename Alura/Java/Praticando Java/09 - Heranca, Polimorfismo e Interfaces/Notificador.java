public class Notificador {

    void enviarMensagem(String mensagem){
        System.out.printf("Mensagem enviada para todos: %s\n",mensagem);
    };
    void enviarMensagem(String destinatario, String mensagem){
        System.out.printf("Mensagem enviada para %s: %s\n",destinatario,mensagem);
    }
    void enviarMensagem(String destinatario, String mensagem,int quantidade){
        for(int i = 0 ; i < quantidade ; i++){
            System.out.printf("Mensagem enviada para %s: %s\n",destinatario,mensagem);
        }
    }
}
