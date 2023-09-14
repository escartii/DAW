public class Ejercicio31 {
    public static void main (String[] args)  {
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a+b+c;
        System.out.println("El resultado del ejercicio A es: "+resultado);
        ejercicioB();
    }
    public static void ejercicioB() {
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = 2*b+3*(a-c);
        System.out.println("El resultado del ejercicio B es: "+resultado);
        ejercicioC();
        
    }
    public static void ejercicioC(){
        int a = 8;
        int b = 3;
        int c = -5;
        System.out.println("El resultado del ejercicio C es: "+a/b);
        ejercicioD();
    }
    public static void ejercicioD(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a%b;
        System.out.println("El resultado del ejercicio D es: "+resultado);
        ejercicioE();
    }
    public static void ejercicioE(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a/c;
        System.out.println("El resultado del ejercicio E es: "+resultado);
        ejercicioF();
    }
    public static void ejercicioF(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a%c;
        System.out.println("El resultado del ejercicio F es: "+resultado);
        ejercicioG();
    }
    public static void ejercicioG(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a*b/c;
        System.out.println("El resultado del ejercicio G es: "+resultado);
        ejercicioH();
    }
    public static void ejercicioH(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a*(b/c);
        System.out.println("El resultado del ejercicio H es: "+resultado);
        ejercicioI();
    }
    public static void ejercicioI(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a*c%b;
        System.out.println("El resultado del ejercicio I es: "+resultado);
        ejercicioJ();
    }
    public static void ejercicioJ(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = (a-3*b)%(c+2*a)/(a-c);
        System.out.println("El resultado del ejercicio J es: "+resultado);
        ejercicioK();
    }
    public static void ejercicioK(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a-b-c*2;
        System.out.println("El resultado del ejercicio K es: "+resultado);
    }
}
