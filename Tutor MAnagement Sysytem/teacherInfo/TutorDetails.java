
package teacherInfo;

import java.sql.ResultSet;
import admin.Database;
import javaprojectfinal.Login;
import javax.swing.JOptionPane;


public class TutorDetails extends javax.swing.JFrame {

    String tusername=null;
    
    public TutorDetails() {
        initComponents();
    }
    
        
    public TutorDetails(String username) {
        
        initComponents();
        tusername = username;
        setProfile();
    }
    
    public void setProfile()
    {
       
        Database db = new Database();
        try{
            ResultSet rs = db.getTutorDetails(tusername);
          
            while(rs.next())
            {
                
                name.setText(rs.getString("Name"));
                contac.setText(rs.getString("Contact_No"));
                currEdu.setText(rs.getString("Current_Edu_Status"));
                loc.setText(rs.getString("Location"));
                expp.setText(rs.getString("Experience"));
                sal.setText(rs.getString("Salary_Range"));
                medi.setText(rs.getString("Medium"));
                gen.setText(rs.getString("Gender"));
                status.setText(rs.getString("status"));
                
            }
           
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        contac = new javax.swing.JLabel();
        loc = new javax.swing.JLabel();
        currEdu = new javax.swing.JLabel();
        expp = new javax.swing.JLabel();
        sal = new javax.swing.JLabel();
        medi = new javax.swing.JLabel();
        gen = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tutor Details");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name                                       :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 100, 300, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact No                              :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 140, 300, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location                                  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 180, 310, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Current Educational Status   :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 220, 300, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Experience                              :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 260, 300, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary Range                          :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 300, 300, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender                                    :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 380, 300, 25);

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 10, 120, 50);

        Exit.setBackground(new java.awt.Color(255, 0, 51));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(690, 10, 110, 50);

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(240, 500, 340, 70);

        name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(name);
        name.setBounds(380, 90, 340, 40);

        contac.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        contac.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(contac);
        contac.setBounds(380, 140, 310, 30);

        loc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        loc.setForeground(java.awt.SystemColor.control);
        jPanel1.add(loc);
        loc.setBounds(380, 180, 320, 30);

        currEdu.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        currEdu.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(currEdu);
        currEdu.setBounds(380, 220, 380, 30);

        expp.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        expp.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(expp);
        expp.setBounds(380, 260, 380, 30);

        sal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        sal.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(sal);
        sal.setBounds(380, 300, 390, 30);

        medi.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        medi.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(medi);
        medi.setBounds(380, 340, 320, 30);

        gen.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        gen.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(gen);
        gen.setBounds(390, 380, 300, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Medium                                   :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(60, 340, 300, 25);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Status                                      :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(60, 420, 300, 30);

        status.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(status);
        status.setBounds(380, 420, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 800, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(this,"Are you sure want to Log Out?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
        Login ln=new Login();
        ln.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_LogOutActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
         int value = JOptionPane.showConfirmDialog(this,"Are you sure want to exit?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
             System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        TeacherInfo ti=new TeacherInfo(tusername);
        ti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    
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
            java.util.logging.Logger.getLogger(TutorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Exit;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel contac;
    private javax.swing.JLabel currEdu;
    private javax.swing.JLabel expp;
    private javax.swing.JLabel gen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loc;
    private javax.swing.JLabel medi;
    private javax.swing.JLabel name;
    private javax.swing.JLabel sal;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
