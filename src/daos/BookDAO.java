/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Book;
import java.util.List;

/**
 *
 * @author hieu0
 */
public interface BookDAO {
    public List<Book> getListBook();
    public Book getBookById(int bookId);
    public List<Book> getBookByName(String name);
    public boolean insertBook(Book book);
    public boolean updateBook(Book book);
    public boolean deleteBook(int bookId);
}
