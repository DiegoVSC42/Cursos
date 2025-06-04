import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDataEHoraParaRelatorios {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        LocalTime horaHoje = LocalTime.now();

        System.out.println("Data formatada: " + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(dataHoje));
        System.out.println("Hora formatada: " + DateTimeFormatter.ofPattern("HH:mm").format(horaHoje));
    }
}
