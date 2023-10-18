
    import java.util.Scanner;

    public class Ejercicio4 {
        public static void main(String[] args) {
        
        int i = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(num + " Es primo");
        } else {
            System.out.println(num + " No es primo");
         }
    }
}
