package RepasoExamen;

/**
 * This class contains a main method that prints the numbers from 0 to 9 using a
 * while loop.
 */
public class ejemplo {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        // The same using a for loop:
        for (int a = 10; a < 10; a--) {
            System.out.println(a);
        }

        int num = 7;

        for (int numero = 0; numero <= 10; numero++) {
            System.out.println(num + " x " + numero + " = " + num * numero);
        }



    }

}