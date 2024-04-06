import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

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

    public static void mostrarVuelosPasajeros(Connection cone) {
        try {
            String selectQuery = "SELECT * FROM vuelos.vuelos_pasajeros";
            Statement st = cone.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);
            
            while (rs.next()) {
                
                int id_vuelo = rs.getInt("id_vuelo");
                int id_pasajero = rs.getInt("id_pasajero");
                String n_asiento = rs.getString("n_asiento");
                // imprimo todos los resultados
                System.out.println("--------------------");
                System.out.println("ID Vuelo: " + id_vuelo);
                System.out.println("ID Pasajero: " + id_pasajero);
                System.out.println("Asiento: " + n_asiento);
                System.out.println("--------------------");
            }

            rs.close();

        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }

    public static void modificarReserva(Connection cone, int id_vuelo, int id_pasajero, String asiento){
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