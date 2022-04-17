/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Abdelfatah Ibrahim
 */
class Db_connect {
    public static Connection  get_connection() throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s","root","");
       System.out.println("successfully connected");
       
       return connection;
    
    }
    
    
}
