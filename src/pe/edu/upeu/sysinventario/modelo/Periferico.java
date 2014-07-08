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
public class Periferico {
    private int idper;
    private String ubcodcaf;
    private String ubestacion;
    private String monmarca;
    private String monmodelo;
    private String montipo;
    private String monserie;
    private String tecmarca;
    private String tecmodelo;
    private String tecserie;
    private String tectipo;
    private String moumarca;
    private String moumodelo;
    private String mouserie;
    private String moutipo;

    public Periferico() {
    }

    public Periferico(String ubcodcaf, String ubestacion, String monmarca, String monmodelo, String montipo, String monserie, String tecmarca, String tecmodelo, String tecserie, String tectipo, String moumarca, String moumodelo, String mouserie, String moutipo) {
        this.ubcodcaf = ubcodcaf;
        this.ubestacion = ubestacion;
        this.monmarca = monmarca;
        this.monmodelo = monmodelo;
        this.montipo = montipo;
        this.monserie = monserie;
        this.tecmarca = tecmarca;
        this.tecmodelo = tecmodelo;
        this.tecserie = tecserie;
        this.tectipo = tectipo;
        this.moumarca = moumarca;
        this.moumodelo = moumodelo;
        this.mouserie = mouserie;
        this.moutipo = moutipo;
    }

    public int getIdper() {
        return idper;
    }

    public void setIdper(int idper) {
        this.idper = idper;
    }

    public String getUbcodcaf() {
        return ubcodcaf;
    }

    public void setUbcodcaf(String ubcodcaf) {
        this.ubcodcaf = ubcodcaf;
    }

    public String getUbestacion() {
        return ubestacion;
    }

    public void setUbestacion(String ubestacion) {
        this.ubestacion = ubestacion;
    }

    public String getMonmarca() {
        return monmarca;
    }

    public void setMonmarca(String monmarca) {
        this.monmarca = monmarca;
    }

    public String getMonmodelo() {
        return monmodelo;
    }

    public void setMonmodelo(String monmodelo) {
        this.monmodelo = monmodelo;
    }

    public String getMontipo() {
        return montipo;
    }

    public void setMontipo(String montipo) {
        this.montipo = montipo;
    }

    public String getMonserie() {
        return monserie;
    }

    public void setMonserie(String monserie) {
        this.monserie = monserie;
    }

    public String getTecmarca() {
        return tecmarca;
    }

    public void setTecmarca(String tecmarca) {
        this.tecmarca = tecmarca;
    }

    public String getTecmodelo() {
        return tecmodelo;
    }

    public void setTecmodelo(String tecmodelo) {
        this.tecmodelo = tecmodelo;
    }

    public String getTecserie() {
        return tecserie;
    }

    public void setTecserie(String tecserie) {
        this.tecserie = tecserie;
    }

    public String getTectipo() {
        return tectipo;
    }

    public void setTectipo(String tectipo) {
        this.tectipo = tectipo;
    }

    public String getMoumarca() {
        return moumarca;
    }

    public void setMoumarca(String moumarca) {
        this.moumarca = moumarca;
    }

    public String getMoumodelo() {
        return moumodelo;
    }

    public void setMoumodelo(String moumodelo) {
        this.moumodelo = moumodelo;
    }

    public String getMouserie() {
        return mouserie;
    }

    public void setMouserie(String mouserie) {
        this.mouserie = mouserie;
    }

    public String getMoutipo() {
        return moutipo;
    }

    public void setMoutipo(String moutipo) {
        this.moutipo = moutipo;
    }
    public static Periferico loadPeriferico(ResultSet rs) throws SQLException{
		Periferico periferico = new Periferico();
                periferico.setIdper(rs.getInt("idper"));
		periferico.setUbcodcaf(rs.getString("ubcodcaf"));
		periferico.setUbestacion(rs.getString("ubestacion"));
                periferico.setMonmarca(rs.getString("monmarca"));
                periferico.setMonmodelo(rs.getString("monmodelo"));
                periferico.setMontipo(rs.getString("montipo"));
                periferico.setMonserie(rs.getString("monserie"));
                periferico.setTecmarca(rs.getString("tecmarca"));
                periferico.setTecmodelo(rs.getString("tecmodelo"));
                periferico.setTecserie(rs.getString("tecserie"));
                periferico.setTectipo(rs.getString("tectipo"));
                periferico.setMoumarca(rs.getString("moumarca"));
                periferico.setMoumodelo(rs.getString("moumodelo"));
                periferico.setMouserie(rs.getString("mouserie"));
                periferico.setMoutipo(rs.getString("moutipo"));
                return periferico;
	}
    
}
