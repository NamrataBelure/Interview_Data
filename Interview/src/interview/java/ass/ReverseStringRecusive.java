package interview.java.ass;

import java.util.Scanner;

public class ReverseStringRecusive {

	public String reverse(String str){
		if ((str==null)||(str.length()<=1)) 
			return str;
		
		return reverse(str.substring(1))+str.charAt(0);
		
	}
	public static void main(String[] args) {
		ReverseStringRecusive rev=new ReverseStringRecusive();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
	    System.out.println("Reverse of \'"+str+"\' is \'"+rev.reverse(str)+"\'");  
	}
}
