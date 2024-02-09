public class Vehiculos {
    // static es para poder acceder desde todos los programas
    private static int vehiculosCreados = 0;
    private int kilometrosRecorridos = 0;
    private static int kilometrosTotales = 0;

    // Constructor
    public Vehiculos() {
        vehiculosCreados++;
    }

    public void recorrer (int km){
        kilometrosRecorridos += km;
        // me guardo en kilometros totales la suma de todos los kilometros recorridos
        kilometrosTotales += km;
    }

    // Getters y Setters
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
     
    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

}
