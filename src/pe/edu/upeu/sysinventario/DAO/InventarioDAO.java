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
import pe.edu.upeu.sysinventario.modelo.Inventario;

/**
 *
 * @author SAMUEL CHALLCO
 */
public class InventarioDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    
    public int registrarInventario (int idcpu, int idmob, int idtop, int idper, int idsala,int idusuario,  String fecchainicializacion, String obs, String estado){
        sql="INSERT INTO inventario VALUES(null,'"+idcpu+"','"+idmob+"','"+idtop+"','"+idper+"','"+idsala+"','"+idusuario+"','"+fecchainicializacion+"','"+obs+"','"+estado+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;  
    }
     public ArrayList<Inventario> listarInventario(){
        ArrayList<Inventario> lista = new ArrayList();
        sql = "select *from inventario";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Inventario.loadInventario(rs));
            }
          } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
      }
    public int modificarInventario(int idinventario,int idcpu, int idmob, int idtop, int idper, int idsala,int idusuario,  String fecchainicializacion, String obs, String estado){
       sql="UPDATE inventario set IdCPU='"+idcpu+"',IdMob='"+idmob+"',IdTOp='"+idtop+"',IdPer='"+idper+"',idSala='"+idsala+"',idUsuario='"+idusuario+"',Fecha_Inicializacion='"+fecchainicializacion+"' WHERE idInventario='"+idinventario+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }
      public int eliminarInventario(int idi){
        sql="DELETE FROM inventario WHERE idInventario='"+idi+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
     public ArrayList<Inventario> listarInventario(int id){
        ArrayList<Inventario> lista = new ArrayList();
        sql = "select *from inventario WHERE idInventario="+id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Inventario.loadInventario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    } 
    public ArrayList<Inventario> listarInventario(String idi){
    ArrayList<Inventario> lista = new ArrayList();
        sql = "select *from inventario WHERE  LIKE '"+idi+"'%";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Inventario.loadInventario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }   
    return lista;
    }
}
