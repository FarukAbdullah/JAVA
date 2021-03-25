
package javaprojectfinal;

import admin.Admin;
import teacherInfo.TeacherInfo;
import studentInfo.StudentInfo;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;



import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

     private Connection con;
    private Statement st;
    private ResultSet rs;

    private JFrame frame;
    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        LoginPassword = new javax.swing.JPasswordField();
        Back = new javax.swing.JButton();
        LoginUsername = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In Form");

        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 197, 200, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 304, 220, 70);

        Login.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Login.setText("Log In");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login);
        Login.setBounds(370, 520, 260, 80);

        Exit.setBackground(new java.awt.Color(204, 0, 51));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.setToolTipText("");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(860, 0, 150, 60);

        LoginPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LoginPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginPasswordFocusLost(evt);
            }
        });
        jPanel1.add(LoginPassword);
        LoginPassword.setBounds(360, 320, 350, 40);

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(0, 0, 150, 60);

        LoginUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LoginUsername.setForeground(new java.awt.Color(204, 204, 204));
        LoginUsername.setText("User Name");
        LoginUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginUsernameFocusLost(evt);
            }
        });
        LoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(LoginUsername);
        LoginUsername.setBounds(360, 230, 350, 40);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jRadioButton1.setText("Show Password");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(540, 420, 180, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/background..jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
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

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Welcome wl =new Welcome();
        wl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
      
       String query = "SELECT * FROM Login;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
	ResultSet rs = null;//to get row by row result from DB
	System.out.println(query);
        
 try{
    Class.forName("com.mysql.jdbc.Driver");
    //step 1:get connection to db
    
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","");
    //step 2:create statement
    st=con.createStatement();
    
	System.out.println("connection done");//connection with database established
	st = con.createStatement();//create statement
	System.out.println("statement created");
	rs = st.executeQuery(query);//getting result
	System.out.println("results received");
			
	boolean flag = false;			
	while(rs.next())
	  {
        String UserName = rs.getString("UserName");
        String Password = rs.getString("Password");
	int status = rs.getInt("status");
                
        if(UserName.equals(LoginUsername.getText()) && Password.equals(LoginPassword.getText()))
	  {
	     flag=true;
	     if(status==0)
		{
		    StudentInfo si = new StudentInfo(UserName);
		    si.setVisible(true);
		    this.setVisible(false);
		}
	else if(status==1)
	  {
	     TeacherInfo ti = new TeacherInfo(UserName);
	     ti.setVisible(true);
	     this.setVisible(false);
             
             
	  }
        
        else if(status==2)
	  {
	     Admin ad = new Admin(UserName);
	     ad.setVisible(true);
	     this.setVisible(false);
             
             
	  }
         else{}
	   }
			}
			if(!flag)
			{
				JOptionPane.showMessageDialog(this,"Invalid ID or Password"); 
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
	

    }//GEN-LAST:event_LoginActionPerformed

    private void LoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginUsernameActionPerformed

    private void LoginUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginUsernameFocusGained
        // TODO add your handling code here:
        
        if(LoginUsername.getText().equals("User Name"))
        {
            LoginUsername.setText("");
            LoginUsername.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_LoginUsernameFocusGained

    private void LoginUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginUsernameFocusLost
        // TODO add your handling code here:
        
        if(LoginUsername.getText().equals(""))
        {
            LoginUsername.setText("User Name");
            LoginUsername.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_LoginUsernameFocusLost

    private void LoginPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginPasswordFocusGained
        // TODO add your handling code here:
         if(LoginPassword.getText().equals("Password"))
        {
            LoginPassword.setText("");
            LoginPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_LoginPasswordFocusGained

    private void LoginPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginPasswordFocusLost
        // TODO add your handling code here:
          if(LoginPassword.getText().equals(""))
        {
            LoginPassword.setText("Password");
            LoginPassword.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_LoginPasswordFocusLost

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        
         if(jRadioButton1.isSelected())
        {
            LoginPassword.setEchoChar((char)0);
        }
        else
        {
            LoginPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField LoginPassword;
    public javax.swing.JTextField LoginUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
