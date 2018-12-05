package withoutHibernate;

public class Test {

	public static void main(String[] args) {
		
		emp12 e=new emp12();
		e.setEid(1);
		e.setName("Anu");
		e.setAddress("Solapur");
		operation o=new operation();
		o.save(e);
	}
}
