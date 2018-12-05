package interview.java.clone;

public class MainTest {

	public static void main(String[] args) throws CloneNotSupportedException {
	Student stu1=new Student("Anu",01,"solapur");
	System.out.println("Before clone "+stu1);
    Student stu2=(Student) stu1.clone();
    System.out.println("after clone: "+stu2);
    
	}

}
