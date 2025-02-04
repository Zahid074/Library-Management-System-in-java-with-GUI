
package Project;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");

            return con;
        } catch (Exception e) {
            System.out.println("Error in Project.ConnectionProvider.getCon():");
            e.printStackTrace();
            return null;
        }
    }
}

