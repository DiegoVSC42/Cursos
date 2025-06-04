import java.util.HashMap;
import java.util.Map;

public class VerificandoSeUmaChaveExiste {
    public static void main(String[] args) {
        Map<Integer,String> clientes = new HashMap<Integer,String>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");
        int chave = 5;
        if(clientes.containsKey(chave)) {
            System.out.println("O nome do cliente com ID "+chave+" é: " + clientes.get(chave));
        }else{
            System.out.println("Cliente com ID "+chave+ " não encontrado.");
        }
        chave = 6;
        if(clientes.containsKey(chave)) {
            System.out.println("O nome do cliente com ID "+chave+" é: " + clientes.get(chave));
        }else{
            System.out.println("Cliente com ID "+chave+ " não encontrado.");
        }

    }
}
