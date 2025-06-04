public class Colaborador {
    String nome;
    String cargo;
    int nivelAcesso;

    public void alterarInformacoes(String cargo,int nivelAcesso){
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel de acesso: " + nivelAcesso);
        System.out.println();
    }
}
