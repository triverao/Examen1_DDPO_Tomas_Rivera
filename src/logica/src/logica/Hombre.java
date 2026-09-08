package logica;

public class Hombre extends Persona {

	public Hombre(double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTMB() {
		return 88.362 + (13.397 * this.peso)+(4.799 * this.altura)-(5.677 * this.edad);
	}

	@Override
	public boolean esValido() {
		return this.peso >= 60 && this.peso <= 110
			&& this.altura >= 160 && this.altura <= 195
			&& this.edad > 15;
	}
}
