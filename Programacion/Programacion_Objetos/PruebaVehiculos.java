public class PruebaVehiculos {
    public static void main(String[] args) {

        Vehiculos coche = new Vehiculos.coche();
        Vehiculos bicicleta = new Vehiculos.bicicleta();

        coche.recorrer(100);
        bicicleta.recorrer(50);

        System.out.println("Kilómetros recorridos por coche: " + coche.getKilometrosRecorridos());
        System.out.println("Kilómetros recorridos por bicicleta: " + bicicleta.getKilometrosRecorridos());
    }
}
