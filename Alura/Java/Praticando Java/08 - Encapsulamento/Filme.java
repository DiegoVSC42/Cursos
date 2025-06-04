import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    List<Integer> avaliacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int valor){
        if(valor >= 1 && valor <= 5)
            avaliacoes.add(valor);
        else
            System.out.println("Valor invalido");
    }

    public void calcularEMostrarMedia(){
        double media = avaliacoes.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.printf("Média de avaliações para %s: %.2f\n", titulo, media);
    }
}
