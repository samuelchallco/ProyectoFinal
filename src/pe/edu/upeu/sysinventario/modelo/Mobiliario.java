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
    private String codcaf;
    private String componente;
    private String marca;
    private String modelo;
    private String otras;
    private String ubmob;

    public Mobiliario() {
    }

    public Mobiliario(String codcaf, String componente, String marca, String modelo, String otras, String ubmob) {
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
                mobiliario.setIdmob(rs.getInt("IdMob"));
                mobiliario.setCodcaf(rs.getString("Cod_CAF"));
		mobiliario.setComponente(rs.getString("Componente"));
		mobiliario.setMarca(rs.getString("Marca"));
                mobiliario.setModelo(rs.getString("Modelo"));
                mobiliario.setOtras(rs.getString("Otras"));
                mobiliario.setUbmob(rs.getString("UB_Mob"));
		return mobiliario;
	}
}
