import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int num;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = input.nextInt();

        if (num < 0){
            System.out.println("El numero es negativo");
        }else if (num > 0){
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    int resultado = i + j +i * j;
                    System.out.println("i = " + i + " j = " + j + " resultado = " + resultado);
                }
            }  
        }
        input.close();
    }
}