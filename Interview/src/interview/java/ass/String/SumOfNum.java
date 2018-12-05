package interview.java.ass.String;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string value..");
	 String a=sc.nextLine();
     int sum = 0;
     String num = "";
    for(int i = 0; i < a.length(); i++) {
        if(Character.isDigit(a.charAt(i))) {
            num = num + a.charAt(i);
        } else {
            if(!num.equals("")) {
                sum = sum + Integer.parseInt(num);
                num = "";
            }
        }
    }

    System.out.println("Total numbers of string is: "+sum);
}
}
