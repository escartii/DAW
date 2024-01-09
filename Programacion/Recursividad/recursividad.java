package Recursividad;

public class recursividad {

    public static int fibonacci(int N) {
        int res = 0;
        if (N == 0) {
            res = 0;
        } else if (N == 1) {
            res = 1;
        } else {
            res = fibonacci(N - 1) + fibonacci(N - 2);
        }
        return res;

        // UNA FUNCIÍON QUE PASEMOS EL ORGANIGRAMA 
    }
    public static void main(String[] args) {

        // Cojo el primer argumento y lo convierto a entero 
        System.out.println(fibonacci(Integer.valueOf(args[0])));
        System.out.println(fibonacci(Integer.valueOf(args[1])));
        System.out.println(fibonacci(Integer.valueOf(args[2])));
    }
}

