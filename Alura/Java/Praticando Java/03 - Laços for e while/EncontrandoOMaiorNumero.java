import java.util.Scanner;

public class EncontrandoOMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os números separados por espaço: ");
        String[] numerosStr = sc.nextLine().split(" ");
        int max = 0;
        for(String valor : numerosStr) {
            max = Integer.parseInt(valor) > max ? Integer.parseInt(valor) : max;
        }
        System.out.println("O maior número é: " + max);

    }
}
