import java.util.List;

public class CalculandoTotalComImposto {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        Double total = precosProdutos.stream().reduce(0.0,Double::sum);
        Double precosComImpostos = precosProdutos.stream().map(p -> p * 1.08).reduce(0.0,Double::sum);
        System.out.println("Valor total antes do imposto: " + String.format("%.2f",total));
        System.out.println("Valor total com impostos: " + String.format("%.2f",precosComImpostos));
    }
}
