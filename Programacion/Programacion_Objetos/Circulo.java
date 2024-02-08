public  class Circulo extends Figura{
    private int radio;
    public Circulo(int radio) {
        this.radio = radio;
    }
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
