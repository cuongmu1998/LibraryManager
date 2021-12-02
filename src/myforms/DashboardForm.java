/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myforms;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;
import myclasses.FunctionClass;

/**
 *
 * @author hieu0
 */
public class DashboardForm extends javax.swing.JFrame {
    
    //the button border
    Border buttonBorder1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
    Border buttonBorder0 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(36,37,42));
    
    
    myclasses.FunctionClass func = new FunctionClass();
    /**
     * Creates new form DashboardForm
     */
    public DashboardForm() {
        initComponents();
        
        // Center the form
        this.setLocationRelativeTo(null);
        
        //display image in the Dashboard left side
        func.displayImage(jLabel_Dashboard_Logo.getWidth(), jLabel_Dashboard_Logo.getHeight(), "/my_images/library.png", jLabel_Dashboard_Logo);
        func.displayImage(jLabel_ClickManageGenreForm.getWidth(), jLabel_ClickManageGenreForm.getHeight(), "/my_images/hierarchy.png", jLabel_ClickManageGenreForm);
        func.displayImage(jLabel_ManageAuthorForm.getWidth(), jLabel_ManageAuthorForm.getHeight(), "/my_images/auth.png", jLabel_ManageAuthorForm);
        func.displayImage(jLabel_ManageBookForm.getWidth(), jLabel_ManageBookForm.getHeight(), "/my_images/book.png", jLabel_ManageBookForm);
        func.displayImage(jLabel_ManageLibraryCard.getWidth(), jLabel_ManageLibraryCard.getHeight(), "/my_images/libraryCard.png", jLabel_ManageLibraryCard);
        func.displayImage(jLabel_ManageBorrowForm.getWidth(), jLabel_ManageBorrowForm.getHeight(), "/my_images/borrow.png", jLabel_ManageBorrowForm);
        func.displayImage(jLabel_ManageBorrowDetailForm.getWidth(), jLabel_ManageBorrowDetailForm.getHeight(), "/my_images/details.png", jLabel_ManageBorrowDetailForm);
        //add a border to the Panel header
        Border panelHeaderBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white);
        jPanel_Header.setBorder(panelHeaderBorder);
        
        //add more Borders
        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(235,125,22));
        jPanel_1_header.setBorder(panelHeader_1_Border);
        
        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(16,138,32));
        jPanel_2_header.setBorder(panelHeader_2_Border);
        
        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(115,40,125));
        jPanel_3_header.setBorder(panelHeader_3_Border);
        
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(31, 58, 147));
        jPanel_4_header.setBorder(panelHeader_4_Border);
        
        Border panelHeader_5_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(247, 202, 24));
        jPanel_5_header.setBorder(panelHeader_5_Border);
        
        Border panelHeader_6_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(83, 51, 237));
        jPanel_6_header.setBorder(panelHeader_6_Border);
        
        //jLabel text center
        jLabel_Admins.setHorizontalAlignment(JLabel.CENTER);
        jLabel_Auth.setHorizontalAlignment(JLabel.CENTER);
        jLabel_Book.setHorizontalAlignment(JLabel.CENTER);
        jLabel_Genre.setHorizontalAlignment(JLabel.CENTER);
        jLabel_Lib.setHorizontalAlignment(JLabel.CENTER);
        jLabel_Borrow.setHorizontalAlignment(JLabel.CENTER);
        jLabel_Details.setHorizontalAlignment(JLabel.CENTER);
        
        //add borders to the buttons
        addBorder();
        
        // the hover effect
        butonsHoverEffect();
        
    }
    
    //create a function to add border to all the button in the jPanel Menu
    public void addBorder(){
        //Get all the component in the jPanel menu
        Component[] comps = jPanel_Menu.getComponents();
        for (Component comp : comps) {
            //check the component is a button
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                //add borders
                button.setBorder(buttonBorder0);
            }
        }
    }
    
    // Create a function to add a Hover effect on the menu buttons
    public void butonsHoverEffect(){
        //Get all the component in the jPanel menu
        Component[] comps = jPanel_Menu.getComponents();
        for (Component comp : comps) {
            //check the component is a button
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                
                //add the action we want to the button
                button.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseEntered(MouseEvent evt){
                        button.setBorder(buttonBorder1);
                    }
                    
                    @Override
                    public void mouseExited(MouseEvent evt){
                        button.setBorder(buttonBorder0);
                    }
                });
                
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Dashboard_Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_Logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel_Admins = new javax.swing.JLabel();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel_Auth = new javax.swing.JLabel();
        jLabel_ManageAuthorForm = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel_Book = new javax.swing.JLabel();
        jLabel_ManageBookForm = new javax.swing.JLabel();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_header = new javax.swing.JPanel();
        jLabel_Genre = new javax.swing.JLabel();
        jLabel_ClickManageGenreForm = new javax.swing.JLabel();
        jPanel_4 = new javax.swing.JPanel();
        jPanel_4_header = new javax.swing.JPanel();
        jLabel_Lib = new javax.swing.JLabel();
        jLabel_ManageLibraryCard = new javax.swing.JLabel();
        jPanel_5 = new javax.swing.JPanel();
        jPanel_5_header = new javax.swing.JPanel();
        jLabel_Borrow = new javax.swing.JLabel();
        jLabel_ManageBorrowForm = new javax.swing.JLabel();
        jPanel_6 = new javax.swing.JPanel();
        jPanel_6_header = new javax.swing.JPanel();
        jLabel_Details = new javax.swing.JLabel();
        jLabel_ManageBorrowDetailForm = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel_Menu.setBackground(new java.awt.Color(36, 37, 42));

        jPanel_Header.setBackground(new java.awt.Color(1, 50, 67));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Library");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29))
        );

        jButton_Logout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_images/logout.png"))); // NOI18N
        jButton_Logout.setText("Logout");
        jButton_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogoutActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_images/icons8-admin-64.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel_Admins.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_Admins.setText("Admins");
        jLabel_Admins.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Admins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Admins, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_2.setBackground(new java.awt.Color(75, 192, 18));

        jPanel_2_header.setBackground(new java.awt.Color(60, 160, 10));

        jLabel_Auth.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_Auth.setText("Authors");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Auth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Auth, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_ManageAuthorForm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_ManageAuthorForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ManageAuthorForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ManageAuthorForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ManageAuthorForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ManageAuthorFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ManageAuthorForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ManageAuthorForm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_3.setBackground(new java.awt.Color(165, 89, 182));

        jPanel_3_header.setBackground(new java.awt.Color(125, 60, 155));

        jLabel_Book.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_Book.setText("Books");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Book, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Book, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_ManageBookForm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_ManageBookForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ManageBookForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ManageBookForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ManageBookForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ManageBookFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ManageBookForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ManageBookForm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel_1.setBackground(new java.awt.Color(255, 178, 41));

        jPanel_1_header.setBackground(new java.awt.Color(246, 145, 16));

        jLabel_Genre.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_Genre.setText("Genre Books");

        javax.swing.GroupLayout jPanel_1_headerLayout = new javax.swing.GroupLayout(jPanel_1_header);
        jPanel_1_header.setLayout(jPanel_1_headerLayout);
        jPanel_1_headerLayout.setHorizontalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Genre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_1_headerLayout.setVerticalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Genre, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_ClickManageGenreForm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_ClickManageGenreForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ClickManageGenreForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ClickManageGenreForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ClickManageGenreForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ClickManageGenreFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ClickManageGenreForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ClickManageGenreForm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel_4.setBackground(new java.awt.Color(51, 255, 255));

        jPanel_4_header.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_Lib.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_Lib.setText("Library Cards");

        javax.swing.GroupLayout jPanel_4_headerLayout = new javax.swing.GroupLayout(jPanel_4_header);
        jPanel_4_header.setLayout(jPanel_4_headerLayout);
        jPanel_4_headerLayout.setHorizontalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Lib, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_4_headerLayout.setVerticalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Lib, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_ManageLibraryCard.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_ManageLibraryCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ManageLibraryCard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ManageLibraryCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ManageLibraryCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ManageLibraryCardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_4_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ManageLibraryCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_4Layout.setVerticalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addComponent(jPanel_4_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ManageLibraryCard, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel_5.setBackground(new java.awt.Color(204, 204, 0));

        jPanel_5_header.setBackground(new java.awt.Color(153, 153, 0));

        jLabel_Borrow.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_Borrow.setText("Borrows");

        javax.swing.GroupLayout jPanel_5_headerLayout = new javax.swing.GroupLayout(jPanel_5_header);
        jPanel_5_header.setLayout(jPanel_5_headerLayout);
        jPanel_5_headerLayout.setHorizontalGroup(
            jPanel_5_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Borrow, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_5_headerLayout.setVerticalGroup(
            jPanel_5_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Borrow, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_ManageBorrowForm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_ManageBorrowForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ManageBorrowForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ManageBorrowForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ManageBorrowForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ManageBorrowFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_5Layout = new javax.swing.GroupLayout(jPanel_5);
        jPanel_5.setLayout(jPanel_5Layout);
        jPanel_5Layout.setHorizontalGroup(
            jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_5_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ManageBorrowForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_5Layout.setVerticalGroup(
            jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5Layout.createSequentialGroup()
                .addComponent(jPanel_5_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ManageBorrowForm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_6.setBackground(new java.awt.Color(51, 102, 255));

        jPanel_6_header.setBackground(new java.awt.Color(51, 0, 255));

        jLabel_Details.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_Details.setText("Borrow Details");

        javax.swing.GroupLayout jPanel_6_headerLayout = new javax.swing.GroupLayout(jPanel_6_header);
        jPanel_6_header.setLayout(jPanel_6_headerLayout);
        jPanel_6_headerLayout.setHorizontalGroup(
            jPanel_6_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_6_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Details, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_6_headerLayout.setVerticalGroup(
            jPanel_6_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_6_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Details, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_ManageBorrowDetailForm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel_ManageBorrowDetailForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ManageBorrowDetailForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ManageBorrowDetailForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ManageBorrowDetailForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ManageBorrowDetailFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_6Layout = new javax.swing.GroupLayout(jPanel_6);
        jPanel_6.setLayout(jPanel_6Layout);
        jPanel_6Layout.setHorizontalGroup(
            jPanel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_6_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ManageBorrowDetailForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_6Layout.setVerticalGroup(
            jPanel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_6Layout.createSequentialGroup()
                .addComponent(jPanel_6_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ManageBorrowDetailForm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_ClickManageGenreFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClickManageGenreFormMouseClicked
        // TODO add your handling code here:
        ManageGenresForm man_G_f = new ManageGenresForm();
        man_G_f.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLabel_ClickManageGenreFormMouseClicked

    private void jButton_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogoutActionPerformed
        // TODO add your handling code here:
        LoginForm lin_f = new LoginForm();
        lin_f.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton_LogoutActionPerformed

    private void jLabel_ManageAuthorFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageAuthorFormMouseClicked
        // TODO add your handling code here:
        ManageAuthorForm authForm = new ManageAuthorForm();
        authForm.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLabel_ManageAuthorFormMouseClicked

    private void jLabel_ManageBookFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageBookFormMouseClicked
        // TODO add your handling code here:
        ManageBookForm bookForm = new ManageBookForm();
        bookForm.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLabel_ManageBookFormMouseClicked

    private void jLabel_ManageLibraryCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageLibraryCardMouseClicked
        // TODO add your handling code here:
        ManageLibraryCardForm libForm = new ManageLibraryCardForm();
        libForm.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLabel_ManageLibraryCardMouseClicked

    private void jLabel_ManageBorrowFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageBorrowFormMouseClicked
        // TODO add your handling code here:
        ManageBorrowForm brForm = new ManageBorrowForm();
        brForm.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel_ManageBorrowFormMouseClicked

    private void jLabel_ManageBorrowDetailFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageBorrowDetailFormMouseClicked
        // TODO add your handling code here:
        
        ManageBorrowDetailForm br_de_form = new ManageBorrowDetailForm();
        br_de_form.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLabel_ManageBorrowDetailFormMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageAdminForm ad_f = new ManageAdminForm();
        ad_f.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Admins;
    private javax.swing.JLabel jLabel_Auth;
    private javax.swing.JLabel jLabel_Book;
    private javax.swing.JLabel jLabel_Borrow;
    private javax.swing.JLabel jLabel_ClickManageGenreForm;
    private javax.swing.JLabel jLabel_Dashboard_Logo;
    private javax.swing.JLabel jLabel_Details;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_Lib;
    private javax.swing.JLabel jLabel_ManageAuthorForm;
    private javax.swing.JLabel jLabel_ManageBookForm;
    private javax.swing.JLabel jLabel_ManageBorrowDetailForm;
    private javax.swing.JLabel jLabel_ManageBorrowForm;
    private javax.swing.JLabel jLabel_ManageLibraryCard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_header;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_4_header;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_5_header;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_6_header;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
