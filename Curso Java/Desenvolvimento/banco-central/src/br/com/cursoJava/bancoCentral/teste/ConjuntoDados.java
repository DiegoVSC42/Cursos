package br.com.cursoJava.bancoCentral.teste;

import br.com.cursoJava.bancoCentral.modelo.ArrayCliente;
import br.com.cursoJava.bancoCentral.modelo.Cliente;

public class ConjuntoDados {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		ArrayCliente array = new ArrayCliente(4);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Vinicius");
		for(int i = 0 ; i < numeros.length; i++) {
			numeros[i] = i * 2;
		}
		for(int i = 0 ; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
