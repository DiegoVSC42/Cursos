
public class OperadoresRelacionais {
	//	> 	maior que
	//	<	menor que
	//	>=	maior ou igual
	// 	<= 	menor ou igual
	//	==	igual
	//	!=	diferente
	

	public static void main(String[] args) {
		int idadeVinicius	= 	20;
		int idadeDiego		=	25;
		boolean testeIdade	= idadeVinicius < 25;
		System.out.println("<? " + testeIdade);
		System.out.println("-------------------------");
		
		testeIdade	= idadeVinicius > 25;
		System.out.println(">? " + testeIdade);
		System.out.println("-------------------------");
		
		testeIdade	= idadeVinicius <= 25;
		System.out.println("<=? " + testeIdade);
		System.out.println("-------------------------");
		
		testeIdade	= idadeVinicius >= 25;
		System.out.println(">=? " + testeIdade);
		System.out.println("-------------------------");
		
		testeIdade	= idadeVinicius == 25;
		System.out.println("==? " + testeIdade);
		System.out.println("-------------------------");
		
		testeIdade	= idadeVinicius != 25;
		System.out.println("!=? " + testeIdade);
		System.out.println("-------------------------");
		
		boolean jaChoveuHoje = false;
		System.out.println("Ja choveu hoje: " + jaChoveuHoje);
	}
	
}
