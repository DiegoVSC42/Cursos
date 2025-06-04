public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("IDENTIFICANDO O ESTUDANTE");
        Aluno aluno1 = new Aluno("Fernanda",10, "regular",2);
        Bolsista aluno2 = new Bolsista("Lucas",10,2);

        aluno1.identificar();
        aluno2.identificar();
        System.out.println("-----------------------------------");

        System.out.println("SISTEMA ESCOLAR");
        Aluno a1 = new Aluno("Julia",16,"regular",8.5);
        Aluno a2 = new Aluno("Caio",17,"regular",7.2);
        Docente d1 = new Docente("Marta",40,"Matemática");
        Docente d2 = new Docente("Roberto",38,"História");

        a1.exibirDados();
        a2.exibirDados();
        d1.exibirDados();
        d2.exibirDados();

        System.out.println("-----------------------------------");

        System.out.println("GERENCIAMENTO DE BIBLIOTECA");
        Livro livro = new Livro("O Guia do Mochileiro das Galáxias",1979,"Douglas Adams");
        Revista revista = new Revista("National Geografic",2023,245);
        Ebook ebook = new Ebook("Clean Code",2008,"PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();

        System.out.println("-----------------------------------");
        System.out.println("SISTEMA DE NOTIFICACAO");

        Notificacao email = new Email(
                "cliente@exemplo.com",
                "Aproveite nossos descontos esta semana.",
                "Promoção especial!");

        Notificacao sms = new Sms(
                "(11) 98765-4321",
                "Sua fatura foi paga com sucesso.");

        Notificacao push = new Push(
                "usuario_app",
                "Você tem uma nova mensagem não lida.",
                "Novidade!");
        email.enviar();
        sms.enviar();
        push.enviar();


        System.out.println("-----------------------------------");
        System.out.println("SISTEMA DE PAGAMENTOS");

        Pagamento cartao = new CartaoCredito(250.00);
        Pagamento boleto = new BoletoBancario(500.00);
        Pagamento pix = new Pix(300.00);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

        System.out.println("-----------------------------------");
        System.out.println("ENVIANDO MENSAGENS");


        Notificador notificacao = new Notificador();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);

        System.out.println("-----------------------------------");
        System.out.println("CONTROLE DE RESERVAS");

        Reserva r = new Reserva();
        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);

        Reserva vip = new ReservaVip();
        vip.reservar();

        System.out.println("-----------------------------------");
        System.out.println("IMPLEMENTANDO UMA INTERFACE");

        Relatorio rel = new Relatorio(
                "Relatório 2025",
                "Tudo funcionando conforme esperado."
        );
        rel.imprimir();

        System.out.println("-----------------------------------");
        System.out.println("SISTEMA BANCÁRIO");
        OperacaoBancaria deposito = new Deposito(200.0);
        OperacaoBancaria saque = new Saque(50.5);

        deposito.executar();
        saque.executar();

        System.out.println("-----------------------------------");
        System.out.println("CONTROLE DE DISPOSITIVOS");
        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        ar.desligar();
    }
}
