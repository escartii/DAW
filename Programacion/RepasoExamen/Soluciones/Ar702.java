import java.util.Scanner;
import java.util.TreeMap;

public class Ar702 {
	
	public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int saldo;
        int mes = 1;
        int n_apuntes;
        String[] fecha;
        int importe;
        TreeMap<String,Integer> apuntes = new TreeMap<String,Integer>();

        saldo = sc.nextInt();
        n_apuntes = sc.nextInt();

        //Cargo y ordeno los apuntes
        for (int i=0;i<n_apuntes;i++) {
            fecha = sc.next().split("-");
            importe = sc.nextInt();
            sc.nextLine();
            apuntes.put(fecha[1]+"-"+fecha[0],importe);
        }

        //Recorro los apuntes
        for (String clave : apuntes.keySet()) {
            while (Integer.valueOf(clave.substring(0,2))!=mes) {
                mes++;
                System.out.print(saldo + " ");
            }
            saldo += apuntes.get(clave);
        }

        //Pinto el saldo del último mes y si faltan meses sin apuntes al final
        for (int i = mes;i<=12;i++) {
            System.out.print(saldo + " ");
        }
        System.out.println();

	}
}