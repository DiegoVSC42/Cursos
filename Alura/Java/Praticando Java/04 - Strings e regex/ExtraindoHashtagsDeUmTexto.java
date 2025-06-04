import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraindoHashtagsDeUmTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        // Olá #mundo! Estou aprendendo #Java e #programação.
        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(sc.nextLine());
        List<String> list = new ArrayList<String>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        if (list.size() == 0) {
            System.out.println("Nenhuma hashtag encontrada");
        }else{
            System.out.println("Hashtag encontradas: " + String.join(", ",list));
        }

    }
}
