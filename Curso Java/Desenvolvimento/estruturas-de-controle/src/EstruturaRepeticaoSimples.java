
public class EstruturaRepeticaoSimples {
	public static void main(String[] args) {
		int contador;
		int numero = 2;
		int potencia = 3;
		
		for(int i = 1; i < potencia; i++) {
			System.out.println(numero + " ");
			numero *= 2; // o mesmo que numero = numero * 2
			System.out.println(numero + " ");
			System.out.println("--------- ");
		}
		
	}
}
