package Geometria;

public class Circulo implements FiguraGeometrica{
	
	private double raio;
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		//Area = pi*r^2
		double valorArea = Math.PI * (raio*raio);
		return valorArea;
	}

	@Override
	public double perimetro() {
		//Perimetro = 2*pi*r
		double valorPerimetro = 2*Math.PI*raio;
		return valorPerimetro;
	}

}
