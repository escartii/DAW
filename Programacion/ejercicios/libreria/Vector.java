package ejercicios.libreria;
import java.util.Scanner;

public class Vector {

    public static int[] generaArrayInt(int largo, int minimo, int maximo) {
        int[] array = new int[largo];

        for (int i = 0; i < largo; i++){
            int numeroAleatorio = (int)Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
            array[i] = numeroAleatorio;
        }
       
        return array;

    }


    public static int minimoArrayInt(int[] array) {
        
        int saberMinimo = array[0];

        for (int i = 0; i <= array.length; i++){

            if (saberMinimo > array[i] ){
                saberMinimo = array[i];
            }
        }
       
        return saberMinimo;
    }


    public static void main(String[] args) {
        int[] array;
        int num;
        int minimo;
        int maximo;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime primer num: ");
        num = sc.nextInt();
        System.out.print("Dime el numero minimo: ");
        minimo = sc.nextInt();
        System.out.print("Dime el numero máximo: ");
        maximo = sc.nextInt();

        array = (generaArrayInt(num, minimo, maximo));

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

        System.out.println(saberMinimo);
    }
}
