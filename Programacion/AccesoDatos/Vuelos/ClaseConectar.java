import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClaseConectar {

    public void conectar(){
        try {

            // COMPILAR: javac -cp :mysql-connector-j-8.3.0.jar Main.java
            // EJECUTAR: java -cp :mysql-connector-j-8.3.0.jar Main.java
            // Conexión con la BD
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            // Creamos un objeto para enviar sentencias SQL a la BD
            Statement st = con.createStatement();
            
            // Insertar datos en la tabla Pasajeros
            String insertQuery = "INSERT INTO aviones.Pasajeros (id_pasajero, numero_pasaporte, nombre_pasajero) VALUES (1, 123456789, 'Alvaro Escarti')";
            int rowsAffected = st.executeUpdate(insertQuery);

            if (rowsAffected > 0) {
                System.out.println("Se ha añadido el pasajero correctamente");
                System.out.println("ID Pasajero: 1");
                System.out.println("Número de pasaporte: 123456789");
                System.out.println("Nombre: Alvaro");
            } else {
                System.out.println("No se ha podido añadir el pasajero.");
            }

            
            // Ejecutamos la consulta SQL y obtenemos el resultado en ResultSet
            ResultSet rs = st.executeQuery("SELECT * FROM aviones.Pasajeros");
            // Recorremos los resultados obtenidos y mostramos sus campos
            while (rs.next()) {
                String nombre = rs.getString("id_pasajero");
                int edad = rs.getInt("numero_pasaporte");
                System.out.println(nombre + ": " + edad);
            }
            // Cerramos la conexión
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
    }
}
        