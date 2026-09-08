package logica;

public abstract class Persona {


	protected double peso;
	protected double altura;
	protected double edad;
	
	public Persona(double peso, double altura, int edad) {
		this.peso=peso;
		this.altura=altura;
		this.edad=edad;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	public double getEdad() {
		return edad;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public abstract double calcularTMB();
	public abstract boolean esValido();
	}
