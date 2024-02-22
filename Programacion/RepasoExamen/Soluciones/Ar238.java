import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Ar238 {
	
	public static void main (String[] args) {
	
        Scanner sc = new Scanner(System.in);
        int billetes;
        int billete;
        int personas;
        int puntero;
        int total;
        String salida;

        do{
            billetes = sc.nextInt();
            personas = sc.nextInt();

            if (billetes!=0||personas!=0){

                LinkedList<Queue> colas = new LinkedList<Queue>();

                //Creo la estructura de colas
                for(int i=0;i<personas;i++) {
                    Queue<Integer> cola = new LinkedList<Integer>();
                    colas.add(cola);
                }

                //Cargo las colas
                puntero = 0;
                for(int i=0;i<billetes;i++) {
                    Queue<Integer> colatmp = new LinkedList<Integer>();
                    colatmp = colas.get(puntero);
                    colatmp.add(sc.nextInt());
                    puntero++;
                    if(puntero==personas) puntero = 0;
                }

                //Recorro todas las colas
                for(int i=0;i<personas;i++){
                    total = 0;
                    salida = "";
                    while(!colas.get(i).isEmpty()) {
                        billete = (int)colas.get(i).remove();
                        total = total + billete;
                        salida = salida + " " + billete;
                    }
                    System.out.println(total+":"+salida);
                }
                System.out.println("---");
            }

        } while(billetes!=0||personas!=0);
	}
	
}