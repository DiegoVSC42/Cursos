
public class Operadores {
	
	public static void main(String[] args) {
		
		// 	soma 			(+)
		// 	subtracao		(-)
		// 	multiplicacao	(*)
		//	divisao			(/)
		
		int idade = 20;
		double salario = 800.50;
		salario = 600;
		salario += 400;
		System.out.println("Meu salario: R$ "+ salario);
		System.out.println("-------------------------");
		
		double bonificacaoJunior = 3;
		salario = salario * bonificacaoJunior;
		System.out.println("Meu salario: R$ "+ salario);
		System.out.println("-------------------------");
		
		salario = salario/2;
		System.out.println("Meu salario: R$ "+ salario);
		System.out.println("-------------------------");
		
		int testeNumeroNegativo = 100;
		System.out.println("Numero: " + testeNumeroNegativo);
		System.out.println("-------------------------");
		testeNumeroNegativo = -testeNumeroNegativo;
		System.out.println("Numero: " + testeNumeroNegativo);
		System.out.println("-------------------------");
		
		int restoDaDivisao = 10 % 2;
		System.out.println("Resto: " + restoDaDivisao);
		System.out.println("-------------------------");
		int restoDaDivisao2 = 10 % 3;
		System.out.println("Resto: " + restoDaDivisao2);
	}	
	
}
