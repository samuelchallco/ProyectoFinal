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
public class Tecoperaciones {
    private int idtop;
    private String codcaf;
    private String componente;
    private String marca;
    private String serie;
    private String modelo;
    private String otras;
    private String ubtec;

    public Tecoperaciones() {
    }

    public Tecoperaciones(String codcaf, String componente, String marca, String serie, String modelo, String otras, String ubtec) {
        this.codcaf = codcaf;
        this.componente = componente;
        this.marca = marca;
        this.serie = serie;
        this.modelo = modelo;
        this.otras = otras;
        this.ubtec = ubtec;
    }

    public int getIdtop() {
        return idtop;
    }

    public void setIdtop(int idtop) {
        this.idtop = idtop;
    }

    public String getCodcaf() {
        return codcaf;
    }

    public void setCodcaf(String codcaf) {
        this.codcaf = codcaf;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOtras() {
        return otras;
    }

    public void setOtras(String otras) {
        this.otras = otras;
    }

    public String getUbtec() {
        return ubtec;
    }

    public void setUbtec(String ubtec) {
        this.ubtec = ubtec;
    }
    public static Tecoperaciones loadTecoperaciones(ResultSet rs) throws SQLException{
		Tecoperaciones tecoperaciones = new Tecoperaciones();
                tecoperaciones.setIdtop(rs.getInt("IdTOp"));
                tecoperaciones.setCodcaf(rs.getString("Cod_Caf"));
		tecoperaciones.setComponente(rs.getString("Componente"));
		tecoperaciones.setMarca(rs.getString("Marca"));
                tecoperaciones.setSerie(rs.getString("Serie"));
                tecoperaciones.setModelo(rs.getString("Modelo"));
                tecoperaciones.setOtras(rs.getString("Otras"));
                tecoperaciones.setUbtec(rs.getString("UB_TecOp"));
		return tecoperaciones;
	}
}
