/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.User;
import java.util.List;

/**
 *
 * @author hieu0
 */
public interface UserDAO {
    public List<User> getUserList();
    public User getUserById(int userId);
    public List<User> getUserByName(String name);
    public boolean insertUser(User user);
    public boolean updateUser(User user);
    public boolean deleteUser(int userId);
}
