import java.util.Arrays;
import java.util.Scanner;

public class Ej702b {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] meses = new int[12];
        int saldo = sc.nextInt();
        int n_apuntes = sc.nextInt();
        String[] fecha;
        int importe;
        Arrays.fill(apuntes,0);

        for (int i = 0; i< n_apuntes;i++){
            fecha = sc.next().split("-");
            importe = Integer.parseInt(sc.next());
            sc.nextLine();
            meses[Integer.valueOf(fecha[1])-1] +=  importe;
        }

        for (int i = 0;i<12; i++) {
            saldo += meses[i];
            System.out.print(saldo);
            if (i!=11) System.out.print(" ");
        }   
        System.out.println();
        sc.close();
    }
}