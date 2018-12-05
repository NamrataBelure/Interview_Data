package interview.java.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
    	Student s=new Student(01,"Anu");
    	child c=new child(010, "Anu","Asad");
    	
    	File file=new File("Abc.txt");
    	FileOutputStream fos=new FileOutputStream(file);
    	ObjectOutputStream oos=new ObjectOutputStream(fos);
    	oos.writeObject(c);
    	oos.close();
        fos.close();
        System.out.println("Object has been serialized"); 

        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        s=(Student)ois.readObject();
        System.out.println("Object has been deserialized "); 
        System.out.println("Student: =" +s);
        fis.close();
        ois.close();
	}

}
class Student {
	int id;
	String uName;
	
	public Student(int id, String uName) {
		super();
		this.id = id;
		this.uName = uName;
	}
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id =" + id + ", uName =" + uName + "]";
	}
	
}
class child extends Student implements Serializable{
	String cName;

	public child(int id, String uName, String cName) {
		super(id, uName);
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "child [id =" + id + ", uName =" + uName + ", cName =" + cName + "]";
	}
	
}