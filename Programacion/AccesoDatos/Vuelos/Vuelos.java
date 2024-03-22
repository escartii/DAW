import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Vuelos {


    public void AltaVuelo(){
        try {
            Connection con = ClaseConectar.getCon();
            String insertQuery = "INSERT INTO aviones.Pasajeros (id_pasajero, numero_pasaporte, nombre_pasajero) VALUES (2, 123456789, 'Ai')";
            Statement st = con.createStatement();
            int rowsAffected = st.executeUpdate(insertQuery);

            if (rowsAffected > 0) {
                System.out.println("Se ha añadido el pasajero correctamente");
                System.out.println("ID Pasajero: 2");
                System.out.println("Número de pasaporte: 123456789");
                System.out.println("Nombre: Ai");
            } else {
                System.out.println("No se ha podido añadir el pasajero.");
            }
        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
}
}
