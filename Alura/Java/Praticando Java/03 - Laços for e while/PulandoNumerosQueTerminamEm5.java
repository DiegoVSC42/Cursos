import java.util.Scanner;

public class PulandoNumerosQueTerminamEm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        for(int i = 1 ; i <= numero ; i++){
            if(i % 10 == 5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
