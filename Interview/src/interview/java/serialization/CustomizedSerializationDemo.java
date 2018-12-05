package interview.java.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	AtmAccount atm=new AtmAccount();
	System.out.println("userName : ="+ atm.userName +", Password :="+atm.PassWard);
	File file=new File("Anu.txt");
	FileOutputStream fos=new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(atm);
	
	FileInputStream fis=new FileInputStream(file);
	ObjectInputStream ois=new ObjectInputStream(fis);
	AtmAccount atm1=(AtmAccount)ois.readObject();
	System.out.println(atm1);
	//System.out.println("userName: ="+ atm.userName +" Password :="+atm.PassWard);
	}

}
class AtmAccount implements Serializable{
	String userName="Anu_Admin";
	transient String PassWard="Anu1237";
	@Override
	public String toString() {
		return "AtmAccount [userName:=" + userName + ", PassWard:=" + PassWard + "]";
	}
	
	public AtmAccount() {
		super();
		this.userName = userName;
		this.PassWard = PassWard;
	}
	
	public void AtmAccount1(){
		
	}

	private void writeObject(ObjectOutputStream oos) throws Exception 
	    { 
		 oos.defaultWriteObject();
		 String user = userName+"23"; 
		 String pwd  = "17"+PassWard;
		 oos.writeObject(user);
		 oos.writeObject(pwd);
	    }
	 private void readObject(ObjectInputStream ois) throws Exception 
	    { 
		 ois.defaultReadObject();
		 String user=(String)ois.readObject();
		 userName=user.substring(0, 9);
		 String pw=(String)ois.readObject();
		 PassWard=pw.substring(2);
		
		 
	    }
}