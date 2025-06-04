import java.util.Scanner;

public class PedindoUmNomeValido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        String nome = "";
        while(!valido) {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
            if(nome.length() >= 3){
                valido = true;
            }else{
                System.out.println("Nome inválido. Digite novamente.");
            }
        }
        System.out.println("Nome " + '"' + nome + '"' + " cadastrado com sucesso!" );
    }
}
