import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Clientes {

    public static void sacarClientes(Connection conexion) {
        try {
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM exdaw.clientes");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(
                "ID: " + rs.getInt("CodigoCliente") + 
                " | Nombre: " + rs.getString("NombreCliente") + 
                " | Contacto: " + rs.getString("NombreContacto"));
            }
        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }

    public static void añadirCliente(Connection conexion, String nombre, String contacto, String apellidoContacto, String telefono, String fax, String LineaDireccion1, String LineaDireccion2, String ciudad, String region, String pais, String codigoPostal, String limiteCredito) {
        try {
            PreparedStatement st = conexion.prepareStatement("INSERT INTO exdaw.clientes (CodigoCliente, NombreCliente, NombreContacto, ApellidoContacto, Telefono, Fax, LineaDireccion1, LineaDireccion2, Ciudad, Region, Pais, CodigoPostal, LimiteCredito) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setInt(1, getNextCodigoCliente(conexion)); // Get the next available CodigoCliente value
            st.setString(2, nombre);
            st.setString(3, contacto);
            st.setString(4, apellidoContacto);
            st.setString(5, telefono);
            st.setString(6, fax);
            st.setString(7, LineaDireccion1);
            st.setString(8, LineaDireccion2);
            st.setString(9, ciudad);
            st.setString(10, region);
            st.setString(11, pais);
            st.setString(12, codigoPostal);
            st.setString(13, limiteCredito);
            st.executeUpdate();
            System.out.println("Cliente agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar cliente: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }
    // Saber el siguiente CodigoCliente disponible
    private static int getNextCodigoCliente(Connection conexion) {
        try {
            PreparedStatement st = conexion.prepareStatement("SELECT MAX(CodigoCliente) + 1 AS NextCodigoCliente FROM exdaw.clientes");
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt("NextCodigoCliente");
            } else {
                return 1; // Return 1 if no rows are found
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el próximo CodigoCliente: " + e.getErrorCode() + "-" + e.getMessage());
            return 1; // Return 1 if an error occurs
        }
    }
}