package interview.java.Deepclone;

public class Maintest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account ac1=new Account(124551455, "sbi", "savingaccount");
		Employee emp1=new Employee(01, "Anu", "pune", ac1);
		System.out.println("Before clone :"+emp1);
		Employee emp2=(Employee) emp1.clone();
        System.out.println("After clone :"+emp2);
	}

}
