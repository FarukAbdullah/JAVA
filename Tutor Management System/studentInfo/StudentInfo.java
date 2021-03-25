package studentInfo;


import admin.Database;
import java.sql.ResultSet;
import javaprojectfinal.Login;
import javax.swing.JOptionPane;


public class StudentInfo extends javax.swing.JFrame {

    public String stuname;
    //public String pass;
    
    public StudentInfo() {
        initComponents();
    }
    
    public StudentInfo(String username) {
        initComponents();
        stuname = username;
        set();
    }
      public void set()
        {
       
        Database db = new Database();
        try{
            ResultSet rs = db.getStudentDetails(stuname);
          
            while(rs.next())
            {
                
                name.setText(rs.getString("Name"));
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
        ExitButton = new javax.swing.JButton();
        MyInfoButton = new javax.swing.JButton();
        SearchTutor = new javax.swing.JButton();
        UpdateInfo = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Home Page");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 230, 80);

        ExitButton.setBackground(new java.awt.Color(204, 0, 51));
        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton);
        ExitButton.setBounds(690, 0, 110, 50);

        MyInfoButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MyInfoButton.setText("My Info");
        MyInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyInfoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MyInfoButton);
        MyInfoButton.setBounds(170, 210, 480, 60);

        SearchTutor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchTutor.setText("Search Tutor");
        SearchTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTutorActionPerformed(evt);
            }
        });
        jPanel1.add(SearchTutor);
        SearchTutor.setBounds(170, 300, 480, 60);

        UpdateInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UpdateInfo.setText("Update");
        UpdateInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateInfoActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateInfo);
        UpdateInfo.setBounds(170, 390, 480, 70);

        LogOutButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutButton);
        LogOutButton.setBounds(170, 490, 480, 70);

        name.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(51, 255, 153));
        jPanel1.add(name);
        name.setBounds(250, 50, 440, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jLabel1.setText("Welcome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
        
       int value = JOptionPane.showConfirmDialog(this,"Are you sure want to Log Out?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
        Login ln=new Login();
        ln.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(this,"Are you sure want to exit?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
             System.exit(0);
        }
       
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void MyInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyInfoButtonActionPerformed
    
         StudentDetails sd=new StudentDetails(stuname);
         sd.setVisible(true);
        this.dispose();
         //this.setVisible(false);
     
    }//GEN-LAST:event_MyInfoButtonActionPerformed

    private void SearchTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTutorActionPerformed
        // TODO add your handling code here:
        Search sr=new Search(stuname);
        sr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SearchTutorActionPerformed

    private void UpdateInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateInfoActionPerformed
        // TODO add your handling code here:
       /* PasswordChange1 pc= new PasswordChange1();
        pc.setVisible(true);
        this.setVisible(false); */
       StudentUpdateRequest s1 = new StudentUpdateRequest(stuname);
       s1.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_UpdateInfoActionPerformed

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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LogOutButton;
    public static javax.swing.JButton MyInfoButton;
    private javax.swing.JButton SearchTutor;
    private javax.swing.JButton UpdateInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
