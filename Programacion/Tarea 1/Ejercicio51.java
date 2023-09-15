public class Ejercicio51 {
    public static void main (String[] args){
        int c = 99;
        int x = 0;
        char d = (char) 'd'; // guardo la variable D con el valor ASCII, que es 100
        char i = (char) 'i';
        char j = (char) 'j';
        char y = (char) 'y';


        System.out.println(!(c == 99));
        System.out.println(!(x > 0));
        System.out.println((c > +d || c > 0));
        System.out.println(i <= j && i >= c);
        System.out.println(i > 0 && j < 5);
        System.out.println(i > 0 || j < 5);
        System.out.println(x > y && i > 0 || j < 5);

    }
}