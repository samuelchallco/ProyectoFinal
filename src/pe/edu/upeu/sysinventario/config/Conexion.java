/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.sysinventario.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jose
 */
public class Conexion {
    public static Connection GetConexion() throws ClassNotFoundException, SQLException{
    Connection conex=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/nombre_de_la_BD";
        String usuario="system";
        String pass ="system";
        conex =(Connection) DriverManager.getConnection(url,usuario,pass);
    
    return conex;
    }
    
}
