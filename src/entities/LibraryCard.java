/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hieu0
 */
public class LibraryCard {
    private int id;
    private String cardCode;
    private String userName;
    private Date dOB;
    private String email;
    private String phone;
    private Date startDate;
    private Date expireDate;

    public LibraryCard() {
    }

    public LibraryCard(int id, String cardCode, String userName, Date dOB, String email, String phone, Date startDate, Date expireDate) {
        this.id = id;
        this.cardCode = cardCode;
        this.userName = userName;
        this.dOB = dOB;
        this.email = email;
        this.phone = phone;
        this.startDate = startDate;
        this.expireDate = expireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getdOB() {
        return dOB;
    }

    public void setdOB(Date dOB) {
        this.dOB = dOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

}
