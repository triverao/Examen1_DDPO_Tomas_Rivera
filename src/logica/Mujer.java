package logica;

public class Mujer extends Persona {

	public Mujer(double peso, double altura, int edad) {
		super(peso, altura, edad);
	
	}

	@Override
	public double calcularTMB() {
		return 447.593 + (9.247 * this.peso)+ (3.098 *this.altura)- (4.33 * this.edad);
	}

	@Override
	public boolean esValido() {
		return this.peso>=40 && this.peso<=80
				&& this.altura>=140 && this.altura<=180
				&& this.edad >15;
	}

}
