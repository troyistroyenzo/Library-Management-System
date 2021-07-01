/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NewBook extends javax.swing.JFrame {

    /**
     * Creates new form NewEntry
     */
    public NewBook() {
        initComponents();
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
        illuminataLogo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        paswordLabel = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        entryIdTextField = new javax.swing.JTextField();
        entryLinkTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        paswordLabel1 = new javax.swing.JLabel();
        paswordLabel2 = new javax.swing.JLabel();
        paswordLabel3 = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        usernameLabel1 = new javax.swing.JLabel();
        entryNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        illuminataLogo1.setFont(new java.awt.Font("Futura Lt BT", 0, 36)); // NOI18N
        illuminataLogo1.setForeground(new java.awt.Color(255, 255, 255));
        illuminataLogo1.setText("BookWorld | Online Library");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(illuminataLogo1)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(illuminataLogo1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paswordLabel.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        paswordLabel.setText("Comments");
        jPanel3.add(paswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, 20));

        studentIdTextField.setBackground(new java.awt.Color(204, 204, 255));
        studentIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(studentIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 220, -1));

        entryIdTextField.setBackground(new java.awt.Color(204, 204, 255));
        entryIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryIdTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(entryIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 220, -1));

        entryLinkTextField.setBackground(new java.awt.Color(204, 204, 255));
        entryLinkTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryLinkTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(entryLinkTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 220, -1));

        usernameLabel.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        usernameLabel.setText("Student ID");
        jPanel3.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel3.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 80, -1));

        closeButton.setText("Back");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 70, -1));

        paswordLabel1.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        paswordLabel1.setText("Book ID");
        jPanel3.add(paswordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 20));

        paswordLabel2.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        paswordLabel2.setText("Category");
        jPanel3.add(paswordLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, 20));

        paswordLabel3.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        paswordLabel3.setText("Book Author");
        jPanel3.add(paswordLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, 20));

        categoryComboBox.setBackground(new java.awt.Color(204, 204, 255));
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fantasy", "Fiction", "Sci-fi" }));
        jPanel3.add(categoryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 220, 20));

        descriptionTextArea.setBackground(new java.awt.Color(204, 204, 255));
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 250, 130));

        usernameLabel1.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        usernameLabel1.setText("Book Name");
        jPanel3.add(usernameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        entryNameTextField.setBackground(new java.awt.Color(204, 204, 255));
        entryNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryNameTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(entryNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entryNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryNameTextFieldActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
        

    }//GEN-LAST:event_closeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String studentID = studentIdTextField.getText();
        String bookName = entryNameTextField.getText();
        String bookID = entryIdTextField.getText();
        String bookAuthor = entryLinkTextField.getText();
        String category = (String)categoryComboBox.getSelectedItem();
        String comments = descriptionTextArea.getText();

        if (studentID.equals("")){
            JOptionPane.showMessageDialog(null, "STUDENT NAME IS REQUIRED");
        }
        else if (bookName.equals(""))  {
            JOptionPane.showMessageDialog(null, "BOOK NAME IS REQUIRED");
        }
        else if (bookID.equals("")) {
            JOptionPane.showMessageDialog(null, "BOOK ID IS REQUIRED");
        }
        else if (bookAuthor.equals("")) {
            JOptionPane.showMessageDialog(null, "BOOK AUTHOR IS REQUIRED");
        }
        else if (category.equals("")) {
            JOptionPane.showMessageDialog(null, "CATEGORY IS REQUIRED");
        }
        else if (comments.equals("")) {
            JOptionPane.showMessageDialog(null, "COMMENTS ARE REQUIRED");
        }
        else {
            JOptionPane.showMessageDialog(null, "VALIDATION SUCCESS!");
             MainApplication.AddRowToJTable2(new Object[]{
            studentID, bookName, bookID, bookAuthor, category, comments
        });
        }

       

    }//GEN-LAST:event_submitButtonActionPerformed

    private void entryLinkTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryLinkTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryLinkTextFieldActionPerformed

    private void entryIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryIdTextFieldActionPerformed

    private void studentIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTextFieldActionPerformed

    }//GEN-LAST:event_studentIdTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField entryIdTextField;
    private javax.swing.JTextField entryLinkTextField;
    private javax.swing.JTextField entryNameTextField;
    private javax.swing.JLabel illuminataLogo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel paswordLabel;
    private javax.swing.JLabel paswordLabel1;
    private javax.swing.JLabel paswordLabel2;
    private javax.swing.JLabel paswordLabel3;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    // End of variables declaration//GEN-END:variables
}
