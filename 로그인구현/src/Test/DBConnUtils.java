package Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnUtils {
    public static Connection getConnection(){
        try{
            String dbURL = "jdbc:mysql://localhost:3306/employees";
            String dbID = "root";
            String dbPW = "10241024";
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(dbURL,dbID,dbPW);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}