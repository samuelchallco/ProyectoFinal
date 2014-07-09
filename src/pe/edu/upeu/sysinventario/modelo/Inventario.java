/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.sysinventario.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SAMUEL CHALLCO
 */
public class Inventario {
    private int idinventario;
    private int idcpu;
    private int idmob;
    private int idtop;
    private int idper;
    private int idsala;
    private int idusuario;
    private String fecchainicializacion;
    private String obs;
    private String estado;

    public Inventario() {
    }

    public Inventario(int idcpu, int idmob, int idtop, int idper, int idsala, int idusuario, String fecchainicializacion, String obs, String estado) {
        this.idcpu = idcpu;
        this.idmob = idmob;
        this.idtop = idtop;
        this.idper = idper;
        this.idsala = idsala;
        this.idusuario = idusuario;
        this.fecchainicializacion = fecchainicializacion;
        this.obs = obs;
        this.estado = estado;
    }

    public int getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

    public int getIdcpu() {
        return idcpu;
    }

    public void setIdcpu(int idcpu) {
        this.idcpu = idcpu;
    }

    public int getIdmob() {
        return idmob;
    }

    public void setIdmob(int idmob) {
        this.idmob = idmob;
    }

    public int getIdtop() {
        return idtop;
    }

    public void setIdtop(int idtop) {
        this.idtop = idtop;
    }

    public int getIdper() {
        return idper;
    }

    public void setIdper(int idper) {
        this.idper = idper;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getFecchainicializacion() {
        return fecchainicializacion;
    }

    public void setFecchainicializacion(String fecchainicializacion) {
        this.fecchainicializacion = fecchainicializacion;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public static Inventario loadInventario(ResultSet rs) throws SQLException{
		Inventario inventario = new Inventario();
                inventario.setIdinventario(rs.getInt("idInventario"));
                inventario.setIdcpu(rs.getInt("IdCPU"));
                inventario.setIdmob(rs.getInt("IdMob"));
                inventario.setIdtop(rs.getInt("IdTOp"));
                inventario.setIdper(rs.getInt("IdPer"));
                inventario.setIdsala(rs.getInt("idSala"));
                inventario.setIdusuario(rs.getInt("idUsuario"));
		inventario.setFecchainicializacion(rs.getString("Fecha_Inicializacion"));
		inventario.setObs(rs.getString("Obs"));
                inventario.setEstado(rs.getString("Estado"));
		return inventario;   
     }
}
