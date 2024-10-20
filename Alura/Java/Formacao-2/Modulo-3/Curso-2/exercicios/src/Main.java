import java.io.FileWriter;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String retornoApi;
        String moeda;
        String busca = "42";
        BuscasApis chamadaApi = new BuscasApis();

        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("Digite um processo que deseja fazer");
            System.out.println("1 - Buscar Livros");
            System.out.println("2 - Cotar Criptomoedas");
            System.out.println("3 - Encontrar Receitas");
            System.out.println("4 - Converter JSON");
            System.out.println("5 - Converter JSON aninhado");
            System.out.println("6 - Fazer divisão de 2 numeros");
            System.out.println("7 - Teste de validação de senha");
            System.out.println("8 - Buscar informacoes de usuário do GitHub");
            System.out.println("9 - Criar arquivo com linha de texto digitado");
            System.out.println("10 - Imprimir json");
            System.out.println("0 - Sair");
            busca = leitura.nextLine();
            switch (busca) {
                case "0":
                    System.out.println("Terminando Aplicação");
                    break;
                case "1":
                    System.out.println("Digite um livro para busca: ");
                    busca = leitura.nextLine();
                    retornoApi = chamadaApi.googleBooks(busca);
                    System.out.println(retornoApi);
                    break;
                case "2":
                    System.out.println("Digite uma criptomoeda para busca: ");
                    busca = leitura.nextLine();
                    System.out.println("Digite o tipo de moeda desejada para busca: ");
                    moeda = leitura.nextLine();
                    retornoApi = chamadaApi.coinGecko(busca, moeda);
                    System.out.println(retornoApi);
                    break;
                case "3":
                    System.out.println("Digite uma receita para busca: ");
                    busca = leitura.nextLine();
                    retornoApi = chamadaApi.theMealDB(busca);
                    System.out.println(retornoApi);
                    break;

                case "4":
                    ConverterJson cj = new ConverterJson();
                    System.out.println(cj.convert());
                    break;
                case "5":
                    ConversaoJsonAninhadoParaObjeto cj2 = new ConversaoJsonAninhadoParaObjeto();
                    cj2.converter();
                    break;
                case "6":
                    System.out.println("Digite o valor do primeiro número");
                    int a = leitura.nextInt();
                    leitura.nextLine();
                    System.out.println("Digite o valor do segundo numero");
                    int b = leitura.nextInt();
                    leitura.nextLine();
                    DesafioTryCatch dtc = new DesafioTryCatch();

                    try {
                        int resultado = dtc.dividir(a, b);
                        System.out.println("Resultado: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: Divisão por zero detectada");
                    }
                    break;
                case "7":
                    System.out.println("Digite uma senha: ");
                    busca = leitura.nextLine();
                    try {
                        if (busca.length() < 8) {
                            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
                        }
                        System.out.println("Senha Válida, acesso permitido!");
                    } catch (SenhaInvalidaException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case "8":
                    System.out.println("Digite um nome de usuário: ");
                    busca = leitura.nextLine();
                    try {
                        HttpResponse<String> respostaGitHub = chamadaApi.github(busca);
                        if (respostaGitHub.statusCode() == 404) {
                            throw new ErroConsultaGitHubException("Usuário não encontrado");
                        }
                        System.out.println(respostaGitHub.body());

                    }catch (ErroConsultaGitHubException e){
                        System.out.println("Erro: "+ e.getMessage());
                    }
                case "9":
                    FileWriter arquivo = new FileWriter("arquivo.txt");
                    System.out.println("Digite o texto que deseja colocar no arquivo: ");
                    busca = leitura.nextLine();
                    arquivo.write(busca);
                    arquivo.close();
                    break;
                case "10":
                    Titulo titulo = new Titulo();
                    String retornoTitulo = titulo.retornajson();
                    System.out.println(retornoTitulo);
            }

        } while (!Objects.equals(busca, "0"));
    }
}
