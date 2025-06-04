import java.util.Scanner;

public class VerificandoSeUmNumeroEstaEmUmIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do empréstimo: ");
        double valor = sc.nextDouble();
        if(valor > 1000 && valor < 5000){
            System.out.println("O valor "+ valor +", está dentro do intervalo permitido para empréstimo. ");
        }else{
            System.out.println("O valor "+ valor +", não está dentro do intervalo permitido para empréstimo. ");
        }
    }
}
