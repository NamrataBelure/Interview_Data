package interview.java.Deepclone;

public class Employee implements Cloneable{

	int eId;
	String ename;
	String address;
	Account account;
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", ename=" + ename + ", address=" + address + ", account=" + account + "]";
	}
	/**
	 * @param eId
	 * @param ename
	 * @param address
	 * @param account
	 */
	public Employee(int eId, String ename, String address, Account account) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.address = address;
		this.account = account;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
}
