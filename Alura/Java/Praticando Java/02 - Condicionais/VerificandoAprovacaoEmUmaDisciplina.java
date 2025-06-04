public class VerificandoAprovacaoEmUmaDisciplina {
    public static void main(String[] args) {
        float media = 5.2f;
        String status;
        if(media >= 7.0f){
            status = "foi aprovado";
        } else if (media > 5.0f && media < 6.9) {
            status = "está de recuperação";
        }else{
            status = "foi reprovado";
        }
        System.out.println("O estudante teve média " + media + " e " + status);
    }
}
