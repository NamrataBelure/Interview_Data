package interview.java.ass.reverseStringWords;

import java.util.Scanner;

public class stringRatotaion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the orignal string:");
		String input=sc.nextLine();
		System.out.println("Enter the rotational string:");
		String ratation=sc.nextLine();
		if(checkRatation(input,ratation)){
			System.out.println(input +"and"+ ratation +"are ratation to each other");
		}
		else{
			System.out.println("sorry string can't ratation to each other  ");
		}
		sc.close();

	}
	private static boolean checkRatation(String input, String ratation) {
		if(input.length()!=ratation.length()){
			return false;
		}
		String concatenated=input+input;
		if(concatenated.indexOf(ratation)!=-1){
			return true;
		}
		return false;
		
	}

}
