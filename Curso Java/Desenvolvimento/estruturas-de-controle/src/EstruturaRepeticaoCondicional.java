
public class EstruturaRepeticaoCondicional {
	public static void main(String[] args) {
		
		int i = 0;
		int numeroMaximo = 1000;
		while(i <= numeroMaximo){
			System.out.print(" " + i);
			i = i + 2;
		}
		
		System.out.println();
		System.out.println("-------");
		
		do {
			System.out.print(" " + i);
			i = i + 2;
			
		}while(i <= numeroMaximo);
		
		System.out.println();
		System.out.println("-------");
		
		switch (i) {
		case 1001:
			System.out.println("Condicao 1001");
			break;
		case 1003:
			System.out.println("Condicao 1003");
			break;
		default:
			System.out.println("Default");
			break;
		}			
		
	}
}
