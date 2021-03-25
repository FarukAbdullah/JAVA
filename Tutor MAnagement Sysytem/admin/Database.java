
package admin;

import java.sql.*;
import java.util.ArrayList;
import javaprojectfinal.Login;
import javax.swing.JOptionPane;


public class Database {
    private Connection con;
    private Statement st;
    private ResultSet rs;

public Database(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    //step 1:get connection to db
    
    this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
    //step 2:create statement
    this.st=this.con.createStatement();
    }
    catch(Exception e)
    {
        System.out.println("error:"+e);
        e.printStackTrace();
    }
    
}
//search tutor

  public ResultSet getsearchTutor(String l,String m,String s,String e,String g)
    {
      try{
         String query="SELECT * from tutor where location = '"+l+"' and medium = '"+m+
                 "' and salary_Range = '"+s+"' and gender = '"+g+"' and experience = '"+e+"' and status = '"+"Verified"+"' ;";  
       
         rs=st.executeQuery(query);
         
                 
      }  
      catch(Exception ex)
      {
          System.err.println("Not Found");
          ex.printStackTrace();
      }
      return rs;
    }



//student info fetch from db
public ResultSet getStudentDetails(String a)
{
    try{
        String query ="select * from student where UserNamefk='"+a+"';";
        rs=st.executeQuery(query);
       
        }
    catch(Exception e)
    {
        System.err.println("Error: "+e);
        e.printStackTrace();
        
    }
    return rs;
}

public void setStudentDetails(String a)
{
    try{
        //String query ="select name,contact_no,SchoolOrCollege,Location,Medium,Class,Gender from student where UserNamefk='"+a+"';";
        st.executeUpdate(a);
       
        }
    catch(Exception e)
    {
        System.err.println("Error: "+e);
        e.printStackTrace();
        
    }
}

public void setTutorDetails(String a)
{
    try{
        
        st.executeUpdate(a);
       
        }
    catch(Exception e)
    {
        System.err.println("Error: "+e);
        e.printStackTrace();
        
    }
}

public void deleteDetails(String a)
{
    try{
        //String query ="select name,contact_no,SchoolOrCollege,Location,Medium,Class,Gender from student where UserNamefk='"+a+"';";
        //st.executedelete(a);
        st.executeUpdate(a);
       
        }
    catch(Exception e)
    {
        System.err.println("Error: "+e);
        e.printStackTrace();
        
    }
}

public void delete(String a)
{
      try{
          String query="DELETE FROM tutorrequest WHERE username='"+a+"';";
         int flag=st.executeUpdate(query);
         System.out.println(flag);
         JOptionPane.showMessageDialog(null,"Tutor Request Delete SUccessfully.");
                 
      }  
      catch(Exception e)
      {
          e.printStackTrace();
      }
    
}

public void Sdelete(String a)
{
      try{
          String query="DELETE FROM studentrequest WHERE username='"+a+"';";
         int flag=st.executeUpdate(query);
         System.out.println(flag);
         JOptionPane.showMessageDialog(null,"student request Delete SUccessfully.");
                 
      }  
      catch(Exception e)
      {
          e.printStackTrace();
      }
    
}


public ResultSet getTutorDetails(String a)
{
    try{
        String query ="SELECT * FROM tutor WHERE UserNametk='"+a+"';";
        rs=st.executeQuery(query);
      
         
    }
    catch(Exception e)
    {
        System.err.println("Error: "+e);
        e.printStackTrace();
        
    }
    return rs;
}


public ResultSet getDetails(String sqlQuery)
    {
        try{
            rs=st.executeQuery(sqlQuery);
        }catch(Exception e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
        return rs;
    }

public void insertIntoDBLogin(ArrayList row)
    {
       
        try{
           
             String query1="insert into Login(UserName,Password,Status)values('"+row.get(0)+"','"+row.get(1)+"',"+0+""+");";
            
             System.out.println(query1);

            //step-3:execute SQL query
             st.executeUpdate(query1);
           // st.executeUpdate(query);
           
            JOptionPane.showMessageDialog(null,"Welcome...!!! Your Information has been added.");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"insert int Database Exception:"+e);
            System.out.println(e);
            
           
        }
    }


//Student insert
public void insertIntoDB(ArrayList row)
    {
       
        try{
           
            
            String query="INSERT INTO Student(Name,UserNamefk,Contact_no,SchoolOrCollege,Location,Medium,Class,Gender) VALUES('"+row.get(0)+"','"+row.get(1)+"','"+row.get(2)+
                    "','"+row.get(3)+"','"+row.get(4)+"','"+row.get(5)+"','"+row.get(6)+"','"+row.get(7)+"'"+");";
             //String query1="insert into Login(UserName,Password,Status)values('"+row.get(0)+"','"+row.get(1)+"',"+0+""+");";
            
             
          //  System.out.println(query1);
            System.out.println(query);
            //step-3:execute SQL query
           //  st.executeUpdate(query1);
            st.executeUpdate(query);
           
          //  JOptionPane.showMessageDialog(null,"You have successfully entered into the SYSTEM.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"insert into Database Exception:"+e);
            System.out.println(e);
        }
    }

//tutor login 

public void insertIntoDBLogin_tutor(ArrayList row)
    {
       
        try{
           
            
             String query1="insert into Login(UserName,Password,Status)values('"+row.get(0)+"','"+row.get(1)+"',"+1+""+");";
            
             
          //  System.out.println(query);
                         System.out.println(query1);

            //step-3:execute SQL query
             st.executeUpdate(query1);
           // st.executeUpdate(query);
           
            JOptionPane.showMessageDialog(null,"Welcome !!! Information Added Successfully");
             
    //   this.setVisible(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"insert int Database Exception:"+e);
            System.out.println(e);
            
        }
    }

//tutor sign up

public void insertIntoDB_tutor(ArrayList row)
    {
       
        try{
           
            
            String query1="INSERT INTO Tutor(Name,UserNametk,Contact_No,Current_Edu_Status,Location,Experience,Salary_Range,Medium,Gender) VALUES('"+row.get(0)+"','"+row.get(1)+"','"+row.get(2)+
                    "','"+row.get(3)+"','"+row.get(4)+"','"+row.get(5)+"','"+row.get(6)+"','"+row.get(7)+"','"+row.get(8)+"'"+");";
             
          //  System.out.println(query1);
            System.out.println(query1);
            //step-3:execute SQL query
           //  st.executeUpdate(query1);
            st.executeUpdate(query1);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"insert into Database Exception:"+e);
            System.out.println(e);
        }
    }

public void insertIntoDBStudentRequest(ArrayList row)
    {
       
        try{
            
             String query1="INSERT INTO studentrequest VALUES('"+row.get(0)+"','"+row.get(1)+"','"+row.get(2)+
                    "','"+row.get(3)+"','"+row.get(4)+"','"+row.get(5)+"','"+row.get(6)+"'"+");";
            
             System.out.println(query1);

            //step-3:execute SQL query
             st.executeUpdate(query1);
           // st.executeUpdate(query);
           
            JOptionPane.showMessageDialog(null,"Your request has been send.");
           //   Login ln = new Login();
    //   ln.setVisible(true); 
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Update exception:"+e);
            System.out.println(e);
            
           
        }
    }

public void insertIntoDBTutorRequest(ArrayList row)
    {
       
        try{
            
             String query1="INSERT INTO tutorrequest VALUES('"+row.get(0)+"','"+row.get(1)+"','"+row.get(2)+
                    "','"+row.get(3)+"','"+row.get(4)+"','"+row.get(5)+"','"+row.get(6)+"'"+");";
            
             System.out.println(query1);

            //step-3:execute SQL query
             st.executeUpdate(query1);
           // st.executeUpdate(query);
           
            JOptionPane.showMessageDialog(null,"Your request has been send.");
           //   Login ln = new Login();
    //   ln.setVisible(true); 
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Update exception:"+e);
            System.out.println(e);
            
           
        }
    }

//Student Update
public void StudentInfoUpdate(ArrayList row,String user)
    {
      // String status= "Unverified";
        try{
            
           
            
         String query = "Update student Set Name='"+row.get(0)+"',"+"Contact_no='"+row.get(1)+"',"
                 + ""+"SchoolOrCollege='"+row.get(2)+"',"+
         "Location='"+row.get(3)+"',"+"Medium='"+row.get(4)+"',"+"Class='"+row.get(5)+"'"
                 + " where UserNamefk = '"+user+"';";
             
        
            st.executeUpdate(query);
           
            JOptionPane.showMessageDialog(null,"Update successfully !");
            //flag=1;
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Exception Found:"+e);
            // flag=0;
        }
      //  return flag;
    }


//Teacher Update
public void TutorUpdate(ArrayList row,String user)
    {
      // String status= "Unverified";
        try{
            
           
            
         String query = "Update tutor Set Name='"+row.get(0)+"',"+"Contact_No='"+row.get(1)+"',"+"Current_Edu_Status='"+row.get(2)+"',"+
         "Location='"+row.get(3)+"',"+"Experience='"+row.get(4)+"',"+"Salary_range='"+row.get(5)+"'"
                 + " where UserNametk = '"+user+"';";
             
        
            st.executeUpdate(query);
           
            JOptionPane.showMessageDialog(null,"Update successfully !");
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Update is Failed!");
            System.out.println(e);
            
        }
       
    }
 public ResultSet Reload()
    {
       
        try{
        String query="SELECT * FROM studentrequest";
       rs=st.executeQuery(query);
               
        }
        
        catch(Exception e)
        {
            System.out.println("Error:"+e);
           e.printStackTrace();
        }
        return rs;
    }
 
  public ResultSet TReload()
    {
       
        try{
        String query="SELECT * FROM tutorrequest";
       rs=st.executeQuery(query);
               
        }
        
        catch(Exception e)
        {
            System.out.println("Error:"+e);
           e.printStackTrace();
        }
        return rs;
    }
  
  





   



    
}
