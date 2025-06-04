public class Aluno extends Pessoa{
    String tipo;
    double nota;

    public Aluno(String nome, int idade, String tipo,double nota) {
        super(nome,idade);
        this.tipo = tipo;
        this.nota = nota;
    }

    public void identificar(){
        System.out.printf("Aluno: %s - Tipo: %s\n",nome,tipo);
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s - Idade: %d - Nota %.2f\n", nome,idade,nota);
    }
}
