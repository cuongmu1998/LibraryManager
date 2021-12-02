/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Author;
import java.util.List;

/**
 *
 * @author hieu0
 */
public interface AuthorDAO {
    public List<Author> getListAuthor();
    public Author getAuthorById(int authorId);
    public List<Author> getAuthorByName(String name);
    public boolean insertAuthor(Author auth);
    public boolean updateAuthor(Author auth);
    public boolean deleteAuthor(int authorId);
}
