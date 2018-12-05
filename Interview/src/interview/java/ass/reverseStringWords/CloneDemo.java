package interview.java.ass.reverseStringWords;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
	Adderess1 adr=new Adderess1(410017,"pune");
	Student stud=new Student(01,"Anushri", adr);
    Student CloneStud=(Student)stud.clone();
    System.out.println(stud==CloneStud);
    System.out.println(stud.getAdderess()==CloneStud.getAdderess());
    System.out.println(stud.getName()==CloneStud.getName());
    System.out.println(stud.getStudId()==CloneStud.getStudId());
    System.out.println(stud.adderess1.getPinCode()==CloneStud.adderess1.getPinCode());
    System.out.println(stud.adderess1.getCity()==CloneStud.adderess1.getCity());
    System.out.println("------.equals------------");
    System.out.println(stud.equals(CloneStud));
    System.out.println(stud.getAdderess().equals(CloneStud.getAdderess()));
    System.out.println(stud.getName().equals(CloneStud.getName()));
    System.out.println(stud.adderess1.getCity().equals(CloneStud.adderess1.getCity()));
	}
}
class Student implements Cloneable{
	int studId;
	String Name;
	Adderess1 adderess1;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Adderess1 getAdderess() {
		return adderess1;
	}
	public void setAdderess(Adderess1 adderess1) {
		this.adderess1 = adderess1;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", Name=" + Name + ", adderess=" + adderess1 + "]";
	}
	
	public Student(int studId, String name, Adderess1 adderess1) {
		super();
		this.studId = studId;
		this.Name = name;
		this.adderess1 = adderess1;
	}
	
}


class Adderess1 implements Cloneable{
	int pinCode;
	String City;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Adderess [pinCode=" + pinCode + ", City=" + City + "]";
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @param pinCode
	 * @param city
	 */
	public Adderess1(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		City = city;
	}
	
}