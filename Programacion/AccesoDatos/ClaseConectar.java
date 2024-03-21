
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClaseConectar {
    private static final String DB_URL = "jdbc:mysql://192.168.0.19:3306/java";
    private static final String USER = "javier";
    private static final String PASSWORD = "root";
    
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

