package interview.java.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {
	public static void printdata( Parent object1) 
    { 
  
        System.out.println("name = " + object1.name); 
        System.out.println("pId = " + object1.pId); 
        System.out.println("c = " + object1.c); 
        System.out.println("d = " + object1.d); 
    } 
  
	public static void main(String[] args) throws IOException, ClassNotFoundException {
    Student s= new Student(01, "Abc");
    File file=new File("Aaa.txt");
	FileOutputStream fos=new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s);
	oos.close();
	fos.close();
	System.out.println("student has been serialised...");

	FileInputStream fis=new FileInputStream(file);
	ObjectInputStream ois=new ObjectInputStream(fis);
	Parent p1=(Parent)ois.readObject();
	System.out.println("parents :="+s);
	fis.close();
	ois.close();
	

	System.out.println("parent has been DeSerialised...");
	}

}
class Parent implements Serializable{
	private static final long serialversionUID = 12354;
	int pId;
	String name;
	transient int c;
	static int d;
	
	public Parent(int pId, String name) {
		super();
		this.pId = pId;
		this.name = name;
		this.c = c;
		this.d = d;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public static int getD() {
		return d;
	}

	public static void setD(int d) {
		Parent.d = d;
	}

	public static long getSerialversionuid() {
		return serialversionUID;
	}

	@Override
	public String toString() {
		return "Parent [pId=" + pId + ", name=" + name + ", c=" + c + ", d="+d+"]";
	}
	
}