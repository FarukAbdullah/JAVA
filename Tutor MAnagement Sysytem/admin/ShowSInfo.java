
package admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ShowSInfo extends javax.swing.JFrame {

    
    String user = null;
    private String usernamefk;
    
    public ShowSInfo() {
        initComponents();
    }
    
    public ShowSInfo(String id) {
        initComponents();
        user = id;
        setStDetails();
    }

    
    public void setStDetails()
    {
        try
        {
            Database db = new Database();
            //String sql="Select * from student where UserNamefk = '"+user+"';";
          // ResultSet rs= db.getDetails(sql);
           ResultSet rs = db.getStudentDetails(user);
            while(rs.next())
            {
                name.setText(rs.getString("Name"));
                username.setText(rs.getString("UserNamefk"));
                contact.setText(rs.getString("Contact_No"));
                school.setText(rs.getString("SchoolOrCollege"));
                location.setText(rs.getString("Location"));
                medium.setText(rs.getString("Medium"));
                clas.setText(rs.getString("Class"));
                gender.setText(rs.getString("Gender"));
              //  status.setText(rs.getString("status"));
            }
        }catch(SQLException e){
            
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        school = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        medium = new javax.swing.JLabel();
        clas = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        gender = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Verify = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Details");

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("User Name           :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 120, 170, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Contact No          :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 170, 160, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("School/college      :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 220, 170, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Location              :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 270, 160, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Medium              :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 310, 160, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Class                  :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 350, 160, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Gender               :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 390, 170, 22);

        name.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(name);
        name.setBounds(220, 40, 300, 40);

        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(username);
        username.setBounds(250, 110, 300, 30);

        contact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(contact);
        contact.setBounds(250, 170, 270, 30);

        school.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        school.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(school);
        school.setBounds(240, 220, 260, 30);

        location.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(location);
        location.setBounds(240, 270, 260, 30);

        medium.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medium.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(medium);
        medium.setBounds(250, 310, 260, 30);

        clas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clas.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(clas);
        clas.setBounds(260, 350, 230, 30);

        Exit.setBackground(java.awt.Color.red);
        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(690, 0, 110, 50);

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(0, 0, 110, 50);

        gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(gender);
        gender.setBounds(250, 390, 220, 30);

        Update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(190, 510, 130, 50);

        Delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(490, 510, 130, 50);

        Verify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(Verify);
        Verify.setBounds(0, 0, 800, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        SInfo si=new SInfo(user);
        si.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
         int value = JOptionPane.showConfirmDialog(this,"Are you sure want to exit?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
             System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
         int value = JOptionPane.showConfirmDialog(this,"Are you sure want to Delete?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
            
         Database db = new Database();
        String del = "Deleted";
        String sql = "Delete from student where UserNamefk = '"+user+"'";
        String sql1 = "Delete from login where UserName = '"+user+"'";
        db.deleteDetails(sql);
        db.deleteDetails(sql1);
       // status.setText(del);
        SInfo s = new SInfo (user);
        s.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
           
         StudentInfoUpdate sd=new  StudentInfoUpdate(user);
         sd.setVisible(true);
         this.setVisible(false);

    }//GEN-LAST:event_UpdateActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowSInfo().setVisible(true);
            }
        });
    }
                                                                                                                                                                                               
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Update;
    private javax.swing.JLabel Verify;
    private javax.swing.JLabel clas;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel location;
    private javax.swing.JLabel medium;
    private javax.swing.JLabel name;
    private javax.swing.JLabel school;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
