package mainPackage;

import connectionPackage.DBConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        PersonManagement personManagement = new PersonManagement();
        personManagement.testTheTest();

    }
}



//package mainPackage;
//
//import connectionPackage.DBConnection;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            DBConnection dbConnection = DBConnection.getInstance();
//            System.out.println("Verbindung zur Datenbank hergestellt!");
//
//            // Beispielhafte Verwendung von PersonManagement
//            PersonManagement personManagement = new PersonManagement();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

