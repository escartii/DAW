import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de huevos que caben en la cazuela: ");
        int capacidadCazuela = scanner.nextInt();

        System.out.print("Ingrese el número de huevos que desea cocer: ");
        int huevosPorCocer = scanner.nextInt();

        scanner.close();

        int tiempoTotalCoccion = (int) Math.ceil((double) huevosPorCocer / capacidadCazuela) * 10;

        System.out.println("El tiempo total de cocción será de " + tiempoTotalCoccion + " minutos.");
    }
}

