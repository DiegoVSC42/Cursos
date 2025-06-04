import java.util.List;
import java.util.stream.Collectors;

public class SelecionandoFuncionariosCOmNomesCurtos {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
        List<String> nomesCurtos =
                funcionarios
                        .stream()
                        .filter(f -> f.length() <= 5)
                        .collect(Collectors.toList());
        System.out.println(nomesCurtos);
    }
}
