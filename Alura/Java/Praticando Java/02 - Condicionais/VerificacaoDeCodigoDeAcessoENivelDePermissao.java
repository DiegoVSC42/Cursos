import java.util.Scanner;

public class VerificacaoDeCodigoDeAcessoENivelDePermissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código de acesso: ");
        int codigoAcesso = sc.nextInt();
        System.out.print("Digite o nível de permissão: ");
        int permissao = sc.nextInt();

        if(codigoAcesso == 2023 && (permissao == 1 || permissao == 2 || permissao == 3)) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        }else{
            System.out.println("Acesso negado.");
        }
    }
}
