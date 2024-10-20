import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverterJson {

    public String convert(){
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: "+pessoa);
        return jsonPessoa;
    }

}
