import libreria.FNumDaw;

public class Ejercicio2 {
    public static void main(String[] args) {
        boolean esCapicua;
        int contadorCapi = 0;
        System.out.println("Ejercicio 2");
        for (int i = 1000; i <= 9999; i++) {
            esCapicua = FNumDaw.esCapicua(i);
            if (esCapicua) {
                System.out.println("El numero: " + i + " Es capicua");
                contadorCapi++;
            }
        }
        System.out.println(" ");
        System.out.println("Hay: " + contadorCapi + " numeros capicua");

    }
}
