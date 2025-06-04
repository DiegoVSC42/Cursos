import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustandoADataDeVencimento {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2025,3,20);
        LocalDate dataEntrega = dataVencimentoOriginal.plusMonths(1);
        System.out.println("Nova data de vencimento: " + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(dataEntrega));

    }
}
