package ejercicios.libreria;

import java.util.Scanner;

public class Vector {
    public static String[] rellenaVectorStr(int numElem) {
        Scanner sc = new Scanner(System.in);
        String[] vecStr = new String[numElem];
        for (int i = 0; i < numElem; i++) {
            System.out.printf("Introduce el elemento %d:", i);
            vecStr[i] = sc.nextLine();
        }
        sc.close();
        return vecStr;

    }

    public static String devuelveValoStr(int pos, String[] v) {
        return v[pos];
    }

    public static boolean esIgualStr(String[]a, String[] b) {
        boolean resultado = true;
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++){
                if (a[i] != b[i]){
                    resultado = false;
                }
            }
            return resultado;
        }
        return false;
    }
}
