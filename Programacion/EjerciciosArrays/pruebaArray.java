public class pruebaArray {
    public static void main(String[] args) {
        // Declarar un array de enteros con 10 elementos
        int[] vectorDeEnteros = new int[10];

        for (int i = 0; i < 10; i++) {
            vectorDeEnteros[i] = i + 1;
            System.out.println("Si la posición es " + i + " el valor es " + vectorDeEnteros[i]);
        }
        System.out.print("-------------------------\n");
        for (int i = 9; i >= 0; i--) {
            System.out.println("Si la posición es " + i + " el valor es " + vectorDeEnteros[i]);
        }
    }
}