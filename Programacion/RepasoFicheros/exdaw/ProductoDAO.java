import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoDAO {

    
    static Connection conexion = ClaseConectar.conectar();
    public static Producto obtenerProductoPorCodigo(int codigoProducto) {
        String sql = "SELECT * FROM productos WHERE codigo_producto = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, codigoProducto);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int codigoProductoDB = rs.getInt("codigo_producto");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                double precioVenta = rs.getDouble("precio_venta");
                int cantidadEnStock = rs.getInt("cantidad_en_stock");
                return new Producto(codigoProductoDB, nombre, descripcion, precioVenta, cantidadEnStock);
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void actualizarStock(int codigoProducto, int nuevaCantidadEnStock) {
        String sql = "UPDATE productos SET cantidad_en_stock = ? WHERE codigo_producto = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, nuevaCantidadEnStock);
            pstmt.setInt(2, codigoProducto);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
