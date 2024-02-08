// Definición de la clase Cuadrado que extiende de la clase Figura
public class Cuadrado extends Figura {
    private int lado; // Variable para almacenar el valor del lado del cuadrado

    // Constructor de la clase Cuadrado que recibe el valor del lado como parámetro
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Implementación del método area() de la clase Figura
    @Override
    public double area() {
        return lado * lado; // Cálculo del área del cuadrado (lado * lado)
    }

    // Implementación del método perimetro() de la clase Figura
    @Override
    public double perimetro() {
        return 4 * lado; // Cálculo del perímetro del cuadrado (4 * lado)
    }
}
