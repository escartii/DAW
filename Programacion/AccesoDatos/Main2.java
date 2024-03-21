import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) {
        try {

            // COMPILAR: javac -cp :mysql-connector-j-8.3.0.jar Main.java
            // EJECUTAR: java -cp :mysql-connector-j-8.3.0.jar Main.java
            // Conexión con la BD
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33006/", "root", "root");
            // Creamos un objeto para enviar sentencias SQL a la BD
            Statement st = con.createStatement();
            // Ejecutamos la consulta SQL y obtenemos el resultado en ResultSet
            ResultSet rs = st.executeQuery("SELECT * FROM empresa.CLIENT");
            // Recorremos los resultados obtenidos y mostramos sus campos
            while (rs.next()) {
                String nombre = rs.getString("NOM");
                int edad = rs.getInt("CLIENT_COD");
                System.out.println(nombre + ": " + edad);
            }
            // Cerramos la conexión
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }            
    }
}