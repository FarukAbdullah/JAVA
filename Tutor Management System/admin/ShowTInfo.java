package admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ShowTInfo extends javax.swing.JFrame {

     String user = null;
    private String usernametk;
    
    public ShowTInfo() {
        initComponents();
    }

   public ShowTInfo(String id) {
        initComponents();
        user = id;
        setTtDetails();
    }

    
    public void setTtDetails()
    {
        try
        {
            Database db = new Database();
            //String sql="Select * from tutor where UserNametk = '"+user+"';";
          // ResultSet rs= db.getDetails(sql);
           ResultSet rs = db.getTutorDetails(user);
            while(rs.next())
            {
                name.setText(rs.getString("Name"));
                username.setText(rs.getString("UserNametk"));
                contac.setText(rs.getString("Contact_No"));
                edustatus.setText(rs.getString("Current_Edu_Status"));
                location.setText(rs.getString("Location"));
                medium.setText(rs.getString("Medium"));
                salary.setText(rs.getString("Salary_Range"));
                gender.setText(rs.getString("Gender"));
                experience.setText(rs.getString("Experience"));
                status.setText(rs.getString("status"));
                
            }
        }catch(SQLException e){
            
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        verify = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        medium = new javax.swing.JLabel();
        contac = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        experience = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        edustatus = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tutor Details");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("User Name                       :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 120, 240, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Experience                       :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 280, 240, 22);

        verify.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        verify.setText("Verify");
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });
        jPanel1.add(verify);
        verify.setBounds(80, 517, 150, 50);

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(290, 520, 160, 50);

        delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(520, 520, 180, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Location                          :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 200, 240, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Current Educational Status  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 240, 250, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Contact No                       :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 160, 240, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Salary Range                    :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 320, 240, 22);

        location.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(location);
        location.setBounds(360, 200, 290, 30);

        medium.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medium.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(medium);
        medium.setBounds(350, 360, 250, 30);

        contac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contac.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(contac);
        contac.setBounds(360, 150, 230, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Status                             :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 430, 230, 22);

        experience.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        experience.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(experience);
        experience.setBounds(350, 280, 250, 30);

        salary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salary.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(salary);
        salary.setBounds(350, 320, 270, 30);

        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(username);
        username.setBounds(360, 110, 220, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Gender                            :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(100, 390, 240, 30);

        gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(gender);
        gender.setBounds(350, 400, 280, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Medium                           :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(100, 360, 240, 22);

        edustatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edustatus.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(edustatus);
        edustatus.setBounds(350, 240, 330, 30);

        name.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(name);
        name.setBounds(200, 20, 460, 50);

        status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        status.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(status);
        status.setBounds(350, 430, 320, 30);

        exit.setBackground(java.awt.Color.red);
        exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit.setText("Exit");
        exit.setToolTipText("");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(690, 0, 110, 50);

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(0, 0, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
        // TODO add your handling code here:
         Database db = new Database();
        String ver = "Verified";
        String sql = "Update tutor set status='"+ver+"' where UserNametk = '"+user+"'";
        db.setTutorDetails(sql);
        status.setText(ver);
    }//GEN-LAST:event_verifyActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
          TInfo ti=new TInfo(user);
        ti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         int value = JOptionPane.showConfirmDialog(this,"Are you sure want to Delete?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
            
         Database db = new Database();
        String del = "Deleted";
        String sql = "Delete from tutor where UserNametk = '"+user+"'";
        String sql1 = "Delete from login where UserName = '"+user+"'";
        db.deleteDetails(sql);
        db.deleteDetails(sql1);
       // status.setText(del);
        TInfo s = new TInfo (user);
        s.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_deleteActionPerformed
 
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
         int value = JOptionPane.showConfirmDialog(this,"Are you sure want to exit?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
             System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        TutorUpdate ti = new TutorUpdate(user);
        ti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowTInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel contac;
    private javax.swing.JButton delete;
    private javax.swing.JLabel edustatus;
    private javax.swing.JButton exit;
    private javax.swing.JLabel experience;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel location;
    private javax.swing.JLabel medium;
    private javax.swing.JLabel name;
    private javax.swing.JLabel salary;
    private javax.swing.JLabel status;
    private javax.swing.JButton update;
    private javax.swing.JLabel username;
    private javax.swing.JButton verify;
    // End of variables declaration//GEN-END:variables
}
