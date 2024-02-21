package RepasoExamen;
public class Camion {

    private String marca;
    private String modelo;
    private int matricula;

     public Camion(String marca, String modelo, int matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Camión{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + '}';
    }
}
