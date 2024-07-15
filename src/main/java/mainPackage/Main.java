//package mainPackage;
//
//import java.sql.SQLException;
//
//public class Main {
//    public static void main(String[] args) throws SQLException {
//
//        PersonManagement personManagement = new PersonManagement();
//        personManagement.testTheTest();
//
//    }
//}


//
//package mainPackage;
//
//import connectionPackage.DBConnection;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            DBConnection dbConnection = DBConnection.getInstance();
//            Connection connection = dbConnection.getConnection();
//
//            if (connection != null) {
//                System.out.println("Verbindung zur Datenbank hergestellt!");
//                // Hier kannst du SQL-Befehle ausführen, z.B.:
//                Statement statement = connection.createStatement();
//                String sql = "SELECT 1";
//                statement.execute(sql);
//                System.out.println("Testabfrage erfolgreich!");
//            } else {
//                System.out.println("Fehler bei der Verbindung zur Datenbank.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}



package mainPackage;

import connectionPackage.DBConnection;

public class Main {
    public static void main(String[] args) {
        try {
            DBConnection dbConnection = DBConnection.getInstance();
            System.out.println("Verbindung zur Datenbank hergestellt!");

            // Beispielhafte Verwendung von PersonManagement
            PersonManagement personManagement = new PersonManagement();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

