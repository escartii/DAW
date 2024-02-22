// Heredamos la clase Pedidos ya que son los mismos datos
class Devolucion extends Pedido {
    public Devolucion(String id, String cliente, String producto, double precio) {
        super(id, cliente, producto, precio);
    }
}
