import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Double> notas;
    private int notasValidas;

    public Disciplina(String nome) {
        this.nome = nome;
        notas = new ArrayList<Double>();
    }

    public void adicionarNota(double nota) {
        if(nota > 0 && nota < 10){
            notas.add(nota);
            notasValidas++;
        }else{
            System.out.printf("Nota inválida ignorada: %.1f\n", nota);
        }
    }

    public void mostrarNotasValidasEMedia(){
        double media = notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.printf("Total de notas válidas: %d\n", notasValidas);
        System.out.printf("Média em %s: %.2f\n",nome,media);
    }
}
