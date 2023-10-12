public class Ejercicio2 {
    public static void main (String[] args){
        // Declaracion de variables
        float a = 8.0f;
        int b = 3;
        char c = '5'; // transformo el caracter 5 a ASCII y lo guardo en la viarable C 
        int resint = (int) a-b+c;
        double resdouble = a-b+c;
        System.out.println("a - b + c = "+(a - b + c)+ " resint = "+resint+" resdouble = "+resdouble);
        ejercicioB();
        ejercicioC();
        ejercicioD();
        ejercicioE();
        ejercicioF();
        ejercicioG();
        ejercicioH();
        ejercicioI();
        ejercicioJ();
    }
    public static void ejercicioB(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) (2 * b + 3 * (a-c));
        double resdouble = (2 * b + 3 * (a-c));
        System.out.println("2 * b + 3 (a-c)"+(2 * b + 3 * (a-c))+" resint = "+resint+" resdouble = "+resdouble);
    }
    public static void ejercicioC(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) (a / b);
        double resdouble = a / b;
        System.out.println("a / b "+(a / b)+" resint = "+resint+" resdouble = "+resdouble);
    }
    public static void ejercicioD(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) (a % b);
        double resdouble = a % b;
        System.out.println("a % b "+(a % b)+" resint = "+resint+" resdouble = "+resdouble);
    }
    public static void ejercicioE(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) (a / c -2);
        double resdouble = a / c -2;
        System.out.println("a / c -2 "+(a / c -2)+" resint = "+resint+" resdouble = "+resdouble);
    }
    public static void ejercicioF(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) (a * b / c);
        double resdouble = a * b / c;
        System.out.println("a * b / c "+(a * b / c)+" resint = "+resint+" resdouble = "+resdouble);
    }
    public static void ejercicioG(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) (a * (c % b));
        double resdouble = a * (c % b);
        System.out.println("a * c % b" +a * (c % b)+" resint = "+resint+" resdouble = "+resdouble);
    }
    public static void ejercicioH(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) ((3*a-2*b) % (2*a-c));
        double resdouble = ((3*a-2*b) % (2*a-c));
        System.out.println("(3*a-2*b) % (2*a-c)"+(3*a-2*b) % (2*a-c)+" resint = "+resint+" resdouble = "+resdouble);
    }
    public static void ejercicioI(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) ((a-3*b) % (c+2*a) / (a-c));
        double resdouble = (a-3*b) % (c+2*a) / (a-c);
        System.out.println("(a-3*b) % (c+2*a) / (a-c)"+(a-3*b) % (c+2*a) / (a-c)+" resint = "+resint+" resdouble = "+resdouble);
    }
     public static void ejercicioJ(){
        float a = 8.0f;
        int b = 3;
        char c = '5';
        int resint = (int) (a-b-c*2);
        double resdouble = a-b-c*2;
        System.out.println("a-b-c*2 "+(a-b-c*2)+" resint = "+resint+" resdouble = "+resdouble);
    }


}
