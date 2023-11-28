package libreriaArrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class libreriaArrays {
    public static int[] generarArray(int n, int min, int max) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
            
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Introduce numero minimo: ");
        int min = sc.nextInt();
        System.out.println("Introduce numero maximo: ");
        int max = sc.nextInt();

        
        System.out.println(generarArray(n, min, max));

        
    }

}
