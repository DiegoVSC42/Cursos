public class ControleDeTarefas {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        t1.descricao = "Estudar Java";
        t1.concluida = false;

        Tarefa t2 = new Tarefa();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        t1.mostrarInformacoes();
        t2.mostrarInformacoes();
    }
}
