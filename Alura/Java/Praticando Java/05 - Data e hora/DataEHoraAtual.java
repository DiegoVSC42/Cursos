import java.time.LocalDate;
import java.time.LocalTime;

public class DataEHoraAtual {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        LocalTime horaHoje = LocalTime.now();

        System.out.println("Data atual: " + dataHoje);
        System.out.println("Hora atual: " + horaHoje);
    }
}
