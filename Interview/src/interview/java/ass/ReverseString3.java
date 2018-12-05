//Reverse string using string bulider with simple way
package interview.java.ass;
import java.util.Scanner;
public class ReverseString3
 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String is:");
	String str=sc.nextLine();
	StringBuilder sb=new StringBuilder(str);
	System.out.println("Reverse string is :"+sb.reverse().toString());
	}

 }
