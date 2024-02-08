public class Triangulo extends Figura {
    private int base;
    private int altura;
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return (base * altura) / 2;
    }
    @Override
    public double perimetro() {
        return base + altura + Math.sqrt((base * base) + (altura * altura));
    }   
    
}
