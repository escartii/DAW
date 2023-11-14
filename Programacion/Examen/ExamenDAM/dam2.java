package ExamenDAM;

import java.util.Scanner;

public class dam2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int plantas;
        int habitaciones;
        int [][] estado;
        int casos;
        int hab;
        int planta;
        int numhab;
        String resultado = "";

        plantas = sc.nextInt();
        habitaciones = sc.nextInt();
        estado = new int [plantas][habitaciones];

        for (int p = 0; p < plantas; p++){
            for (int h = 0; h < habitaciones; h++) {
                estado[p][h] = sc.nextInt();  
            }
        }

        casos = sc.nextInt();

        for (int i = 0; i < casos; i++){
            
            hab = sc.nextInt(); // pregunto el numero de la habitacion
            planta = (int) hab/100;
            numhab = (hab%100);
            // Planta -1 y numhab -1 porque la posicion 1 de la matriz es la 0
            switch (estado[planta-1][numhab-1]) {
                case 0:
                    resultado = " LIBRE";
                    break;
                case 1:
                    resultado = " RESERVADA";
                    break;
                case 2:
                    resultado = " OCUPADA";
                    break;
            }
            System.out.println(hab + resultado);
        }
    }
}
