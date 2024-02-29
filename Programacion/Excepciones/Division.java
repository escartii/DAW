import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Primer numero: ");
            int num1 = sc.nextInt();
            System.out.println("Segundo numero: ");
            int num2 = sc.nextInt();

            int division = num1 / num2;
            System.out.println(division);

            
        } catch (Exception e) {
            System.out.println("Problemas con la división");
        }

    }
}
