public class Item {
    String nome;
    int quantidade;

    public String vender(int quantidade){
        if(quantidade < this.quantidade){
            this.quantidade -= quantidade;
            return "Venda realizada. Estoque restante da Camiseta: " + this.quantidade;
        }
        return "Estoque insuficiente";
    }
}
