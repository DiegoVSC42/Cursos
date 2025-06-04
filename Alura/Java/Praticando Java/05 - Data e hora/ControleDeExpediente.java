import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ControleDeExpediente {
    public static void main(String[] args) {
        LocalTime horaEntrada = LocalTime.of(8,0);
        int cargaHorariaDiaria = 8;
        LocalTime horarioSaida = horaEntrada.plusHours(cargaHorariaDiaria);
        LocalTime horarioSaidaReal = LocalTime.of(17,0);
        long horaExtras = Duration.between(horarioSaida,horarioSaidaReal).toHours();
        long minExtras = Duration.between(horarioSaida,horarioSaidaReal).toMinutesPart();
        System.out.println("Horario de entrada: " + DateTimeFormatter.ofPattern("HH:mm").format(horaEntrada));
        System.out.println("Horario de saida previsto: " + DateTimeFormatter.ofPattern("HH:mm").format(horarioSaida));
        System.out.println("Horario real de saída: " + horarioSaidaReal);
        System.out.println("Saldo de horas: " + horaExtras +"h " + minExtras + "min");
    }
}
