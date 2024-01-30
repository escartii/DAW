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
        int mcd = calcularMCD(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }

    private int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }else {
            return calcularMCD(b, a % b);
        }
    }

    public void multiplicar(Fraccion otraFraccion) {
        this.numerador *= otraFraccion.numerador;
        this.denominador *= otraFraccion.denominador;
        invertir();
    }

    public void dividir(Fraccion otraFraccion) {
        this.numerador /= otraFraccion.denominador;
        this.denominador /= otraFraccion.numerador;
    }
    // Mostramos la fraccion 
    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }

}


