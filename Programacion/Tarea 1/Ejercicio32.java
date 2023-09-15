public class Ejercicio32 {
    public static void main (String[] args){
        String creator = "Alvaro Escarti";
        System.out.println(creator);
        double x = 88;
        double y = 3.5;
        double z = -5.2;
        double resultado = x+y+z;
        System.out.println("El resultado del ejercicio A es: "+resultado);
        ejercicioB(); // Restauro las variables a su valor original
        ejercicioC();
        ejercicioD();
        ejercicioE();
        ejercicioF();
        ejercicioG();
        ejercicioH();
        ejercicioI();
    }
    public static void ejercicioB() {
        double x = 88; //Vuelvo a iniciar las variables a su valor para seguir operando
        double y = 3.5;
        double z = -5.2;
        double resultado = 2*y+3*(x-z);
        System.out.println("El resultado del ejercicio B es: "+resultado);
    }
    public static void ejercicioC() {
        double x = 88;
        double y = 3.5;
        double z = -5.2;
        double resultado = x/y;
        System.out.println("El resultado del ejercicio C es: "+resultado);
    }
    public static void ejercicioD() {
        double x = 88;
        double y = 3.5;
        double z = -5.2;
        double resultado = x%y;
        System.out.println("El resultado del ejercicio D es: "+resultado);
    }
    public static void ejercicioE() {
        double x = 88;
        double y = 3.5;
        double z = -5.2;
        double resultado = x/ (y+z);
        System.out.println("El resultado del ejercicio E es: "+resultado);

    }
    public static void ejercicioF() {
        double x = 88;
        double y = 3.5;
        double z = -5.2;
        double resultado = x*(y%z);
        System.out.println("El resultado del ejercicio F es: "+resultado);
    }
    public static void ejercicioG() {
        double x = 88;
        double y = 3.5;
        double z = -5.2;
        double resultado = 3*x-z-2*x;
        System.out.println("El resultado del ejercicio G es: "+resultado);
    }
    public static void ejercicioH() {
        double x = 88;
        double y = 3.5;
        double z = -5.2;
        double resultado = 2+x/5%y;
        System.out.println("El resultado del ejercicio H es: "+resultado);
    }
    public static void ejercicioI() {
        double x = 88;
        double y = 3.5;
        double z = -5.2;
        double resultado = x-y-z*2;
        System.out.println("El resultado del ejercicio I es: "+resultado);
    }
}
