
public class PreparacionExamen {
    public static void main(String[] args) {
        boolean hayGanador = false;
        // cambio de int a double
        int valorEntero = 5;
        if (hayGanador) {
            // cuando se cumple la condicion, salimos
            hayGanador = true;
        } else {
            // continuamos con el codigo en caso de que la condicion sea falsa
            hayGanador = false;
        }

        // String a substring
        String str = "¡Hola, Mundo!";
        // Declaración de condicional if

        System.out.println(" ");
        System.out.println("*--SENTENCIA IF--*");
        System.out.println(" ");

        if (valorEntero < 10) {
            System.out.println("El valor es menor que 10.");
        } else {
            System.out.println("El valor es mayor que 10.");
        }

        System.out.println(" ");
        System.out.println("*--BUCLE WHILE--*");
        System.out.println(" ");
        // Bucle while
        int i = 0;
        while (i < 5) {
            System.out.println("Iteración de bucle while: " + i);
            i++;
        }

        System.out.println(" ");
        System.out.println("*--BUCLE FOR--*");
        System.out.println(" ");
        // Bucle for
        for (int j = 0; j < 5; j++) {
            System.out.println("Iteración de bucle for: " + j);
        }

        System.out.println(" ");
        System.out.println("*--ARRAYS O VECTORES--*");
        System.out.println(" ");

        // Arreglos
        int[] arregloEnteros = { 1, 2, 3, 4, 5 };
        System.out.println("Elementos del array:");
        for (int k = 0; k < arregloEnteros.length; k++) {
            System.out.println("Elemento en el índice " + k + ": " + arregloEnteros[k]);
        }

        System.out.println(" ");
        System.out.println("*--MATRICES O ARRAYS 2D--*");
        System.out.println(" ");

        // Matrices (arreglos 2D)

        // Comprobar si dos matrices son iguales
        int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        boolean iguales = true;

        for (int f = 0; f < matriz1.length; f++) {
            for (int c = 0; c < matriz2.length; c++) {
                if (matriz1[f][c] != matriz2[f][c]) {
                    iguales = false;
                }
            }
        }
        System.out.println(matriz1[1][1]);
        System.out.println(matriz1[1][1] * 5);

        if (iguales) {
            System.out.println("Las matrices son iguales");
        } else {
            System.out.println("Las matrices no son iguales");

            for (int alvaro = 5; alvaro >= 0; alvaro--) {
                System.out.println(alvaro);
            }


            int alvaro = 5; 
            // Bucle for que hace una cuenta atrás hasta que sea menor o igual que 0
            for (alvaro = 5; alvaro >= 0; alvaro--) {
                System.out.println("variable alvaro (FOR) : " + alvaro);
            }
            
            // Bucle while que se ejecuta 5 veces hasta que el resultado sea 0
            int escarti = 5;
            while (escarti != 0) {
                escarti--;
                System.out.println("Variable escarti (WHILE) : " + escarti);
            }
        }
    }
}