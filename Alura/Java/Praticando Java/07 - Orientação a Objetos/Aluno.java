public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public void exibeMediaEAprovacao(){
        System.out.println("Aluno: " + nome);
        System.out.printf("Nota 1: %.1f\n" , nota1);
        System.out.printf("Nota 2: %.1f\n" , nota2);
        double media = (nota1+nota2)/2;
        System.out.printf("Média: %.1f\n" ,media);
        System.out.println("Situação: " + (media >= 7 ? "Aprovado" : "Reprovado"));
    }
}
