import java.util.Scanner;

public class InOK {
    private static Scanner sc = new Scanner(System.in);
    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven","Brahms", "Mahler", "Bartok"};

    public static void Leeint() {

        try {
            System.out.println("Primera Excepción");
            sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error, no es un numero entero.");
            sc.nextLine();
        }

    }

    public static void LeeIntPos() {
        int numero = 0;
        boolean esPositivo = false;

        while (!esPositivo) {
            try {
                System.out.println("Segunda Excepción");
                numero = sc.nextInt();
                if (numero > 0) {
                    esPositivo = true;
                } else {
                    throw new Exception("Error, el número debe ser positivo.");
                }
            } catch (Exception e) {
                // getMessage lo coge de la nueva excepcion que hemos sacado
                if (e.getMessage() == null) {
                    System.out.println("No has introducido un número");
                } else {
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }
            }
        }
    }
    //

    public static void LeeIntRango() {

        try {
            System.out.println("Tercera Excepción");
            int num = sc.nextInt();
            if ((num > 100) || (num < 0)) {
                throw new Exception("Número fuera del rango [0,100]");
            }
        } catch (Exception e) {
            if (e.getMessage() == null) {
                System.out.println("No has introducido un número");
            } else {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void LeeDou() {

        try {
            System.out.println("Cuarta excepción");
            // Double para coger el numero real
            if (sc.hasNextDouble()) {
                System.out.println("es numero real");
            } else {
                throw new Exception("No has introducido un número real");
            }
        } catch (Exception e) {
            if (e.getMessage() == null) {
                System.out.println("No has introducido un número real");
            } else {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void LeeDouRango() {
        Scanner ss = new Scanner(System.in);
        try {
            System.out.println("Quinta Excepción");
            double num = ss.nextDouble();
            if ((num > 100.0) || (num < 0.0)) {
                throw new Exception("Número fuera del rango [0,100]");
            }
        } catch (Exception e) {
            if (e.getMessage() == null) {
                System.out.println("No has introducido un número real");
            } else {
                System.out.println(e.getMessage());
                ss.nextLine();
            }
        }
    }

    public static void LeeString() {
        Scanner ss = new Scanner(System.in);
        boolean encontrado = false;
        try {
            System.out.println("Introduce un String:");
            String entrada = ss.nextLine();

            for (int i = 0; i < COMPOSITORES.length; i++) {
                if (COMPOSITORES[i].equals(entrada)) {
                    System.out.println("El String existe en el array. Índice: " + i);
                }
            }
            if (!encontrado) {
                throw new ElementoNoExistente("El elemento no existe en el array COMPOSITORES.");
            }
            
        } catch (ElementoNoExistente e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Llamo al metodo
        Leeint();
        LeeIntPos();
        LeeIntRango();
        LeeDou();
        LeeDouRango();
        LeeString();
    }
}
