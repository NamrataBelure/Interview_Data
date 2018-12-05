package interview.java.ass.FileHandling;

import java.util.Scanner;

public class sumnumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the string:");
		String a=sc.nextLine();
        String num="";
        for (int i = 0; i < a.length(); i++) {
		if (Character.isDigit(a.charAt(i))) {
			sum = sum + Character.getNumericValue(a.charAt(i));
		  }	
		else{
			if (!num.equals("")) {
				sum=sum+Integer.parseInt(num);
				num="";
			}
		}
	}
        System.out.println(sum);
		
	}
}
