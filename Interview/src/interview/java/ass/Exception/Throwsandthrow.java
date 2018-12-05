package interview.java.ass.Exception;

public class Throwsandthrow {

	public static void main(String[] args) {
		try {
			m1();
		} catch (PositiveException e) {
			// TODO: handle exception
		}
		m5();

	}
	private static void m1() throws PositiveException {
		System.out.println("inside m1");
		m2();
		System.out.println("complete m1");	
	}
	private static void m2() throws PositiveException {
	System.out.println("inside m2");
	m3();
	System.out.println("com[plete m2");	
	}
	private static void m3() throws PositiveException {
		System.out.println("inside m3");
	m4();
	System.out.println("complete m3");
	}
	private static void m4() throws PositiveException {
	System.out.println("inside m4");
	int i=-10;
	if(i==-10){
		throw new PositiveException("Number should be positive number:");
	}
	System.out.println("complete m4");
	}
	private static void m5() {
	System.out.println("inside m5");
	System.out.println("complete m5");
	}
}
