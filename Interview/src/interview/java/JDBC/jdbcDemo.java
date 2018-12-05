package interview.java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcDemo {
	public static void main(String[] args) {
	    String url = "jdbc:mysql://localhost:3306/student"; 
        String user = "root"; 
        String pass = " "; 
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Student Name: ");
         String name=sc.next();
         System.out.println("Enter the RollNo: ");
         String roll=sc.next();
         System.out.println("Enter the Adderess: ");
         String adderess=sc.next();
        //Inserting data using SQL query 
        String sql = "insert into student1 values('"+name+"',"+roll+",'"+adderess+"')"; 
        Connection con=null;
       
        try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
			Class.forName("com.mysql.jdbc.Driver"); 
			//Reference to connection interface 
			con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select*from Student");
			int a=st.executeUpdate(sql);
			if (a==1) {
				System.out.println("inserted successfully : "+sql);
			     }
				else 
				{
				System.out.println("insertion Failed...");
			    }
			con.close();
		} catch (Exception e) {
			System.out.println("An error occurred while connecting MySQL databse");
			e.printStackTrace();
	}
}
}
