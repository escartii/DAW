public class Producto {

    private int codigoProducto;
    private String nombre;
    private String descripcion;
    private double precioVenta;
    private int cantidadEnStock;

    public Producto(int codigoProducto, String nombre, String descripcion, double precioVenta, int cantidadEnStock) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidadEnStock = cantidadEnStock;
    }

    

    public int getCodigoProducto() {
        return codigoProducto;
    }



    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDescripcion() {
        return descripcion;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public double getPrecioVenta() {
        return precioVenta;
    }



    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }



    public int getCantidadEnStock() {
        return cantidadEnStock;
    }



    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }



    public boolean isDisponible() {
        return cantidadEnStock > 0;
    }
}
