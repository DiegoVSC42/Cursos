import java.util.Scanner;

public class FormatandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();
        System.out.println("Valor formatado: " + String.format("R$ %.2f", valor));
    }
}
