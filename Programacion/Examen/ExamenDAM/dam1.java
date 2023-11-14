package ExamenDAM;

import java.util.Scanner;

public class dam1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos;
        int clientes;
        int maletas;
        int total = 0;
        int carros;

        casos = sc.nextInt();
        // Bucle de casos   
        for (int i = 1; i <= casos; i++) {
            clientes = sc.nextInt();
            carros=1;
            // Bucle de clientes 
            total = 0;
            for ( int j = 1; j <= clientes; j++){
                maletas = sc.nextInt(); // GUARDA LOS NUMEROS DE LAS MALETAS DE CADA CLIENTE
                if (total + maletas > 10) {
                    carros++;
                    total = maletas; // RESETEA EL TOTAL DE MALETAS
                } else {
                    total = total + maletas; // SUMA LAS MALETAS DE CADA CLIENTE
                }
            }
            System.out.println(carros);
        }
        sc.close();
    }
}
