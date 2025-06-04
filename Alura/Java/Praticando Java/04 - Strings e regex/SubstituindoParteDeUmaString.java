import java.util.Scanner;

public class SubstituindoParteDeUmaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String nome = sc.nextLine();
        System.out.print("Digite a palavra a ser substituida: ");
        String palavra = sc.nextLine();
        System.out.print("Digite a nova palavra: ");
        String novaPalavra = sc.nextLine();
        System.out.println("Texto modificado: " + nome.replace(palavra,novaPalavra));
    }
}
