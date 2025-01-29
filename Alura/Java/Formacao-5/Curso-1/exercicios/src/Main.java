import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Diego", 14);
        Pessoa p2 = new Pessoa("Diego", 15);
        Pessoa p3 = new Pessoa("Diego", 16);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));

        System.out.println(listaDePessoas);

        Produto produto1 = new Produto("produto 1", 1.0, 1);
        Produto produto2 = new Produto("produto 2", 2.0, 2);
        Produto produto3 = new Produto("produto 2", 3.0, 2);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println(produtos.size());

        System.out.println(produtos);

        ProdutoPerecivel pp = new ProdutoPerecivel("produto 4", 4.0, 4, LocalDateTime.now());
        System.out.println(pp);

        ArrayList<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("palavra 1");
        listaDeStrings.add("palavra 2");
        listaDeStrings.forEach(System.out::println);

        Animal animal = new Cachorro();
        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("O objeto é um cachorro");
        }else{
            System.out.println("O objeto nao é um cachorro");
        }
        double precoMedio;
        precoMedio = 0;
        for(Produto produto: produtos){
          precoMedio =  precoMedio + produto.getPreco();
        }
        precoMedio = precoMedio / produtos.size();
        System.out.println(precoMedio);

        ArrayList<Forma> formas = new ArrayList<>();
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 2;
        Circulo circulo = new Circulo();
        circulo.raio = 2;

        formas.add(quadrado);
        formas.add(circulo);

        for(Forma forma: formas){
            System.out.println(forma.calcularArea());
        }

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroDaConta = 1;
        conta1.saldo = 0;
        contas.add(conta1);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numeroDaConta = 2;
        conta2.saldo = 200;
        contas.add(conta2);
        double menorSaldo = Double.MAX_VALUE;
        for(ContaBancaria conta: contas){
            if(menorSaldo > conta.saldo){
                menorSaldo = conta.saldo;
            }
        }
        System.out.println(menorSaldo);
    }
}