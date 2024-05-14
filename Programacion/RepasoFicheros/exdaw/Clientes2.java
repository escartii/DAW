import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Clientes2 {

    public static void importarClientesDesdeCSV(Connection conexion, String archivoCSV) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV));
            PreparedStatement stmt = conexion.prepareStatement("SELECT MAX(CodigoCliente) AS max_codigo FROM clientes")) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int maxCodigo = rs.getInt("max_codigo") + 1; // Incrementar el valor de max_codigo en 1 para el siguiente cliente

                String sql = "INSERT INTO clientes (CodigoCliente, NombreCliente, NombreContacto, ApellidoContacto, Telefono, Fax, LineaDireccion1, LineaDireccion2, Ciudad, Region, Pais, CodigoPostal, LimiteCredito) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(",");
                        if (values.length == 13) {
                            pstmt.setInt(1, maxCodigo);
                            pstmt.setString(2, values[0]);
                            pstmt.setString(3, values[1]);
                            pstmt.setString(4, values[2]);
                            pstmt.setString(5, values[3]);
                            pstmt.setString(6, values[4]);
                            pstmt.setString(7, values[5]);
                            pstmt.setString(8, values[6]);
                            pstmt.setString(9, values[7]);
                            pstmt.setString(10, values[8]);
                            pstmt.setString(11, values[9]);
                            pstmt.setString(12, values[10]);
                            pstmt.setDouble(13, Double.parseDouble(values[11]));  // Convertir el valor de LimiteCredito a double
                            pstmt.executeUpdate();
                            System.out.println("Cliente importado correctamente: " + values[0]);
                            maxCodigo++;
                        }
                    }
                }
            } else {
                System.out.println("No se encontraron clientes en el archivo CSV.");
            }
        } catch (SQLException | IOException e) {
            System.out.println("Error al importar clientes desde " + archivoCSV + ": " + e.getMessage());
        }
    }
}