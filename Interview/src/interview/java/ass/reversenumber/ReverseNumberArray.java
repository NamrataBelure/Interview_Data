//reverse Number using Array
package interview.java.ass.reversenumber;
import java.util.Scanner;
public class ReverseNumberArray {

	public static void main(String[] args) {
		int i=0,j=0,temp;
		int num[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the positive Number is:");
		int count=sc.nextInt();
		
		for ( i = 0; i <count; i++) {
			System.out.println("Enter Array Element"+(i+1)+" : ");
			num[i]=sc.nextInt();
		}
			j=i-1;
			i=0;
			sc.close();
			while (i<j) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				i++;
				j--;
				
			}
			System.out.println("Reversed Array is:");
			for (i = 0; i <count ;i++) {
				System.out.println(num[i]+" ");
			}
		}
}


