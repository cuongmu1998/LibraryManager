/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author hieu0
 */
public class Borrow {
    private int borrowId;
    private int cardId;
    private int bookId;
    private String cardCode;
    private String userName;
    private String bookName;
    private String user_Email;
    private String user_Phone;
    private Date borrowDate;
    private Date returnDate;

    public Borrow() {
    }

    public Borrow(int borrowId, int cardId, int bookId, String cardCode, String userName, String bookName, String user_Email, String user_Phone, Date borrowDate, Date returnDate) {
        this.borrowId = borrowId;
        this.cardId = cardId;
        this.bookId = bookId;
        this.cardCode = cardCode;
        this.userName = userName;
        this.bookName = bookName;
        this.user_Email = user_Email;
        this.user_Phone = user_Phone;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getUser_Phone() {
        return user_Phone;
    }

    public void setUser_Phone(String user_Phone) {
        this.user_Phone = user_Phone;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
}
