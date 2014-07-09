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
import pe.edu.upeu.sysinventario.modelo.Periferico;



/**
 *
 * @author SAMUEL CHALLCO
 */
public class PerifericoDAO {
     int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    public int registrarPeriferico(String ubcodcaf, String ubestacion, String monmarca, String monmodelo, String montipo, String monserie, String tecmarca, String tecmodelo, String tecserie, String tectipo, String moumarca, String moumodelo, String mouserie, String moutipo){
        sql="INSERT INTO periferico VALUES(null,'"+ubcodcaf+"','"+ubestacion+"','"+monmarca+"','"+monmodelo+"','"+montipo+"','"+monserie+"','"+tecmarca+"','"+tecmodelo+"','"+tecserie+"','"+tectipo+"','"+moumarca+"','"+moumodelo+"','"+mouserie+"','"+moutipo+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;
    }
    public ArrayList<Periferico> listarPeriferico(){
        ArrayList<Periferico> lista = new ArrayList();
        sql = "select *from periferico";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Periferico.loadPeriferico(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    public int modificarPeriferico(int idper, String ubcodcaf, String ubestacion, String monmarca, String monmodelo, String montipo, String monserie, String tecmarca, String tecmodelo, String tecserie, String tectipo, String moumarca, String moumodelo, String mouserie, String moutipo){
    sql="UPDATE periferico set UB_CodCAF='"+ubcodcaf+"', UB_Estacion='"+ubestacion+"', Mon_Marca='"+monmarca+"', Mon_Modelo='"+monmodelo+"', Mon_Tipo='"+montipo+"', Mon_Serie='"+monserie+"', Tec_Marca='"+tecmarca+"', Tec_Modelo='"+tecmodelo+"', Tec_Serie='"+tecserie+"', Tec_Tipo='"+tectipo+"', Mou_Marca='"+moumarca+"', Mou_Modelo='"+moumodelo+"', Mou_Serie='"+mouserie+"', Mou_Tipo='"+moutipo+"'  WHERE IdPer='"+idper+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }
    public int eliminarPeriferico(int Ide){
        sql="DELETE FROM periferico WHERE IdPer='"+Ide+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
    public ArrayList<Periferico> listarPeriferico(int Id){
        ArrayList<Periferico> lista = new ArrayList();
        sql = "select *from periferico WHERE IdPer="+Id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Periferico.loadPeriferico(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    } 
    public ArrayList<Periferico> listarPeriferico(String IdPer){
    ArrayList<Periferico> lista = new ArrayList();
        sql = "select *from periferico WHERE  LIKE '"+IdPer+"'%";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Periferico.loadPeriferico(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }   
    return lista;
    }
}
