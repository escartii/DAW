public class ejercicio3 {
    public static void main(String[] args) {
        String caracter = "-";
        int mina;
        int filas = 20;
        int columnas = 20;
        char [][] vector = new char [filas][columnas];
         for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                System.out.println(vector[i][j] + "--------------------");
            }
        }
    }
}
