/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.managment.system;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class Connect {
    public static Connection Connection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","31260");
            System.out.println(con);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
