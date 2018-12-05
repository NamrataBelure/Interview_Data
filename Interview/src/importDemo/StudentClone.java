package importDemo;

class StudentClone implements Cloneable{
int rollNo;
String name;

StudentClone(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}
public Object Clone() throws CloneNotSupportedException{
	return super.clone();
	
}
	public static void main(String[] args) {
		try {
			StudentClone s1=new StudentClone(01,"Anu");
			StudentClone s2=(StudentClone)s1.Clone();
			
			System.out.println("["+s1.rollNo+","+s1.name+"]");
			System.out.println("["+s2.rollNo+","+s2.name+"]");
		} catch (CloneNotSupportedException e) {}

	}

}
