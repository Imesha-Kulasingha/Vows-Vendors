package lk.sliit.vendorbooking;

import java.sql.*;

public class DBconnect {
    public  static Connection getConnection() throws ClassNotFoundException, SQLException {

        String username="root";
        String password="imesha836";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/weddingvendordb?characterEncoding=utf8",username,password);
        System.out.println("Successfully connected to the database.");
        return con;

    }
}
