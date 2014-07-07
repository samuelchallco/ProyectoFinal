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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pe.edu.upeu.sysinventario.config.Conexion;

/**
 *
 * @author jose
 */
public class UsuarioDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    public int validarUsuario(String usua, String clave){
        sql="SELECT *FROM USUARIO WHERE LOGIN='"+usua+"' AND clave='"+clave+"'";
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
    sql="SELECT *FROM USUARIO WHERE LOGIN='"+user+"'";
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
        sql="INSERT INTO USUARIO VALUES(null,'"+user+"','"+clave+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;
    }
    public ArrayList<Usuario> listarUsuario(){
        ArrayList<Usuario> lista = new ArrayList();
        sql = "select *from USUARIO";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Usuario.loadUsuario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    public int modificarUsuario(int idu, String usuario, String clave){
    sql="UPDATE USUARIO set LOGIN='"+usuario+"', clave='"+clave+"' WHERE IDUSUARIO='"+idu+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }
    public int eliminarUsuario(int idu){
        sql="DELETE FROM USUARIO WHERE IDUSUARIO='"+idu+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
    public ArrayList<Usuario> listarUsuario(int id){
        ArrayList<Usuario> lista = new ArrayList();
        sql = "select *from USUARIO WHERE IDUSUARIO="+id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Usuario.loadUsuario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    } 
    public ArrayList<Usuario> listarUsuario(String us){
    ArrayList<Usuario> lista = new ArrayList();
        sql = "select *from USUARIO WHERE LOGIN LIKE '"+us+"'%";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Usuario.loadUsuario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }   
    return lista;
    }
}
