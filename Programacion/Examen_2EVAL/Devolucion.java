// Heredamos la clase Pedidos y le añadimos producto y precio
class Devolucion extends Pedido {
    public Devolucion(String id, String cliente, String producto, double precio) {
        super(id, cliente, producto, precio);
    }
}