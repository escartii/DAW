public class Test3 {
	public static void main (String [] args) {
		double d = 100.04; // la variable d que contiene dos decimales
		long l = (long)d; // long significa numero largo, y esta quitando los decimales de la variable d
		int i = (int)l; // el numero entero de l es 100, que es la variable d y es un numero entero.
		
		System.out.println("Valor Int "+i);
		System.out.println("Valor Long "+l);
		System.out.println("Valor Double "+d);
	}
	
}