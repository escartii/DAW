import java.util.Scanner;

public class Ej238_b {

    public static void main(String[] args) {
        int perso;
        int bills;
        int puntero;
        int[] l_bills;
        String salida;
        int total;

        Scanner sc = new Scanner(System.in);

        do {

            bills = sc.nextInt();
            perso = sc.nextInt();

            if (bills!=0||perso!=0) {

                l_bills = new int[bills];

                for (int i = 0;i<bills;i++) l_bills[i] = sc.nextInt();
               
                for (int i =0;i<perso;i++) {
                    puntero = i;
                    total = 0;
                    salida = "";
                    while (puntero < bills) {
                        total += l_bills[puntero];
                        salida += " " + l_bills[puntero];
                        puntero += perso;
                    }
                    System.out.println(total+":"+salida);
                }
                System.out.println("---");
                
            }
        } while(bills!=0||perso!=0);

        sc.close();

    }


}
