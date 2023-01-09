import java.util.Scanner;

/*Fazer um programa, que receba do usuario a quantidade de triangulos que ele deseja calcular,
 *  depois, receber os 3 lados de cada triangulo, e mostrar na tala, area de cada um deles, 
 *  calculadas de forma separada.
 * */
public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de triangulos: ");
		
		int qtdTriangulos = sc.nextInt();
		for(int i = 1 ; i <= qtdTriangulos; i++) {
			
			System.out.println("Base do triangulo " + i + ": ");
			int	base = sc.nextInt();
			System.out.println("Altura do triangulo " + i + ": ");
			int altura = sc.nextInt();
			int area = base * altura;
			System.out.println("Area do triangulo " + i +": " + area);
		}
	}
}
