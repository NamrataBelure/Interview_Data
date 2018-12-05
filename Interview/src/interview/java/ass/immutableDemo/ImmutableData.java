package interview.java.ass.immutableDemo;

import java.util.Date;

public class ImmutableData {

	public static void main(String[] args) {
	 Adderess adr=Adderess.getAdderess("mumbai",471001);
		Date d = new Date(2018/01/05);
       student st=student.getstudent(01,"Akash", adr, d);
       System.out.println(st);
          st.getDoB().setDate(23);
        System.out.println(st);
	}

}
final class student{
	final private int aadharNo;
	final private String name;
	final private Adderess adderess;
	final private Date doB;
	@Override
	public String toString() {
		return "student [aadharNo=" + aadharNo + ", name=" + name + ", adderess=" + adderess + ", doB=" + doB + "]";
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public String getName() {
		return name;
	}
	public Adderess getAdderess() {
		return adderess;
	}
	public Date getDoB() {
		return new Date(doB.getYear(),doB.getMonth(),doB.getDate());
	}

	public static student getstudent(int id,String nm,Adderess adr,Date d){
		return new student(id, nm, adr, d);
		
	}
	
	  private student(int aadharNo, String name, Adderess adderess, Date doB) {
		this.aadharNo = aadharNo;
		this.name = name;
		this.adderess = adderess;
		this.doB = doB;
	}
	
}

final class Adderess{
    private final  String city;
    private final int pinCode;
	@Override
	public String toString() {
		return "Adderess [city=" + city + ", pinCode=" + pinCode + "]";
	}
	/*public static Adderess getAdderess() {
		// TODO Auto-generated method stub
		return null;
	}*/
	public String getCity() {
		return city;
	}
	public int getPinCode() {
		return pinCode;
	}
	/**
	 * @param city
	 * @param pinCode
	 */
	private Adderess(String city, int pinCode) {
		this.city = city;
		this.pinCode = pinCode;
	}
	
	public static Adderess getAdderess(String c,int p){
		return new Adderess(c,p);
		
	}
}

