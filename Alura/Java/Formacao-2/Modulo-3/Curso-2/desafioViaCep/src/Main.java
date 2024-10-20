import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        String cep;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CEP: ");
        cep = sc.nextLine();
        comunicacaoAPI comunicacao = new comunicacaoAPI();
        HttpResponse<String> busca;

        try {
            busca = comunicacao.buscaEndereco(cep);
            if(400 == busca.statusCode()){
                System.out.println("Verifique o endereço");
            }

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Endereco endereco;
            endereco = gson.fromJson(busca.body(), Endereco.class);


            FileWriter arquivo = new FileWriter(endereco.cep() +".json");
            arquivo.write(gson.toJson(endereco));
            arquivo.close();
            System.out.println("-------------------------------------");
            System.out.println("Informacoes solicitadas: ");
            System.out.println("CEP:        " + endereco.cep());
            System.out.println("Logradouro: " + endereco.logradouro());
            System.out.println("Bairro:     " + endereco.bairro());
            System.out.println("Localidade: " + endereco.localidade());
            System.out.println("UF:         " + endereco.uf());
            System.out.println("Arquivo criado com sucesso!");

        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }



    }
}