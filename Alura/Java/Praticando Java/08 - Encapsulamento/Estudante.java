public class Estudante {
    private String login;
    private String senha;

    public Estudante(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha(String senha) {
        if(this.senha.equals(senha)) {
            System.out.println("Login bem sucedido!");
            return true;
        }
        return false;
    }
}
