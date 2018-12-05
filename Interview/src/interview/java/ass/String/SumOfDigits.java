
package interview.java.ass.String;

import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The string is : ");
		String a=sc.nextLine();
		getValues(a);
	}

	private static void getValues(String a) {
		int sum=0;
		for (int i = 0; i < a.length(); i++) {
			char b=a.charAt(i);
			if (Character.isDigit(b)) {
				int c=Integer.parseInt(String.valueOf(b));
				sum=sum+c;
			}
		}
		if (sum==0) {
			System.out.println(-1);
		}
		else
		  System.out.println(sum);		
		
	}
}
