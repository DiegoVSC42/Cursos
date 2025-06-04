import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculandoADataDaEntrega {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2025,3,15);
        LocalDate dataEntrega = dataInicio.plusDays(15);
        System.out.println("Data de entrega: " + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(dataEntrega));

    }
}
