import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String tentativaSenha = scanner.nextLine();
        scanner.close();

        if(tentativaSenha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Acesso negado!");
        }
    }
}
