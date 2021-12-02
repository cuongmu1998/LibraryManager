/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import daos.BookDAO;
import database.DBUtility;
import entities.Book;
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
public class BookDAOImpl implements BookDAO{

    @Override
    public List<Book> getListBook() {
        List<Book> list = new ArrayList<>();
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{call sp_GetAllBook}");
            rs = cstmt.executeQuery();
            while(rs.next()){
                Book b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("BookName"));
                b.setCateName(rs.getString("GenreName"));
                b.setAuthName(rs.getString("AuthorName"));
                b.setPublisher(rs.getString("Publisher"));
                b.setPublishYear(rs.getInt("PublishYear"));
                b.setQuantity(rs.getInt("Quantity"));
                list.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        
        return list;
    }

    @Override
    public Book getBookById(int bookId) {
        Book b = null;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetBookById(?)}");
            cstmt.setInt(1,bookId);
            rs = cstmt.executeQuery();
            if(rs.next()){
                b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("BookName"));
                b.setCateName(rs.getString("GenreName"));
                b.setAuthName(rs.getString("AuthorName"));
                b.setPublisher(rs.getString("Publisher"));
                b.setPublishYear(rs.getInt("PublishYear"));
                b.setQuantity(rs.getInt("Quantity"));   
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return b;
    }

    @Override
    public List<Book> getBookByName(String name) {
        List<Book> list = new ArrayList<>();
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
            cstmt = conn.prepareCall("{CALL sp_GetBookByName(?)}");
            cstmt.setString(1, name);
            rs = cstmt.executeQuery();
            while (rs.next()) {                
                Book b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("BookName"));
                b.setCateName(rs.getString("GenreName"));
                b.setAuthName(rs.getString("AuthorName"));
                b.setPublisher(rs.getString("Publisher"));
                b.setPublishYear(rs.getInt("PublishYear"));
                b.setQuantity(rs.getInt("Quantity"));
                list.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public boolean insertBook(Book book) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_InsertBook(?, ?, ?, ?, ?, ?)}");
            cstmt.setString(1, book.getName());
            cstmt.setInt(2, book.getCateId());
            cstmt.setInt(3, book.getAuthorId());
            cstmt.setString(4, book.getPublisher());
            cstmt.setInt(5, book.getPublishYear());
            cstmt.setInt(6, book.getQuantity());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean updateBook(Book book) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_UpdateBook(?, ?, ?, ?, ?, ?, ?)}");
            cstmt.setInt(1, book.getBookId());
            cstmt.setString(2, book.getName());
            cstmt.setInt(3, book.getCateId());
            cstmt.setInt(4, book.getAuthorId());
            cstmt.setString(5, book.getPublisher());
            cstmt.setInt(6, book.getPublishYear());
            cstmt.setInt(7, book.getQuantity());
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
            
        return bl; 
    }

    @Override
    public boolean deleteBook(int bookId) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_DeleteBook(?)}");
            cstmt.setInt(1, bookId);
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }
    
}
