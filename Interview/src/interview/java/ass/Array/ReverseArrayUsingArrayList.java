package interview.java.ass.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayUsingArrayList {
   public static void main(String[] args) {
	   String[] months={"Jan","Feb","March","April","may"};
	   System.out.println("Arrays before Reverse"+Arrays.toString(months));
	   List<String>list=Arrays.asList(months);
	   Collections.reverse(list);
	   String[]rev=list.toArray(months);
	   System.out.println("Arrays After Reverse:"+Arrays.toString(months));
    }
}
