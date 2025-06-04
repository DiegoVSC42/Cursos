import java.util.Scanner;

public class ContagemDeDegraus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus: ");
        int degraus = sc.nextInt();
        for(int i = 1 ; i <= degraus ; i++){
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Voce chegou ao topo!");
    }
}
