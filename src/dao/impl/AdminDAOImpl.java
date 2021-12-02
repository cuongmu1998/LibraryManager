/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import daos.AdminDAO;
import database.DBUtility;
import entities.Admin;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hieu0
 */
public class AdminDAOImpl implements AdminDAO{
    
    @Override
    public List<Admin> getListAdmin() {
        List<Admin> list = new ArrayList<>();
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAllAdmin}");
            rs = cstmt.executeQuery();
            while(rs.next()){
                Admin ad = new Admin();
                ad.setAdminId(rs.getInt("AdminId"));
                ad.setName(rs.getString("AdminName"));
                ad.setPassword(rs.getString("Password"));
                list.add(ad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public Admin getAdminById(int admId) {
        Admin ad = null;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAdminById(?)}");
            cstmt.setInt(1, admId);
            rs = cstmt.executeQuery();
            if(rs.next()){
                ad = new Admin();
                ad.setAdminId(rs.getInt("AdminId"));
                ad.setName(rs.getString("AdminName"));
                ad.setPassword(rs.getString("Password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return ad;
    }

    @Override
    public List<Admin> getAdminByName(String name) {
        List<Admin> list = new ArrayList<>();
        if (name.length()==0) {
            name = "%";
        }else{
            name = "%"+name+"%";
        }
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAdminByName(?)}");
            cstmt.setString(1, name);
            rs = cstmt.executeQuery();
            if(rs.next()){
                Admin ad = new Admin();
                ad.setAdminId(rs.getInt("AdminId"));
                ad.setName(rs.getString("AdminName"));
                ad.setPassword(rs.getString("Password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public boolean insertAdmin(Admin adm) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_InsertAdmin(?, ?)}");
            cstmt.setString(1, adm.getName());
            cstmt.setString(2, adm.getPassword());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean updateAdmin(Admin adm) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_UpdateAdmin(?, ?, ?)}");
            cstmt.setString(1, adm.getName());
            cstmt.setString(2, adm.getPassword());
            cstmt.setInt(3, adm.getAdminId());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;    
    }

    @Override
    public boolean deleteAdmin(int admId) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_DeleteAdmin(?)}");
            cstmt.setInt(1, admId);
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }
    
}
