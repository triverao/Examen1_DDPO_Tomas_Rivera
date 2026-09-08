package main;
import logica.Hombre;
import logica.Mujer;
import logica.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		Persona persona1=new Hombre(60,175,50);
		probar (persona1);
		
		
		Persona persona2=new Hombre(70,160,40);
		probar (persona2);
		
		
		Persona persona3=new Mujer(40,150,45);
		probar (persona3);
		
		Persona persona4=new Mujer(60,165,13);
		probar (persona4);

	}
	private static void probar(Persona persona) {
		if (persona.esValido()) {
			System.out.println("TMB: "+persona.calcularTMB());
		
		} else {
			System.out.println("Datos no validos para calcular la TMB.");
		}
	}
}
