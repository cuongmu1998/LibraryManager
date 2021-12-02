/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import daos.LibraryCardDAO;
import database.DBUtility;
import entities.LibraryCard;
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
public class LibraryCardDAOImpl implements LibraryCardDAO{

    @Override
    public List<LibraryCard> getCardList() {
        List<LibraryCard> list = new ArrayList<>();
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetAllLibraryCard}");
            rs = cstmt.executeQuery();
            while(rs.next()){
                LibraryCard card = new LibraryCard();
                card.setId(rs.getInt("CardId"));
                card.setCardCode(rs.getString("CardCode"));
                card.setUserName(rs.getString("UserName"));
                card.setdOB(rs.getDate("DateOfBirth"));
                card.setEmail(rs.getString("Email"));
                card.setPhone(rs.getString("Phone"));
                card.setStartDate(rs.getDate("StartDate"));
                card.setExpireDate(rs.getDate("ExpireDate"));
                list.add(card);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryCardDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public LibraryCard getCardById(int libId) {
        LibraryCard card = null;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetLibraryCardById(?)}");
            cstmt.setInt(1, libId);
            rs = cstmt.executeQuery();
            if(rs.next()){
                card = new LibraryCard();
                card.setId(rs.getInt("CardId"));
                card.setCardCode(rs.getString("CardCode"));
                card.setStartDate(rs.getDate("StartDate"));
                card.setExpireDate(rs.getDate("ExpireDate"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryCardDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return card;
    }
    
    @Override
    public List<LibraryCard> getCardByCardCode(String cardcode) {
        List<LibraryCard> list = new ArrayList<>();
        if (cardcode.length()==0) {
            cardcode = "%";
        }else{
            cardcode = "%"+cardcode+"%";
        }
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_GetCardByCardCode(?)}");
            cstmt.setString(1, cardcode);
            rs = cstmt.executeQuery();
            while(rs.next()){
                LibraryCard card = new LibraryCard();
                card.setId(rs.getInt("CardId"));
                card.setCardCode(rs.getString("CardCode"));
                card.setStartDate(rs.getDate("StartDate"));
                card.setExpireDate(rs.getDate("ExpireDate"));
                list.add(card);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return list;
    }

    @Override
    public boolean insertCard(LibraryCard lib) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_InsertLibraryCard(?,?,?,?,?,?,?)}");
            cstmt.setString(1, lib.getCardCode());
            cstmt.setString(2, lib.getUserName());
            cstmt.setDate(3, new java.sql.Date(lib.getdOB().getTime()));
            cstmt.setString(4, lib.getEmail());
            cstmt.setString(5, lib.getPhone());
            cstmt.setDate(6, new java.sql.Date(lib.getStartDate().getTime()));
            cstmt.setDate(7, new java.sql.Date(lib.getExpireDate().getTime()));
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryCardDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean updateCard(LibraryCard lib) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_UpdateLibraryCard(?,?,?,?,?,?,?,?)}");
            cstmt.setInt(1, lib.getId());
            cstmt.setString(2, lib.getCardCode());
            cstmt.setString(3, lib.getUserName());
            cstmt.setDate(4, new java.sql.Date(lib.getdOB().getTime()));
            cstmt.setString(5, lib.getEmail());
            cstmt.setString(6, lib.getPhone());
            cstmt.setDate(7, new java.sql.Date(lib.getStartDate().getTime()));
            cstmt.setDate(8, new java.sql.Date(lib.getExpireDate().getTime()));
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryCardDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }

    @Override
    public boolean deleteCard(int libId) {
        boolean bl = false;
        Connection conn;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnetion();
        try {
            cstmt = conn.prepareCall("{CALL sp_DeleteLibraryCard(?)}");
            cstmt.setInt(1, libId);
            int i = cstmt.executeUpdate();
            if (i>0) {
                bl=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryCardDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(conn, cstmt, rs);
        }
        return bl;
    }
}
