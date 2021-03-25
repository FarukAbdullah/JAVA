package teacherInfo;

import admin.Database;
import java.sql.ResultSet;
import java.util.ArrayList;
import javaprojectfinal.Login;

public class TutorUpdateRequest extends javax.swing.JFrame {
public static ArrayList<String> t = new ArrayList<>();
   String tusername=null;
   
    public TutorUpdateRequest() {
        initComponents();
    }
     public TutorUpdateRequest(String username) {
        initComponents();
        tusername=username;
        set();
    }
public void set(){
    Database db=new Database();
    try{
    ResultSet rs=db.getTutorDetails(tusername);
    
      while(rs.next())
            {
                uname.setText(rs.getString("UserNametk"));
            }
            
    } catch(Exception e){
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
        contactno = new javax.swing.JTextField();
        currentedustatus = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        send = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        location = new javax.swing.JComboBox<String>();
        experience = new javax.swing.JComboBox<String>();
        salayrange = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tutor Update Request");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name                             :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 180, 340, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact No                      :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 220, 340, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location                          :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 260, 330, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Current Educational Status  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 300, 340, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Experience                      :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 340, 320, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary Range                   :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 390, 370, 29);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(410, 180, 310, 30);
        jPanel1.add(contactno);
        contactno.setBounds(410, 220, 310, 30);
        jPanel1.add(currentedustatus);
        currentedustatus.setBounds(410, 300, 310, 30);

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(40, 460, 190, 50);

        logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(570, 460, 220, 50);

        send.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send);
        send.setBounds(280, 460, 250, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Hey ADMIN!!! I want to update my INFORMATION.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 0, 800, 70);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Update information for ( user name)");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 90, 390, 40);

        uname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(uname);
        uname.setBounds(430, 100, 250, 30);

        location.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bashundhara", "Baridhara", "Khilkhet", "Nikunjo", "Gulshan", "Banani", "Mohakhali", "Dhanmondi", "Mohammadpur", "Kallyanpur" }));
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });
        jPanel1.add(location);
        location.setBounds(410, 262, 310, 30);

        experience.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        experience.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< 6 Months", "< 1 Year", "< 2 Years", "< 3 Years", "> 4 Years" }));
        experience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experienceActionPerformed(evt);
            }
        });
        jPanel1.add(experience);
        experience.setBounds(410, 340, 310, 30);

        salayrange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salayrange.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< 2,000", "< 5,000", "< 10,000", "< 15,000", "> 15,000" }));
        jPanel1.add(salayrange);
        salayrange.setBounds(410, 390, 310, 30);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      TeacherInfo ti= new TeacherInfo(tusername);
      ti.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       Login ln =new  Login();
       ln.setVisible(true);
       
    }//GEN-LAST:event_logoutActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
        t.add(uname.getText());
        t.add(name.getText());
        t.add(contactno.getText());
        t.add(location.getSelectedItem().toString());
        t.add(currentedustatus.getText());
        t.add(experience.getSelectedItem().toString());
        t.add(salayrange.getSelectedItem().toString());
        
         Database db=new Database();
        db.insertIntoDBTutorRequest(t);
        
        TeacherInfo info = new TeacherInfo(tusername);
        info.setVisible(true);
        this.setVisible(false);
        
      
    }//GEN-LAST:event_sendActionPerformed

    private void experienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experienceActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

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
            java.util.logging.Logger.getLogger(TutorUpdateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorUpdateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorUpdateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorUpdateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorUpdateRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField currentedustatus;
    private javax.swing.JComboBox<String> experience;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> location;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> salayrange;
    private javax.swing.JButton send;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
