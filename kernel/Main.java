package kernel;

public class Main {

	public static void main(String[] args) {
		
		Sumar suma= new Sumar();
		Resta resta =new Resta ();
		Divisi�n divisi�n = new Divisi�n ();
		Multiplicaci�n multiplicaci�n = new Multiplicaci�n ();
		
		double a = 50;
		double b = 10;
		
		System.out.println("Respuesta de suma:");
		System.out.println(suma.suma(a, b));
		
		System.out.println("Respuesta de resta:");
		System.out.println(resta.resta(a, b));
		
		System.out.println("Respuesta de divici�n:");
		System.out.println(divisi�n.dividir(a, b));
		
		System.out.println("Respuesta de multiplicaci�n:");
	    System.out.println(multiplicaci�n.multiplicaci�n(a, b));
		

	}

}
