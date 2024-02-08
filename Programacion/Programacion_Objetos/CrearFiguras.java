import java.util.Vector;
public class CrearFiguras {
    public static void main(String[] args) {
        
        Vector<Figura> figuras = new Vector<Figura>();

        figuras.add(new Circulo(10));
        figuras.add(new Cuadrado(10));
        figuras.add(new Triangulo(10, 5));
        for (Figura f : figuras) {
            System.out.println("Area: " + f.area());
            System.out.println("Perimetro: " + f.perimetro());
        }
    }
}