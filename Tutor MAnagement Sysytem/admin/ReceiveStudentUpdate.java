package admin;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.ArrayList;
import javaprojectfinal.Login;
import javax.swing.JOptionPane;



public class ReceiveStudentUpdate extends javax.swing.JFrame {

        
     String s = "";
     String suser="";
    
    public ReceiveStudentUpdate() {
        initComponents();
    }
    
     public ReceiveStudentUpdate(ArrayList a) {
        initComponents();
      showArea.setText("");
        try{
        
        Database db=new Database();
        ResultSet rs=db.Reload();
        while(rs.next()){
            
                 String uname=rs.getString("UserName");
                 String name=rs.getString("Name");
                 String contact=rs.getString("ContactNo");
                 String school=rs.getString("SchoolCollege");
                 String loc=rs.getString("Location");
                 String medd=rs.getString("Medium");
                 String cls=rs.getString("Class");
            showArea.setText(showArea.getText()+"\n"+"User Name: "+uname+"\n"+"Name: "+name
            +"\n"+"Contact No: "+contact+"\n"+"School/College: "+school+"\n"+"Location: "+loc+"\n"+"Medium: "+medd+"\n"+"Class: "+cls+"\n"+"_________________________");
        }
        }
        catch(Exception e)
        {
            System.out.println("error:"+e);
            e.printStackTrace();;
        }
     }
      
        
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showArea = new javax.swing.JTextArea();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        UserNameee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Update Request");

        jPanel1.setLayout(null);

        showArea.setColumns(20);
        showArea.setRows(5);
        jScrollPane1.setViewportView(showArea);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 460, 500);

        logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(510, 470, 250, 60);

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(0, 0, 120, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("                              Update Request From Students");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-80, 0, 780, 90);

        delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(510, 390, 250, 60);

        UserNameee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserNameeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UserNameeeFocusLost(evt);
            }
        });
        jPanel1.add(UserNameee);
        UserNameee.setBounds(510, 240, 250, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(510, 210, 130, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        Admin ad = new Admin();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        ArrayList delete=new ArrayList();
      
        Database dbc=new Database();
        dbc.Sdelete(UserNameee.getText());
        System.out.println(delete);
        
        Admin ad = new Admin();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteActionPerformed

    private void UserNameeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserNameeeFocusGained
          if(UserNameee.getText().equals("User Name"))
        {
            UserNameee.setText("");
            UserNameee.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_UserNameeeFocusGained

    private void UserNameeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserNameeeFocusLost
          if(UserNameee.getText().equals(""))
        {
            UserNameee.setText("User Name");
            UserNameee.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_UserNameeeFocusLost

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
            java.util.logging.Logger.getLogger(ReceiveStudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiveStudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiveStudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiveStudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiveStudentUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserNameee;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextArea showArea;
    // End of variables declaration//GEN-END:variables
}
