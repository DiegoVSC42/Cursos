import java.util.Scanner;

public class ComparandoDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("O maior número é: " + (num1 > num2 ? num1 : num2));
    }
}
