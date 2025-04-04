package com.diego.projeto.consulta_fipe.principal;

import com.diego.projeto.consulta_fipe.model.Dados;
import com.diego.projeto.consulta_fipe.model.DadosModelo;
import com.diego.projeto.consulta_fipe.model.DadosVeiculo;
import com.diego.projeto.consulta_fipe.service.ConsumoApi;
import com.diego.projeto.consulta_fipe.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private ConsumoApi consumo = new ConsumoApi();

    private ConverteDados conversor = new ConverteDados();

    private String tipoVeiculo;

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    private String endereco = URL_BASE;

    String json;

    public void exibemenu() {
        System.out.println("\nSISTEMA DE PESQUISA POR TABELA FIPE");
        System.out.println("\nSelecione uma opção para pesquisar:");
        System.out.println("    Carro");
        System.out.println("    Caminhao");
        System.out.println("    Moto");

        String opcao = leitura.nextLine();


        if (opcao.toLowerCase().contains("car")) {

            tipoVeiculo = "carros";
        } else if (opcao.toLowerCase().contains("cam")) {
            tipoVeiculo = "caminhoes";
        } else if (opcao.toLowerCase().contains("mot")) {
            tipoVeiculo = "motos";
        } else {
            System.out.println("\nOpção inválida");
        }


        endereco = endereco + tipoVeiculo + "/marcas";
        json = consumo.obterDados(endereco);
        List<Dados> dadosMarcas = conversor.obterLista(json, Dados.class);

        System.out.println("MARCAS DE CARRO");
        System.out.println("---------------");
        dadosMarcas.stream()
                .sorted(Comparator.comparing(d -> Integer.parseInt(d.codigo())))
                .forEach(m -> System.out.println(m.nome()));

        System.out.println("\nDigite o nome da marca desejada");

        var marca = leitura.nextLine();

        String codigoMarca = null;

        Optional<Dados> marcaEncontrada = dadosMarcas.stream()
                .filter(d -> d.nome().equalsIgnoreCase(marca))
                .findFirst();

        if (marcaEncontrada.isPresent()) {
            codigoMarca = marcaEncontrada.get().codigo();
//            System.out.println("Código da marca selecionada: " + codigoMarca);
        } else {
            System.out.println("Marca não encontrada.");
        }


        endereco = endereco + "/" + codigoMarca + "/modelos";
        json = consumo.obterDados(endereco);

        DadosModelo dadosModelos = conversor.obterDados(json, DadosModelo.class);

        System.out.println("MODELOS DA MARCA: ");
        System.out.println("---------------");
        dadosModelos.modelos().stream()
                .sorted(Comparator.comparing(d -> Integer.parseInt(d.codigo())))
                .forEach(m -> System.out.println(m.nome()));


        System.out.println("\nDigite um trecho do nome do carro a ser buscado");
        var nomeVeiculo = leitura.nextLine();

        List<Dados> modelosFiltrados = dadosModelos.modelos().stream()
                .filter(m -> m.nome().toUpperCase().contains(nomeVeiculo.toUpperCase()))
                .collect(Collectors.toList());

        modelosFiltrados.stream()
                .sorted(Comparator.comparing(d -> Integer.parseInt(d.codigo())))
                .forEach(m -> System.out.println(m.codigo() + "-" + m.nome()));

        System.out.println("\nDigite o código do modelo");
        var codigoModelo = leitura.nextLine();
        endereco = endereco + "/" + codigoModelo + "/anos";
        json = consumo.obterDados(endereco);

        List<Dados> anos = conversor.obterLista(json, Dados.class);

        List<DadosVeiculo> veiculos = new ArrayList<>();

        for (int i = 0; i < anos.size(); i++) {
            var enderecoAnos = endereco + "/" + anos.get(i).codigo();
            json = consumo.obterDados(enderecoAnos);
            DadosVeiculo veiculo = conversor.obterDados(json, DadosVeiculo.class);
            veiculos.add(veiculo);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("\nTodos os veiculos filtrados com avaliacoes por ano:");
        System.out.println("----------------------------------------------------------");
        veiculos.forEach(v -> System.out.println(
                        "Marca:       | " + v.marca() +
                        "\nModelo:      | " + v.modelo() +
                        "\nAno:         | " + v.anoModelo() +
                        "\nCombustível: | " + v.combustivel() +
                        "\nValor:       | " + v.valor() +
                        "\n----------------------------------------------------------"
        ));
    }

}
