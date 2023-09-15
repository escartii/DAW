public class Ejercicio33 {
    public static void main (String[] args){
        // GitHub: https://github.com/escartii/DAW
        String creator = "Alvaro Escarti";
        System.out.println(creator);
        char c1 = 'E';
        char c2 = '5';
        char c3 = '?';
        //System.out.println(+a); // Poner el "+" delante de la variable entiende que esta en ASCII y lo traduce a texto
        //System.out.println(+c2);// Se que hace operaciones aritmeticas
        //System.out.println(+c3);
        ejercicioA(); // Restablezco el valor de la variable al original
        ejercicioB();
        ejercicioC();
        ejercicioD();
        ejercicioE();
        ejercicioF();
        ejercicioG();
        ejercicioH();
        
    }
    public static void ejercicioA() {
        char c1 = 'E';  //Vuelvo a iniciar las variables a su valor para seguir operando
        char c2 = '5';
        char c3 = '?';

        int resultado = c1+1;
        System.out.println("El resultado del ejercicio A es: " +resultado);

    }
    public static void ejercicioB() {
        char c1 = 'E';
        char c2 = '5';
        char c3 = '?';

        int resultado = c1-c2+c3;
        System.out.println("El resultado del ejercicio B es: " +resultado);

    }
    public static void ejercicioC() {
        char c1 = 'E';
        char c2 = '5';
        char c3 = '?';

        int resultado = c1-2;
        System.out.println("El resultado del ejercicio C es: " +resultado);
    }
    public static void ejercicioD() {
        char c1 = 'E';
        char c2 = '5';
        char c3 = '?';

        int resultado = c2-'2'; // el valor numero de '2' equivale a 50, por eso da 19
        System.out.println("El resultado del ejercicio D es: " +resultado);
        // System.out.println('2');
    }
    public static void ejercicioE() {
        char c1 = 'E';
        char c2 = '5';
        char c3 = '?';

        int resultado = c3+'#';
        System.out.println("El resultado del ejercicio E es: " +resultado);
        //System.out.println('#'); // el valor numerico de '#' equivale 35, por eso da 98 (c3 = 53 + '#' = 98)
    }
    public static void ejercicioF() {
        char c1 = 'E';
        char c2 = '5';
        char c3 = '?';

        int resultado = '2'+'2';
        System.out.println("El resultado del ejercicio F es: " +resultado);
    }
    public static void ejercicioG() {
        char c1 = 'E';
        char c2 = '5';
        char c3 = '?';

        int resultado = 3*c2;
        System.out.println("El resultado del ejercicio G es: " +resultado);
    }
    public static void ejercicioH() {
        char c1 = 'E';
        char c2 = '5';
        char c3 = '?';

        int resultado = '3'*c2;
        System.out.println("El resultado del ejercicio H es: " +resultado);
        //System.out.println('3');
    }
}
