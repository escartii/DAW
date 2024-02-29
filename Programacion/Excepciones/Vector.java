public class Vector {
    public static void main(String[] args) {
        int[] vector = new int[5];
        try {
            for (int posiciones = 0; posiciones < vector.length; posiciones++) {
                vector[posiciones] = posiciones;
                if (posiciones == 3) {
                    throw new ArrayIndexOutOfBoundsException("No te dejo asignar en esta posición");
                }
                System.out.println(vector[posiciones]);   
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            int posVector = 6;
            if (posVector < 0 || posVector >= vector.length) {
                throw new ArrayIndexOutOfBoundsException("Posición fuera del rango del array");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
