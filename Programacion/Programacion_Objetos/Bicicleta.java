public class Bicicleta {
    public class bicicleta extends Vehiculos {
        private int kilometrosRecorridos = 0;
        public bicicleta() {
            super(0);
        }

        public void recorrer(int distancia) {
            kilometrosRecorridos += distancia;
        }
    }
}
