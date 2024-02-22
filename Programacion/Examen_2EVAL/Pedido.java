class Pedido extends Formulario {
    private String producto;
    private double precio;

    public Pedido(String id, String cliente, String producto, double precio) {
        super(id, cliente);
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void imprimirDatos() {
        // Llamamos a la superclase (padre)
        super.imprimirDatos();
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio);
    }
}