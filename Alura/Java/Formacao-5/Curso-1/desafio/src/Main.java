import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.println("Digite o limite do cartão");
        var limite = sc.nextDouble();
        sc.nextLine();

        while (cont) {
            Produto produto = new Produto();

            System.out.println("Digite a descriçao da compra:");
            produto.descricao = sc.nextLine();

            System.out.println("Digite o valor da compra:");
            var valor = sc.nextDouble();
            sc.nextLine();

            produto.valor = valor;

            if (limite >= valor) {
                produtos.add(produto);
                limite = limite - valor;
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
                menuItens(produtos);
                System.out.println("Limite restante: " + limite);
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            if (sc.nextInt() == 0) {
                cont = false;
                menuItens(produtos);
                System.out.println("Limite restante: " + limite);
            }
            sc.nextLine();
        }


    }

    public static void menuItens(List<Produto> produtos) {

        System.out.println("*****************************");
        System.out.println("COMPRAS REALIZADAS: ");
        Collections.sort(produtos);
        for (Produto mostraProduto : produtos) {
            System.out.println(mostraProduto.descricao + " - " + mostraProduto.valor);
        }
        System.out.println("*****************************");

    }
}