/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Borrow;
import java.util.List;

/**
 *
 * @author hieu0
 */
public interface BorrowDAO {
    public List<Borrow> getBorrowList();
    public Borrow getBorrowById(int borrowId);
    public boolean insertBorrow(Borrow borrow);
    public boolean updateBorrow(Borrow borrow);
    public boolean deleteBorrow(int borrowId);
    public List<Borrow> getBorrowDetailList();
    public Borrow getBorrowDetailById(int borrowId);
    public List<Borrow> getBorrowDetailByUserName(String userName);
}
