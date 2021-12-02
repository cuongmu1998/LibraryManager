/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Admin;
import java.util.List;

/**
 *
 * @author hieu0
 */
public interface AdminDAO {
    public List<Admin> getListAdmin();
    public Admin getAdminById(int admId);
    public List<Admin> getAdminByName(String name);
    public boolean  insertAdmin(Admin adm);
    public boolean updateAdmin(Admin adm);
    public boolean deleteAdmin(int admId);
}
