package PreparacionExamen;

public class romperfor {
    public static void main(String[] args) {
        boolean shouldBreak = false;
        for (int i = 0; i < 10 && !shouldBreak; i++) {
            System.out.println("El valor de i es: " + i);
            if (i == 5) {
                System.out.println("Se alcanzó la condición de salida. Saliendo del bucle sin usar break ni return.");
                shouldBreak = true; // Establecer la condición para salir del bucle
            }
        }

    }
}
