
package admin;

import java.sql.ResultSet;
import java.util.ArrayList;
import javaprojectfinal.Login;
import javax.swing.JOptionPane;
import teacherInfo.TeacherInfo;


public class TutorUpdate extends javax.swing.JFrame {
   String tusername="";
Database db = new Database();
   
    public TutorUpdate() {
        initComponents();
    }

         public TutorUpdate(String username) {
        initComponents();
        tusername=username;
        set();
    }
     
        public void set()
    {
        //System.out.println(hemail);
        Database db = new Database();
        try{
            ResultSet rs = db.getTutorDetails(tusername);
            
            while(rs.next())
            {
                name.setText(rs.getString("Name"));
                cont.setText(rs.getString("Contact_No"));
                curr.setText(rs.getString("Current_Edu_Status"));
                locc.setSelectedItem(rs.getString("Location"));
                expp.setSelectedItem(rs.getString("Experience"));
                sal.setSelectedItem(rs.getString("Salary_Range"));
               
                 
                
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
        name = new javax.swing.JTextField();
        cont = new javax.swing.JTextField();
        curr = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        locc = new javax.swing.JComboBox<String>();
        sal = new javax.swing.JComboBox<String>();
        expp = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Tutor Information");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name                             :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 90, 320, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact No                      :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 140, 330, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location                          :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 190, 320, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Current Educational Status  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 240, 320, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Experience                       :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 290, 320, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary Range                    :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 340, 320, 29);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(400, 90, 310, 30);

        cont.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(cont);
        cont.setBounds(400, 140, 310, 30);

        curr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(curr);
        curr.setBounds(400, 240, 310, 30);

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(0, 0, 130, 40);

        Exit.setBackground(new java.awt.Color(255, 0, 51));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(660, 0, 140, 50);

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(440, 460, 280, 60);

        Confirm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(Confirm);
        Confirm.setBounds(70, 460, 290, 60);

        locc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        locc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bashundhara", "Baridhara", "Khilkhet", "Nikunjo", "Gulshan", "Banani", "Mohakhali", "Dhanmondi", "Mohammadpur", "Kallyanpur" }));
        jPanel1.add(locc);
        locc.setBounds(404, 192, 310, 30);

        sal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< 2,000", "< 5,000", "< 10,000", "< 15,000", "> 15,000" }));
        jPanel1.add(sal);
        sal.setBounds(400, 340, 310, 30);

        expp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< 6 Months", "< 1 Year", "< 2 Years", "< 3 Years", "> 4 Years" }));
        jPanel1.add(expp);
        expp.setBounds(400, 290, 310, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
         TInfo s=new TInfo(tusername);
         s.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        int value = JOptionPane.showConfirmDialog(this,"Are you sure want to exit?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
             System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
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

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
       
         ArrayList sInfo=new ArrayList();
        sInfo.add(name.getText());
        sInfo.add(cont.getText());
        sInfo.add(curr.getText());
         sInfo.add(locc.getSelectedItem().toString());
        sInfo.add(expp.getSelectedItem().toString());
        sInfo.add(sal.getSelectedItem().toString());
     
       db.TutorUpdate(sInfo,tusername);
 
          TutorUpdate t1 = new  TutorUpdate(tusername);
            t1.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_ConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(TutorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Confirm;
    private javax.swing.JButton Exit;
    private javax.swing.JButton LogOut;
    private javax.swing.JTextField cont;
    private javax.swing.JTextField curr;
    private javax.swing.JComboBox<String> expp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> locc;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> sal;
    // End of variables declaration//GEN-END:variables
}
