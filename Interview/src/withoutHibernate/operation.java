package withoutHibernate;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class operation {

	public void save(Object o){
		if(o instanceof emp12){
			emp12 e=(emp12)o;
			Connection c= ConnectionProvider.getconnection();
			//System.out.println(c);
			try {
			   PreparedStatement ps= c.prepareStatement("insert into emp12 values(?,?,?)");
				ps.setInt(1,e.getEid());
				ps.setString(2,e.getName());
				ps.setString(3,e.getAddress());
				
				int i= ps.executeUpdate();
				if (i>0) {
					System.out.println("Data inserted...");
				}
				else{
					System.out.println("Data not inserted....");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
