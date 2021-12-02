package myforms;

import dao.impl.BorrowDAOImpl;
import entities.Borrow;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import myclasses.FunctionClass;

/**
 *
 * @author hieu0
 */
public class ManageBorrowDetailForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    DefaultTableModel dftbl;

    public ManageBorrowDetailForm() {
        initComponents();
        //dftbl = (DefaultTableModel) jTable_User_.getModel();
        // center the form
        this.setLocationRelativeTo(null);

        //display image on the top
        myclasses.FunctionClass func = new FunctionClass();
        func.displayImage(75, 60, "/my_images/user.png", jLabel_FormTitle);

        // add a gray border to the Jpanel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(71, 54, 218));
        jPanel1.setBorder(panelHeaderBorder);

        //customize the Jtable
        jTable_BorrowDetail_.setSelectionBackground(new Color(249, 105, 14));
        jTable_BorrowDetail_.setSelectionForeground(Color.white);
        jTable_BorrowDetail_.setRowHeight(25);
        //jTable_Genres.setShowGrid(true);
        jTable_BorrowDetail_.setBackground(new Color(248, 248, 248));

        //customize the Jtable header row
        jTable_BorrowDetail_.getTableHeader().setBackground(new Color(42, 187, 155));
        jTable_BorrowDetail_.getTableHeader().setForeground(Color.black);
        jTable_BorrowDetail_.getTableHeader().setFont(new Font("Vardana", Font.BOLD, 13));
        jTable_BorrowDetail_.getTableHeader().setOpaque(false);

        //Refresh table
        populateJTableWithBorrowDetail();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm = new javax.swing.JLabel();
        jButton_Delete_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_BorrowDetail_ = new javax.swing.JTable();
        jButton_FindByName_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(71, 54, 218));
        jLabel_FormTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("       Manage Borrow Detail");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm.setBackground(new java.awt.Color(71, 54, 218));
        jLabel_CloseForm.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel_CloseForm.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_CloseForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm.setText("x");
        jLabel_CloseForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm.setOpaque(true);
        jLabel_CloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseFormMouseClicked(evt);
            }
        });

        jButton_Delete_.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Delete_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Delete_.setForeground(new java.awt.Color(111, 13, 200));
        jButton_Delete_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_images/icons8-delete-24.png"))); // NOI18N
        jButton_Delete_.setText("Delete");
        jButton_Delete_.setContentAreaFilled(false);
        jButton_Delete_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete_.setOpaque(true);
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jTable_BorrowDetail_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_BorrowDetail_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BorrowDetail_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_BorrowDetail_);

        jButton_FindByName_.setBackground(new java.awt.Color(0, 255, 0));
        jButton_FindByName_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_FindByName_.setForeground(new java.awt.Color(111, 13, 200));
        jButton_FindByName_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_images/icons8-search-24.png"))); // NOI18N
        jButton_FindByName_.setText("Find by Name");
        jButton_FindByName_.setContentAreaFilled(false);
        jButton_FindByName_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_FindByName_.setOpaque(true);
        jButton_FindByName_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FindByName_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_FindByName_)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Delete_)
                    .addComponent(jButton_FindByName_))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClicked

        // Display DashboardForm
        DashboardForm dash_f = new DashboardForm();
        dash_f.setVisible(true);
        
        // close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClicked

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        // TODO add your handling code here:
        int index =  jTable_BorrowDetail_.getSelectedRow();
        try{
                int id = (int) jTable_BorrowDetail_.getValueAt(index, 0);
                boolean bl = new BorrowDAOImpl().deleteBorrow(id);
                if (bl) {
                    JOptionPane.showMessageDialog(this, "Delete successful");
                    //refresh Jtable
                    populateJTableWithBorrowDetail();
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showConfirmDialog(this, "Invalid Borrow id", "Error", 0);
            }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jTable_BorrowDetail_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BorrowDetail_MouseClicked

        // Display the selected LibraryCard
        int index =  jTable_BorrowDetail_.getSelectedRow();
        
        //get values
        String id = jTable_BorrowDetail_.getValueAt(index, 0).toString();
        String userName = jTable_BorrowDetail_.getValueAt(index, 1).toString();
        String cardCode = jTable_BorrowDetail_.getValueAt(index, 2).toString();
        String bookName = jTable_BorrowDetail_.getValueAt(index, 3).toString();
        String email = jTable_BorrowDetail_.getValueAt(index, 4).toString(); 
        String phone = jTable_BorrowDetail_.getValueAt(index, 5).toString();
        String brD = jTable_BorrowDetail_.getValueAt(index, 6).toString();
        String rtD = jTable_BorrowDetail_.getValueAt(index, 7).toString();
    }//GEN-LAST:event_jTable_BorrowDetail_MouseClicked

    private void jButton_FindByName_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FindByName_ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String name = JOptionPane.showInputDialog("Enter Name");
        if (name!=null && name.length()>0) {
            List<Borrow> listBorrowDetail = new BorrowDAOImpl().getBorrowDetailByUserName(name);
            if (listBorrowDetail==null || listBorrowDetail.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Name "+name, "Error", 0);
            }else{
                 String [] colNames = {"ID", "User Name", "Card Code", "Book", "User Email", "User Phone", "Borrow Date", "Return Date"};
        
                //rows
                Object[][] rows = new Object[listBorrowDetail.size()][colNames.length];
                for (int i = 0; i < listBorrowDetail.size(); i++) {
                    rows[i][0] = listBorrowDetail.get(i).getBorrowId();
                    rows[i][1] = listBorrowDetail.get(i).getUserName();
                    rows[i][2] = listBorrowDetail.get(i).getCardCode();
                    rows[i][3] = listBorrowDetail.get(i).getBookName();
                    rows[i][4] = listBorrowDetail.get(i).getUser_Email();
                    rows[i][5] = listBorrowDetail.get(i).getUser_Phone();
                    rows[i][6] = sf.format(listBorrowDetail.get(i).getBorrowDate());
                    rows[i][7] = sf.format(listBorrowDetail.get(i).getReturnDate());
                }
                dftbl = new DefaultTableModel(rows, colNames);
                jTable_BorrowDetail_.setModel(dftbl);
            }
        }
    }//GEN-LAST:event_jButton_FindByName_ActionPerformed
        
    //create a function to populate the jTable with Borrow
    public void populateJTableWithBorrowDetail(){
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
//        List<LibraryCard> listLib = new LibraryCardDAOImpl().getCardList();
//        List<Book> listBook = new BookDAOImpl().getListBook();
//        List<User> listUser = new UserDAOImpl().getUserList();
        List<Borrow> listBorrowDetail = new BorrowDAOImpl().getBorrowDetailList();
        
        //Jtable column
        String [] colNames = {"ID", "User Name", "Card Code", "Book", "User Email", "User Phone", "Borrow Date", "Return Date"};
        
        //rows
        Object[][] rows = new Object[listBorrowDetail.size()][colNames.length];
        for (int i = 0; i < listBorrowDetail.size(); i++) {
            rows[i][0] = listBorrowDetail.get(i).getBorrowId();
            rows[i][1] = listBorrowDetail.get(i).getUserName();
            rows[i][2] = listBorrowDetail.get(i).getCardCode();
            rows[i][3] = listBorrowDetail.get(i).getBookName();
            rows[i][4] = listBorrowDetail.get(i).getUser_Email();
            rows[i][5] = listBorrowDetail.get(i).getUser_Phone();
            rows[i][6] = sf.format(listBorrowDetail.get(i).getBorrowDate());
            rows[i][7] = sf.format(listBorrowDetail.get(i).getReturnDate());
        }
        dftbl = new DefaultTableModel(rows, colNames);
        jTable_BorrowDetail_.setModel(dftbl);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageBorrowDetailForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBorrowDetailForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBorrowDetailForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBorrowDetailForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBorrowDetailForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_FindByName_;
    private javax.swing.JLabel jLabel_CloseForm;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_BorrowDetail_;
    // End of variables declaration//GEN-END:variables
}
