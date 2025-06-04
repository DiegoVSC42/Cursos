import java.util.Scanner;

public class ExtraindoParteDeUmaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String nome = sc.nextLine();
        System.out.println("Nome do arquivo sem extensão: " + nome.substring(0, nome.lastIndexOf(".")));
    }
}
