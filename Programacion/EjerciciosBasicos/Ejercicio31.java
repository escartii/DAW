public class Ejercicio31 {
    public static void main (String[] args)  {
        // GitHub: https://github.com/escartii/DAW
        String creator = "Alvaro Escarti";
        System.out.println(creator);
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a+b+c;
        System.out.println("El resultado del ejercicio A es: "+resultado);
        ejercicioB(); // Restauro las variables a su valor original
        ejercicioC();
        ejercicioD();
        ejercicioE();
        ejercicioF();
        ejercicioG();
        ejercicioH();
        ejercicioI();
        ejercicioJ();
        ejercicioK();
    }
    public static void ejercicioB(){
        int a = 8; //Vuelvo a iniciar las variables a su valor para seguir operando
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
    }
    public static void ejercicioD(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a%b;
        System.out.println("El resultado del ejercicio D es: "+resultado);
    }
    public static void ejercicioE(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a/c;
        System.out.println("El resultado del ejercicio E es: "+resultado);
    }
    public static void ejercicioF(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a%c;
        System.out.println("El resultado del ejercicio F es: "+resultado);
    }
    public static void ejercicioG(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a*b/c;
        System.out.println("El resultado del ejercicio G es: "+resultado);
    }
    public static void ejercicioH(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a*(b/c);
        System.out.println("El resultado del ejercicio H es: "+resultado);
    }
    public static void ejercicioI(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a*c%b;
        System.out.println("El resultado del ejercicio I es: "+resultado);
    }
    public static void ejercicioJ(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = (a-3*b)%(c+2*a)/(a-c);
        System.out.println("El resultado del ejercicio J es: "+resultado);
    }
    public static void ejercicioK(){
        int a = 8;
        int b = 3;
        int c = -5;
        int resultado = a-b-c*2;
        System.out.println("El resultado del ejercicio K es: "+resultado);
    }
}
