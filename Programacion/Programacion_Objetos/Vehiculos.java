public class Vehiculos {
    private int vehiculosCreados = 0;
    private int kilometrosRecorridos = 0;

    public Vehiculos(int km) {
        vehiculosCreados++;
        kilometrosRecorridos += km;
    }

    public int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public class coche extends Vehiculos {

        public coche() {
            super(0); // Call the constructor of the superclass with 0 as the argument
        }
        
        public void recorrer(int distancia) {
            kilometrosRecorridos += distancia;
        }
    }

    public class bicicleta extends Vehiculos {
        public bicicleta() {
            super(0);
        }

        public void recorrer(int distancia) {
            kilometrosRecorridos += distancia;
        }
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setVehiculosCreados(int vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    
}
