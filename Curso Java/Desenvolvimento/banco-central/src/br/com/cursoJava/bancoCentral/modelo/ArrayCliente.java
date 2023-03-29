package br.com.cursoJava.bancoCentral.modelo;

public class ArrayCliente{
	
	private Cliente clientes[];
	
	public ArrayCliente(int quantidadeCliente) {
		clientes = new Cliente[quantidadeCliente];
	}
	
	public void adicionArray(int index, Cliente cliente) {
		this.clientes[index] = cliente;
	}
	
	
	public int quantidadeCLiente() {
		return clientes.length;
	}
}