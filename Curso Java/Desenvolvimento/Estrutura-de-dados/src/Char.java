import java.util.Scanner;

public class Char {
	public static void main(String[] args) {
		
		char nome[] = {'D','V','S'};
		for(int i = 0; i < nome.length/2 ;i++ ) {
			char aux = nome[i];
			nome [i] = nome[nome.length - i - 1];
			nome[nome.length - i - 1] = aux;
			
		}
		for(int i = 0; i < nome.length ; i++) {
			System.out.println("Nome invertido: " + nome[i]);
		}
		
	}
}
