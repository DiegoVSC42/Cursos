import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("################################################");
        System.out.println("CADASTRANDO VEICULOS");
        Carro gol = new Carro("Gol","ABC-1234",2020);
        gol.exibirInformacoees();

        System.out.println("################################################");
        System.out.println("AGENDA DE CONTATOS");
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João Silva", "(11) 99999-0000"));
        contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        for(int i = 0; i < contatos.size(); i++){
            System.out.printf("%d. %s - %s\n", i,contatos.get(i).getNome(),contatos.get(i).getTelefone());
        }


        System.out.println("################################################");
        System.out.println("CADASTRO DE PRODUTOS COM VALIDACAO");
        Produto produto = new Produto("Mouse");
        produto.setPreco(-59.9);
        produto.mostrarInformacoes();
        System.out.println("################################################");

        System.out.println("CONTROLE DE SENHA");
        Usuario user = new Usuario("123456");
        user.setSenha("123456","abc123");
        user.setSenha("123456","abc123");
        System.out.println("################################################");

        System.out.println("CONTROLE DO NIVEL DE BATERIA");
        Bateria bateria = new Bateria();
        bateria.setNivel(85);
        bateria.exibeStatus();
        System.out.println("################################################");

        System.out.println("CONTROLE DE SALDO BANCÁRIO");
        Conta conta = new Conta("Ana");
        conta.depositar(1000.00);
        conta.sacar(1200.00);
        conta.exibirSaldo();

        conta = new Conta("Ana");
        conta.depositar(1000.00);
        conta.sacar(200.00);
        conta.exibirSaldo();

        System.out.println("################################################");

        System.out.println("AVALIAÇÃO DE FILMES");
        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);
        matrix.calcularEMostrarMedia();
        System.out.println("################################################");
//
//        System.out.println("VALIDACAO DE LOGIN");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Login: ");
//        String login = sc.nextLine();
//        System.out.print("Senha: ");
//        String senha = sc.nextLine();
//
//        Estudante estudante = new Estudante(login,senha);
//
//        List<String> tentativas = new ArrayList<>();
//        for(int i = 0 ; i < 3 ; i++){
//            System.out.print("Digite a senha: ");
//            senha = sc.nextLine();
//            if(!estudante.validarSenha(senha)){
//                System.out.printf("Senha incorreta. Tentativas restantes: %d",3-i);
//            }
//                tentativas.add(senha);
//        }
//        System.out.println("Tentativas: " + tentativas);
        System.out.println("################################################");
        System.out.println("SISTEMAS DE PONTOS PARA ALUNOS");
        Aluno aluno = new Aluno("Fernanda");

        aluno.ganharPontos(300);
        aluno.exibirStatus();

        System.out.println("################################################");
        System.out.println("REGISTRO DE NOTAS");
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);
        matematica.mostrarNotasValidasEMedia();
        System.out.println("################################################");
    }
}
