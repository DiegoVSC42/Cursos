import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertendoHorarioParaOutroFuso {
    public static void main(String[] args) {
        ZonedDateTime horaBrasil = ZonedDateTime.now();
        ZonedDateTime horaSydney = horaBrasil.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println("Horário atual em São Paulo: " + DateTimeFormatter.ofPattern("HH:mm").format(horaBrasil));
        System.out.println("Horário atual em Sydney: " + DateTimeFormatter.ofPattern("HH:mm").format(horaSydney));
    }
}
