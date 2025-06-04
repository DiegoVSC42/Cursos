import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoCodigosDeReferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o codigo de referencia: ");
        Pattern pattern = Pattern.compile("[A-Z]{3}-\\d{4}");
        Matcher matcher = pattern.matcher(sc.nextLine());
        System.out.println("O código de referencia " + ((matcher.matches() ? "está " : "não está ") + "válido"));
    }
}
