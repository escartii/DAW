import lib_objetos.Fraccion;

public class PruebaFraccion {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion(3, 5);

        System.out.print("Fracción 1: ");
        f1.mostrar(); 
        System.out.print("Fracción 2: ");
        f2.mostrar();

        System.out.print("Invertir Fracción 1: ");
        f1.invertir();
        f1.mostrar();

        System.out.print("Simplificar Fracción 2: ");
        f2.simplificar();
        f2.mostrar();

        System.out.print("Multiplicar Fracción 1 por Fracción 2: ");
        f1.multiplicar(f2);
        f1.mostrar();

        System.out.print("Dividir Fracción 1 por Fracción 2: ");
        f1.dividir(f2);
        f1.mostrar();
    }
}
