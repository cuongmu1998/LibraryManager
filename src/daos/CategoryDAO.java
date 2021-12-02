/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Category;
import java.util.List;

/**
 *
 * @author hieu0
 */
public interface CategoryDAO {
    public List<Category> getCategoryList();
    public Category getCategoryById(int cateId);
    public List<Category> getCategoryByName(String name);
    public boolean insertCategory(Category cate);
    public boolean updateCategory(Category cate);
    public boolean deleteCategory(int cateId);
}
