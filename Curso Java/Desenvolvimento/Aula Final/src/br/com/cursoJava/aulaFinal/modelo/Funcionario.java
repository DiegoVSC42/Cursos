package br.com.cursoJava.aulaFinal.modelo;

public class Funcionario extends Pessoa {
	
	private String nome;
	private String cpf;
	private double salario;
	public static int QTD_FUNC_CADASTRADOS;
	
	public Funcionario(String nome, String cpf, double salario) {
		QTD_FUNC_CADASTRADOS++;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	public Funcionario(String nome, double salario) {
		QTD_FUNC_CADASTRADOS++;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void gastarQuantidade(double quantidadeGastar) {
		if(this.salario - quantidadeGastar < 0) {
			System.out.println("Saldo insuficiente para gastar");
		}else{
			this.salario -= quantidadeGastar;
		}

	}
	public void receberSalarioMes() {
		this.salario += 800;
	}
	@Override
	public double calculaImpostoRenda(double salario) {
		double resultado = salario * 0.3;
		return resultado;
	}
	
	public static double calculaImpostoRenda(double salario,int qtdFilhos){
		double resultado = salario * (0.3/qtdFilhos);
		return resultado;
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
