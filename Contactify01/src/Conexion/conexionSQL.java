/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class conexionSQL {
    Connection conectar=null;
    
    public Connection conexion(){
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/foodscout", "root", "");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion"+e.getMessage());
        }
        return conectar;
    }
    
}
