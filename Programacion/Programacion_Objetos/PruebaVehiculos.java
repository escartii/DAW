import java.util.Scanner;

public class PruebaVehiculos {

    public static void limpiar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Pulsa \u001B[32mINTRO\u001B[0m para continuar...");
        sc.nextLine();
        System.out.print("\033[H\033[2J");
    }
    public static void main(String[] args) {
        int eleccion = 0;
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();

        coche.recorrer(0);
        bicicleta.recorrer(0);

        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[32mKilómetros recorridos por coche: " + coche.getKilometrosRecorridos() + "\u001B[0m");
        System.out.println("\u001B[32mKilómetros recorridos por bicicleta: " + bicicleta.getKilometrosRecorridos() + "\u001B[0m");
        System.out.println("\u001B[32mKilometros Totales: " + Vehiculos.getKilometrosTotales() + "\u001B[0m");

        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda en bicicleta");
            System.out.println("2. Anda en coche");
            System.out.println("3. Ver kilometraje de la bicicleta");
            System.out.println("4. Ver kilometraje del coche");
            System.out.println("5. Ver kilometraje total");
            System.out.println("6. Ver vehículos totales");
            System.out.println("7. Salir");
            System.out.print("Elige una opción (1-7): ");
            eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    bicicleta.recorrer(100);
                    break;
                case 2:
                    coche.recorrer(100);
                    break;
                case 3:
                    System.out.println("\u001B[32mKilometraje de la bicicleta: " + bicicleta.getKilometrosRecorridos() + "\u001B[0m");
                    break;
                case 4:
                    System.out.println("\u001B[31mKilometraje del coche: " + coche.getKilometrosRecorridos() + "\u001B[0m");
                    break;
                case 5:
                    System.out.println("\u001B[1mKilometraje total: " + Vehiculos.getKilometrosTotales() + "\u001B[0m");
                    break;
                case 6:
                    System.out.println("Vehículos totales: " + Vehiculos.getVehiculosCreados());
                    break;
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Por favor, introduce un numero del 1 al 7");
                    break;
            }
            // Funcion que limpia la pantalla y espera un intro para continuar
            limpiar();

        } while (eleccion != 7);
    }
}
