import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[] args) {
        ZonedDateTime horaToquio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime horaBrasil = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Horário atual em Tóquio: " + DateTimeFormatter.ofPattern("HH:mm:ss").format(horaToquio));
        System.out.println("Horário atual em São Paulo: " + DateTimeFormatter.ofPattern("HH:mm:ss").format(horaBrasil));
    }

}

