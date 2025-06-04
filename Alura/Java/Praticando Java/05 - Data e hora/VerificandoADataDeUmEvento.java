import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class VerificandoADataDeUmEvento {
    public static void main(String[] args) {
        LocalDate dataDoEvento = LocalDate.of(2025,3,10);
        LocalDate dataAtual = LocalDate.of(2025,5,10);
        System.out.println("O evento " + ((dataDoEvento.isBefore(dataAtual)) ? "já " : "não ") + "ocorreu.");

    }
}
