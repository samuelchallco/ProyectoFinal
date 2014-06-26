/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.sysinventario.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pe.edu.upeu.sysinventario.config.Conexion;

/**
 *
 * @author Samuel
 */
public class UsuarioDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    public int validarUsuario(String usua, String clave){
        sql="SELECT *FROM Usuario WHERE usuario='"+usua+"' AND clave='"+clave+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            //cx.close();
            if(rs.next()){
                res=1;
            }else{
                res=2;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }    
    return res;
    }
    public int verificarUsuario(String user){
    sql="SELECT *FROM Usuario WHERE usuario='"+user+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            //cx.close();
            if(rs.next()){
                res=1;
            }else{
                res=2;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return res;    
    }
    public int registrarUsuario(String user, String clave){
        sql="INSERT INTO Usuario VALUES(null,'"+user+"','"+clave+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;
    }
}
