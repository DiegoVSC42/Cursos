import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o codigo de referencia: ");
        Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        Matcher matcher = pattern.matcher(sc.nextLine());
        System.out.println("O CPF " + ((matcher.matches() ? "está " : "não está ") + "no formato válido"));
    }
}
