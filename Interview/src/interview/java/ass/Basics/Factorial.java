package interview.java.ass.Basics;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[])
    {
     int n,c;
     System.out.println("Enter an integer to calculate its factorial");
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     if(n<0)
     System.out.println("Number should be non-negative");
     else
      { 
       for(int i=0;i<=n;i++)
	   {
		  int fact=1;
       for(c=1;c<=i;c++)								
	   {
       fact=fact*c;
      
      }
	   System.out.println("Factorial of" +i+ "is="+fact);
	   }
	}
 }
}
