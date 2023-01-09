
public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int idade = 20;
		idade += 1;
		System.out.println(idade);
		System.out.println("-------------------------");
		
		idade = (byte)(idade - 3);
		idade -= 3;
		System.out.println(idade);
		System.out.println("-------------------------");
		
		idade %= 2;
		System.out.println(idade);
		System.out.println("-------------------------");
		
		double salario = 600;
		salario *= 3;
		System.out.println(salario);
		System.out.println("-------------------------");
		
		salario /= 2;
		System.out.println(salario);
		System.out.println("-------------------------");
	}
}
