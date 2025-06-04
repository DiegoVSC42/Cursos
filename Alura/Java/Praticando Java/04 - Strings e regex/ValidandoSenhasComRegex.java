import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoSenhasComRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$");
        Matcher matcher = pattern.matcher(sc.nextLine());
        System.out.println("A senha " + ((matcher.matches() ? "está " : "não está ") + "no formato válido"));


    }
}
