
package admin;


import javaprojectfinal.Login;
import javax.swing.JOptionPane;
import studentInfo.StudentUpdateRequest;
import teacherInfo.TutorUpdateRequest;


public class Admin extends javax.swing.JFrame {

    public String stuname;
     public String tusername;
    
    public Admin() {
        initComponents();
    }
    
     public Admin(String username) {
        initComponents();
        stuname = username;
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        StudentInfo = new javax.swing.JButton();
        TutorInfo = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");

        jPanel1.setLayout(null);

        Exit.setBackground(java.awt.Color.red);
        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(670, 0, 120, 50);

        StudentInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        StudentInfo.setText("Student Info");
        StudentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentInfoActionPerformed(evt);
            }
        });
        jPanel1.add(StudentInfo);
        StudentInfo.setBounds(160, 140, 420, 70);

        TutorInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TutorInfo.setText("Tutor Info");
        TutorInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorInfoActionPerformed(evt);
            }
        });
        jPanel1.add(TutorInfo);
        TutorInfo.setBounds(160, 230, 420, 70);

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(160, 500, 420, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("ADMIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 30, 250, 90);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Request from Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 320, 420, 70);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Request from Tutor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(160, 410, 420, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
          int value = JOptionPane.showConfirmDialog(this,"Are you sure want to exit?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
             System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
         int value = JOptionPane.showConfirmDialog(this,"Are you sure want to Log Out?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
        Login ln=new Login();
        ln.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_LogOutActionPerformed

    private void StudentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentInfoActionPerformed
        // TODO add your handling code here:
        
         SInfo s=new SInfo(stuname);
         s.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_StudentInfoActionPerformed

    private void TutorInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorInfoActionPerformed
        // TODO add your handling code here:
        
         TInfo s=new TInfo(tusername);
         s.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_TutorInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Sender s = new StudentUpdateRequest();
        //ReceiveStudentUpdate ru =new ReceiveStudentUpdate();
       new ReceiveStudentUpdate(StudentUpdateRequest.s).setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          new ReceiveTutorUpdate(TutorUpdateRequest.t).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton StudentInfo;
    private javax.swing.JButton TutorInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
