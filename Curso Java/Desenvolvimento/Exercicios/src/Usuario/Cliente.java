package Usuario;

public class Cliente {

	String nome;
	String cpf;
	int numeroAgencia;
	int idade;
	double saldo;
	/*
	public Cliente(String nome, String cpf, int numeroAgencia, int idade, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroAgencia = numeroAgencia;
		this.idade = idade;
		this.saldo = saldo;
	}*/
	public void depositar(double valor){
		this.saldo += valor;
	}
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			saldo -= valor;
			System.out.println("Valor sacado com sucesso");
			System.out.println("Saldo atual: R$ " + this.saldo);
			return true;
		}else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
			
	}
}
