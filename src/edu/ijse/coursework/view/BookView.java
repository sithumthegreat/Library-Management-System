/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.coursework.view;

import edu.ijse.coursework.controller.BookController;
import edu.ijse.coursework.dto.BookDto;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Sithum
 */
public class BookView extends javax.swing.JFrame {
    private final BookController BOOK_CONTROLLER;

    /**
     * Creates new form BookView
     */
    public BookView()throws Exception{
        BOOK_CONTROLLER=new BookController();
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Book Management");
        loadTable();
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
        BookIdLabel = new javax.swing.JLabel();
        bookIdField = new javax.swing.JTextField();
        bookNameLabel = new javax.swing.JLabel();
        bookNameField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        authorLabel = new javax.swing.JLabel();
        authorNameField = new javax.swing.JTextField();
        countLabel = new javax.swing.JLabel();
        countField = new javax.swing.JTextField();
        categoryIdLabel = new javax.swing.JLabel();
        categoryIdField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bookHeadingLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        BookIdLabel.setBackground(new java.awt.Color(51, 51, 51));
        BookIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BookIdLabel.setText("Book ID");

        bookIdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        bookNameLabel.setBackground(new java.awt.Color(51, 51, 51));
        bookNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookNameLabel.setText("Book Name");

        bookNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameFieldActionPerformed(evt);
            }
        });

        bookTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookTable.setForeground(new java.awt.Color(51, 51, 51));
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        bookTable.setSelectionBackground(new java.awt.Color(80, 227, 194));
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);

        authorLabel.setBackground(new java.awt.Color(51, 51, 51));
        authorLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        authorLabel.setText("Author");

        authorNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        authorNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorNameFieldActionPerformed(evt);
            }
        });

        countLabel.setBackground(new java.awt.Color(51, 51, 51));
        countLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        countLabel.setText("Book Count");

        countField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        categoryIdLabel.setBackground(new java.awt.Color(51, 51, 51));
        categoryIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoryIdLabel.setText("Category ID");

        categoryIdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoryIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIdFieldActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(74, 144, 226));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(74, 144, 226));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(74, 144, 226));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(74, 144, 226));

        bookHeadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookHeadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookHeadingLabel.setText("Book Management ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bookHeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bookHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");

        refreshButton.setBackground(new java.awt.Color(74, 144, 226));
        refreshButton.setText("Refresh Table");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(categoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(authorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(224, 224, 224)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(54, 54, 54))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(refreshButton)
                                                .addGap(30, 30, 30))))))
                            .addComponent(BookIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(categoryIdLabel)
                                .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addGap(18, 18, 18)
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(countLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(312, 312, 312))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        try {
            setBook();
        } catch (Exception ex) {
            Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookTableMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            saveBook();
        } catch (Exception ex) {
            Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            updateBook();
        } catch (Exception ex) {
            Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteBook();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void bookNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameFieldActionPerformed

    private void authorNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorNameFieldActionPerformed

    private void categoryIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryIdFieldActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        try {
            // TODO add your handling code here:
            loadTable();
        } catch (Exception ex) {
            Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BookView().setVisible(true);
//            }
//        });
//    }
    
    public void loadTable()throws Exception{
        try {
            String columns[]={"Book ID","Book Name","Author","Count","Category ID"};
            DefaultTableModel dtm=new DefaultTableModel(columns,0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                }
                
            };
            bookTable.setModel(dtm);
            ArrayList<BookDto> bookDtos=BOOK_CONTROLLER.getAll();
            for (BookDto bookDto:bookDtos){
                Object[] rowData={bookDto.getBookId(),bookDto.getBookName(),bookDto.getAuthor(),bookDto.getCount(),bookDto.getCategoryId()};
                dtm.addRow(rowData);
            }
            JTableHeader header=bookTable.getTableHeader();
            header.setBackground(new Color(74,144,226));
            header.setForeground(new Color(255,255,255));
            header.setFont(new Font("segoe UI",Font.BOLD,14));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    
    
    public void clearForm() {
        bookIdField.setText("");
        bookNameField.setText("");
        authorNameField.setText("");
        countField.setText("");
        categoryIdField.setText("");
        
    }
    
    public void saveBook()throws Exception{
        try {
            BookDto bookDto=new BookDto(bookIdField.getText(),bookNameField.getText(),authorNameField.getText(),Integer.parseInt(countField.getText()),categoryIdField.getText());
            String rsp=BOOK_CONTROLLER.save(bookDto);
            JOptionPane.showMessageDialog(this,rsp);
            loadTable();
            clearForm();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: All fields must be filled out.");
        }
        
    }
    
    public void updateBook()throws Exception{
        try {
            BookDto bookDto=new BookDto(bookIdField.getText(),bookNameField.getText(),authorNameField.getText(),Integer.parseInt(countField.getText()),categoryIdField.getText());
            String rsp=BOOK_CONTROLLER.update(bookDto);
            JOptionPane.showMessageDialog(this, rsp);
            loadTable();
            clearForm();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please ensure that all fields in the form are completed before saving. Thank you!");

        }
        
    }
    public void setBook()throws Exception{
        try {
            String code=(String)bookTable.getValueAt(bookTable.getSelectedRow(), 0);
            BookDto bookDto=BOOK_CONTROLLER.get(code);
            if (bookDto!=null){
                bookIdField.setText(bookDto.getBookId());
                bookNameField.setText(bookDto.getBookName());
                authorNameField.setText(bookDto.getAuthor());
                countField.setText(bookDto.getCount().toString());
                categoryIdField.setText(bookDto.getCategoryId());
            }else{
                JOptionPane.showMessageDialog(this,"Book Not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
    }
    
    public void deleteBook(){
        try {
            String code=bookIdField.getText();
            String rsp=BOOK_CONTROLLER.delete(code);
            JOptionPane.showMessageDialog(this, rsp);
            loadTable();
            clearForm();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookIdLabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorNameField;
    private javax.swing.JLabel bookHeadingLabel;
    private javax.swing.JTextField bookIdField;
    private javax.swing.JTextField bookNameField;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField categoryIdField;
    private javax.swing.JLabel categoryIdLabel;
    private javax.swing.JTextField countField;
    private javax.swing.JLabel countLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
