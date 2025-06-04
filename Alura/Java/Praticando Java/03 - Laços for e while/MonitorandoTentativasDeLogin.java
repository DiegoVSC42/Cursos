import java.util.Scanner;

public class MonitorandoTentativasDeLogin {
    public static void main(String[] args) {
        String senhaCorreta = "1234";
        String senha = "";
        Scanner sc = new Scanner(System.in);
        int tentativas = 3;
        while(tentativas > 0){
            System.out.print("Digite sua senha: ");
            senha = sc.nextLine();
            tentativas--;
            if(senha.equals(senhaCorreta)){
                System.out.println("Senha correta! Acesso concedido");
                break;
            }else{
                System.out.println("Senha incorreta. Você tem " + tentativas + " tentativas restantes");
            }
        }
        if(!senhaCorreta.equals(senha)){
            System.out.println("Conta bloqueada temporariamente.");
        }
    }
}
