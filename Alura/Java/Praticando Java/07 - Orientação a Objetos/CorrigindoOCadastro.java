public class CorrigindoOCadastro {
    public static void main(String[] args) {
        Colaborador c = new Colaborador();
        c.nome = "Júlia Oliveira";
        c.cargo = "Pessoa Desenvolvedora Júnior";
        c.nivelAcesso = 1;
        System.out.println("--- Antes da atualização ---");
        c.exibirInformacoes();
        c.alterarInformacoes("Pessoa Desenvolvedora Plena",2);
        System.out.println("--- Após atualização ---");
        c.exibirInformacoes();



    }
}
