/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.main.DBConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Kawmal Kashmika
 */
public class DBConnection {
      private static String URL="jdbc:mysql://localhost:3306/pc_doctor";
      private static String USERNAME="root";
      private static  String PASSWORD="Kawmal@123";
    
    public static Connection getDBConnection(){
        Connection connection=null;
         try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Check if the connection is successful
            if (connection != null) {
                System.out.println("Connected to the database!");
                // You can perform your database operations here
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Could not load JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        }
         return connection;
    }
    
    
    public static ResultSet readDatabase(String query){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
           connection=getDBConnection();

            // Creating a statement
            statement = connection.createStatement();

            // Executing the query
            resultSet = statement.executeQuery(query);
        } catch (SQLException ex) {
              ex.printStackTrace();
        }
        return resultSet;
    }
    
}
