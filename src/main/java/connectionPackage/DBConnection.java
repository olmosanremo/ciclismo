package connectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Einzige Instanz der Klasse
    private static DBConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/ciclismo";
    private String username = "root";
    private String password = "";

    // Privater Konstruktor, damit keine weiteren Instanzen erstellt werden können
    private DBConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            // Hier könntest du eine benutzerdefinierte Ausnahme werfen, falls der Treiber nicht gefunden wird
        }
    }

    // Öffentliche Methode, um die einzige Instanz zu erhalten
    public static DBConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBConnection();
        }

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}

