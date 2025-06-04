import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembreteDePagamento {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025,3,25);
        int periodoAntecedencia = 10;
        LocalDate dataVencimentoAntecedencia = dataVencimento.minusDays(periodoAntecedencia);
        System.out.println("Data do lembrete: " + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(dataVencimento));
    }
}
