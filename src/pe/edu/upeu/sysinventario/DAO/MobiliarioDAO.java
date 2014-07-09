/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.sysinventario.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pe.edu.upeu.sysinventario.config.Conexion;
import pe.edu.upeu.sysinventario.modelo.Mobiliario;



/**
 *
 * @author SAMUEL CHALLCO
 */
public class MobiliarioDAO {
    
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    
    public int registrarMobiliario (String codcaf, String componente, String marca, String modelo, String otras, String ubmob){
        sql="INSERT INTO mobiliario VALUES(null,'"+codcaf+"','"+componente+"','"+marca+"','"+modelo+"','"+otras+"','"+ubmob+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;
    }
     public ArrayList<Mobiliario> listarMobiliario(){
        ArrayList<Mobiliario> lista = new ArrayList();
        sql = "select *from mobiliario";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Mobiliario.loadMobiliario(rs));
            }
          } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
      }
    public int modificarMobiliario(int idmob,String codcaf, String componente, String marca, String modelo, String otras, String ubmob){
       sql="UPDATE mobiliario set Cod_CAF='"+codcaf+"',Componente='"+componente+"',Marca='"+marca+"',Modelo='"+modelo+"',Otras='"+otras+"',UB_Mob='"+ubmob+"' WHERE IdMob='"+idmob+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }
      public int eliminarMobiliario(int idm){
        sql="DELETE FROM mobiliario WHERE IdMob='"+idm+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
     public ArrayList<Mobiliario> listarMobiliario(int id){
        ArrayList<Mobiliario> lista = new ArrayList();
        sql = "select *from mobiliario WHERE IdMob="+id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Mobiliario.loadMobiliario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    } 
    public ArrayList<Mobiliario> listarMobiliario(String us){
    ArrayList<Mobiliario> lista = new ArrayList();
        sql = "select *from mobiliario WHERE LOGIN LIKE '"+us+"'%";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Mobiliario.loadMobiliario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }   
    return lista;
    }
}
