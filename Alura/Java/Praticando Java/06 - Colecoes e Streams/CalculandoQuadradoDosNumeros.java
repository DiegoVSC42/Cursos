import java.util.List;
import java.util.stream.Collectors;

public class CalculandoQuadradoDosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> quadrados = numeros.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(quadrados);
    }
}
