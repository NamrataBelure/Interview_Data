package withoutHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {
     static Connection connection=null;
 
     private ConnectionProvider(){}
     
    public static Connection getconnection(){
    	
    	if (connection==null) {
			try {
			     Class.forName("com.mysql.jdbc.Driver").newInstance();
			     connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hiber", "root","");
				return connection;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
    	}
			else{
				return connection;
			}
		return connection;
    	
    }
     
}
