/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.LibraryCard;
import java.util.List;

/**
 *
 * @author hieu0
 */
public interface LibraryCardDAO {
    public List<LibraryCard> getCardList();
    public List<LibraryCard> getCardByCardCode(String cardcode);
    public LibraryCard getCardById(int libId);
    public boolean insertCard(LibraryCard lib);
    public boolean updateCard(LibraryCard lib);
    public boolean deleteCard(int libId);
}
