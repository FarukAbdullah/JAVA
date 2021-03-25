
package studentInfo;

import admin.Database;
import java.sql.ResultSet;
import java.util.ArrayList;
import javaprojectfinal.Login;
import javax.swing.JOptionPane;


public class StudentUpdateRequest extends javax.swing.JFrame {

    public static ArrayList<String> s = new ArrayList<>();
    String stuname=null;
    
    public StudentUpdateRequest() {
        initComponents();
    }
 public StudentUpdateRequest(String username) {
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
                uname.setText(rs.getString("UserNamefk"));
            }
            
    }
             catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Update Request");

        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(360, 150, 280, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(360, 210, 280, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(360, 270, 280, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Name                 :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 150, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Contact No         :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 210, 230, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("School/College  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 270, 220, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Medium              :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 330, 230, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Location             :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 400, 220, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Class                   :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 470, 220, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Hey ADMIN!!! I want to update some of my INFORMATIONS.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, -10, 800, 90);

        send.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send);
        send.setBounds(320, 530, 190, 50);

        logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(610, 530, 180, 50);

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 530, 170, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Update information for ( user name) ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 70, 350, 70);

        uname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel1.add(uname);
        uname.setBounds(370, 90, 270, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bashundhara", "Baridhara", "Khilkhet", "Nikunjo", "Gulshan", "Banani", "Mohakhali", "Dhanmondi", "Mohammadpur", "Kallyanpur" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(360, 400, 280, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bangla", "English" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(360, 340, 280, 40);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "One", "Two", "Three", "Four", "Five", "Six ", "Seven", "Eight", "Nine", "Ten", "O Level", "A Level", "Eleven", "Twelve" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(360, 460, 280, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
       // ArrayList<String> s = new ArrayList<>();
        s.add(uname.getText());
        s.add(jTextField1.getText());
        s.add(jTextField2.getText());
        s.add(jTextField3.getText());
        s.add(jComboBox2.getSelectedItem().toString());
        s.add(jComboBox1.getSelectedItem().toString());
        s.add(jComboBox3.getSelectedItem().toString());
        
        
       Database dbc=new Database();
       dbc.insertIntoDBStudentRequest(s);
        
        StudentInfo info = new StudentInfo(stuname);
        info.setVisible(true);
        this.setVisible(false);
       
       
       
       //System.out.println(s);
             
    }//GEN-LAST:event_sendActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
              
       int value = JOptionPane.showConfirmDialog(this,"Are you sure want to Log Out?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
        Login ln=new Login();
        ln.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        StudentInfo si=new StudentInfo(stuname); 
        si.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

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
            java.util.logging.Logger.getLogger(StudentUpdateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUpdateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUpdateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUpdateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUpdateRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton logout;
    public javax.swing.JButton send;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
