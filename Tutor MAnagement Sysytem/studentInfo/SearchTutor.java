package studentInfo;

import admin.Database;
import java.sql.ResultSet;
import javaprojectfinal.Login;
import javax.swing.JOptionPane;


public class SearchTutor extends javax.swing.JFrame {
    String stuname="";
    
  String status="";
  String loc;
  String med;
  String sal;
  String exp;
  String gen;
    public SearchTutor() {
        initComponents();
    }
     public SearchTutor(String username) {
        initComponents();
        stuname=username;
        get();
        
    }
     
    
      public void get(){
         Database db=new Database();
         ResultSet rs=db.getTutorDetails(stuname);
         
        try{
        while(rs.next())
        {
            
            stuname=rs.getString("usernamefk");
        }
    }
        catch(Exception e)
        {   System.out.println("Error: "+e);
            e.printStackTrace();
        }
         
        
     }

    public  SearchTutor(String l,String m,String s,String e,String g,String username) {
        
        initComponents();
        loc = l;
        med = m;
        sal = s;
        exp = e;
        gen = g;
        stuname=username;
        searchProfile();
    }
    
    public void searchProfile()
    {
       
        Database db = new Database();
        try{
            ResultSet rs = db.getsearchTutor(loc,med,sal,exp,gen);
                      
            while(rs.next())
            {
                
                 String name=rs.getString("Name");
                 String contact=rs.getString("Contact_No");
                 String current=rs.getString("Current_Edu_Status");
                 String locc=rs.getString("Location");
                 String expp=rs.getString("Experience");
                 String sall=rs.getString("Salary_Range");
                 String medd=rs.getString("Medium");
                 String genn=rs.getString("Gender");
                  
             Info.setText(Info.getText()+"\n"+"Name: "+name
           +"\n"+"Contact No: "+contact+"\n"+"Current Educational Status: "+current+"\n"+"Location: "+locc+"\n"+"Experience: "+expp
           +"\n"+"Salary Range: "+sall+"\n"+"Medium: "+medd+"\n"+"Gender: "+genn+"\n"+"_______________________________________");
            
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
        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Info = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show Search Details");

        jPanel1.setLayout(null);

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(0, 0, 110, 50);

        Exit.setBackground(new java.awt.Color(255, 0, 51));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(690, 0, 110, 50);

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(250, 480, 340, 70);

        Info.setColumns(20);
        Info.setRows(5);
        jScrollPane2.setViewportView(Info);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(170, 70, 500, 380);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaprojectfinal/image.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
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
        StudentInfo sf = new StudentInfo(stuname);
        sf.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BackActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(this,"Are you sure want to Log Out?" , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION);
        if(value == 0){
        Login ln=new Login();
        ln.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_LogOutActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Exit;
    private javax.swing.JTextArea Info;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
