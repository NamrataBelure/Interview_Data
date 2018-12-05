package withoutHibernate;

public class emp12 {

	private int eid;
	private String name;
	private String address;
	@Override
	public String toString() {
		return "emp12 [eid=" + eid + ", name=" + name + ", address=" + address + "]";
	}
	/**
	 */
	public emp12() {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
