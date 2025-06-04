import java.util.Scanner;

public class ConvertendoParaMaiusculaseMinusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String nome = sc.nextLine();
        System.out.println("Texto em maiusculas: " + nome.toUpperCase());
        System.out.println("Texto em minusculas: " + nome.toLowerCase());
    }
}
