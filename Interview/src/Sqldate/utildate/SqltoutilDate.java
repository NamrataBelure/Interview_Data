package Sqldate.utildate;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqltoutilDate {

	public static void main(String[] args) {
		java.sql.Date sqlDate=readDateFormDataBase();
        java.util.Date utilDate=new java.util.Date(sqlDate.getTime());
        System.out.println("Sql date for DataBase:"+sqlDate);
        System.out.println("Util date for java:"+utilDate);
	}
	private static java.sql.Date readDateFormDataBase() {
		Connection con=null;
		java.sql.Date dateFromDatabase=null;
		try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		String url = "jdbc:sqlserver://Server: 127.0.0.1;";
		DriverManager.setLogWriter(new PrintWriter(System.out, true));
		con = DriverManager.getConnection(url, "root", "root"); 
		PreparedStatement ps = con.prepareStatement("select GETDATE()"); 
		ResultSet rs = ps.executeQuery(); rs.next();
		// move the cursor to first column 
		dateFromDatabase = rs.getDate(1); 
		} catch (Exception e) {
			e.printStackTrace();
			} 
		return dateFromDatabase;
	}

}
