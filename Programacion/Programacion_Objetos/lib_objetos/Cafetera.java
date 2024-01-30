package lib_objetos;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public int llenarCafetera() {
        return capacidadMaxima;
    }

    public Cafetera(int nivelMax) {
        this.capacidadMaxima = nivelMax;
        this.cantidadActual = this.capacidadMaxima;
    }



    public void servirTaza(int capacidadTaza) {
        if (cantidadActual >= capacidadTaza) {
            cantidadActual -= capacidadTaza;
        } else {
            this.cantidadActual = 0;
        }
    }

    public void agregarCafe(int cantidad) {
        this.cantidadActual += cantidad;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}   

