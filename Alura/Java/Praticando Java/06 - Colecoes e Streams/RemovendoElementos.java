import java.util.ArrayList;
import java.util.List;

public class RemovendoElementos {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Joana", "Lucas", "Pedro", "Antonio"));
        System.out.println("Lista inicial: " + lista);
        lista.remove("Pedro");
        System.out.println("Lista após a exclusão: " + lista);
    }
}
