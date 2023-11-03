package PreparacionExamen;

public class PreparacionExamen {
    public static void main(String[] args) {
    boolean hayGanador = false;
    // cambio de int a double
    int valorEntero = 5;
    double doubleValue = valorEntero;

        if (hayGanador) {
            // cuando se cumple la condicion, salimos
            hayGanador = true;
        } else {
            // continuamos con el codigo en caso de que la condicion sea falsa
            hayGanador = false;
        }

          // String a substring
          String str = "¡Hola, Mundo!";
          String subStr = str.substring(7);
  
          // Declaración de condicional if
          if (valorEntero < 10) {
              System.out.println("El valor es menor que 10.");
          } else {
              System.out.println("El valor no es menor que 10.");
          }
  
          // Bucle while
          int i = 0;
          while (i < 5) {
              System.out.println("Iteración de bucle while: " + i);
              i++;
          }
  
          // Bucle for
          for (int j = 0; j < 5; j++) {
              System.out.println("Iteración de bucle for: " + j);
          }
  
          // Arreglos
          int[] arregloEnteros = {1, 2, 3, 4, 5};
          System.out.println("Elementos del arreglo:");
          for (int k = 0; k < arregloEnteros.length; k++) {
              System.out.println("Elemento en el índice " + k + ": " + arregloEnteros[k]);
          }
  
          // Matrices (arreglos 2D)
          int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
          System.out.println("Elementos de la matriz:");
          for (int f = 0; f < matriz.length; f++) {
              for (int c = 0; c < matriz[f].length; c++) {
                  System.out.print(matriz[f][c] + " ");
                }
              System.out.println();
          }
    }
}

