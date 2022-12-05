/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library.management.system;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SHAKTHI GANAPATHY S
 */
public class LibraryManagementSystem {
 Connection conn;
    /**
     * @param args the command line arguments
     */
    public static Connection ConnectorDb() {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
           return conn;
    } catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }
}

