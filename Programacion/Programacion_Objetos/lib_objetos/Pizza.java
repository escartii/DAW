package lib_objetos;

public class Pizza {
    // Atributos
    private String tamaño;
    private String tipo;
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    // Constructor
    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        totalPedidas++;
    }

    // Métodos
    public void sirve() {
        if (estado.equals("pedida")) {
            estado = "servida";
            totalServidas++;
        } else {
            System.out.println("Esta pizza ya ha sido servida.");
        }
    }

    public String toString() {
        return "Pizza: tamaño=" + tamaño + ", tipo=" + tipo + ", estado=" + estado;
    }
    // Getters y Setters
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }
    // se pone static para que pueda ser llamado desde el main
    public static int getTotalServidas() {
        return totalServidas;
    }
}
