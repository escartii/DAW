import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClaseConectar {

    public Scanner sc = new Scanner(System.in);
    private Connection con; 

    public void conectar() {
        try {
            // COMPILAR: javac -cp :mysql-connector-j-8.3.0.jar Main.java
            // EJECUTAR: java -cp :mysql-connector-j-8.3.0.jar Main.java
            // Conexión con la BD
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            // Creamos un objeto para enviar sentencias SQL a la BD
            //Statement st = con.createStatement();

            // Insertar datos en la tabla Pasajeros
            // String insertQuery = "INSERT INTO aviones.Pasajeros (id_pasajero,
            // numero_pasaporte, nombre_pasajero) VALUES (1, 123456789, 'Alvaro Escarti')";
            // int rowsAffected = st.executeUpdate(insertQuery);

            // if (rowsAffected > 0) {
            // System.out.println("Se ha añadido el pasajero correctamente");
            // System.out.println("ID Pasajero: 1");
            // System.out.println("Número de pasaporte: 123456789");
            // System.out.println("Nombre: Alvaro");
            // } else {
            // System.out.println("No se ha podido añadir el pasajero.");
            // }

            // Ejecutamos la consulta SQL y obtenemos el resultado en ResultSet
            //ResultSet rs = st.executeQuery("SELECT * FROM aviones.Pasajeros");
            // Recorremos los resultados obtenidos y mostramos sus campos
            //while (rs.next()) {
              //  String nombre = rs.getString("id_pasajero");
                //int edad = rs.getInt("numero_pasaporte");
                //System.out.println(nombre + ": " + edad);
            //}
            // Cerramos la conexión
        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    } 

    public void AltaVuelo(String num_vuelo, String origen, String destino, String fecha, int Capacidad) {
        

        try {
            String insertQuery = "INSERT INTO aviones.Vuelos (id_vuelo, numero_vuelo, origen, destino, fecha, capacidad)"+
            " VALUES ( 1,'"+num_vuelo+"' ,'" +origen+"' ,'"+destino +"' ,'"+fecha+" ' ,'"+Capacidad+"');";
            Statement st = con.createStatement();
            st.executeUpdate(insertQuery);

        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }

    public void AltaPasajero(){

        try {
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

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    
}
