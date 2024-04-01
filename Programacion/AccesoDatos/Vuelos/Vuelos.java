import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Vuelos {


    public static void AltaVuelo(Connection cone, String num_vuelo, String origen, String destino, String fecha, int capacidad){
        try {
            String insertQuery = "INSERT INTO vuelos.Vuelos (numero_vuelo, origen, destino, fecha, capacidad)"+
            " VALUES ('"+num_vuelo+"' ,'" +origen+"' ,'" +destino+"' ,'" +fecha+"' ," +capacidad+");";
            Statement st = cone.createStatement();
            st.executeUpdate(insertQuery);

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


    public static void ReservaVuelo(Connection cone, int id_vuelo, int id_pasajero, String asiento){
        try {
            String insertQuery = "INSERT INTO vuelos.vuelos_pasajeros (id_vuelo, id_pasajero, n_asiento)"+
            " VALUES ("+id_vuelo+", "+id_pasajero+", '"+asiento+"');";
            Statement st = cone.createStatement();
            st.executeUpdate(insertQuery);

        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }
}
