import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DiferencaEntreHoras {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.of(14,30);
        LocalTime hora2 = LocalTime.of(16,45);
        Duration diferenca = Duration.between(hora,hora2);
        System.out.println("Diferença de tempo: " + diferenca.toHours() + " horas" + " e " + diferenca.toMinutesPart() + " minutos");
    }
}
