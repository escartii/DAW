package lib_objetos;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Cafetera(int nivelMax) {
        this.capacidadMaxima = nivelMax;
        this.cantidadActual = this.capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}   

