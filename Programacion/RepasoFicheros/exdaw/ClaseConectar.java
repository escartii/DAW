import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClaseConectar {

    private Connection con = null; 

    public static Connection conectar(){
        Connection cone = null;
        try {
            // COMPILAR: javac -cp :mysql-connector-j-8.3.0.jar *.java
            // EJECUTAR: java -cp :mysql-connector-j-8.3.0.jar Main
            // Conexión con la BD
            cone = DriverManager.getConnection("jdbc:mysql://localhost:33006/exdaw", "root", "dbrootpass");
            return cone;
        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        }
        return cone;
    } 

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    
}