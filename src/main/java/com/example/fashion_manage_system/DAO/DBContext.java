package com.example.fashion_manage_system.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    private static String URL = "jdbc:mysql://localhost:3306/fashion_manage_system";
    private static String USERNAME = "root";
    private  static String PASSWORD ="1234567890";

    // tao sington cho DBContext

    protected Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
