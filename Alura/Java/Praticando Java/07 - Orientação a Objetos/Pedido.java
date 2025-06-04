public class Pedido {
    String titulo;
    int diasAtraso;
    public void exibirDetalhes(){
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f",titulo,diasAtraso,diasAtraso*2.5);

    }
}
