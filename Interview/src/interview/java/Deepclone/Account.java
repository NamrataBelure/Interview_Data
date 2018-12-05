package interview.java.Deepclone;

public class Account {

	int acNo;
	String acName;
	String acType;
	/**
	 * @param acNo
	 * @param acName
	 * @param acType
	 */
	public Account(int acNo, String acName, String acType) {
		super();
		this.acNo = acNo;
		this.acName = acName;
		this.acType = acType;
	}
	@Override
	public String toString() {
		return "\nAccount [acNo=" + acNo + ", acName=" + acName + ", acType=" + acType + "]";
	}
	
}
