import java.util.Scanner;

public class CalculadoraDeFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        long numero = sc.nextLong();
        long resultado = 1;
        for(long i = numero; i > 0 ; i--){
            resultado *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
}
