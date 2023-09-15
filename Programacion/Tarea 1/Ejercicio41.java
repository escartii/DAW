public class Ejercicio41 {
    /**
     * @param args
     */
    public static void main (String[] args){
        String creator = "Alvaro Escarti";
        System.out.println(creator);
        int i = 8;
        int j = 5;
        double x = 0.005;
        double y = -0.01;
        char c = 'c';
        char d = 'd';

        boolean resultado = (i <= j);
        //System.out.println(resultado); -> Nos devuelve False
        System.out.println("Ejercicio A: "+resultado+", La variable: "+i+" No es menor o igual que: "+j);
        
        ejercicioB();
        ejercicioC();
        ejercicioD();
        ejercicioE();
        ejercicioF();
        ejercicioG();

    }
    public static void ejercicioB(){
        int i = 8;
        int j = 5;
        double x = 0.005;
        double y = -0.01;
        char c = 'c';
        char d = 'd';

        boolean resultado = ( +c > +d);
        //System.out.println(resultado); -> Nos devuelve False
        System.out.println("Ejercicio B: "+resultado);
        //System.out.println(+c); 'c' en ascii tiene valor 99, 'd' tiene valor 100 en ASCII por eso da False
        //System.out.println(+d);
    }
    public static void ejercicioC(){
        int i = 8;
        int j = 5;
        double x = 0.005; 
        double y = -0.01;
        char c = 'c';
        char d = 'd';

        boolean resultado = (x >= 0);
        System.out.println("Ejercicio C: "+resultado+", la variable " +x+ " es mayor que: 0");   
    }
     public static void ejercicioD(){
        int i = 8;
        int j = 5;
        double x = 0.005;
        double y = -0.01;
        char c = 'c';
        char d = 'd';

        boolean resultado = (x < y -1);
        System.out.println("Ejercicio D: "+resultado);
    }
    public static void ejercicioE(){
        int i = 8;
        int j = 5;
        double x = 0.005;
        double y = -0.01;
        char c = 'c';
        char d = 'd';

        boolean resultado = (j != 6);
        System.out.println("Ejercicio E: "+resultado);
    }
    public static void ejercicioF(){
        int i = 8;
        int j = 5;
        double x = 0.005;
        double y = -0.01;
        char c = 'c';
        char d = 'd';

        boolean resultado = (+c == 99);
        System.out.println("Ejercicio F: "+resultado);
    }
    public static void ejercicioG(){
        int i = 8;
        int j = 5;
        double x = 0.005;
        double y = -0.01;
        char c = 'c';
        char d = 'd';

        boolean resultado = (y -1 < 1);
        System.out.println("Ejercicio G: "+resultado);
    }
}
