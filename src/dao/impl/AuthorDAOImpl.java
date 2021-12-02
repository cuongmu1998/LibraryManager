/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import daos.AuthorDAO;
import database.DBUtility;
import entities.Author;
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
public class AuthorDAOImpl implements AuthorDAO{

    @Override
    public List<Author> getListAuthor() {
        List<Author> list = new ArrayList<>();
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAllAuthor}");
            rs = cstmt.executeQuery();
            while(rs.next()){
                Author auth = new Author();
                auth.setAuthorId(rs.getInt("AuthorId"));
                auth.setName(rs.getString("AuthorName"));
                list.add(auth);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public Author getAuthorById(int authorId) {
        Author auth = null;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAuthorById(?)}");
            cstmt.setInt(1, authorId);
            rs = cstmt.executeQuery();
            if(rs.next()){
                auth = new Author();
                auth.setAuthorId(rs.getInt("AuthorId"));
                auth.setName(rs.getString("AuthorName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return auth;
    }

    @Override
    public List<Author> getAuthorByName(String name) {
        List<Author> list = new ArrayList<>();
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
            cstmt = conn.prepareCall("{CALL sp_GetAuthorByName(?)}");
            cstmt.setString(1, name);
            rs = cstmt.executeQuery();
            while(rs.next()){
                Author auth = new Author();
                auth.setAuthorId(rs.getInt("AuthorId"));
                auth.setName(rs.getString("AuthorName"));
                list.add(auth);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public boolean insertAuthor(Author auth) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_InsertAuthor(?)}");
            cstmt.setString(1, auth.getName());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean updateAuthor(Author auth) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_UpdateAuthor(?, ?)}");
            cstmt.setInt(1, auth.getAuthorId());
            cstmt.setString(2, auth.getName());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean deleteAuthor(int authorId) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_DeleteAuthor(?)}");
            cstmt.setInt(1, authorId);
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }
    
}
