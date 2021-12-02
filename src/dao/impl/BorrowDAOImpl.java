/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import daos.BorrowDAO;
import database.DBUtility;
import entities.Borrow;
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
public class BorrowDAOImpl implements BorrowDAO{

    @Override
    public List<Borrow> getBorrowList() {
        List<Borrow> list = new ArrayList<>();
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAllBorrow}");
            rs = cstmt.executeQuery();
            while (rs.next()) {
                Borrow borrow = new Borrow();
                borrow.setBorrowId(rs.getInt("BorrowId"));
                borrow.setBookName(rs.getString("BookName"));
                borrow.setCardCode(rs.getString("CardCode"));
                borrow.setBorrowDate(rs.getDate("BorrowDate"));
                borrow.setReturnDate(rs.getDate("ReturnDate"));
                list.add(borrow);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        
        return list;
    }

    @Override
    public Borrow getBorrowById(int borrowId) {
        Borrow borrow = null;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetBorrowById(?)}");
            cstmt.setInt(1, borrowId);
            rs = cstmt.executeQuery();
            if (rs.next()) {
                borrow = new Borrow();
                borrow.setBorrowId(rs.getInt("BorrowId"));
                borrow.setBookName(rs.getString("BookName"));
                borrow.setCardCode(rs.getString("CardCode"));
                borrow.setBorrowDate(rs.getDate("BorrowDate"));
                borrow.setReturnDate(rs.getDate("ReturnDate")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return borrow;
    }

    @Override
    public boolean insertBorrow(Borrow borrow) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_InsertBorrow(?, ?, ?, ?)}");
            cstmt.setInt(1, borrow.getCardId());
            cstmt.setInt(2, borrow.getBookId());
            cstmt.setDate(3, new java.sql.Date(borrow.getBorrowDate().getTime()));
            cstmt.setDate(4, new java.sql.Date(borrow.getReturnDate().getTime()));
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean updateBorrow(Borrow borrow) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_UpdateBorrow(?, ?, ?, ?, ?)}");
            cstmt.setInt(1, borrow.getBorrowId());
            cstmt.setInt(2, borrow.getCardId());
            cstmt.setInt(3, borrow.getBookId());
            cstmt.setDate(4, new java.sql.Date(borrow.getBorrowDate().getTime()));
            cstmt.setDate(5, new java.sql.Date(borrow.getReturnDate().getTime()));
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean deleteBorrow(int borrowId) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_DeleteBorrow(?)}");
            cstmt.setInt(1, borrowId);
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public List<Borrow> getBorrowDetailList() {
        List<Borrow> listDetail = new ArrayList<>();
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAllBorrowDetail}");
            rs = cstmt.executeQuery();
            while (rs.next()) {
                Borrow borrowdetail = new Borrow();
                borrowdetail.setBorrowId(rs.getInt("BorrowId"));
                borrowdetail.setUserName(rs.getString("UserName"));
                borrowdetail.setCardCode(rs.getString("CardCode"));
                borrowdetail.setBookName(rs.getString("BookName"));
                borrowdetail.setUser_Email(rs.getString("Email"));
                borrowdetail.setUser_Phone(rs.getString("Phone"));
                borrowdetail.setBorrowDate(rs.getDate("BorrowDate"));
                borrowdetail.setReturnDate(rs.getDate("ReturnDate"));
                listDetail.add(borrowdetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        
        return listDetail;
    }

    @Override
    public Borrow getBorrowDetailById(int borrowId) {
        Borrow borrowdetail = null;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetBorrowDetailById(?)}");
            cstmt.setInt(1, borrowId);
            rs = cstmt.executeQuery();
            if (rs.next()) {
                borrowdetail = new Borrow();
                borrowdetail.setBorrowId(rs.getInt("BorrowId"));
                borrowdetail.setUserName(rs.getString("UserName"));
                borrowdetail.setCardCode(rs.getString("CardCode"));
                borrowdetail.setBookName(rs.getString("BookName"));
                borrowdetail.setUser_Email(rs.getString("Email"));
                borrowdetail.setUser_Phone(rs.getString("Phone"));
                borrowdetail.setBorrowDate(rs.getDate("BorrowDate"));
                borrowdetail.setReturnDate(rs.getDate("ReturnDate"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return borrowdetail;
    }

    @Override
    public List<Borrow> getBorrowDetailByUserName(String userName) {
        List<Borrow> listDetail = new ArrayList<>();
        if (userName.length()==0) {
            userName = "%";
        }else{
            userName = "%"+ userName +"%";
        }
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetBorrowDetailByUserName(?)}");
            cstmt.setString(1, userName);
            rs = cstmt.executeQuery();
            while (rs.next()) {
                Borrow borrowdetail = new Borrow();
                borrowdetail.setBorrowId(rs.getInt("BorrowId"));
                borrowdetail.setUserName(rs.getString("UserName"));
                borrowdetail.setCardCode(rs.getString("CardCode"));
                borrowdetail.setBookName(rs.getString("BookName"));
                borrowdetail.setUser_Email(rs.getString("Email"));
                borrowdetail.setUser_Phone(rs.getString("Phone"));
                borrowdetail.setBorrowDate(rs.getDate("BorrowDate"));
                borrowdetail.setReturnDate(rs.getDate("ReturnDate"));
                listDetail.add(borrowdetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        
        return listDetail;
    }
    
}
