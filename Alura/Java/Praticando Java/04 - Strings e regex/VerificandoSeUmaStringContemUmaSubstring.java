import java.util.Scanner;

public class VerificandoSeUmaStringContemUmaSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String nome = sc.nextLine();
        System.out.print("Digite a palavra: ");
        String palavra = sc.nextLine();
        System.out.println("A palavra " + '"'+ palavra +'"'+ (nome.contains(palavra) ? " está presente no texto." : " não está presente no texto."));
    }
}
