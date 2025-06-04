import java.util.Scanner;

public class VerificacaoDeDescontoEmCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        if(valor > 100){
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: " + (valor - (valor*0.10)));
        }else{
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valor);
        }
    }
}
