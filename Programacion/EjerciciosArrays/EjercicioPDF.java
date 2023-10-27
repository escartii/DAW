public class EjercicioPDF {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        // la i es horizontal
        // la j es vertical
        // Recorremos todas las filas de la matriz (matriz.length te da el número de filas de la matriz)
        for (int i = 0; i <= 2; i++) {
            // Recorremos todas las columnas de la matriz 
            for (int j = 0; j <= 2; j++) {
                // Mostramos Las filas i y las columnas j
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
