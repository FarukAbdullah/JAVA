
package admin;

import java.sql.ResultSet;
import java.util.ArrayList;
import javaprojectfinal.Login;
import javax.swing.JOptionPane;
import studentInfo.StudentInfo;


public class StudentInfoUpdate extends javax.swing.JFrame {
String stuname="";
Database db = new Database();
    
    public StudentInfoUpdate() {
        initComponents();
    }
     public StudentInfoUpdate(String username) {
        initComponents();
        stuname=username;
        set();
    }
     
        public void set()
    {
        //System.out.println(hemail);
        Database db = new Database();
        try{
            ResultSet rs = db.getStudentDetails(stuname);
            
            while(rs.next())
            {
                name.setText(rs.getString("Name"));
                contc.setText(rs.getString("Contact_No"));
                school.setText(rs.getString("SchoolOrCollege"));
               medi.setSelectedItem(rs.getString("Medium"));
                locc.setSelectedItem(rs.getString("Location"));
                clss.setSelectedItem(rs.getString("Class"));
                 // clss.setSelectedItem(rs.getString("Class"));
               
                 
                
            }
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        contc = new javax.swing.JTextField();
        school = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        clss = new javax.swing.JComboBox<String>();
        locc = new javax.swing.JComboBox<String>();
        medi = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Student Information");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Name                            :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 100, 240, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Contact No                   :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 150, 240, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("School/College            :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 190, 240, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Medium                        :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 230, 240, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Location                       :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 270, 240, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Class                             :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 320, 240, 25);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 51));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(420, 110, 240, 28);

        contc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contc.setForeground(new java.awt.Color(51, 0, 51));
        jPanel1.add(contc);
        contc.setBounds(420, 150, 240, 28);

        school.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        school.setForeground(new java.awt.Color(51, 0, 51));
        jPanel1.add(school);
        school.setBounds(420, 190, 240, 28);

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(0, 0, 110, 40);

        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(670, 0, 120, 40);

        Confirm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(Confirm);
        Confirm.setBounds(130, 489, 190, 60);

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(430, 490, 240, 60);

        clss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clss.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "One", "Two", "Three", "Four", "Five", "Six ", "Seven", "Eight", "Nine", "Ten", "O Level", "A Level", "Eleven", "Twelve" }));
        jPanel1.add(clss);
        clss.setBounds(420, 320, 240, 30);

        locc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        locc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bashundhara", "Baridhara", "Khilkhet", "Nikunjo", "Gulshan", "Banani", "Mohakhali", "Dhanmondi", "Mohammadpur", "Kallyanpur" }));
        jPanel1.add(locc);
        locc.setBounds(420, 270, 240, 30);

        medi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bangla", "English" }));
        jPanel1.add(medi);
        medi.setBounds(420, 230, 240, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        SInfo s=new SInfo(stuname);
         s.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
         int value = JOptionPane.showConfirmDialog(this,"Are you sure want to exit?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
             System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        ArrayList sInfo=new ArrayList();
        sInfo.add(name.getText());
        sInfo.add(contc.getText());
        sInfo.add(school.getText());
        sInfo.add(locc.getSelectedItem().toString());
        sInfo.add(medi.getSelectedItem().toString());
        sInfo.add(clss.getSelectedItem().toString());
     
       db.StudentInfoUpdate(sInfo,stuname);
 
          StudentInfoUpdate s1 = new  StudentInfoUpdate(stuname);
            s1.setVisible(true);
            this.setVisible(false);
    
        
    }//GEN-LAST:event_ConfirmActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
       int value = JOptionPane.showConfirmDialog(this,"Are you sure want to Log Out?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
        Login ln=new Login();
        ln.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_LogOutActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

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
            java.util.logging.Logger.getLogger(StudentInfoUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfoUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfoUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfoUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfoUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Confirm;
    private javax.swing.JButton Exit;
    private javax.swing.JButton LogOut;
    private javax.swing.JComboBox<String> clss;
    private javax.swing.JTextField contc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> locc;
    private javax.swing.JComboBox<String> medi;
    private javax.swing.JTextField name;
    private javax.swing.JTextField school;
    // End of variables declaration//GEN-END:variables
}
