package lib_objetos;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
    // Establecemos las cantidades
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    // Constructor que inciializa la cantidad actual de cafe es la maxima
    public Cafetera(int nivelMax) {
        this.capacidadMaxima = nivelMax;
        this.cantidadActual = this.capacidadMaxima;
    }
    // Constructor 
    public Cafetera(int capacidadMaxima,int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadMaxima < capacidadActual) {
            this.cantidadActual = capacidadActual;
        }else{
            this.cantidadActual = capacidadMaxima;
        }
    }
    // Getters y Setters
    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }

    // LLenamos la cafetera
    public int llenarCafetera() {
        return capacidadMaxima;
    }
    // Servimos
    public void servirTaza(int capacidadTaza) {
        if (cantidadActual >= capacidadTaza) {
            cantidadActual -= capacidadTaza;
        } else {
            this.cantidadActual = 0;
        }
    }
    //Vaciamos
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    // Agregamos cafe
    public void agregarCafe(int cantidad) {
        this.cantidadActual += cantidad;
    }

    public int getCantidadActual() {
        return this.cantidadActual;
    }

}   

