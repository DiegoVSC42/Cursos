import com.google.gson.Gson;

public class ConversaoJsonAninhadoParaObjeto {
    String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
    public void converter(){
        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);
    }
}
