package lib_objetos;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(){
        // Constructor que crea la fraccion
        this.numerador=1;
        this.denominador=1;
    }

    public Fraccion(int numerador, int denominador){
        // Constructor que crea la fraccion
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void invertir() {
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    public void simplificar() {
        int mcd = Euclides(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }
    // Metodo Euclides 
    private int Euclides(int a, int b) {
        if (b == 0) {
            return a;
        }else {
            return Euclides(b, a % b);
        }
    }

    public void multiplicar(Fraccion otraFraccion) {
        this.numerador *= otraFraccion.numerador;
        this.denominador *= otraFraccion.denominador;

    }
    
    public void dividir(Fraccion otraFraccion) {
        this.numerador *= otraFraccion.denominador;
        this.denominador *= otraFraccion.numerador;
        
    }
    // Mostramos la fraccion 
    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

}


