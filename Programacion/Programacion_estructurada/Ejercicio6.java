import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Declaro las variables
        int dia;
        int dia2;
        int hora;
        int hora2;
        int contadorHoras;

        Scanner sc = new Scanner(System.in);
        // Compruebo que el dia introducido es correcto
        do {
            System.out.print("Introduce un día (entre 1 y 7): ");
            dia = sc.nextInt();
        } while (dia <= 0 || dia >= 8);

        System.out.print("Introduce una hora: ");
        hora = sc.nextInt();

        System.out.print("Introduce el segundo dia: ");
        dia2 = sc.nextInt();

        System.out.print("Introduce una hora: ");
        hora2 = sc.nextInt();
        
        // Calculo las horas
        // Explicación resto el segundo dia al primer dia y lo multiplico por 24 para saber las horas que hay entre los dos dias
        // Luego le resto la hora del segundo dia a la hora del primer dia para saber las horas que hay entre las dos horas
        contadorHoras = (dia2 - dia) * 24 + (hora2 - hora);
        System.out.println(contadorHoras + " horas");
        sc.close();
    }
}

