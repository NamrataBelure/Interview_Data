//simple program
package interview.java.ass.reversenumber;
public class ReverseNumber4 {
	public static void main(String[] args) {
		    int num=11221321;
		    int reverse= 0;
		    while(num!=0){
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			System.out.println("Reverse Number is:"+reverse);
	     }
  }
}
