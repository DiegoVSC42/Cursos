package diego.desafio.musicchallenge.model;

import jakarta.persistence.*;


@Entity
@Table(name = "musicas")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    private Artista artista;

    public Musica(String nomeMusica) {
        this.nome = nomeMusica;
    }

    public Musica() {

    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                        ", artista=" + artista.getNome();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
