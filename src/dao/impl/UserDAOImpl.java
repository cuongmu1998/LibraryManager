/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import daos.UserDAO;
import database.DBUtility;
import entities.User;
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
public class UserDAOImpl implements UserDAO{

    @Override
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAllUser}");
            rs = cstmt.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUserId(rs.getInt("UserId"));
                user.setCardCode(rs.getString("CardCode"));
                user.setName(rs.getString("UserName"));
                user.setDateOfBirth(rs.getDate("DateOfBirth"));
                user.setPhone(rs.getString("Phone"));
                user.setEmail(rs.getString("Email"));
                list.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public User getUserById(int userId) {
        User user = null;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetUserById(?)}");
            cstmt.setInt(1, userId);
            rs = cstmt.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUserId(rs.getInt("UserId"));
                user.setCardCode(rs.getString("CardCode"));
                user.setName(rs.getString("UserName"));
                user.setDateOfBirth(rs.getDate("DateOfBirth"));
                user.setPhone(rs.getString("Phone"));
                user.setEmail(rs.getString("Email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return user;
    }

    @Override
    public List<User> getUserByName(String name) {
        List<User> list = new ArrayList<>();
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
            cstmt = conn.prepareCall("{CALL sp_GetUserByName(?)}");
            cstmt.setString(1, name);
            rs = cstmt.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("UserId"));
                user.setCardCode(rs.getString("CardCode"));
                user.setName(rs.getString("UserName"));
                user.setDateOfBirth(rs.getDate("DateOfBirth"));
                user.setPhone(rs.getString("Phone"));
                user.setEmail(rs.getString("Email"));
                list.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public boolean insertUser(User user) { 
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_InsertUser(?,?,?,?,?)}");
            cstmt.setInt(1, user.getCardId());
            cstmt.setString(2, user.getName());
            java.sql.Date sqlDate = new java.sql.Date(user.getDateOfBirth().getTime());
            cstmt.setDate(3, sqlDate);
            cstmt.setString(4, user.getPhone());
            cstmt.setString(5, user.getEmail());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean updateUser(User user) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_UpdateUser(?,?,?,?,?,?)}");
            cstmt.setInt(1, user.getUserId());
            cstmt.setInt(2, user.getCardId());
            cstmt.setString(3, user.getName());
            cstmt.setDate(4, new java.sql.Date(user.getDateOfBirth().getTime()));
            cstmt.setString(5, user.getPhone());
            cstmt.setString(6, user.getEmail());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean deleteUser(int userId) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_DeleteUser(?)}");
            cstmt.setInt(1, userId);
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }
    
}
