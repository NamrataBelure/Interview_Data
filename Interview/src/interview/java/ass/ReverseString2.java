//string Reverse using in string Builder
package interview.java.ass;
import java.util.Scanner;
public class ReverseString2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for (int i=str.length()-1;i>=0; i--)
		{
		sb.append(str.charAt(i));	
		}
     System.out.println("Reverse String is : "+sb.toString());
	}

}
