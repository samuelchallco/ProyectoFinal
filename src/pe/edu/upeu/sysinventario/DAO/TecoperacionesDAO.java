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

import pe.edu.upeu.sysinventario.modelo.Tecoperaciones;

/**
 *
 * @author SAMUEL CHALLCO
 */
public class TecoperacionesDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    public int registrarPeriferico(String codcaf, String componente, String marca, String serie, String modelo, String otras, String ubtec){
        sql="INSERT INTO tec_operaciones VALUES(null,'"+codcaf+"','"+componente+"','"+marca+"','"+serie+"','"+modelo+"','"+otras+"','"+ubtec+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;
    }
    public ArrayList<Tecoperaciones> listarTecoperaciones(){
        ArrayList<Tecoperaciones> lista = new ArrayList();
        sql = "select *from tec_operaciones";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Tecoperaciones.loadTecoperaciones(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    public int modificarTecoperaciones(int idtop, String codcaf, String componente, String marca, String serie, String modelo, String otras, String ubtec){
    sql="UPDATE tec_operaciones set Cod_CAF='"+codcaf+"', Componente='"+componente+"', Marca='"+marca+"', Serie='"+serie+"', Modelo='"+modelo+"', Otras='"+otras+"', UB_TecOp='"+ubtec+"' WHERE IdTOp='"+idtop+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }
    public int eliminarTecoperaciones(int Idt){
        sql="DELETE FROM tec_operaciones WHERE IdTOp='"+Idt+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
    public ArrayList<Tecoperaciones> listarTecoperaciones(int Id){
        ArrayList<Tecoperaciones> lista = new ArrayList();
        sql = "select *from tec_operaciones WHERE IdTOp="+Id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Tecoperaciones.loadTecoperaciones(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    } 
    public ArrayList<Tecoperaciones> listarTecoperaciones(String Idtec){
    ArrayList<Tecoperaciones> lista = new ArrayList();
        sql = "select *from tec_operaciones WHERE  LIKE '"+Idtec+"'%";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Tecoperaciones.loadTecoperaciones(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }   
    return lista;
    }
}
