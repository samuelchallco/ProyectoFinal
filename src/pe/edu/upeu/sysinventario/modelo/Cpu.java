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
public class Cpu {
    public int idcpu;
    public String ub_caf;
    public String ub_est;
    public String pp_mar;
    public String pp_pla;
    public String pp_ser;
    public String p_mar;
    public String p_model;
    public String p_ser;
    public String p_vel;
    public String dd_mar1;
    public String dd_mar2;
    public String dd_tipo;
    public String dd_ser1;
    public String dd_ser2;
    public String dd_cap1;
    public String dd_cap2;
    public String ram_mar;
    public String ram_model;
    public String ram_cap;
    public String uo_mar;
    public String uo_tipo;
    public String uo_ser;
    public String tv_mar;
    public String tv_tipo;
    public String tv_memo;
    public String tv_ser1;
    public String tv_ser2;
    public String ts_inte;
    public String tr_mar;
    public String tr_model;
    public String tr_ser;

    public Cpu() {
    }

    public Cpu(String ub_caf, String ub_est, String pp_mar, String pp_pla, String pp_ser, String p_mar, String p_model, String p_ser, String p_vel, String dd_mar1, String dd_mar2, String dd_tipo, String dd_ser1, String dd_ser2, String dd_cap1, String dd_cap2, String ram_mar, String ram_model, String ram_cap, String uo_mar, String uo_tipo, String uo_ser, String tv_mar, String tv_tipo, String tv_memo, String tv_ser1, String tv_ser2, String ts_inte, String tr_mar, String tr_model, String tr_ser) {
        this.ub_caf = ub_caf;
        this.ub_est = ub_est;
        this.pp_mar = pp_mar;
        this.pp_pla = pp_pla;
        this.pp_ser = pp_ser;
        this.p_mar = p_mar;
        this.p_model = p_model;
        this.p_ser = p_ser;
        this.p_vel = p_vel;
        this.dd_mar1 = dd_mar1;
        this.dd_mar2 = dd_mar2;
        this.dd_tipo = dd_tipo;
        this.dd_ser1 = dd_ser1;
        this.dd_ser2 = dd_ser2;
        this.dd_cap1 = dd_cap1;
        this.dd_cap2 = dd_cap2;
        this.ram_mar = ram_mar;
        this.ram_model = ram_model;
        this.ram_cap = ram_cap;
        this.uo_mar = uo_mar;
        this.uo_tipo = uo_tipo;
        this.uo_ser = uo_ser;
        this.tv_mar = tv_mar;
        this.tv_tipo = tv_tipo;
        this.tv_memo = tv_memo;
        this.tv_ser1 = tv_ser1;
        this.tv_ser2 = tv_ser2;
        this.ts_inte = ts_inte;
        this.tr_mar = tr_mar;
        this.tr_model = tr_model;
        this.tr_ser = tr_ser;
    }

    public int getIdcpu() {
        return idcpu;
    }

    public void setIdcpu(int idcpu) {
        this.idcpu = idcpu;
    }

    public String getUb_caf() {
        return ub_caf;
    }

    public void setUb_caf(String ub_caf) {
        this.ub_caf = ub_caf;
    }

    public String getUb_est() {
        return ub_est;
    }

    public void setUb_est(String ub_est) {
        this.ub_est = ub_est;
    }

    public String getPp_mar() {
        return pp_mar;
    }

    public void setPp_mar(String pp_mar) {
        this.pp_mar = pp_mar;
    }

    public String getPp_pla() {
        return pp_pla;
    }

    public void setPp_pla(String pp_pla) {
        this.pp_pla = pp_pla;
    }

    public String getPp_ser() {
        return pp_ser;
    }

    public void setPp_ser(String pp_ser) {
        this.pp_ser = pp_ser;
    }

    public String getP_mar() {
        return p_mar;
    }

    public void setP_mar(String p_mar) {
        this.p_mar = p_mar;
    }

    public String getP_model() {
        return p_model;
    }

    public void setP_model(String p_model) {
        this.p_model = p_model;
    }

    public String getP_ser() {
        return p_ser;
    }

    public void setP_ser(String p_ser) {
        this.p_ser = p_ser;
    }

    public String getP_vel() {
        return p_vel;
    }

    public void setP_vel(String p_vel) {
        this.p_vel = p_vel;
    }

    public String getDd_mar1() {
        return dd_mar1;
    }

    public void setDd_mar1(String dd_mar1) {
        this.dd_mar1 = dd_mar1;
    }

    public String getDd_mar2() {
        return dd_mar2;
    }

    public void setDd_mar2(String dd_mar2) {
        this.dd_mar2 = dd_mar2;
    }

    public String getDd_tipo() {
        return dd_tipo;
    }

    public void setDd_tipo(String dd_tipo) {
        this.dd_tipo = dd_tipo;
    }

    public String getDd_ser1() {
        return dd_ser1;
    }

    public void setDd_ser1(String dd_ser1) {
        this.dd_ser1 = dd_ser1;
    }

    public String getDd_ser2() {
        return dd_ser2;
    }

    public void setDd_ser2(String dd_ser2) {
        this.dd_ser2 = dd_ser2;
    }

    public String getDd_cap1() {
        return dd_cap1;
    }

    public void setDd_cap1(String dd_cap1) {
        this.dd_cap1 = dd_cap1;
    }

    public String getDd_cap2() {
        return dd_cap2;
    }

    public void setDd_cap2(String dd_cap2) {
        this.dd_cap2 = dd_cap2;
    }

    public String getRam_mar() {
        return ram_mar;
    }

    public void setRam_mar(String ram_mar) {
        this.ram_mar = ram_mar;
    }

    public String getRam_model() {
        return ram_model;
    }

    public void setRam_model(String ram_model) {
        this.ram_model = ram_model;
    }

    public String getRam_cap() {
        return ram_cap;
    }

    public void setRam_cap(String ram_cap) {
        this.ram_cap = ram_cap;
    }

    public String getUo_mar() {
        return uo_mar;
    }

    public void setUo_mar(String uo_mar) {
        this.uo_mar = uo_mar;
    }

    public String getUo_tipo() {
        return uo_tipo;
    }

    public void setUo_tipo(String uo_tipo) {
        this.uo_tipo = uo_tipo;
    }

    public String getUo_ser() {
        return uo_ser;
    }

    public void setUo_ser(String uo_ser) {
        this.uo_ser = uo_ser;
    }

    public String getTv_mar() {
        return tv_mar;
    }

    public void setTv_mar(String tv_mar) {
        this.tv_mar = tv_mar;
    }

    public String getTv_tipo() {
        return tv_tipo;
    }

    public void setTv_tipo(String tv_tipo) {
        this.tv_tipo = tv_tipo;
    }

    public String getTv_memo() {
        return tv_memo;
    }

    public void setTv_memo(String tv_memo) {
        this.tv_memo = tv_memo;
    }

    public String getTv_ser1() {
        return tv_ser1;
    }

    public void setTv_ser1(String tv_ser1) {
        this.tv_ser1 = tv_ser1;
    }

    public String getTv_ser2() {
        return tv_ser2;
    }

    public void setTv_ser2(String tv_ser2) {
        this.tv_ser2 = tv_ser2;
    }

    public String getTs_inte() {
        return ts_inte;
    }

    public void setTs_inte(String ts_inte) {
        this.ts_inte = ts_inte;
    }

    public String getTr_mar() {
        return tr_mar;
    }

    public void setTr_mar(String tr_mar) {
        this.tr_mar = tr_mar;
    }

    public String getTr_model() {
        return tr_model;
    }

    public void setTr_model(String tr_model) {
        this.tr_model = tr_model;
    }

    public String getTr_ser() {
        return tr_ser;
    }

    public void setTr_ser(String tr_ser) {
        this.tr_ser = tr_ser;
    }
    public static Cpu loadCpu(ResultSet rs) throws SQLException{
		Cpu cpu = new Cpu();
                cpu.setIdcpu(rs.getInt("idCPU"));
		cpu.setUb_caf(rs.getString("UB_CodCAF"));
                cpu.setUb_est(rs.getString("UB_Estacion"));
                cpu.setPp_mar(rs.getString("PP_Marca"));
                cpu.setPp_pla(rs.getString("PP_Placa"));
                cpu.setPp_ser(rs.getString("PP_Serie"));
                cpu.setP_mar(rs.getString("P_Marca"));
                cpu.setP_model(rs.getString("P_Modelo"));
                cpu.setP_ser(rs.getString("P_Serie"));
                cpu.setP_vel(rs.getString("P_Velocidad"));  
                cpu.setDd_mar1(rs.getString("DD_Marca1"));
                cpu.setDd_mar2(rs.getString("DD_Marca2"));
                cpu.setDd_tipo(rs.getString("DD_Tipo"));
                cpu.setDd_ser1(rs.getString("DD_Serie1"));
                cpu.setDd_ser2(rs.getString("DD_Serie2"));
                cpu.setDd_cap1(rs.getString("DD_Capacidad1"));
                cpu.setDd_cap2(rs.getString("DD_Capacidad2"));
                cpu.setRam_mar(rs.getString("RAM_Marca"));
                cpu.setRam_model(rs.getString("RAM_Modelo"));
                cpu.setRam_cap(rs.getString("RAM_Capacidad"));
                cpu.setUo_mar(rs.getString("UO_Marca"));
                cpu.setUo_tipo(rs.getString("UO_Tipo"));
                cpu.setUo_ser(rs.getString("UO_Serie"));
                cpu.setTv_mar(rs.getString("TV_Marca"));
                cpu.setTv_tipo(rs.getString("TV_Tipo"));
                cpu.setTv_memo(rs.getString("TV_Memoria"));
                cpu.setTv_ser1(rs.getString("TV_Serie1"));
                cpu.setTv_ser2(rs.getString("TV_Serie2"));
                cpu.setTs_inte(rs.getString("TS_Integrado"));
                cpu.setTr_mar(rs.getString("TR_Marca"));
                cpu.setTr_model(rs.getString("TR_Modelo"));
                cpu.setTr_ser(rs.getString("TR_Serie"));
		return cpu;
	}
}

