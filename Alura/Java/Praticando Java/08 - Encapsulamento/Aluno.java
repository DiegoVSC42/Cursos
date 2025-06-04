public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void ganharPontos(int valor){
        pontos += valor;
        nivel = (pontos) / 100 + 1;
    }

    public void exibirStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Nivel: " + nivel);
    }
}
