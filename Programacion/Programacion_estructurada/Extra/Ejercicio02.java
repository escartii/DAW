package Programacion_estructurada.Extra;

public class Ejercicio02 {
    public static void main(String[] args) {

        int numeroAleatorio;
        int numeroAleatorio2;
        int ocurrenciasDados = 0; // variable para contabilizar cuantas veces ha tardado en sacar dos números iguales
        numeroAleatorio = (int) (Math.random()*6+1);
        numeroAleatorio2 = (int) (Math.random()*6+1);

        while (numeroAleatorio != numeroAleatorio2) { // mientras que sea distinto entra en el bucle
            
            System.out.println("El primer dado ha sacado: " + numeroAleatorio);
            System.out.println("El segundo dado ha sacado: " + numeroAleatorio2);
            numeroAleatorio = (int) (Math.random()*6+1);
            numeroAleatorio2 = (int) (Math.random()*6+1);
            ocurrenciasDados++; // contabiliza las veces que ha entrado en el bucle
        }
        System.out.print("Los numeros: " + numeroAleatorio + " y " + numeroAleatorio2 + " son iguales\n");
        System.out.print("Los dados se han lazado: " + ocurrenciasDados + " veces");
    }
}
