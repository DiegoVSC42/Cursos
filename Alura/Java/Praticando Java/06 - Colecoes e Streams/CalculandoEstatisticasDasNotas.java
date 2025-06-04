import java.util.List;

public class CalculandoEstatisticasDasNotas {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        Double media = notas.stream().reduce(Double::sum).get() / notas.size();
        Double menor = notas.stream().reduce(Double::min).get();
        Double maior = notas.stream().reduce(Double::max).get();
        System.out.println("A média das notas é: " + String.format("%.1f",media));
        System.out.println("A menor nota foi: " + String.format("%.1f",menor));
        System.out.println("A maior nota foi: " + String.format("%.1f",maior));

    }
}
