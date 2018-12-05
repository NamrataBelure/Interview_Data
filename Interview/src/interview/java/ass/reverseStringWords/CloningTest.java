package interview.java.ass.reverseStringWords;
import java.io.Serializable;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Adderess adderess = new Adderess(411046,"Pune");
		Company company = new Company(1,"Infosys",adderess);
		Company cloncmp=(Company)company.clone();
		System.out.println(company == cloncmp);//false
		System.out.println(company.getCompanyadderess() ==cloncmp.getCompanyadderess());//true -- shollow ,false - deep	
	}
}
class Company implements Cloneable,Serializable{
	int regId;
	String companyName;
	Adderess Companyadderess;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		/*Company clonnedCompany = (Company)super.clone(); //shallow
		Adderess originalAddress = clonnedCompany.getCompanyadderess();
		Adderess clonnedAddress = (Adderess)originalAddress.Clone();
		clonnedCompany.setCompanyadderess(clonnedAddress);
		return clonnedCompany;*/
		
		
		Company clonnedCmpny = (Company)super.clone(); //shallow of company
		clonnedCmpny.setCompanyadderess((Adderess)clonnedCmpny.getCompanyadderess().Clone());
		clonnedCmpny.setCompanyadderess(new Adderess(clonnedCmpny.getCompanyadderess().getPinCode(),clonnedCmpny.getCompanyadderess().getCity()));
		return clonnedCmpny;
		
	}
	
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Adderess getCompanyadderess() {
		return Companyadderess;
	}
	public void setCompanyadderess(Adderess companyadderess) {
		Companyadderess = companyadderess;
	}
	/**
	 * @param regId
	 * @param companyName
	 * @param companyadderess
	 */
	public Company(int regId, String companyName, Adderess companyadderess) {
		super();
		this.regId = regId;
		this.companyName = companyName;
		Companyadderess = companyadderess;
	}
	@Override
	public String toString() {
		return "Company [regId=" + regId + ", companyName=" + companyName + ", Companyadderess=" + Companyadderess
				+ "]";
	}
	
	
}
class Adderess implements Cloneable,Serializable{
	int pinCode;
	String city;
	
	protected Object Clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Adderess [pinCode=" + pinCode + ", city=" + city + "]";
	}
	
	
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public Adderess(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}
	
}