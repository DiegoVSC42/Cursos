import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VerificacaoDeDiaUtil {
    public static void main(String[] args) {
        Map<String,String> diaUtil = new HashMap<>();
        diaUtil.put("segunda","Segunda");
        diaUtil.put("terca","Terca");
        diaUtil.put("quarta","Quarta");
        diaUtil.put("quinta","Quinta");
        diaUtil.put("sexta","Sexta");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String dia = scanner.nextLine();
        if(diaUtil.containsKey(dia)){
            System.out.println(diaUtil.get(dia) + " é um dia útil.");
        }else{
            System.out.println(dia + " não é um dia útil.");
        }
    }
}
