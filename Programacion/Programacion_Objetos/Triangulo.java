// Clase Triangulo que hereda de la clase Figura
public class Triangulo extends Figura {
    private int base; // Variable para almacenar la base del triángulo
    private int altura; // Variable para almacenar la altura del triángulo
    
    // Constructor de la clase Triangulo que recibe la base y la altura como parámetros
    public Triangulo(int base, int altura) {
        this.base = base; // Asigna el valor de la base recibida al atributo base de la clase
        this.altura = altura; // Asigna el valor de la altura recibida al atributo altura de la clase
    }
    
    // Método para calcular el área del triángulo
    @Override
    public double area() {
        return (base * altura) / 2; // Retorna el resultado del cálculo del área del triángulo
    }
    
    // Método para calcular el perímetro del triángulo
    @Override
    public double perimetro() {
        return base + 2* Math.sqrt((base * base) /4 + (altura * altura)); // Retorna el resultado del cálculo del perímetro del triángulo
    }   
    
}
