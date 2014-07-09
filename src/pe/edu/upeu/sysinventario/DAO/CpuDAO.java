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
import pe.edu.upeu.sysinventario.modelo.Cpu;
import pe.edu.upeu.sysinventario.modelo.Usuario;

/**
 *
 * @author SAMUEL CHALLCO
 */
public class CpuDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    
    public int registrarCpu(String ub_caf, String ub_est, String pp_mar, String pp_pla, String pp_ser, String p_mar, String p_model, String p_ser, String p_vel, String dd_mar1, String dd_mar2, String dd_tipo, String dd_ser1, String dd_ser2, String dd_cap1, String dd_cap2, String ram_mar, String ram_model, String ram_cap, String uo_mar, String uo_tipo, String uo_ser, String tv_mar, String tv_tipo, String tv_memo, String tv_ser1, String tv_ser2, String ts_inte, String tr_mar, String tr_model, String tr_ser){
        sql="INSERT INTO CPU VALUES(null,'"+ub_caf+"','"+ub_est+"','"+pp_mar+"','"+pp_pla+"','"+pp_ser+"','"+p_mar+"','"+p_model+"','"+p_ser+"','"+p_vel+"','"+dd_mar1+"','"+dd_mar2+"','"+dd_tipo+"','"+dd_ser1+"','"+dd_ser2+"','"+dd_cap1+"','"+dd_cap2+"','"+ram_mar+"','"+ram_model+"','"+ram_cap+"','"+uo_mar+"','"+uo_tipo+"','"+uo_ser+"','"+tv_mar+"','"+tv_tipo+"','"+tv_memo+"','"+tv_ser1+"','"+tv_ser2+"','"+ts_inte+"','"+tr_mar+"','"+tr_model+"','"+tr_ser+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;
    }
    public ArrayList<Cpu> listarCpu(){
        ArrayList<Cpu> lista = new ArrayList();
        sql = "select *from CPU";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Cpu.loadCpu(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    public int modificarCpu(int idcpu, String ub_caf, String ub_est, String pp_mar, String pp_pla, String pp_ser, String p_mar, String p_model, String p_ser, String p_vel, String dd_mar1, String dd_mar2, String dd_tipo, String dd_ser1, String dd_ser2, String dd_cap1, String dd_cap2, String ram_mar, String ram_model, String ram_cap, String uo_mar, String uo_tipo, String uo_ser, String tv_mar, String tv_tipo, String tv_memo, String tv_ser1, String tv_ser2, String ts_inte, String tr_mar, String tr_model, String tr_ser){
    sql="UPDATE CPU set UB_CodCAF='"+ub_caf+"', UB_Estacion='"+ub_est+"'PP_Marca='"+pp_mar+"',PP_Placa='"+pp_pla+"',PP_Serie='"+pp_ser+"',P_Marca='"+p_mar+"',P_Modelo='"+p_model+"',P_Serie='"+p_ser+"',P_Velocidad='"+p_vel+"',DD_Marca1='"+dd_mar1+"',DD_Marca2='"+dd_mar2+"',DD_Tipo='"+dd_tipo+"',DD_Serie1='"+dd_ser1+"',DD_Serie2='"+dd_ser2+"',DD_Capacidad1='"+dd_cap1+"',DD_Capacidad2='"+dd_cap2+"',RAM_Marca='"+ram_mar+"',RAM_Modelo='"+ram_model+"',RAM_Capacidad='"+ram_cap+"',UO_Marca='"+uo_mar+"',UO_Tipo='"+uo_tipo+"',UO_Serie='"+uo_ser+"',TV_Marca='"+tv_mar+"',TV_Tipo='"+tv_tipo+"',TV_Memoria='"+tv_memo+"',TV_Serie1='"+tv_ser1+"',TV_Serie2='"+tv_ser2+"',TS_Integrado='"+ts_inte+"',TR_Marca='"+tr_mar+"',TR_Modelo='"+tr_model+"',TR_Serie='"+tr_ser+"' WHERE IdCPU='"+idcpu+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }
    public int eliminarCpu(int idcpu){
        sql="DELETE FROM CPU WHERE IDCPU='"+idcpu+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
    public ArrayList<Cpu> listarCpu(int id){
        ArrayList<Cpu> lista = new ArrayList();
        sql = "select *from CPU WHERE IDCPU="+id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Cpu.loadCpu(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    } 
    public ArrayList<Cpu> listarCpu(String us){
    ArrayList<Cpu> lista = new ArrayList();
        sql = "select *from CPU WHERE UB_CodCAF LIKE '"+us+"'%";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Cpu.loadCpu(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }   
    return lista;
    }
}
