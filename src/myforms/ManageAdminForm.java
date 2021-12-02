package myforms;

import dao.impl.AdminDAOImpl;
import dao.impl.AuthorDAOImpl;
import entities.Admin;
import entities.Author;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
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
public class ManageAdminForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    DefaultTableModel dftbl;
    public ManageAdminForm() {
        initComponents();
        
        // center the form
        this.setLocationRelativeTo(null);
        
        //display image on the top
        myclasses.FunctionClass func = new FunctionClass();
        func.displayImage(75, 60, "/my_images/author.png", jLabel_FormTitle);
        
        // add a gray border to the Jpanel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 67));
        jPanel1.setBorder(panelHeaderBorder);
        
        //customize the Jtable
        jTable_Admin.setSelectionBackground(new Color(249, 105, 14));
        jTable_Admin.setSelectionForeground(Color.black);
        jTable_Admin.setRowHeight(25);
        //jTable_Genres.setShowGrid(true);
        jTable_Admin.setBackground(new Color(248,248,248));
        
        //customize the Jtable header row
        jTable_Admin.getTableHeader().setBackground(new Color(42,187,155));
        jTable_Admin.getTableHeader().setForeground(Color.white);
        jTable_Admin.getTableHeader().setFont(new Font("Vardana", Font.BOLD, 13));
        jTable_Admin.getTableHeader().setOpaque(false);
        
        //Refresh table
        populateJTableWithAdmin();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Admin = new javax.swing.JTable();
        jButton_FindById_ = new javax.swing.JButton();
        jButton_FindByName_ = new javax.swing.JButton();
        txt_Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(1, 50, 67));
        jLabel_FormTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("       Manage Admins");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm.setBackground(new java.awt.Color(1, 50, 67));
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password:");

        txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameActionPerformed(evt);
            }
        });

        txt_Id.setEditable(false);
        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });

        jButton_Add_.setBackground(new java.awt.Color(0, 255, 0));
        jButton_Add_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_.setForeground(new java.awt.Color(111, 13, 200));
        jButton_Add_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_images/icons8-add-24.png"))); // NOI18N
        jButton_Add_.setText("Add");
        jButton_Add_.setContentAreaFilled(false);
        jButton_Add_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_.setOpaque(true);
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setBackground(new java.awt.Color(0, 255, 0));
        jButton_Edit_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_.setForeground(new java.awt.Color(111, 13, 200));
        jButton_Edit_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_images/icons8-update-24.png"))); // NOI18N
        jButton_Edit_.setText("Edit");
        jButton_Edit_.setContentAreaFilled(false);
        jButton_Edit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_.setOpaque(true);
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
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

        jTable_Admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AdminMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Admin);

        jButton_FindById_.setBackground(new java.awt.Color(0, 255, 0));
        jButton_FindById_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_FindById_.setForeground(new java.awt.Color(111, 13, 200));
        jButton_FindById_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_images/icons8-search-24.png"))); // NOI18N
        jButton_FindById_.setText("Find by Id");
        jButton_FindById_.setContentAreaFilled(false);
        jButton_FindById_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_FindById_.setOpaque(true);
        jButton_FindById_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FindById_ActionPerformed(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Password)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton_FindById_)
                        .addGap(59, 59, 59)
                        .addComponent(jButton_FindByName_))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Delete_)
                    .addComponent(jButton_Edit_)
                    .addComponent(jButton_Add_)
                    .addComponent(jButton_FindById_, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_FindByName_, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameActionPerformed

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdActionPerformed

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        // add new Author
        String adName = txt_Name.getText().trim();
        String pass = txt_Password.getText().trim();
        
        // check textfield empty or not
        if (adName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the author name", "", 2);
        } else{
            Admin ad = new Admin();
            ad.setName(adName);
            ad.setPassword(pass);
            boolean bl = new AdminDAOImpl().insertAdmin(ad);
            if (bl) {
                JOptionPane.showMessageDialog(this, "Insert successful");
                //refresh Jtable
                populateJTableWithAdmin();
                
                //clear text from the textfield
                txt_Id.setText("");
                txt_Name.setText("");
                txt_Password.setText("");
            }
            
        }
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        // Edit category
        String authId = txt_Id.getText().trim();
        String name = txt_Name.getText().trim();
        String pass = txt_Password.getText().trim();
        if (authId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the author id", "Author Id", 2);
        }else if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name field cannot be empty", "Name", 2);
        }else if (pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password field cannot be empty", "Password", 2);
        }else{
            try {
                int id = Integer.parseInt(authId);
                Admin ad = new Admin();
                ad.setAdminId(id);
                ad.setName(name);
                ad.setPassword(pass);
                boolean bl = new AdminDAOImpl().updateAdmin(ad);
                if (bl) {
                    JOptionPane.showMessageDialog(this, "Edit successful");
                    //refresh Jtable
                    populateJTableWithAdmin();
                    //clear text from the textfield
                    txt_Id.setText("");
                    txt_Name.setText("");
                    txt_Password.setText("");
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showConfirmDialog(this, "Invalid author id", "Error", 0);
            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        // TODO add your handling code here:
        try {
                int id = Integer.parseInt(txt_Id.getText());
                boolean bl = new AdminDAOImpl().deleteAdmin(id);
                if (bl) {
                    JOptionPane.showMessageDialog(this, "Delete successful");
                    //refresh Jtable
                    populateJTableWithAdmin();
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showConfirmDialog(this, "Invalid author id", "Error", 0);
            }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jTable_AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AdminMouseClicked
        // Display the selected Author
        int index =  jTable_Admin.getSelectedRow();
        //get values
        String id = jTable_Admin.getValueAt(index, 0).toString();
        String name = jTable_Admin.getValueAt(index, 1).toString();
        String pass = jTable_Admin.getValueAt(index, 2).toString();
        
        //show data in textfield
        txt_Id.setText(id);
        txt_Name.setText(name);
        txt_Password.setText(pass);
    }//GEN-LAST:event_jTable_AdminMouseClicked

    private void jButton_FindById_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FindById_ActionPerformed
        // TODO add your handling code here:
        String strId = JOptionPane.showInputDialog("Enter Id!");
        if (strId!=null && strId.length()>0) {
            try {
                int adminId = Integer.parseInt(strId);
                Admin ad = new AdminDAOImpl().getAdminById(adminId);
                if (ad!=null) {
                    txt_Id.setText(ad.getAdminId()+"");
                    txt_Name.setText(ad.getName());
                    txt_Password.setText(ad.getPassword());
                }else{
                    JOptionPane.showMessageDialog(this, "Invalid id "+strId, "Error", 0);
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_FindById_ActionPerformed

    private void jButton_FindByName_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FindByName_ActionPerformed
        // TODO add your handling code here:
        String strAdName = JOptionPane.showInputDialog("Enter Name");
        if (strAdName!=null && strAdName.length()>0) {
            List<Admin> list = new AdminDAOImpl().getAdminByName(strAdName);
            if (list==null || list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid Name "+strAdName, "Error", 0);
            }else{
                //Jtable column
                String [] colNames = {"ID", "NAME", "Password"};

                //rows
                Object[][] rows = new Object[list.size()][colNames.length];
                for (int i = 0; i < list.size(); i++) {
                    rows[i][0] = list.get(i).getAdminId();
                    rows[i][1] = list.get(i).getName();
                    rows[i][2] = list.get(i).getPassword();
                }
                dftbl = new DefaultTableModel(rows, colNames);
                jTable_Admin.setModel(dftbl);
            }
        }
    }//GEN-LAST:event_jButton_FindByName_ActionPerformed

    //create a function to populate the jTable with Admin
    public void populateJTableWithAdmin(){
        List<Admin> list = new AdminDAOImpl().getListAdmin();
        
        //Jtable column
        String [] colNames = {"ID", "NAME", "Password"};
        
        //rows
        Object[][] rows = new Object[list.size()][colNames.length];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getAdminId();
            rows[i][1] = list.get(i).getName();
            rows[i][2] = list.get(i).getPassword();
        }
        dftbl = new DefaultTableModel(rows, colNames);
        jTable_Admin.setModel(dftbl);
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
            java.util.logging.Logger.getLogger(ManageAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_FindById_;
    private javax.swing.JButton jButton_FindByName_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_CloseForm;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Admin;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables
}
