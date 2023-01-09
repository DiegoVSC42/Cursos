import java.util.Scanner;

public class TipoTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.println("Digite o lado 1: ");
		int lado1 = sc.nextInt();
		System.out.println("Digite o lado 2: ");
		int lado2 = sc.nextInt();
		System.out.println("Digite o lado 3: ");
		int lado3 = sc.nextInt();
		
		boolean cmp1 = lado1 == lado2;
		boolean cmp2 = lado1 == lado3;
		
		int aux1 = cmp1 ? 1 : 0;
		int aux2 = cmp2 ? 1 : 0;
		
		switch (aux1){ 
		case 1:
			contador++;
			break;
		}
		switch (aux2){ 
		case 1:
			contador++;
			break;
		}
		
		switch (contador){ 
		case 0:
			System.out.println("Escaleno");
			break;
		case 1:
			System.out.println("Isosceles");
			break;
		case 2:
			System.out.println("Equilatero");
			break;
		}
		
	}	

}
