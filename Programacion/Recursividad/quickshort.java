public class quickshort {
    public static void main(String[] args) {
        /*
         * Algoritmo
         * Coger un numero pibote y pasar todos los menores al lado izquierdo
         * El pibote (normalmente el del medio) debe estar en su posición
         * Pasar todos los numeros mayores a la derecha
         * Repetimos el proceso
         */
        int pibote = 0;
        int array[] = {0, 2, 4, 6, 5, 3};
        // Bucle que recorre todo el array 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] < array[3]) {
                System.out.println("El numero es menor que el pibote");
            }
        }
    }   
}
