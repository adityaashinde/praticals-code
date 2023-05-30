package jdbc1;

import java.sql.*;

public class expt4_Jdbc {

	public static void main(String[] args) {
		
		try 
		{  
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skn", "root", "Lumos");  
		Statement s = con.createStatement();  
		            s.execute("create table student ( stud_id integer,stud_name varchar(20),stud_address varchar(30) )"); 
		            s.execute("insert into student values(001,'Arman','Delhi')");    
		            s.execute("insert into student values(002,'Robert','Canada')");    
		            s.execute("insert into student values(003,'Ahuja','Karnal')"); 
		            ResultSet rs = s.executeQuery("select * from student");  
		            if (rs != null) 
		                while (rs.next())   
		            {  
		                System.out.println("________________________________________");  
		                System.out.println("Id of the student: " + rs.getString(1));  
		                System.out.println("Name of student: " + rs.getString(2));  
		                System.out.println("Address of student: " + rs.getString(3));  
		                System.out.println("________________________________________");  
		            }  
		            s.close(); 
		            con.close(); 
		        } catch (SQLException err) {  
		            System.out.println("ERROR: " + err);  
		        } catch (Exception err) {  
		            System.out.println("ERROR: " + err);  
		        }  
		    }  
	}


