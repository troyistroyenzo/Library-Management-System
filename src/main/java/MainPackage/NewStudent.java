/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 * 
 * 
 */

public class NewStudent extends javax.swing.JFrame {

   
    
    /**
     * Creates new form newMember
     */
    public NewStudent() {
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
        studentNameTextField = new javax.swing.JTextField();
        studentIdTextField = new javax.swing.JTextField();
        studentEmailTextField = new javax.swing.JTextField();
        schoolBranchComboBox = new javax.swing.JComboBox<>();
        courseTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        paswordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        paswordLabel1 = new javax.swing.JLabel();
        paswordLabel2 = new javax.swing.JLabel();
        paswordLabel3 = new javax.swing.JLabel();

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
                .addContainerGap(116, Short.MAX_VALUE))
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

        studentNameTextField.setBackground(new java.awt.Color(204, 204, 255));
        studentNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(studentNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 220, -1));

        studentIdTextField.setBackground(new java.awt.Color(204, 204, 255));
        studentIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(studentIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 220, -1));

        studentEmailTextField.setBackground(new java.awt.Color(204, 204, 255));
        studentEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentEmailTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(studentEmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 220, -1));

        schoolBranchComboBox.setBackground(new java.awt.Color(204, 204, 255));
        schoolBranchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main", "South", "North East" }));
        jPanel3.add(schoolBranchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 160, 20));

        courseTextField.setBackground(new java.awt.Color(204, 204, 255));
        courseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(courseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 220, -1));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel3.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 80, -1));

        closeButton.setText("Back");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 70, -1));

        paswordLabel.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        paswordLabel.setText("Student Email");
        jPanel3.add(paswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 20));

        usernameLabel.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        usernameLabel.setText("Student Name");
        jPanel3.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        paswordLabel1.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        paswordLabel1.setText("Student ID");
        jPanel3.add(paswordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 20));

        paswordLabel2.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        paswordLabel2.setText("School Branch");
        jPanel3.add(paswordLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 20));

        paswordLabel3.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        paswordLabel3.setText("Course");
        jPanel3.add(paswordLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, 20));

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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameTextFieldActionPerformed
      
       
        
    }//GEN-LAST:event_studentNameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        String studentName = studentNameTextField.getText();
        String studentID = studentIdTextField.getText();
        String studentCourse = studentEmailTextField.getText();
        String schoolBranch = (String)schoolBranchComboBox.getSelectedItem();
        String studentEmail = studentEmailTextField.getText();
   
        if (studentName.equals("")){
            JOptionPane.showMessageDialog(null, "STUDENT NAME IS REQUIRED");
        }
        else if (studentID.equals(""))  {
            JOptionPane.showMessageDialog(null, "STUDENT ID IS REQUIRED");
        }
        else if (studentCourse.equals("")) {
            JOptionPane.showMessageDialog(null, "STUDENT COURSE IS REQUIRED");
        }
        else if (schoolBranch.equals("")) {
            JOptionPane.showMessageDialog(null, "SCHOOL BRANCH IS REQUIRED");
        }
        else if (studentEmail.equals("")) {
            JOptionPane.showMessageDialog(null, "STUDENT EMAIL IS REQUIRED");
        }
        else {
            JOptionPane.showMessageDialog(null, "VALIDATION SUCCESS!");
             MainApplication.AddRowToJTable(new Object[]{
            studentName, studentID, studentCourse, schoolBranch, studentEmail
           });
        }
        

        
        
        
      
        
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
        

    }//GEN-LAST:event_closeButtonActionPerformed

    private void studentIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdTextFieldActionPerformed

    private void studentEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentEmailTextFieldActionPerformed

    private void courseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField courseTextField;
    private javax.swing.JLabel illuminataLogo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel paswordLabel;
    private javax.swing.JLabel paswordLabel1;
    private javax.swing.JLabel paswordLabel2;
    private javax.swing.JLabel paswordLabel3;
    private javax.swing.JComboBox<String> schoolBranchComboBox;
    private javax.swing.JTextField studentEmailTextField;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
