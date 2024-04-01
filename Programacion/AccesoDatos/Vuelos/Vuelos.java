import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Vuelos {


    public static void AltaVuelo(Connection cone, String num_vuelo, String origen, String destino, String fecha, int capacidad){
        try {
            String insertQuery = "INSERT INTO vuelos.Pasajeros (numero_pasaporte, nombre_pasajero) VALUES (123456789, 'Ai')";
            Statement st = cone.createStatement();
            st.executeUpdate(insertQuery);
            System.out.println("Ok");

        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }

    public static void AltaPasajero(Connection cone, String numero_pasaporte, String nombre_pasajero){

        try {
            String insertQuery = "INSERT INTO vuelos.Pasajeros (nombre_pasajero, numero_pasaporte)"+
            " VALUES ('"+nombre_pasajero+"' ,'" +numero_pasaporte+"');";
            Statement st = cone.createStatement();
            st.executeUpdate(insertQuery);

        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }


    public static void ReservaVuelo(Connection cone, String num_vuelo_reserva, String pasaporte_reserva){
        // id vuelo quieresd
        // id pasajero
        // numero asiento
        // insert a la tabla de reservas 

        

    }
}
