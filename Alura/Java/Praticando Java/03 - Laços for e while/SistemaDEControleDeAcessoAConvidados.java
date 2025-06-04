import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDEControleDeAcessoAConvidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cadastrados = new ArrayList<String>();
        //Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):
        String valor = "";
        while(!valor.equals("sair")){
            System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            valor = sc.nextLine();
            if(valor.equals("ver")){
                System.out.println("Lista atualizada de convidados:" + cadastrados);
                continue;
            }
            boolean jaExiste = false;
            for (String convidado : cadastrados) {
                if (convidado.toLowerCase().equals(valor.toLowerCase())) {
                    jaExiste = true;
                    break;
                }
            }
            if (jaExiste) {
                System.out.println("O nome " + valor + " já está na lista de convidados.");
            }else{
                cadastrados.add(valor);
                System.out.println(valor + " foi adicionado à lista de convidados.");
            }

        }
    }
}
