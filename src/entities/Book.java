/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hieu0
 */
public class Book {
    private int bookId;
    private int cateId;
    private String cateName;
    private int authorId;
    private String authName;
    private String publisher;
    private String name;
    private int publishYear;
    private int quantity;
   // private boolean status;// 1: còn, 0:hết
    

    public Book() {
    }

    public Book(int bookId, int cateId, int authorId, String authName, String cateName, String publisher, String name, int publishYear, int quantity) {
        this.bookId = bookId;
        this.cateId = cateId;
        this.authorId = authorId;
        this.publisher = publisher;
        this.name = name;
        this.publishYear = publishYear;
        this.quantity = quantity;
        this.authName = authName;
        this.cateName = cateName;
    }
    
    public int getBookId() {
        return bookId;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    /*public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }*/
    
}
