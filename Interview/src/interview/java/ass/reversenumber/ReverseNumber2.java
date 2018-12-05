//using forLoop
package interview.java.ass.reversenumber;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values :");
		int num=sc.nextInt();
		int reverse=0;
		for ( ;num!=0; ) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			System.out.println("Reverse Numnber is :"+reverse);
		}

	}

}
