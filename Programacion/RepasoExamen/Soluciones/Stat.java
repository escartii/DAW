import java.util.Scanner;
import java.util.ArrayList;

public class Stat {
	
	public static void limpia() {
		System.out.print("\033[H\033[2J");  
	}
	
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<Double>();
        String op;
        Boolean sigue = true;
        Double media = 0.0;
        Double desv = 0.0;
        Double total = 0.0;

        while (sigue) {
            limpia();
            System.out.println("Media: " + media + " Desv.Tipica: " + desv);
            System.out.print(": ");
            op = sc.nextLine();

            if (op.equals("q")) sigue = false;
            else {

                lista.add(Double.valueOf(op));

                //media
                total = 0.0;
                for (Double num : lista) total += num;
                media = total / lista.size();

                //desviacion tipica
                total = 0.0;
                for (Double num : lista) total += Math.pow((num-media),2);
                desv = Math.sqrt(total / lista.size());
            }

        }
				
	}
	
}