package kernel;

public class Main {

	public static void main(String[] args) {
		
		Sumar suma= new Sumar();
		Resta resta =new Resta ();
		División división = new División ();
		Multiplicación multiplicación = new Multiplicación ();
		
		double a = 50;
		double b = 10;
		
		System.out.println("Respuesta de suma:");
		System.out.println(suma.suma(a, b));
		
		System.out.println("Respuesta de resta:");
		System.out.println(resta.resta(a, b));
		
		System.out.println("Respuesta de divición:");
		System.out.println(división.dividir(a, b));
		
		System.out.println("Respuesta de multiplicación:");
	    System.out.println(multiplicación.multiplicación(a, b));
		

	}

}
