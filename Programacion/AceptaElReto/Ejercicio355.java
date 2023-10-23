import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        int contador;
        int anyo;
        String mostrarlinea = "";
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (contador = 0; contador < num; contador++) {
            anyo = sc.nextInt();
            if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
                mostrarlinea += "29\n";
            }else{
                mostrarlinea += ("28\n");
            }
        }
        System.out.print(mostrarlinea);
    }
}