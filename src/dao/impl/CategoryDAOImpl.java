/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import daos.CategoryDAO;
import database.DBUtility;
import entities.Category;
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
public class CategoryDAOImpl implements CategoryDAO{

    @Override
    public List<Category> getCategoryList() {
        List<Category> list = new ArrayList<>();
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAllGener}");
            rs = cstmt.executeQuery();
            while(rs.next()){
                Category cate = new Category();
                cate.setCateId(rs.getInt("GenreId"));
                cate.setName(rs.getString("GenreName"));
                list.add(cate);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public Category getCategoryById(int cateId) {
        Category cate = null;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetGenreById(?)}");
            cstmt.setInt(1, cateId);
            rs = cstmt.executeQuery();
            if(rs.next()){
                cate = new Category();
                cate.setCateId(rs.getInt("GenreId"));
                cate.setName(rs.getString("GenreName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return cate;    }

    @Override
    public List<Category> getCategoryByName(String name) {
        List<Category> list = new ArrayList<>();
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
            cstmt = conn.prepareCall("{CALL sp_GetGenreByName(?)}");
            cstmt.setString(1, name);
            rs = cstmt.executeQuery();
            while(rs.next()){
                Category cate = new Category();
                cate.setCateId(rs.getInt("GenreId"));
                cate.setName(rs.getString("GenreName"));
                list.add(cate);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public boolean insertCategory(Category cate) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_InsertGenre(?)}");
            cstmt.setString(1, cate.getName());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean updateCategory(Category cate) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_UpdateGenre(?, ?)}");
            cstmt.setInt(1, cate.getCateId());
            cstmt.setString(2, cate.getName());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean deleteCategory(int cateId) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_DeleteGenre(?)}");
            cstmt.setInt(1, cateId);
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }
    
}
