// Reverse a number using recursion
package interview.java.ass.reversenumber;
import java.util.Scanner;
public class ReverseNumber3 {
   public static void reverseNum(int num){
	   if (num<10) {
		System.out.println(num);
		return;
	}else
		System.out.println(num%10);
	    reverseNum(num/10);
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number is :");
		int num=sc.nextInt();
		System.out.println("Reverse number is:");
		reverseNum(num);
		

	}

}
