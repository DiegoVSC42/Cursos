package diego.desafio.musicchallenge.principal;

import diego.desafio.musicchallenge.model.Artista;
import diego.desafio.musicchallenge.model.Musica;
import diego.desafio.musicchallenge.model.TipoArtista;
import diego.desafio.musicchallenge.repository.ArtistaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private ArtistaRepository repositorio;


    public Principal(ArtistaRepository repositorio){
        this.repositorio = repositorio;
    }
    public void exibeMenu() {
        var opcao = -1;

        while (opcao!= 0) {
            var menu = """
                    *** Screen Sound Músicas ***                    
                                        
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                                    
                    0 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("#################################");
                    cadastrarArtistas();
                    System.out.println("#################################");
                    break;
                case 2:
                    System.out.println("#################################");
                    cadastrarMusicas();
                    System.out.println("#################################");
                    break;
                case 3:
                    System.out.println("#################################");
                    listarMusicas();
                    System.out.println("#################################");
                    break;
                case 4:
                    System.out.println("#################################");
                    buscarMusicasPorArtista();
                    System.out.println("#################################");
                    break;
                case 0:
                    System.out.println("#################################");
                    System.out.println("Encerrando a aplicação!");
                    System.out.println("#################################");
                    break;
                default:
                    System.out.println("#################################");
                    System.out.println("Opção inválida!");
                    System.out.println("#################################");
            }
        }
    }

    private void cadastrarArtistas() {
        System.out.println("Digite o nome do artista: ");
        var nomeArtista = leitura.nextLine();
        System.out.println("Informe o tipo desse artista: (solo, dupla ou banda)");
        var tipo = leitura.nextLine();
        TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
        Artista artista = new Artista(nomeArtista,tipoArtista);
        System.out.println(artista);
        repositorio.save(artista);
    }

    private void cadastrarMusicas() {
        System.out.println("Digite o nome do artista: ");
        var nomeArtista = leitura.nextLine();
        Optional<Artista> artista = repositorio.findByNomeContainingIgnoreCase(nomeArtista);
        if (artista.isPresent()) {
            System.out.println("Digite o nome da musica: ");
            var nomeMusica = leitura.nextLine();
            Musica musica = new Musica(nomeMusica);
            musica.setArtista(artista.get());
            artista.get().getMusicas().add(musica);
            repositorio.save(artista.get());
        }else{
            System.out.println("Artista não econtrado");
        }
    }

    private void listarMusicas() {
        List<Artista> artistas = repositorio.findAll();
        artistas.forEach(a-> a.getMusicas().forEach(m-> System.out.println("Artista: "+ m.getArtista().getNome() + "\t"+ "Musica: " + m.getNome())));
    }

    private void buscarMusicasPorArtista() {
        System.out.println("Buscar músicas de que artista ?");
        var nomeArtista = leitura.nextLine();
        List<Musica> musicas = repositorio.buscaMusicasPorArtista(nomeArtista);
        musicas.forEach(m-> System.out.println("Musica: "+ m.getNome()));
    }
}