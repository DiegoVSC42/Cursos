public class Tarefa {
    String descricao;
    boolean concluida;

    public void mostrarInformacoes(){
        System.out.printf("Tarefa: %s - Status: %s\n", descricao, concluida ? "Concluída" : "Pendente");
    }
}
