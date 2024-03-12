import java.util.Scanner;

public class pruebas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("Introduzca la referencia del tablón:");
                String referencia = scanner.nextLine();
                System.out.println("Introduzca el volumen en metros cúbicos:");
                double volumen = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer

                double precioTotal = 0, unidadesNecesarias = 0, precioPorM3 = 0;
                String error = "";

                try {
                    precioTotal = inventario.calcularPrecioTotal(referencia, volumen);
                    unidadesNecesarias = inventario.calcularUnidadesNecesarias(referencia, volumen);
                    precioPorM3 = inventario.calcularPrecioPorM3(referencia, volumen);
                } catch (Exception e) {
                    error = e.getMessage();
                }

                if (error.isEmpty()) {
                    System.out.println("Precio total: " + precioTotal + " euros");
                    System.out.println("Unidades necesarias: " + unidadesNecesarias);
                    System.out.println("Precio por m3: " + precioPorM3 + " euros");
                } else {
                    System.out.println("Error: " + error);
                }

                System.out.println("¿Desea realizar otro cálculo? (s/n)");
                String respuesta = scanner.nextLine();
                salir = respuesta.equalsIgnoreCase("n");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}