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
public class Mobiliario {
    private int idmob;
    private int codcaf;
    private String componente;
    private String marca;
    private String modelo;
    private String otras;
    private String ubmob;

    public Mobiliario() {
    }

    public Mobiliario(int codcaf, String componente, String marca, String modelo, String otras, String ubmob) {
        this.codcaf = codcaf;
        this.componente = componente;
        this.marca = marca;
        this.modelo = modelo;
        this.otras = otras;
        this.ubmob = ubmob;
    }

    public int getIdmob() {
        return idmob;
    }

    public void setIdmob(int idmob) {
        this.idmob = idmob;
    }

    public int getCodcaf() {
        return codcaf;
    }

    public void setCodcaf(int codcaf) {
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

    public String getUbmob() {
        return ubmob;
    }

    public void setUbmob(String ubmob) {
        this.ubmob = ubmob;
    }
    public static Mobiliario loadMobiliario(ResultSet rs) throws SQLException{
		Mobiliario mobiliario = new Mobiliario();
                mobiliario.setIdmob(rs.getInt("idmob"));
                mobiliario.setCodcaf(rs.getInt("codcaf"));
		mobiliario.setComponente(rs.getString("componente"));
		mobiliario.setMarca(rs.getString("marca"));
                mobiliario.setModelo(rs.getString("modelo"));
                mobiliario.setOtras(rs.getString("otras"));
                mobiliario.setUbmob(rs.getString("ubmob"));
		return mobiliario;
	}
    
}
