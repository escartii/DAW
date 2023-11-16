package CadenasString;

import java.util.Random;

public class metodomath {
    public static void main(String[] args) {
        // abs()
        int absoluto = Math.abs(-10);
        System.out.println("abs(-10): " + absoluto);

        // ceil()
        double techo = Math.ceil(5.25);
        System.out.println("ceil(5.25): " + techo);

        // floor()
        double piso = Math.floor(5.75);
        System.out.println("floor(5.75): " + piso);

        // max()
        int maximo = Math.max(8, 12);
        System.out.println("max(8, 12): " + maximo);

        // min()
        int minimo = Math.min(8, 12);
        System.out.println("min(8, 12): " + minimo);

        // pow()
        double potencia = Math.pow(2, 3);
        System.out.println("pow(2, 3): " + potencia);

        // sqrt()
        double raizCuadrada = Math.sqrt(25);
        System.out.println("sqrt(25): " + raizCuadrada);

        // random()
        double numeroAleatorio = Math.random();
        System.out.println("random(): " + numeroAleatorio);

        // round()
        long redondeado = Math.round(5.6);
        System.out.println("round(5.6): " + redondeado);

        // sin(), cos(), tan()
        double angulo = Math.PI / 4; // 45 grados en radianes
        double seno = Math.sin(angulo);
        double coseno = Math.cos(angulo);
        double tangente = Math.tan(angulo);
        System.out.println("sin(45°): " + seno);
        System.out.println("cos(45°): " + coseno);
        System.out.println("tan(45°): " + tangente);

        // Me quedo con el ultimo numero

       int ultimoNumero = 0;
        for (int i = 0; i < 10; i++){
            ultimoNumero = i;
        }
        System.out.println(String.valueOf(ultimoNumero).charAt(String.valueOf(ultimoNumero).length() - 1));
        // me quedo con el numero más grande 
        Random random = new Random();
            int maximo2 = Integer.MIN_VALUE;
            for (int i = 0; i < 10; i++) {
                int numAleatorio = random.nextInt();
                if (numAleatorio > maximo2) {
                    maximo2 = numAleatorio;
                }
            }
            System.out.println("El número más grande es: " + maximo2);
    }
}
