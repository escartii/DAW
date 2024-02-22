import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class TurnOMatic {
	
	public static void limpia() {
		System.out.print("\033[H\033[2J");  
	}
	
	public static void main (String[] args) {
        Queue<String> cola = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        Boolean sigue = true;
        int op;

        while (sigue) {

            limpia();
            System.out.println("1. Nuevo cliente ha entrado");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Mostrar cola actual");
            System.out.println("0. Salir");
            System.out.print(": ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Clientes delante: "+cola.size());
                    System.out.print("Nombre: ");
                    cola.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Siguiente: "+cola.remove());
                    sc.nextLine();
                    break;
                case 3:
                    for(String nombre : cola) {
                        System.out.println(nombre);
                    }
                    sc.nextLine();
                    break;
                
                case 0:
                    sigue = false;
                    break;
                default:
                    break;
            }

        }

				
	}
	
}