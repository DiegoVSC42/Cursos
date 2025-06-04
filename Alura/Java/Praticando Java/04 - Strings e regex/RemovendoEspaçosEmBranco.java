import java.util.Scanner;

public class RemovendoEspaçosEmBranco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        nome = nome.trim();
        System.out.println("Nome sem espaços: " + nome);
    }
}
