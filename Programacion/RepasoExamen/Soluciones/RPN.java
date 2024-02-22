import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class RPN {
	
	public static void limpia() {
		System.out.print("\033[H\033[2J");  
	}
	
	public static void main (String[] args) {
	
		boolean sigue = true;
		Stack<Double> stack = new Stack<Double>();
		String dato;
		int i;
		Scanner sc = new Scanner (System.in);

		while (sigue) {
		
			limpia();
			i = stack.size();
			for (Double num : stack) {
				System.out.printf("%02d:%20f\n", i, num );
				i--;
			}

			System.out.print(": ");
			
			dato = sc.nextLine();
		
			if (dato.equals("+")){
				stack.push( stack.pop() + stack.pop() );
			
			} else if (dato.equals("-")) {
				stack.push(-stack.pop() + stack.pop());
				
			} else if (dato.equals("*") ){
				stack.push( stack.pop() * stack.pop() );
				
			} else if (dato.equals("/")) {
				stack.push( 1/stack.pop()  * stack.pop());
				
			} else if (dato.equals("q")) {
				limpia();
				sigue = false;
			} else {
				stack.push(Double.valueOf(dato));
			}
		
		}
				
	}
	
}