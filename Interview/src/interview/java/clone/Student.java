package interview.java.clone;

public class Student implements Cloneable{
	int rollNo;
	String add;
	String name;
	
	public Student(String name, int rollNo, String add) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.add = add;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", add=" + add + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
